package patternDecorator;

import patternDecorator.produits.Boisson;
import patternDecorator.produits.Colombia;
import patternDecorator.produits.Espresso;
import patternDecorator.supplements.supplements.*;

public class PatternDecoratorDemo {
    public static void main(String[] args) {
        Boisson boisson1 ;
        boisson1 = new Espresso();
        boisson1 = new MousseDeLait(boisson1);
        boisson1 = new Caramel(boisson1);
        boisson1 = new CremeChantilly(boisson1);
        System.out.println("Boisson 1 :");
        System.out.println("\t\t"+boisson1.getDescription()+" : "+boisson1.cout());

        Boisson boisson2;
        boisson2 = new Colombia();
        boisson2 = new Chocolat(boisson2);
        boisson2= new Noisette(boisson2);
        boisson2 = new Vanille(boisson2);
        System.out.println();
        System.out.println("Boisson 2 : ");
        System.out.println("\t\t"+boisson2.getDescription()+ " : "+boisson2.cout());

        boisson2 = ((DecorateurBoisson) boisson2).retirerDecorateur(Noisette.class);
        System.out.println();
        System.out.println("Boisson 2 après avoir retirer un supplément : ");
        System.out.println("\t\t"+boisson2.getDescription()+ " : "+boisson2.cout());

    }
}
