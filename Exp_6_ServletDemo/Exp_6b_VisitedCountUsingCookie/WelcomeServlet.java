package cookie;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class WelcomeServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String username = request.getParameter("username");

        // Check if cookies exist
        Cookie[] cookies = request.getCookies();
        int visitCount = 1;
        boolean found = false;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(cookie.getValue()) + 1;
                    found = true;
                    break;
                }
            }
        }

        // Create/Update visit count cookie
        Cookie visitCookie = new Cookie("visitCount", String.valueOf(visitCount));
        visitCookie.setMaxAge(60); // Cookie expires in 60 seconds
        response.addCookie(visitCookie);

        // Save username in cookie (optional for expiry demo)
        Cookie nameCookie = new Cookie("username", username);
        nameCookie.setMaxAge(60); // Expires in 60 seconds
        response.addCookie(nameCookie);

        out.println("<html><body>");
        out.println("<h2>Welcome back " + username + "!</h2>");
        out.println("<p>You have visited this page " + visitCount + " times.</p>");
        out.println("<p><i>(Cookie will expire in 60 seconds)</i></p>");
        out.println("</body></html>");
    }
}
