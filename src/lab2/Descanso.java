package lab2;

public class Descanso {
    private int horasDescanso;
    private int numeroSemana;

    public Descanso() {
    }
    public void defineHorasDescanso(int valor){
        this.horasDescanso = valor;
    }
    public void defineNumeroSemanas(int valor) {
        this.numeroSemana = valor;
    }

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

