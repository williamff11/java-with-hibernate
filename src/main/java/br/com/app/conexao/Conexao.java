package br.com.app.conexao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Conexao {

    private static EntityManager em;

    public static EntityManager obter(){
        if (em == null){
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("infnetPU");
            em = factory.createEntityManager();
        }
        return em;
    }
}
