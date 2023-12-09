package patternDecorator.supplements.supplements;

import patternDecorator.produits.Boisson;

public class Sirop extends DecorateurBoisson {

    public Sirop(Boisson boisson) {
        super(boisson);
    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" au sirop";
    }

    @Override
    public double cout() {
        return 1.5+ boisson.cout();
    }
}
