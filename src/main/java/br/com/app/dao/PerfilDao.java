package br.com.app.dao;

import br.com.app.conexao.Conexao;
import br.com.app.negocio.Perfil;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PerfilDao {

    private static EntityManager conexao;
    private static EntityTransaction transacao;
    public static boolean incluir (Perfil perfil){
        conexao =  Conexao.obter();

        transacao = conexao.getTransaction();

        transacao.begin();

        conexao.persist(perfil);

        transacao.commit();
        return conexao != null;
    }
}
