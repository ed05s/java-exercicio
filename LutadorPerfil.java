/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutador;

/**
 *
 * @author ADMIN
 */
public class LutadorPerfil {
    private String nome;
    private String nacionalidade;
    private int idade;
    private float peso;
    private float altura;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    
    
    
    
    public void apresentar(){
        System.out.println("----------------------------------");
        System.out.println("É HORA DE APRESENTAR O LUTADOR " +this.getNome());
        System.out.println("DIRETAMENTE DE " + this.getNacionalidade());
        System.out.println("COM SEUS " + this.getIdade() + " de idade");
        System.out.println("PESANDO " + this.getPeso() + " Kgs");
        System.out.println("COM " +this.getAltura() + " DE ALTURA");
        System.out.println("COM " +this.getVitorias()+ " VITÓRIAS");
        System.out.println("E " +this.getDerrotas() + " DERROTAS");
        System.out.println("E " +this.getEmpates() + " EMPATES");
        System.out.println("----------------------------------");
    }
    public void status(){
        System.out.println(this.getNome()+ " é um " +this.getCategoria());
        System.out.println(" Ganhou "+this.getVitorias() + " vezes");
        System.out.println(" perdeu "+this.getDerrotas() + " vezes");
        System.out.println(" empatou "+this.getEmpates() + " vezes");
    }
    public void ganharLuta(){
        this.setVitorias(this.getVitorias()+1);
    }
    public void perderLuta(){
        this.setDerrotas(this.getDerrotas()+1);
    }
    public void empatarLuta(){
        this.setEmpates(this.getEmpates()+1);
    }
    // construtor

    public LutadorPerfil(String nome, String nacionalidade, int idade, float peso, float altura, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.setPeso(peso);
        this.altura = altura;
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
    }
    public String getCategoria(){
        return categoria;
    }
    private void setCategoria(){
        if(this.peso<52.2){
            this.categoria = "invalido";
        }else if(this.peso<=70.3){
            this.categoria="peso leve";
        }else if(this.peso<=80.9){
            this.categoria="peso médio";
        }else if(this.peso<=120.2){
            this.categoria="peso pesado";
        }else{
            this.categoria="invalido";
        }
        
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    
    
    
    
    
    
    
    
    
    
}
