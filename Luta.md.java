/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lutador;

import java.util.Random;

/**
 *
 * @author ADMIN
 */
public class Luta {
    //atributos e métodos
    private LutadorPerfil desafiado;
    private LutadorPerfil desafiante;
    private boolean aprovada;
    private int rounds;
    
    //métodos públicos
    public void marcarLuta( LutadorPerfil l1,LutadorPerfil L2){
        if(l1.getCategoria().equals(L2.getCategoria())
        && l1!= L2){
        this.aprovada=true;
        this.desafiado=l1;
        this.desafiante=L2;    
        }else{
          this.aprovada=false;
          this.desafiante=null;
          this.desafiado=null;
        }
    }
    public void lutar(){
       if(this.aprovada){
           System.out.println("###DESAFIADO");
           this.desafiado.apresentar();
           System.out.println("###DESAFIANTE###");
           this.desafiante.apresentar();
           Random aleatorio = new Random();
           int vencedor = aleatorio.nextInt(3);//0,1,2
           System.out.println("========RESULTADO DA LUTA ===========");
           switch(vencedor){
               case 0://empate
                   System.out.println("empatou");
                   this.desafiado.empatarLuta();
                   this.desafiante.empatarLuta();
                   break;
               case 1://Desafiado vence
                   System.out.println(" venceu" + this.desafiado.getNome());
                   this.desafiado.ganharLuta();
                   this.desafiante.perderLuta();
                   break;
               case 2://desafiante vence
                   System.out.println(" Venceu "+ this.desafiante.getNome());
                   this.desafiante.perderLuta();
                   this.desafiado.perderLuta();
                   break;
                   
           }
           System.out.println("==============================");
       }else{
           System.out.println("a luta não pode acontecer");
       }
    }
    // metodos especiais

    public LutadorPerfil getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(LutadorPerfil desafiado) {
        this.desafiado = desafiado;
    }

    public LutadorPerfil getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(LutadorPerfil desafiante) {
        this.desafiante = desafiante;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }
    
    
}
