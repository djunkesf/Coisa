package lab2;

/**
 * Representação de um registro de resumos de estudos.
 * Armazena temas e conteúdos com um limite estabelecido. Se o limite for atingido, os temas e conteudos sao substituidos de modo circular.
 *
 * @author Daniela Junkes Fernandes
 */
public class RegistroResumos {

    /**
     * Array que armazena os resumos pela classe Resumo.
     */
    private Resumo[] resumos;

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
        this.quantidadeResumos = 0;
        this.resumos = new Resumo[limite];
    }

    /**
     * Adiciona um novo resumo no array de tema e no de conteudo. O mesmo indice nos dois arrays indicam o mesmo resumo.
     * Se o limite for atingido, a inserção volta para o inicio do array(indice 0).
     * @param tema o tema do resumo
     * @param conteudo o conteuoo do resumo
     */
    public void adiciona(String tema, String conteudo) {
        if (proximaPosicao > limite-1) {
            this.resumos[proximaPosicao-limite-1] = new Resumo(tema, conteudo);
        } else {
            this.resumos[proximaPosicao] = new Resumo(tema, conteudo);

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
            resultado[i] = resumos[i].toString();
        }
        return resultado;
    }

    /**
     * Retorna uma representação em texto com a quantidade total de resumos e a listagem dos temas separados por uma "|".
     * @return uma string
     */
    public String imprimeResumos() {
        String imprime = "- " + conta() + " Resumo(s) cadastrado(s)\n- ";

        for (int i=0; i<quantidadeResumos; i++) {
            if (resumos[i].getTema() != null ) {
                if (i > 0) {
                    imprime += " | ";
                }
                imprime += resumos[i].getTema();
            }
        }
        return imprime;
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
     * @param tema nome do tema que vai ser buscado
     * @return true se for encontrado, caso contrário, retorna false.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < quantidadeResumos; i++) {
            if (resumos[i].getTema().equals(tema)) {
                return true;
            }
        }
        return false;
        }
    }