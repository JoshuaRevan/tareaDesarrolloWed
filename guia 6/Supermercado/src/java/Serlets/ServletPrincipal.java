package Serlets;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


public class ServletPrincipal extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ServletPrincipal</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletPrincipal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String  accion = request.getParameter("accion");
        if(accion == null){
            request.getRequestDispatcher("/Login.jsp").forward(request,response);
        }else if (accion.equals("Login")){
            request.getRequestDispatcher("/Login.jsp").forward(request,response);
        }else if (accion.equals("RegistroGerente")){
            request.getRequestDispatcher("/RegistroGerente.html").forward(request,response);
        }else if (accion.equals("RegistroCajeros")){
            request.getRequestDispatcher("/RegistroCajeros.html").forward(request,response);
        }else if (accion.equals("RegistroProducto")){
            request.getRequestDispatcher("/RegistroProducto.html").forward(request,response);
        }else if (accion.equals("RegistroAlmacen")){
            request.getRequestDispatcher("/RegistroAlmacen.html").forward(request,response);
        }
    }

  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String accion = request.getParameter("accion");
        
        if (accion.equals("Login")){
            String usuario = request.getParameter("tfUsuario");
            String contrasenia = request.getParameter("tfContrasenia");
            
        try(PrintWriter print = response.getWriter()){
                if(usuario.equals("admin") && contrasenia.equals("root")) {
                    request.getRequestDispatcher("/PanelAdministrador.jsp").forward(request, response);
                }if(usuario.equals("gerente") && contrasenia.equals("root")) {
                    request.getRequestDispatcher("/PanelAdministrador.jsp").forward(request, response);
                }if(usuario.equals("cajero") && contrasenia.equals("root")) {
                    request.getRequestDispatcher("/PanelAdministrador.jsp").forward(request, response);
                }else {
            
                   print.println("<!DOCTYPE html>");
                   print.println("<html>");
                   print.println("<head>");
                   print.println("<title>Login Sistema Supermercado</title>");
                   print.println("</head>");
                   print.println("<body>");
                   print.println("<h2>Error la contraseña o el usuario son erroneos</h2>");
                   print.println("</body>");
                   print.println("</html>");
                
                }
            }
        
        }
    }
    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
