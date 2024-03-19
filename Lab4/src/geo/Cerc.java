package geo;
import java.lang.Math;

public class Cerc implements calcul{

    public Cerc(double raza) {
        this.raza = raza;
    }

    private final double raza;

    @Override
    public double calculPerimetru() {
        return 2 * Math.PI * raza;
    }
}
