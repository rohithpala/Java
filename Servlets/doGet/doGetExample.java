import java.servlet.*;
import java.servlet.http.*;
import java.io.*;

public class doGetExample extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String sname = req.getParameter("surname");
        String fname = req.getParameter("firstname");

        try {
            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();
            pw.print("<html><body>");
            pw.print("<h6>Surname: " + sname + "</h6>");
            pw.print("<h6>First Name: " + fname + "</h6>");
            pw.print("<h5>Details entered by you</h5>");
            pw.close();
        } catch (Exception ex) {}
    }
}
