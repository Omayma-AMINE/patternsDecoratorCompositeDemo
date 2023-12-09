package patternDecorator.supplements.supplements;

import patternDecorator.produits.Boisson;

public class Vanille extends DecorateurBoisson{
    @Override
    public double cout() {
        return 1.9+ boisson.cout();
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+ " à la vanille";
    }

    public Vanille(Boisson boisson) {
        super(boisson);
    }
}
