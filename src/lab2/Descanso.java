package lab2;

/**
 * A representação do Descanso do aluno recebe a quantidade de horas descansadas e o numero de semanas que ele descansou.
 *
 * @author Daniela Junkes Fernandes
 * */
public class Descanso {

    /**
     * Um inteiro que representa as horas de Descanso.
     */
    private int horasDescanso;

    /**
     * um inteiro que representa o número de semanas descansadas.
     */
    private int numeroSemana;

    /**
     * Constrói a representação do descanso.
     * O construtor inicializa as horas de descanso e o numero de semanas como sendo 0.
     */
    public Descanso() {
        this.horasDescanso = 0;
        this.numeroSemana = 0;
    }

    /**
     * Metodo sem retorno que define as horas de Descanso recebendo um valor como parametro.
     * @param valor o valor
     */
    public void defineHorasDescanso(int valor){
        this.horasDescanso = valor;
    }

    /**
     * Metodo sem retorno que define o numero de semanas descansadas.
     * @param valor o valor
     */
    public void defineNumeroSemanas(int valor) {
        this.numeroSemana = valor;
    }

    /**
     * Retorna uma String que representa se o aluno está cansado ou não, com base nas horas de estudo e numero de semanas.
     * Se não houver registros, o aluno ja começa cansado.
     * @return a representação em String do cansaço do aluno.
     */
    public String getStatusGeral(){
        if (this.numeroSemana == 0) {
            return "cansado";
        }
        if (this.horasDescanso / this.numeroSemana >= 26) {
            return "descansado";
        }
        return "cansado";
    }

}

