package dev.saranda.learningstruts;

import java.io.*;

import jakarta.inject.Inject;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {

    @Inject
    HelloService helloService;

    private String message;

    public void init() {
        message = "Hello World!";
    }

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");

        try {
            helloService.createHelloMessage("HEEY");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // Hello
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
        out.close();
    }
}