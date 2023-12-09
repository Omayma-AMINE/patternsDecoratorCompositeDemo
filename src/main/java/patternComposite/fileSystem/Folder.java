package patternComposite.fileSystem;

import java.util.ArrayList;
import java.util.List;

public class Folder extends Composante{

    protected List<Composante> composantes = new ArrayList<>();
    public Folder(String name) {
        super(name);
    }

    @Override
    public void afficher() {
        System.out.println(getTab()+"- Folder : "+name);
        for ( Composante composante: composantes) {
            composante.afficher();
        }
    }

    public Composante addComposante(Composante composante){
        this.composantes.add(composante);
        composante.level=this.level+1;
        return composante;
    }

    public void remove(Composante composante){
        this.composantes.remove(composante);
    }
}
