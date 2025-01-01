package com.kmakrutin.listener;

import com.kmakrutin.controller.DynamicController;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.ServletRegistration;
import jakarta.servlet.annotation.WebListener;

@WebListener
public class DynamicControllerRegister implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletRegistration.Dynamic dynamicController = sce.getServletContext().addServlet("dynamicController", new DynamicController());
        dynamicController.addMapping("/dynamic");
    }
}
