import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveQuestion extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out=response.getWriter();
        String fcode=request.getParameter("fcode");
        String question=request.getParameter("question");
        String subject=request.getParameter("subject");
        Date date=new Date();
        java.sql.Date sdate=new java.sql.Date(date.getTime());
        String sql="insert into quebank(que,subject,sdate,fcode) values(?,?,?,?)";
        try{
            Connection con=mypkg.Data.connect();
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, question);
            ps.setString(2, subject);
            ps.setDate(3, sdate);
            ps.setString(4, fcode);
            ps.executeUpdate();
            con.close();
            out.println("<html><body>");
            out.println("<h3>Question Stored Successfully</h3>");
            out.println("<h4><a href=AssignmentSubmission.jsp>Add-More</a></h4>");
            out.println("<h4><a href=facultypage.jsp>Faculty-Page</a></h4>");            
            out.println("</body></html>");
        }catch(Exception e){
            out.println(e);
        }
        
        
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
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
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
