package patternDecorator.supplements.supplements;

import patternDecorator.produits.Boisson;

public class Caramel extends DecorateurBoisson{
    public Caramel(Boisson boisson) {
        super(boisson);
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" au caramel";
    }

    @Override
    public double cout() {
        return 3+boisson.cout();
    }


}
