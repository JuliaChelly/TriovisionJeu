import java.util.ArrayList;
import java.util.List;

public class Partie {
    private final List<Joueur> joueurs;
    private final List<CarteMotif> pioche;

    public Partie(int taillePlateau) {
        Plateau plateau = new Plateau(taillePlateau);
        this.joueurs = new ArrayList<>();
        this.pioche = new ArrayList<>();
    }

    public void ajouterJoueur(Joueur joueur) {
        joueurs.add(joueur);
    }

    public void ajouterCarteMotif(CarteMotif carte) {
        pioche.add(carte);
    }

    public void demarrerPartie() {
        // méthode pour initialiser la partie
    }

    public void jouerTour(Joueur joueur) {

    }

    public boolean estTerminee() {
        //  méthode pour vérifier si la partie est terminée
        return false; // À implémenter
    }

    public void afficherResultats() {
        // méthode pour afficher les résultats
    }

    public Joueur[] getJoueurs() {
        return new Joueur[0];
    }
}
