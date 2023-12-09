package patternDecorator.supplements.supplements;

import patternDecorator.produits.Boisson;

public abstract class DecorateurBoisson extends Boisson{
    Boisson boisson;

    public DecorateurBoisson(Boisson boisson) {
        this.boisson = boisson;
    }

    public Boisson retirerDecorateur(Class<? extends DecorateurBoisson> decorateurClass) {
        if (decorateurClass.isInstance(this)) {
            return boisson;
        } else if (boisson instanceof DecorateurBoisson) {
            boisson = ((DecorateurBoisson) boisson).retirerDecorateur(decorateurClass);
        }
        return this;
    }
}
