package patternDecorator.produits;

public class Sumatra extends Boisson{
    public Sumatra() {
        this.description="Somatra";
    }

    @Override
    public double cout() {
        return 6.5;
    }
}
