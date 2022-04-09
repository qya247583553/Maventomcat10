import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/*urlPattern:一个servlet可以配置对个访问路肩
* */
@WebServlet(urlPatterns = {"/demo7}","/demo9"})
public class Servletdemo7 extends MyHttpServlet{
    @Override
    protected void doPost(ServletRequest servletRequest, ServletResponse servletResponse) {
        super.doPost(servletRequest, servletResponse);
    }

    @Override
    protected void doGet(ServletRequest servletRequest, ServletResponse servletResponse) throws IOException {
        super.doGet(servletRequest, servletResponse);
    }
}
