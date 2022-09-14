package com.mycompany.aula07;

import java.util.Random;

public class Luta {
    //atributos
    private Lutador desafiado; //desafiado e desafiante tbm são objetos com atributos da classe Lutador
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //metodos publicos
    public void marcarLuta(Lutador l1, Lutador l2){ //coloca os lutadores como parâmetro
        if (l1.getCategoria().equals(l2.getCategoria()) //utiliza o .equals no lugar de == para igualar categorias
                && l1!=l2){ //com a lógica E condicionando ! l1 diferente de l2
            this.aprovada = true; //a luta so ocorre se categorias iguais e lutadores diferentes
            this.desafiado = l1; //desafiado recebe l1
            this.desafiante = l2; //desafiante recebe l2
        } else {
            this.aprovada = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    
    }
    
    public void lutar(){
        if(this.aprovada){
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random(); //comando para randomizar
            int vencedor = aleatorio.nextInt(3);//0 1 2 gerador aleatoriamente e salvos em vencedor
            
            switch(vencedor){ //função escolha caso utiliza o valor aleatório (case) da variável vencedor
                case 0: {
                    //empate
                    System.out.println("Empatou!");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    //sempre para fechar o case
                }
                case 1: {
                    //desafiado vence
                    System.out.println("Vitória do "+this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                }
                case 2: {
                    //desafiante vence
                    System.out.println("Vitória do "+this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                }
            }
            //função escolha caso utiliza o valor aleatório (case) da variável vencedor
                        //função escolha caso utiliza o valor aleatório (case) da variável vencedor
                        
        } else {
            System.out.println("A luta não pode acontecer!");
        }
    }
                       
    //metodos especiais (Getter e Setter automáticos)

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
}
