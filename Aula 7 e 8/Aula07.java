package com.mycompany.aula07;

public class Aula07 {

    public static void main(String[] args) {
        Lutador l[] = new Lutador [6]; //declaração de vetor com 6 objetos
        
        //cada novo lutador, coloca entre [] a posição do vetor
        //a disposição dos dados segue o modelo construtor na classe Lutador
        l[0] = new Lutador("Pretty Boy","França",31,1.75f,68.9f,11,3,1);
        l[1] = new Lutador ("PutScript","Brasil",29,1.68f,57.8f,14,2,3);
        l[2] = new Lutador ("Snapshadow","EUA",35,1.65f,80.9f,12,2,1);
        l[3] = new Lutador ("Dead Code","Austrália",28,1.93f,81.6f,13,0,2);
        l[4] = new Lutador ("UFOCobol","Brasil",37,1.70f,119.3f,5,4,3);
        l[5] = new Lutador ("Nerdaart","EUA",30,1.81f,105.7f,12,2,4);
                
        //Criando um objeto da classe Luta
        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[5], l[4]);
        UEC01.lutar();
        l[5].status();
    }
}
