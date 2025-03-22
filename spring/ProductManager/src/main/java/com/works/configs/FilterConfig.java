package com.works.configs;

import jakarta.servlet.*;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;
import java.io.PrintWriter;

@Configuration
// olmayan özelliğin springe eklemesi yada
// var olan özelliğin değiştirilmesi
public class FilterConfig implements Filter {

    @Override
    public void init(jakarta.servlet.FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        // uygulama ayağa kalktığında bir kez çalışam metodtur.
        System.out.println("Server UP");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;

        // request -> kullanıcıdan gelen değerler, url, data, json, ip, header vb.
        // response -> programın ürettiği ve kullancının gördüğü datalar url, data, json, header, vb.

        String url = request.getRequestURI();
        String ip = request.getRemoteAddr();
        String sessionID = request.getSession().getId();

        // free urls
        String[] freeUrls = {"/customer"};
        boolean loginStatus = false;
        for (String freeUrl : freeUrls) {
            if (url.startsWith(freeUrl)) {
                loginStatus = true;
            }
        }

        if (loginStatus) {
            // oturum gerekmiyor
            filterChain.doFilter(request, response);
        }else {
            // oturum gerekli
            Object userObject = request.getSession().getAttribute("user");
            if (userObject != null) {
                // oturum var hizmeti sun
                filterChain.doFilter(request, response);
            }else {
                // oturum yok hizmet hatası ver
                PrintWriter out = response.getWriter();
                response.setHeader("Content-Type", "application/json;charset=UTF-8");
                out.println("{ \"status\": false, \"message\": \"Lütfen oturum açınız\" }");
                response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            }
        }


    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("Server DOWN");
    }
}
