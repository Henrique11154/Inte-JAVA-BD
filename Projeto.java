package br.edu.iftm.javaempresax.classes;

public class Projeto {
    
    private int codigo;
    private String titulo;
    private Departamento departamento;
    
    public Projeto(){
        
    }
    
    public Projeto(int codigo, String titulo, Departamento departamento) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Projeto [codigo=" + codigo + ", departamento=" + departamento + ", titulo=" + titulo + "]";
    }
    
    
}
