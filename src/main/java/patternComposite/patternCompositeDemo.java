package patternComposite;

import patternComposite.fileSystem.Composante;
import patternComposite.fileSystem.File;
import patternComposite.fileSystem.Folder;

public class patternCompositeDemo {
    public static void main(String[] args) {
        Folder root = new Folder("Project");
        root.addComposante(new File("config.properties"));
        root.addComposante(new File("pom.xml"));

        Folder src = (Folder) root.addComposante(new Folder("src"));
        Folder main = (Folder) src.addComposante(new Folder("main"));
        Folder test = (Folder) src.addComposante(new Folder("test"));


        main.addComposante(new File("classJava.java"));
        Folder resources = (Folder) main.addComposante(new Folder("resources"));
        resources.addComposante(new File("fichierResources.txt"));
        main.addComposante(new File("main.java"));
        File application = new File("application.java");
        main.addComposante(application);

        test.addComposante(new File("classTest.java"));

        root.afficher();

        System.out.println("----------------------");
        main.remove(application);
        root.afficher();
        System.out.println("----------------------");
        main.remove(resources);
        root.afficher();


    }
}
