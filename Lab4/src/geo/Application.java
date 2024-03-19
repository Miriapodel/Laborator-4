package geo;

public class Application {
    public static void main(String[] args) {
            Cerc cerc = new Cerc(10);
            Patrulater patrulater = new Patrulater(5, 4);

        System.out.println(cerc.calculPerimetru());
        System.out.println(patrulater.calculPerimetru());
    }
}
