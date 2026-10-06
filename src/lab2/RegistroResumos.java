package lab2;

/**
 * Representação de um registro de resumos de estudos.
 * Armazena temas e conteúdos com um limite estabelecido. Se o limite for atingido, os temas e conteudos sao substituidos de modo circular.
 *
 * @author Daniela Junkes Fernandes
 */
public class RegistroResumos {
    /**
     * Array que armazena os temas dos resumos.
     */
    private String[] tema;

    /**
     * Array que armazena os conteudos dos resumos.
     */
    private String[] conteudo;

    /**
     * Conta a quantidade de Resumos adicionados nos arrays.
     */
    private int quantidadeResumos;

    /**
     * ìndice que indica a proxima posição que um resumo será inserido nos arrays.
     */
    private int proximaPosicao;

    /**
     * Limite de resumos que podem ser armazenados nos arrays.
     */
    private int limite;

    /**
     * Constrói o registro de resumos e define o limite máximo.
     * @param numeroDeResumos o numero maximo de resumos suportados
     */
    public RegistroResumos(int numeroDeResumos) {
        this.limite = numeroDeResumos;
        this.proximaPosicao = 0;
        this.tema = new String[numeroDeResumos];
        this.conteudo = new String[numeroDeResumos];
        this.quantidadeResumos = 0;
    }

    /**
     * Adiciona um novo resumo no array de tema e no de conteudo. O mesmo indice nos dois arrays indicam o mesmo resumo.
     * Se o limite for atingido, a inserção volta para o inicio do array(indice 0).
     * @param tema o tema do resumo
     * @param conteudo o conteuoo do resumo
     */
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

    /**
     * Retorna um array que contém todos os resumos com seus respectivos temas e conteúdos
     * Formato: "Tema: conteudo".
     * @return array de strings com tema e conteuoo dos resumos.
     */
    public String[] pegaResumos() {
        String[] resultado = new String[this.quantidadeResumos];
        for (int i =0; i < this.quantidadeResumos; i++) {
            resultado[i] = this.tema[i] + ": " + this.conteudo[i];
        }
        return resultado;
    }

    /**
     * Retorna uma representação em texto com a quantidade total de resumos e a listagem dos temas separados por uma "|".
     * @return uma string
     */
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

    /**
     * Retorna a quantidade de resumos adicionados.
     * @return numero de resumos adicionados.
     */
    public int conta() {
        return quantidadeResumos;
    }

    /**
     * Verifica se um tema ja se encontra no registro de resumos.
     * @param temas nome do tema que vai ser buscado
     * @return true se for encontrado, caso contrário, retorna false.
     */
    public boolean temResumo(String temas) {
        for (int i = 0; i < tema.length; i++) {
            if (temas.equals(this.tema[i])) {
                return true;
            }
        }
        return false;
        }
    }