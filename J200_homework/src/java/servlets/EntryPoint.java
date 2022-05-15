package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author YuriPilshikov
 */
@WebServlet(name = "EntryPoint", urlPatterns = {"/"})
public class EntryPoint extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Entry point</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>ТОЧКА ВХОДА</h1>\n");
            out.println("<form action =\"create\" method=\"POST\">\n");
            out.println("<p>\n");
            out.println("Создать новую запись \n");
            out.println("<input type=\"submit\" value=\"CREATE\"/>\n");
            out.println("</p>\n");
            out.println("</form>");
            out.println("<form action =\"addaddress\" method=\"POST\">\n");
            out.println("<p>\n");
            out.println("Добавить адрес существующему клиенту \n");
            out.println("<input type=\"submit\" value=\"ADD\"/>\n");
            out.println("</p>\n");
            out.println("</form>");
            out.println("<form action =\"viewlist\" method=\"POST\">\n");
            out.println("<p>\n");
            out.println("Посмотреть полный перечень \n");
            out.println("<input type=\"submit\" value=\"List\"/>\n");
            out.println("</p>\n");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {}

    @Override
    public String getServletInfo() {
        return "Short description";
    }
    
    private void processEntries() {
        
    }
}
