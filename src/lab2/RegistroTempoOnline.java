package lab2;

/**
 * Representação de um registro de tempo online em determinada disciplina.
 * Permite saber se o tempo dedicado cumpre a meta de tempo esperado para tal disciplina.
 *
 * @author Daniela Junkes Fernandes
 */
public class RegistroTempoOnline {

    /**
     * Nome da disciplina
     */
    private String nomeDisciplina;

    /**
     * O tempo online esperado para a disciplina.
     */
    private int tempoOnlineEsperado;

    /**
     * o tempo online investido pelo estudante na disciplina
     */
    private int tempoInvestidoOnline;

    /**
     * Constrói o registro para a disciplina e define o tempo esperado padrão como 120.
     * @param nomeDisciplina o nome da disciplina
     */
    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }

    /**
     *Constrói o registro para uma disciplina e define um tempo online esperado(diferente do padrao).
     * @param nomeDisciplina o nome da disciplina
     * @param tempoOnlineEsperado o tempo online esperado
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }

    /**
     * Adiciona uma quantidade no tempo online investido na disciplina.
     * @param tempo a quantidade de tempo para adicionar no tempo online investido.
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoInvestidoOnline += tempo;
    }

    /**
     * Verifica se o aluno atingiu a meta de tempo online esperado.
     * @return true se ele tiver atingido e false se não tiver atingido.
     */
    public boolean atingiuMetaTempoOnline() {
        if (this.tempoInvestidoOnline >= this.tempoOnlineEsperado) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna a representação em texto do registro de tempo online.
     * No formato: "Nome da disciplina tempo investido/tempoesperado.
     * @return uma string
     */
    @Override
    public String toString(){
        return this.nomeDisciplina + " " +this.tempoInvestidoOnline + "/" + this.tempoOnlineEsperado;
    }
}
