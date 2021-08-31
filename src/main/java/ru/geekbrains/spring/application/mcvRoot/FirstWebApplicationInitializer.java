package ru.geekbrains.spring.application.mcvRoot;

import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.WebApplicationInitializer;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

public class FirstWebApplicationInitializer implements WebApplicationInitializer {
    @Override
    public void onStartup(javax.servlet.ServletContext servletContext) throws ServletException {
        ServletRegistration.Dynamic registration
                = servletContext.addServlet("dispatcher", new DispatcherServlet());
        registration.setLoadOnStartup(1);
        registration.addMapping("/cart-app/*");

    }
}
