import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class SimpleTest extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        primaryStage.setTitle("Velkommen til min opskriftssamling");
        primaryStage.setScene(new Scene(root, 300, 275));
        primaryStage.show();
    }

    public static void main(String[] args) {
        System.out.println("Velkommen til min opskrifts-applikations-dummy");
        blankLine();

        Opskrift glasurOpskrift = new Opskrift("Glasur",1,5,"Mix og bland");

        Ingrediens vand = new Ingrediens("Vand", 0);
        Ingrediens melis = new Ingrediens("Melis", 550);

        System.out.println("Opskrift er oprettet: " + glasurOpskrift.navn);
        System.out.println("Ingrediens er oprettet: " + vand.navn);
        System.out.println("Ingrediens er oprettet: " + melis.navn);

        blankLine();

        Opskrift teOpskrift = new Opskrift("Te", 1, 5, "Kog vand, put tebrev i og lad trække 3 minutter");

        Ingrediens te = new Ingrediens("Te", 2);
        Ingrediens citron = new Ingrediens("Citron", 10);


        System.out.println("Opskrift er oprettet: " + teOpskrift.navn);
        System.out.println("Ingrediens er oprettet: " + vand.navn);
        System.out.println("Ingrediens er oprettet: " + te.navn);
        System.out.println("Ingrediens er oprettet: " + citron.navn);

        glasurOpskrift.addIngrediens(vand);
        glasurOpskrift.addIngrediens(melis);

        teOpskrift.addIngrediens(vand);
        teOpskrift.addIngrediens(te);
        teOpskrift.addIngrediens(citron);

        // launch(args);
    }
    public void opretOpskrifter() {

    }
    public static void blankLine() {
        System.out.println();
    }

}
