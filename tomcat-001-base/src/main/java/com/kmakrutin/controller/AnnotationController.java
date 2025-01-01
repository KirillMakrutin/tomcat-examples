package com.kmakrutin.controller;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.logging.Logger;

@WebServlet("/annotation")
public class AnnotationController extends HttpServlet {

    private static final Logger LOGGER = Logger.getLogger(AnnotationController.class.getName());

    @Override
    public void init() {
        LOGGER.info("AnnotationController initialized.");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.setContentType("text/html");
        resp.getWriter().write("<h1>Hello from AnnotationController</h1>");
        resp.getWriter().write("<a href=\"" + req.getContextPath() + "/\">Main</h1>");
        LOGGER.info("GET request received.");
    }

}
