public class Pion {
    private final String couleur;
    private int ligne;
    private int colonne;

    // Constructeurs
    public Pion(String couleur, int ligne, int colonne) {
        this.couleur = couleur;
        this.ligne = ligne;
        this.colonne = colonne;
    }

    // Méthodes getters d'accès aux attributs
    public String getCouleur() {
        return couleur;
    }

    public int getLigne() {
        return ligne;
    }

    public int getColonne() {
        return colonne;
    }

    // Méthode déplacer qui permet de déplacer le pion à une nouvelle position sur le plateau
    public void deplacer(int nouvelleLigne, int nouvelleColonne) {
        this.ligne = nouvelleLigne;:
        this.colonne = nouvelleColonne;
    }
}
