package com.kmakrutin.controller;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.logging.Logger;

public class BaseController extends HttpServlet {
    private static final Logger LOGGER = Logger.getLogger(BaseController.class.getName());

    @Override
    public void init(ServletConfig config) {
        LOGGER.info("BaseController init");
        LOGGER.info("base-context-param: " + config.getServletContext().getInitParameter("base-context-param"));
        LOGGER.info("base-init-param: " + config.getInitParameter("base-init-param"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String parameter = req.getParameter("base-param");
        LOGGER.info("base-param: " + parameter);

        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Hello from AnnotationController</h1>");
        resp.getWriter().write("<a href=\"" + req.getContextPath() + "/\">Main</h1>");
        LOGGER.info("GET request received.");
    }
}
