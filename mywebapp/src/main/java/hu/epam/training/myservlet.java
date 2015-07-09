package hu.epam.training;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/myservlet")
public class myservlet extends HttpServlet {
	
	 /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            // TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MyOwnServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet MyOwnServlet at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            //
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    /*
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    } 
*/
    /** 
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        processRequest(request, response);
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
    
    
    ////// 
      public void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        response.setBufferSize(8192);

        PrintWriter out = response.getWriter();

        // then write the data of the response
        out.println("<html>" + "<head><title>Hello</title></head>");

        // then write the data of the response
        out.println("<body  bgcolor=\"#ffffff\">" +
            "<img src=\"duke.waving.gif\" alt=\"Duke waving\">" +
            "<h2>Hello, my name is Luke. What's yours?</h2>" +
            "<form method=\"get\">" +
            "<input type=\"text\" name=\"username\" size=\"25\">" + "<p></p>" +
            "<input type=\"submit\" value=\"Submit\">" +
            "<input type=\"reset\" value=\"Reset\">" + "</form>");

        String username = request.getParameter("username");


        if ((username != null) && (username.length() > 0)) {
            out.println("<h2>Hello, " + username + "!</h2>");
        }
        
        /*
        String hobby = request.getParameter("hobby");
        if ((hobby != null) && (hobby.length() > 0)) {
        	out.println("<h2>Your hobby is " + hobby + "!</h2>");
        }*/
        
        /*
        if ((username != null) && (username.length() > 0)) {
            RequestDispatcher dispatcher =
                getServletContext()
                    .getRequestDispatcher("/Response");

            if (dispatcher != null) {
                dispatcher.include(request, response);
            }
        }*/
        
        
        
        out.println("</body></html>");
        out.close();
    }
     
     
    
    

}
