/*6c. Build a servlet program to check the given number is prime number or not using HTML with step
by step procedure.*/



package com.prime;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/prime")
public class PrimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        try {
            int number = Integer.parseInt(request.getParameter("number"));
            boolean isPrime = true;
            String explanation = "";

            if (number <= 1) {
                isPrime = false;
                explanation = number + " is not a prime number because it is less than or equal to 1.";
            } else {
                explanation = "Checking divisibility of " + number + " from 2 to " + (number / 2) + "<br>";
                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        isPrime = false;
                        explanation += number + " is divisible by " + i + ", hence not a prime number.";
                        break;
                    }
                }
                if (isPrime) {
                    explanation += number + " is not divisible by any number between 2 and " + (number / 2) + ", hence it is a prime number.";
                }
            }

            out.println("<html><head><title>Prime Check Result</title></head><body>");
            out.println("<div style='margin:20px; padding:20px; border:1px solid #ccc; border-radius:5px;'>");
            out.println("<h2>Prime Number Checker</h2>");
            out.println("<p>Number Entered: <strong>" + number + "</strong></p>");
            out.println("<p>Result: <strong>" + (isPrime ? "Prime" : "Not Prime") + "</strong></p>");
            out.println("<p>" + explanation + "</p>");
            out.println("<a href='index.html'>Check Another Number</a>");
            out.println("</div></body></html>");

        } catch (NumberFormatException e) {
            out.println("<html><body><h3>Please enter a valid number.</h3>");
            out.println("<a href='index.html'>Go Back</a></body></html>");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("index.html");
    }
}
