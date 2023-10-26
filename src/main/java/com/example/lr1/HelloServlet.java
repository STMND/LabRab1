//Вариант 3

package com.example.lr1;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "loginServlet", value = "/auth")
public class HelloServlet extends HttpServlet {
    private String[][] psevdoDB = {{"admin","111"}, {"hello","222"}, {"match","333"}};

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String _username = request.getParameter("user");
        String _password = request.getParameter("pass");
        PrintWriter printWriter = response.getWriter();

       boolean authorized = false;

        try {
            if (_username!=null)
            {
                for (int i=0; i<psevdoDB.length; i++){

                    if (_username.equals(psevdoDB[i][0]) && _password.equals(psevdoDB[i][1]))
                        authorized = true;

                }

                if (authorized)
                    printWriter.write("True");
                else printWriter.write("False");
            }

        }
        catch (Exception ex) {
            printWriter.write("Exception!");
        }
        printWriter.close();
    }

    public void destroy() {
    }
}

