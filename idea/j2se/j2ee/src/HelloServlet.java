import java.io.IOException;

public class HelloServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    // 注意idea 中石油一个module 的概念
    // 一个 Project 就相当于是一个解决方案 里面一个一个一个module 就相当于是一个一个的项目。。
    // 我现在这个命名 和项目 就是搞得有一点混乱了。。要重新弄一个文件夹重新搞一波
    // 越是通过学习 发现文件是会越来越乱。。因为东西变多。不知道的东西更多。。原来的文件不可避免的就变的乱了。
    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        try{
            response.getWriter().println("<h1> Hello Servlet!</h1>");
        }catch (IOException e){
            e.printStackTrace();
        }

    }
}
