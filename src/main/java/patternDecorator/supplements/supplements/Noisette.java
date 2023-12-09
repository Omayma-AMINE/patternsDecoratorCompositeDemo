package patternDecorator.supplements.supplements;

import patternDecorator.produits.Boisson;

public class Noisette extends DecorateurBoisson{
    @Override
    public String getDescription() {
        return boisson.getDescription()+" au noisette";
    }

    @Override
    public double cout() {
        return 2.2+ boisson.cout();
    }

    public Noisette(Boisson boisson) {
        super(boisson);
    }
}
