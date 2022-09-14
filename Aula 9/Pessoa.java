package projetolivro;

public class Pessoa {
    //atibutos
    private String nome;
    private int idade;
    private String sexo;
    
    //método construtor

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }
    //métodos publicos
    public void fazerAniver(){
        this.idade = this.idade + 1;//ou pode ser this.idade++
    }
    
    //médotos especiais

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
}
       