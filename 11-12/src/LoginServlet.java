import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        JDBC login = new JDBC();
        boolean flag = true;
        try {
            flag = login.login(username,password);
            Date date = new Date();
            SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String time = format.format(date);
            String status = "已登录";
            if (flag) {
                req.setAttribute("username",username);
                req.setAttribute("status",status);
                req.setAttribute("time",time);
                req.setAttribute("msg","登陆成功");
                System.out.println("登陆成功");
                req.getRequestDispatcher("success.jsp").forward(req,resp);
            } else {
                req.setAttribute("msg","登陆失败");
                System.out.println("登陆失败");
                req.getRequestDispatcher("login.jsp").forward(req,resp);
                return;
            }
            login.update(username,time,status);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
