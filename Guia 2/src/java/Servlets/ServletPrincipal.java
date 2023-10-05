/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletPrincipal", urlPatterns = {"/ServletPrincipal"})
public class ServletPrincipal extends HttpServlet {


    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
    }

   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>REgistro exitoso</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ServletPrincipal at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
            String nombre = request.getParameter("id_producto");
            String nombreProducto = request.getParameter("nombre_producto");
            String categoria = request.getParameter("categoria");
            String Proveedor = request.getParameter("proveedor");
            String Precio = request.getParameter("precio");
          
            String Mensaje = "Registro Exitoso";
            
            out.println("<h1>" + Mensaje + "</h1>");
            out.println("<strong>nombre: </strong> " + nombre);
            out.println("<br><strong>nombreproducto: </strong>" + nombreProducto);
            out.println("<br><strong>categoria: </strong>" + categoria);
            out.println("<br><strong>proveedor: </strong>" + Proveedor);
            out.println("<br><strong>Precio: </strong>" + Precio);
         
            out.println("</body>");
            out.println("</html>");
        }
        
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
