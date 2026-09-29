package lab2;

import java.util.Arrays;

public class Disciplina {

    private String nomedaDisciplina;
    private int horasdeEstudo;
    private double[] notas;


    public Disciplina(String nomedaDisciplina) {
        this.nomedaDisciplina = nomedaDisciplina;
    }
    public void cadastraHoras(int horas){
        this.horasdeEstudo += horas;
    }
    public void cadastraNota(int nota, double valorNota){
        if (nota >= 1 && nota <= 4) {
            this.notas[nota-1] = valorNota;
        }
    }
    public double calculaMedia(){
        double soma = 0;
        for (double nota : this.notas) {
            soma += nota;
        }
        return soma / 4.0;
    }
    public boolean aprovado() {
        if (calculaMedia() >=7) {
            return true;
        } else {
            return false;
        }
    }
    public String toString(){
        return this.nomedaDisciplina + " " + this.horasdeEstudo + " " + calculaMedia() + " " + Arrays.toString(this.notas);
    }

}
