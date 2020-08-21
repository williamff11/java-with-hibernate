package br.com.app.controle;

import br.com.app.dao.PerfilDao;
import br.com.app.negocio.Perfil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "PerfilController")
public class PerfilController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            String nome = "Admin";
            Float nivel = 3.5f;
            Perfil perfil = new Perfil(nome, nivel);
            perfil.setId(2);
            perfil.setAdministrador(false);
            perfil.setTipo("Gerentes");
            perfil.imprimir();
            PerfilDao.incluir(new Perfil("Admin", 3.5f));

            if (PerfilDao.incluir(perfil)) {
                System.out.println("Inclusão reaizada com sucesso");
            } else {
                System.out.println("Problema");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
