package ex201895039;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

/**
 * Servlet Filter implementation class EncoderFilter
 */
public class EncoderFilter implements Filter {
	
    /**
     * Default constructor. 
     */
	ServletContext context;
    public EncoderFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see Filter#init(FilterConfig)
     */
    public void init(FilterConfig fConfig) throws jakarta.servlet.ServletException { 
         // TODO Auto-generated method stub
    	System.out.println("utf-8 인코딩...........");
    	context = fConfig.getServletContext();
    }

	/**
     * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
     */
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws java.io.IOException, jakarta.servlet.ServletException { 
         // TODO Auto-generated method stub
    	System.out.println("doFilter 호출");
    	request.setCharacterEncoding( "utf-8" );
    	String context = ((HttpServletRequest)request).getContextPath();
    	String pathinfo = ((HttpServletRequest)request).getRequestURI();
    	String realPath = request.getRealPath(pathinfo);
    	String mesg = " Context 정보:" + context
    				+ "\n URI 정보:" + pathinfo
    				+ "\n 물리적 경로: " + realPath;
    	System.out.println(mesg);
    	chain.doFilter(request, response);
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
}
