package src;

public class TPException 
{
    public static void main(String[] main)
    {
        CompteBancaire compte = new CompteBancaire();
        System.out.println(compte.toString());

        compte.setSolde(100);

        // try-catch ou throws IllegalArgumentException / AutorisationException
        try
        {
            //compte.retrait(-10);
            compte.retrait(900);
        }
        catch (IllegalArgumentException illegalArgException)
        {
            System.out.println("-- Illegal Arg. Exception --");
            System.out.println(illegalArgException.getMessage());

        }
        catch(AutorisationException autorisationException)
        {
            System.out.println("-- Autorisation Arg. Exception --");
            System.out.println(autorisationException.getMessage());
        }

    }
    
}
