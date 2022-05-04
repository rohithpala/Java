import java.servlet.*;
import java.servlet.http.*;
import java.io.*;

public class Add extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String n1 = req.getParameter("first");
        String n2 = req.getParameter("second");

        try {
            res.setContentType("text/html");
            PrintWriter pw = res.getWriter();
            pw.print("<html><body>");
            pw.print("<p>Output: " + (n1+n2) + "</p>");
            pw.print("<h5>Details entered by you</h5>");
            pw.close();
        } catch (Exception ex) {}
    }
}
