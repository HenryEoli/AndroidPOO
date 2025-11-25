package com.example.androidpoo;

import java.io.Serializable;

public class alunos implements Serializable {

    private int id;
    private String nome;
    private String documento;
    private String curso;

    public alunos(int id, String nome, String documento, String curso) {
        this.id = id;
        this.nome = nome;
        this.documento = documento;
        this.curso = curso;
    }

    public int getId(){
        return id;
    }
    public String getNome(){
        return nome;
    }
    public String getDocumento(){
        return documento;
    }
    public String getCurso(){
        return curso;
    }
}

