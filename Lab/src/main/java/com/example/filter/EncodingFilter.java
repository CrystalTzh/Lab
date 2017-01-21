package com.example.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import java.io.IOException;

/**
 * Servlet Filter implementation class EncodingFilter
 */
@WebFilter(urlPatterns="/*",
filterName= "TokenReplacementFilter",
initParams={
             @WebInitParam( name  ="charset", value="utf-8") }
 )

public class EncodingFilter implements Filter {

    private String charset;
    
    public EncodingFilter() {
        // TODO Auto-generated constructor stub
    }

	
	
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.charset = fConfig.getInitParameter("charset");
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		request.setCharacterEncoding(charset);
//		System.out.println("所用编码格式"+charset);
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	
	public void destroy() {
		// TODO Auto-generated method stub
	}

}
