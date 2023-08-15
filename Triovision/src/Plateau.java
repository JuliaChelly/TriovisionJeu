public class Plateau {
    private final Pion[][] cases;
    private final int taille;

    public Plateau(int taille) {
        this.taille = taille;
        this.cases = new Pion[taille][taille];
    }

    public int getTaille() {
        return taille;
    }

    public Pion getPion(int ligne, int colonne) {
        return cases[ligne][colonne];
    }

    public void placerPion(Pion pion, int ligne, int colonne) {
        cases[ligne][colonne] = pion;
        pion.deplacer(ligne, colonne);
    }

    public void deplacerPion(int ancienneLigne, int ancienneColonne, int nouvelleLigne, int nouvelleColonne) {
        Pion pion = cases[ancienneLigne][ancienneColonne];
        cases[ancienneLigne][ancienneColonne] = null;
        cases[nouvelleLigne][nouvelleColonne] = pion;
        pion.deplacer(nouvelleLigne, nouvelleColonne);
    }

    public boolean verifierMotif(CarteMotif carte) {
        for (Pion motifPion : carte.getMotifs()) {
            int ligne = motifPion.getLigne();
            int colonne = motifPion.getColonne();
            if (ligne < 0 || ligne >= taille || colonne < 0 || colonne >= taille || cases[ligne][colonne] == null || !cases[ligne][colonne].getCouleur().equals(motifPion.getCouleur())) {
                return false;
            }
        }
        return true;
    }
}
