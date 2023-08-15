import java.util.List;

public record CarteMotif(List<Pion> motifs) {
    public CarteMotif {
        if (motifs.size() != 3) {
            throw new IllegalArgumentException("Une carte motif doit contenir exactement trois pions.");
        }
    }

    public Pion[] getMotifs() {
        return new Pion[0];
    }
}
