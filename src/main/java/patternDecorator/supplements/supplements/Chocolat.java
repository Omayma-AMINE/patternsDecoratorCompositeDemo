package patternDecorator.supplements.supplements;

import patternDecorator.produits.Boisson;

public class Chocolat extends DecorateurBoisson{
    @Override
    public String getDescription() {
        return boisson.getDescription()+" au chocolat";
    }

    @Override
    public double cout() {
        return 3+ boisson.cout();
    }

    public Chocolat(Boisson boisson) {
        super(boisson);
    }
}
