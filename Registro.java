package com.marciacassis.meuprofessor;

/**
 * Created by MarciaCassis on 27/11/2016.
 */

public class Registro {

    private String nome;
    private String email;
    private String telefone;
    private String disciplina;

    public Registro(String nome, String email, String telefone, String disciplina)
    {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.disciplina = disciplina;
    }
    public String getNome() { return nome; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public String getDisciplina() { return disciplina; }

}
