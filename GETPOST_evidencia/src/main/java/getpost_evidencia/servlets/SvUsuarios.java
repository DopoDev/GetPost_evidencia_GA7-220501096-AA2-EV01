package getpost_evidencia.servlets;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import paqueteLogica_clases.Usuario;
import paqueteLogica_clases.conexiondb;

@WebServlet(name = "SvUsuarios", urlPatterns = {"/SvUsuarios"})
public class SvUsuarios extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Usuario> usuariosLista = new ArrayList<>();
        usuariosLista.add(new Usuario("12345678A", "Juan", "Pérez", "123-456-7890", "juan.perez@example.com"));
        usuariosLista.add(new Usuario("23456789B", "María", "Gómez", "234-567-8901", "maria.gomez@example.com"));
        usuariosLista.add(new Usuario("34567890C", "Carlos", "López", "345-678-9012", "carlos.lopez@example.com"));
        usuariosLista.add(new Usuario("45678901D", "Ana", "Martínez", "456-789-0123", "ana.martinez@example.com"));
        usuariosLista.add(new Usuario("56789012E", "Pedro", "Rodríguez", "567-890-1234", "pedro.rodriguez@example.com"));
        usuariosLista.add(new Usuario("67890123F", "Lucía", "Hernández", "678-901-2345", "lucia.hernandez@example.com"));
        
        HttpSession misesion = request.getSession(); 
        
        misesion.setAttribute("usuariosLista", usuariosLista);
        
        response.sendRedirect("mostrarUsuarios.jsp");
        
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        conexiondb db = new conexiondb();
        db.conectardb();
        
        String cedula = request.getParameter("cedula");
        String nombre = request.getParameter("nombre");
        String apellido = request.getParameter("apellido");
        String mail = request.getParameter("mail");
        String telefono = request.getParameter("telefono");
        
        System.out.println("LLegaron los datos!\n "
                + "Cedula = " + cedula + "\n"
                        + "nombre = " + nombre + "\n"
                                + "apellido = " + apellido + "\n"
                                        + "Correo = " + mail + "\n"
                                                + "telefono = " + telefono);
        
        
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
