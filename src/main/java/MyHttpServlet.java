import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class MyHttpServlet implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //根据请求方式的不同进行分别的处理

        HttpServletRequest request= (HttpServletRequest) servletRequest;
        //1.获取请求方式

        String method = request.getMethod();
        //2.判断

        if ("GET".equals(method)){
            //get方式处理
            doGet(servletRequest,servletResponse);
        }else if ("POST".equals(method)){
            //post处理方式
            doPost(servletRequest,servletResponse);
        }

    }

    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
    }

    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
