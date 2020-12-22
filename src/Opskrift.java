import java.util.ArrayList;
import java.util.List;

public class Opskrift {

    String navn;
    List<Ingrediens> ingredienser = new ArrayList<>();
    int antalPortioner;
    int tilberedningstid;
    String vejledning;


    // default constructor (giver ingen mening)
    public Opskrift(){

    }

    // constructor
    public Opskrift(String navn, int antalPortioner, int tilberedningstid, String vejledning){
        this.navn = navn;
        this.antalPortioner = antalPortioner;
        this.tilberedningstid = tilberedningstid;
        this.vejledning = vejledning;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public ArrayList getIngredienser() {
        return (ArrayList) ingredienser;
    }

    public void setIngredienser(ArrayList ingredienser) {
        this.ingredienser = ingredienser;
    }

    public int getAntalPortioner() {
        return antalPortioner;
    }

    public void setAntalPortioner(int antalPortioner) {
        this.antalPortioner = antalPortioner;
    }

    public int getTilberedningstid() {
        return tilberedningstid;
    }

    public void setTilberedningstid(int tilberedningstid) {
        this.tilberedningstid = tilberedningstid;
    }

    public String getVejledning() {
        return vejledning;
    }

    public void setVejledning(String vejledning) {
        this.vejledning = vejledning;
    }

    public void addIngrediens(Ingrediens ingrediens) {
        this.ingredienser.add(ingrediens);

    }
    public void addIngrediens(String navn, int kalorier) {

    }

    public void visIngredienser(List<Ingrediens> ingredienser){

        for (Ingrediens ingrediens : ingredienser)
        {
            System.out.println("- " + ingrediens);
        }
    }

    public void visFremgangsmaade(){

    }

    public void visOpskrift(){

    }

    public int kalorierIAlt(){
        int w = 1;

        return w;

    }

    public int kalorierPerPortion(){

        int w = 1;

        return w;
    }
}
