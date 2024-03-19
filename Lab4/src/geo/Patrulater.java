package geo;

public class Patrulater implements calcul{

    private final double l, L;

    public Patrulater(double l, double l1) {
        this.l = l;
        L = l1;
    }

    @Override
    public double calculPerimetru() {
        return 2 * (l + L);
    }
}
