import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/exercicio8")
public class ServletExercicio8 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public ServletExercicio8() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        double celsius = Double.parseDouble(request.getParameter("celsius"));
        double fahrenheit = (celsius * 9/5) + 32;

        PrintWriter saida = response.getWriter();
        saida.println("<html lang=\"pt-br\">"
                + "<meta charset=\"UTF-8\">"
                + "<head><title>Conversão de Temperatura</title></head>"
                + "<body><h1>" + celsius + " graus Celsius é igual a " + fahrenheit + " Fahrenheit.</h1></body></html>");
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }
}
