package patternDecorator.supplements.supplements;

import patternDecorator.produits.Boisson;

public class MousseDeLait extends DecorateurBoisson{
    public MousseDeLait(Boisson boisson) {
        super(boisson);

    }

    @Override
    public String getDescription() {
        return boisson.getDescription()+" à la mousse de lait";
    }

    @Override
    public double cout() {
        return 2.5+boisson.cout();
    }
}
