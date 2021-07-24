import java.io.IOException;
import java.util.Date;
 
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class HelloServlet extends HttpServlet{

    /**
     * 1. ideal 导入项目 导入新的项目
     * 2. 配置 创建 Artifacts WebApplication Exploded from Module 不太清楚这个的作用
     * 3. 配置Tomcat 这个可以自由的指定。。需要用哪里的环境机可以用哪个环境
     * 4. ideal 开发工具使用起来 还是比 eclipes 要舒服很多。
     * 5. 如果教程也都是使用 这个的就好了。
     * 6. 配置打开的url路由 会自带上这个链接。。
     * 7. 有一定的基础之后 也就不那么容易的卡住了。。google一下 很多问题也都能狗解决
     * @param request
     * @param response
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response){
         
        try {
            response.getWriter().println("<h1>Hello Servlet!</h1>");
            response.getWriter().println(new Date().toLocaleString());
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
     
}