public class Joueur {
    private final String nom;
    private int score;

    // Constructeurs
    public Joueur(String nom) {
        this.nom = nom;
        this.score = 0;
    }
    // Méthodes getters d'accès aux attributs
    public String getNom() {
        return nom;
    }

    public int getScore() {
        return score;
    }

    public void incrementerScore() {
        score++;
    }

    public void indiquerSolution() {
        // Méthode pour indiquer une solution (à implémenter selon les besoins)
    }
}
