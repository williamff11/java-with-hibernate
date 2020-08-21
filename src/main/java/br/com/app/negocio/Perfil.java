package br.com.app.negocio;

import javax.persistence.*;

@Entity
@Table(name = "TPerfil")
public class Perfil {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Float nivel;
    private boolean administrador;
    private String tipo;

    public Perfil(String nome, Float nivel) {
        this.nome = nome;
        this.nivel = nivel;
    }

    public Perfil() {

    }

    public void imprimir() {
        System.out.println(this.toString());
    }

    public String toString() {
        return String.format("[%d] O perfil %s é do nível %.2f, tipo %s (Admin: %s)",
                this.id,
                this.nome,
                this.nivel,
                this.tipo,
                this.administrador ? "Sim" : "Não"
        );
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void setAdministrador(boolean administrador) {
        this.administrador = administrador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Float getNivel() {
        return nivel;
    }

    public void setNivel(Float nivel) {
        this.nivel = nivel;
    }
}