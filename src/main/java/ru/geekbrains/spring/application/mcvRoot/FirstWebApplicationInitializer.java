package ru.geekbrains.spring.application.mcvRoot;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class FirstWebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
    /*@Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic registration
                = servletContext.addServlet("dispatcher", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/cart-app/*");

    }*/

    @Override
    protected String[] getServletMappings() {
        return new String[] {"/"};
    }

    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] {RootWebApplicationConfig.class};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[] {WebMvcApplicationConfig.class};
    }
}
