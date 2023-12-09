package patternDecorator.supplements.supplements;

import patternDecorator.produits.Boisson;

public class CremeChantilly extends DecorateurBoisson{
    @Override
    public String getDescription() {
        return boisson.getDescription()+" à la crème chantilly";
    }

    @Override
    public double cout() {
        return 0.9+boisson.cout();
    }

    public CremeChantilly(Boisson boisson) {
        super(boisson);
    }
}
