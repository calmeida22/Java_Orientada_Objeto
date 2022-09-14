package projetolivro;

//para vincular a interface, use implements
//clicar na lâmpada pra implementar os metodos abstratos
public class Livro implements Publicacao { 
    
    //atributos
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;//é um objeto da classe pessoa

    //metodo construtor
    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto) {
        this.titulo = titulo;
        this.autor = autor;
        this.aberto = false;
        this.pagAtual = 0;
        this.totPaginas = totPaginas;
    }
    
    //método publico
    
    public String detalhes(){
        return "Livro{" + "titulo=" + titulo + "\n, autor=" 
                + autor + "\n, totPaginas=" + totPaginas 
                + "\n, pagAtual=" + pagAtual + "\n, aberto=" 
                + aberto + "\n, leitor=" + leitor.getNome()+"\n, idade=" + idade.getIdade()
                +"\n, sexo=" + sexo.getSexo()'}';
    }

  
    //métodos especiais

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public String getLeitor() {
        return leitor;
    }

    public void setLeitor(String leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int p) {
        this.pagAtual = p;
    }

    @Override
    public void avancarPag() {
        this.pagAtual = this.pagAtual+1; //ou pagAtual++
    }

    @Override
    public void voltarPag() {
        this.pagAtual = this.pagAtual-1; //ou pagAtual--
    }

   
}
