package controlers;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentsController",urlPatterns = "/students")
public class StudentsController extends HttpServlet { //Servlet - компонент внутри приложения который отвечает на HTTP запросы

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException { // get запрос
        resp.getWriter().println("<h2> This is test </h2> "); // возвращает поток в который мы можем отправлять информацию ( что отправим то будет выведено пользователю)
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doPost(req, resp);
    }
}
