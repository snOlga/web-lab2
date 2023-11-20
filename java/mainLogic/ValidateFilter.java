package mainLogic;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class ValidateFilter implements Filter
{
    private FilterConfig filterConfig;

    @Override
    public void init(FilterConfig filterConfigOutSide) throws ServletException
    {
        filterConfig = filterConfigOutSide;
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException
    {
        DataBean bean = new DataBean();
        bean.setX(servletRequest.getParameter("selectX"));
        bean.setY(servletRequest.getParameter("selectY"));
        bean.setR(servletRequest.getParameter("selectR"));

        if(bean.getX() == null || bean.getY() == null || bean.getR() == null)
        {
            HttpServletResponse httpResponse = (HttpServletResponse) servletResponse;
            httpResponse.sendError(HttpServletResponse.SC_BAD_REQUEST);
        }
        filterChain.doFilter(servletRequest, servletResponse);
    }
}
