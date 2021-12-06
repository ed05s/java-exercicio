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
public class Lutador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // iniciando os obejetos usando uma matriz de 6 posições
        LutadorPerfil l[];
        l = new LutadorPerfil[6];
        
        l[0]=new LutadorPerfil(" prety boy "," frança ",31,68.9f,1.75f,11,2,1);
        
        l[1]=new LutadorPerfil(" cabeçudo ", "Brasil",29,57.8f,1.68f,14,2,3);
        
        l[2]=new LutadorPerfil(" Snakeman "," EUA ",35,80.9f,1.65f,12,2,1);
        
        l[3]=new LutadorPerfil(" DeadShot", " Austrália",28,81.6f,1.93f,13,0,2);
        
        l[4]=new LutadorPerfil(" foquinha", "Brasil",37, 119.3f, 1.70f,5,4,3);
        
        l[5]=new LutadorPerfil(" Tongo", " EUA", 30,105.7f, 1.81f, 12,2,3);
        
        
        Luta UEC01= new Luta();
        UEC01.marcarLuta(l[2], l[3]);
        UEC01.lutar();
        l[2].status();
        l[3].status();
    }
    
}
