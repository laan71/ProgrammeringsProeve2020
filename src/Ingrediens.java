public class Ingrediens {

    String navn;
    int kalorier;


    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getKalorier() {
        return kalorier;
    }

    public void setKalorier(int kalorier) {
        this.kalorier = kalorier;
    }

    // constructor
    public Ingrediens(String navn, int kalorier){
        this.navn = navn;
        this.kalorier = kalorier;
    }

    public boolean rigPaaKalorier(String x, int y){

        boolean w = true;

        return w;

    }
}
