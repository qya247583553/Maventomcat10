import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet(urlPatterns = "/demo2",loadOnStartup = 1)
public class Servletdemo2 implements Servlet {
    /*初始化方法
    * 1.调用时机，默认情况下，servlet被第一次访问时，调用
    *  LoadOnstartup：
    * 2.调用次数：1次*/
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init....");

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    /*
    提供服务
    1.调用时机 每一次servlet被访问时就调用
    2.调用次数：多次
    * */
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("出现了");

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    /*
    * 销毁方法
    * 1.调用时机：内存释放或者服务器关闭时候，servlet对象会被小猴，调用
    * 调用次数：1次*/
    @Override
    public void destroy() {
        System.out.println("关闭");

    }
}
