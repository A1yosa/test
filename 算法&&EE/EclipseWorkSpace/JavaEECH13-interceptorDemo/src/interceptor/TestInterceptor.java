package interceptor;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class TestInterceptor implements HandlerInterceptor{
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("preHandler方法在控制器的处理请求方法前执行TestInterceptor");
		/**
		 * 返回true表示继续向下执行，返回false表示中断后续操作
		 */
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView)
			throws Exception {
		System.out.println("postHandler方法在控制器的处理请求方法之后，解析视图之前执行TestInterceptor");
	}
	
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler,
			Exception ex)
			throws Exception {
		System.out.println("afterCompletion方法在控制器的处理请求方法执行完成后，即视图渲染之后执行TestInterceptor");
	}
}
