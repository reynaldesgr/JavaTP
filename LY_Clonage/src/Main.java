package src;

public class Main 
{
    public static void main(String[] args)
    {
        Arme    armeTest    = new Fusil("F1");;
        Trooper trooperTest = new Trooper("Cody", 100, armeTest, Grade.COMMANDEUR);
        System.out.println("\n" + trooperTest + "\n");

        Trooper cloneTrooperTest = (Trooper) trooperTest.clone();

        System.out.println("\n" + trooperTest);
    }
    
}
