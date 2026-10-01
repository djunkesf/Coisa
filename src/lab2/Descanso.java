package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemana;


    public Descanso() {
    }
    public void defineHorasDescanso(int valor){
        this.horasDescanso = horasDescanso;
    }
    public void defineNumeroSemanas(int valor) {
        this.numeroSemana = numeroSemana;
    }
    public String getStatusGeral(){
        if (this.horasDescanso / this.numeroSemana >= 26) {
            return "descansado";
        } else {
            return "cansado";
        }
    }
}