package presentation;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

public class AutoWiredServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	protected AutowireCapableBeanFactory ctx;

	public void init() throws ServletException {
		WebApplicationContext context = WebApplicationContextUtils.getWebApplicationContext(getServletContext());
		ctx = context.getAutowireCapableBeanFactory();
		ctx.autowireBean(this);

	}

}
