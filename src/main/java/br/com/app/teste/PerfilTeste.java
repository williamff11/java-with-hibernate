package br.com.app.teste;

import br.com.app.dao.PerfilDao;
import br.com.app.negocio.Perfil;

public class PerfilTeste {

    public static void main(String[] args) {

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
            }else{
                System.out.println("Problema");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

