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
    public void adiciona(String tema, String conteudo) {
        if (proximaPosicao > limite-1) {
            this.tema[proximaPosicao-limite-1] = tema;
            this.conteudo[proximaPosicao-limite-1] = conteudo;
        } else {
            this.tema[proximaPosicao] = tema;
            this.conteudo [proximaPosicao] = conteudo;

        }
        quantidadeResumos ++;
        proximaPosicao++;
    }
    public String[] pegaResumos() {
        String[] resumos;
        resumos = new String[quantidadeResumos];
        for (int i; quantidadeResumos + 1; i++) {
            resumos[i] = tema[i] + ": " + conteudo[i];
        }
        return resumos;
    }

    public String imprimeResumos() {

    }
    public int conta() {
        return quantidadeResumos;
    }
    public boolean temResumo(String tema) {
        for (int i = 0; tema.length(); i++) {
            if (tema.equals(tema[i])) {
                return true;
            }
            return false;
        }
    }