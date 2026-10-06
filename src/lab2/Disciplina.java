package lab2;

import java.util.Arrays;

/**
 * Representação de uma disciplina. Toda disciplina precisa ter um nome, horas de estudo e notas.
 *
 * @author Daniela junkes Fernandes
 * */

public class Disciplina {
    /**
     * Nome da Disciplina que sera cadastrada.
     */
    private String nomedaDisciplina;
    /**
     * Horas de Estudo na disciplina.
     */
    private int horasdeEstudo;
    /**
     * Array das notas que o aluno tirou na disciplina.
     */
    private double[] notas;

    /**
     * Constroi uma Disciplina a partir do nome da disciplina.
     *
     * @param nomedaDisciplina o nome da disciplina
     */
    public Disciplina(String nomedaDisciplina) {
        this.notas = new double[4];
        this.nomedaDisciplina = nomedaDisciplina;
    }

    /**
     * Metodo sem retorno que cadastra horas de estudo do aluno.
     * @param horas
     */
    public void cadastraHoras(int horas){
        this.horasdeEstudo += horas;
    }

    /**
     * Metodo sem retorno que cadastra as notas no array de notas. Vai receber 4 notas.
     */

    public void cadastraNota(int nota, double valorNota){
        if (nota >= 1 && nota <= 4) {
            this.notas[nota-1] = valorNota;
        }
    }

    /**
     * Retorna em double a media a partir das 4 notas do array notas.
     * @return a media das notas na disciplina.
     */
    public double calculaMedia(){
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / 4.0;
    }

    /**
     * Retorna um booleano que diz se o aluno foi aprovado (media maior ou igual a 7), ou reprovado.
     * @return true se foi aprovado, false se foi reprovado
     */
    public boolean aprovado() {
        if (calculaMedia() >=7) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna uma representação de texto que representa o nome da disciplina, as horas de estudo, a media e as notas da disciplina.
     * @return uma representacao em String
     */
    @Override
    public String toString(){
        return this.nomedaDisciplina + " " + this.horasdeEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }

}
