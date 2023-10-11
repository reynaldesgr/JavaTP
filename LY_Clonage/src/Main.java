package src;

public class Main 
{
    public static void main(String[] args)
    {
        Trooper trooperTest = new Trooper("Cody", 100, Grade.COMMANDEUR);
        System.out.println("\n" + trooperTest + "\n");

        Trooper cloneTrooperTest = (Trooper) trooperTest.clone();

        //System.out.println("\n" + trooperTest);


        // Modifier le nom du clone ("Mort"), le numéro de série de l'arme & niveau de santé à 49.
        cloneTrooperTest.setNom("Mort");
        cloneTrooperTest.getArme().setNumSerie(45);
        cloneTrooperTest.setNiveauSante(49);

        System.out.println("\n Modification du Trooper clone : \n" + cloneTrooperTest);
        System.out.println("\n * Trooper originel :  \n" + trooperTest);

        // L'arme du clone et l'arme original ont encore le même numéro de série
        // Le clonage a crée deux clones qui partagent la même arme

        /*
        La méthode super.clone() 
        effectue une copie superficielle de l'objet, 
        ce qui signifie que les références aux objets internes ne sont pas dupliquées.  
        Par conséquent : les clones partagent la même référence à l'objet Arme.
        */

        System.out.println("\n-- Copie profonde : --\n" + cloneTrooperTest);

        Trooper2 trooper2Test = new Trooper2("Cody", 100, Grade.COMMANDEUR);
        Trooper2 cloneTrooper2Test = (Trooper2) trooper2Test.clone();

        // Modifier le nom du clone ("Mort"), le numéro de série de l'arme & niveau de santé à 49.
        cloneTrooper2Test.setNom("Mort");
        cloneTrooper2Test.getArme().setNumSerie(45);
        cloneTrooper2Test.setNiveauSante(49);

        System.out.println("\n Modification du Trooper clone : \n" + cloneTrooper2Test);
        System.out.println("\n * Trooper originel :  \n" + trooper2Test);

        // Les clones ne partagent plus la même référence à l'objet Arme.

    }
    
}
