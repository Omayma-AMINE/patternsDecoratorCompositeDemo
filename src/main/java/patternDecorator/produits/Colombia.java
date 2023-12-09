package patternDecorator.produits;

public class Colombia extends Boisson{
    public Colombia() {
        this.description="Colombia";
    }

    @Override
    public double cout() {
        return 10.9;
    }
}
