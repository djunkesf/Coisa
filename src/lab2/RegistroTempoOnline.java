package lab2;

public class RegistroTempoOnline {
    private String nomeDisciplina;
    private int tempoOnlineEsperado;
    private int tempoInvestidoOnline;

    public RegistroTempoOnline(String nomeDisciplina){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = 120;
    }
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado){
        this.nomeDisciplina = nomeDisciplina;
        this.tempoOnlineEsperado = tempoOnlineEsperado;
    }
    public void adicionaTempoOnline(int tempo) {
        this.tempoInvestidoOnline += tempo;
    }
    public boolean atingiuMetaTempoOnline() {
        if (this.tempoInvestidoOnline >= this.tempoOnlineEsperado) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString(){
        return this.nomeDisciplina + " " +this.tempoInvestidoOnline + "/" + this.tempoOnlineEsperado;
    }
}
