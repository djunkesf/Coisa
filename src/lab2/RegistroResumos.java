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
        proximaPosicao ++;
    }
    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidadeResumos];
        for (int i =0; i < this.quantidadeResumos; i++) {
            resultado[i] = this.tema[i] + ": " + this.conteudo[i];
        }
        return resultado;
    }

    public String imprimeResumos() {
        String lt = "";
        for (int i=0; i<tema.length; i++) {
            if (this.tema[i] != null ) {
                if (i > 0) {
                    lt += " | ";
                }
                lt += this.tema[i];
            }
        }
        return "- " + this.quantidadeResumos +" resumo(s) cadastrado(s)\n- " + lt;
    }
    public int conta() {
        return quantidadeResumos;
    }

    public boolean temResumo(String temas) {
        for (int i = 0; i < tema.length; i++) {
            if (temas.equals(this.tema[i])) {
                return true;
            }
        }
        return false;
        }
    }