package io.ccard.routers;

import io.ccard.controllers.MainController;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class Main extends HttpServlet {

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws IOException
    {
        MainController controller = new MainController();
        OutputStream out = resp.getOutputStream();
        out.write(controller.helloWorld());
        out.flush();
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws IOException
    {
        doGet(req, resp);
    }
}
