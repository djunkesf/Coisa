package lab2;

public class RegistroResumos {
    private String[] tema;
    private String[] conteudo;
    private int quantidadeResumos;
    private int proximaPosicao;
    private int limite;

    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.proximaPosicao = 0;
        this.tema = new String[numeroDeResumos];
        this.conteudo = new String[numeroDeResumos];
        this.quantidadeResumos = 0;
    }
    public void adicionaResumo(String tema, String conteudo) {

    }
    public String[] pegaResumos() {

    }
    public String imprimeResumos() {

    }
    public int contaResumos() {

    }
    public boolean temResumo(String tema) {

    }
}
