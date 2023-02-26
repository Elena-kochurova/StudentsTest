package filters;

import javax.servlet.*;
import java.io.IOException;

public class EncodingFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException { // фильтр отрабатывает когда стартует приложение(tomcar к нему обращается)

    }

    @Override //метод отрабатывает при посткпление запроса на томкат. потом отправит запрос на сервлет
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
      servletRequest.setCharacterEncoding("UTF-8"); // установить кодировку объекту запроса
        servletResponse.setCharacterEncoding("UTF-8"); // обекту ответа
        filterChain.doFilter(servletRequest,servletResponse);// filterChain - описывает всю цепочку фильтров. doFilter(servletRequest,servletResponse)- запрос уходит по цепочке фильтров
    }

    @Override
    public void destroy() { // вызывается томкатом когда приложение заканчивает свою работу

    }
}
