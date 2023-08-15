import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

class TriovisionApp extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        // Charger le fichier FXML
        Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("PlateauView.fxml")));

        // Créer une scène avec le contenu chargé du fichier FXML
        Scene scene = new Scene(root);

        // Appliquer le fichier CSS à la scène
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("styles.css")).toExternalForm());

        // Configurer la scène sur la fenêtre principale
        primaryStage.setScene(scene);
        primaryStage.setTitle("Triovision Game");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

class Triovision {
    public static void main(String[] args) {
        // Créez une instance de Partie et ajoutez des joueurs
        Partie partie = new Partie(4); // Spécifiez la taille du plateau
        Joueur joueur1 = new Joueur("Joueur 1");
        Joueur joueur2 = new Joueur("Joueur 2");
        partie.ajouterJoueur(joueur1);
        partie.ajouterJoueur(joueur2);

        // Créez des cartes motifs et ajoutez-les à la pioche
        List<Pion> motifs1 = new ArrayList<>();
        motifs1.add(new Pion("rouge", 0, 0));
        motifs1.add(new Pion("bleu", 0, 1));
        motifs1.add(new Pion("vert", 0, 2));
        CarteMotif carte1 = new CarteMotif(motifs1);
        partie.ajouterCarteMotif(carte1);

        List<Pion> motifs2 = new ArrayList<>();
        motifs2.add(new Pion("jaune", 1, 0));
        motifs2.add(new Pion("vert", 2, 0));
        motifs2.add(new Pion("rouge", 3, 0));
        CarteMotif carte2 = new CarteMotif(motifs2);
        partie.ajouterCarteMotif(carte2);

        // Démarrez la partie et jouez des tours
        partie.demarrerPartie();
        while (!partie.estTerminee()) {
            for (Joueur joueur : partie.getJoueurs()) {
                partie.jouerTour(joueur);
            }
        }

        // Affichez les résultats finaux
        partie.afficherResultats();
    }
}
