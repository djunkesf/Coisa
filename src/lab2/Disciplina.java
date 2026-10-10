package lab2;

import java.util.Arrays;

/**
 * Representação de uma disciplina. Toda disciplina precisa ter obrigatoriamente um nome, horas de estudo e notas.
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
     * quantidade de notas
     */
    private int qtdnotas;
    /**
     * Recebe os pesos de cada nota.
     */
    private double[] pesos;

    /**
     * Constroi uma Disciplina a partir do nome da disciplina, com 4 notas com o mesmo peso. Toda disciplina começa com horas de estudos e notas iguais a zero
     *
     * @param nomedaDisciplina o nome da disciplina
     */
    public Disciplina(String nomedaDisciplina) {
        this.notas = new double[4];
        this.nomedaDisciplina = nomedaDisciplina;
    }

    /**
     * Constrói uma Disciplina a partir de seu nome e especifica a quantidade de notas associada a ela.
     * @param nomedaDisciplina o nome da disciplina
     * @param qtdnotas quantidade total de notas na disciplina
     */
    public Disciplina(String nomedaDisciplina, int qtdnotas){
        this.nomedaDisciplina = nomedaDisciplina;
        this.qtdnotas = qtdnotas;
    }

    /**
     * Constrói uma Disciplina a partir do seu nome, da quantidade de notas associadas, e do array de pesos respectivos de cada nota.
     * @param nomedaDisciplina o nome da disciplina
     * @param qtdnotas a quantidade total de notas
     * @param pesos os pesos que cada nota vale
     */
    public Disciplina(String nomedaDisciplina, int qtdnotas, double[] pesos){
        this.nomedaDisciplina = nomedaDisciplina;
        this.pesos = new double[qtdnotas];
        this.qtdnotas = qtdnotas;
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
     * Retorna em double a media aritmética a partir das 4 notas do array notas.
     * Se o array de pesos tiver sido passado, calcula a média ponderada das notas.
     * @return a media das notas do aluno na disciplina .
     */
    public double calculaMedia() {
        if (pesos == null || pesos.length == 0) {
            double soma = 0;
            int cont =0;
            for (double nota : this.notas) {
                soma += nota;
                cont ++;
            }
            return soma / cont;
        } else {
            double somadepesos = 0;
            double somadenotas =0;

            for (int i = 0; i < qtdnotas; i++ ) {
                somadepesos += pesos[i];
                somadenotas += pesos[i] * notas[i];
            }
            return somadenotas / somadepesos;
        }
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
