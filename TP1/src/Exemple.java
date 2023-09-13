public class Exemple
{
    // point d'entrée
    public static void main(String[] argv)
    {
        int i = 0;
        i = i + 1;
        i += 1;
        i *= 2;

        System.out.println(i); // 4
        System.out.println(++i); // 5 (incremente puis retourne i)
        System.out.println(++i); // 5 
        System.out.println(i); // 5
        System.out.println(i++); // 5 (retourne i puis incremente)
        System.out.println(i); // 6

        i = (int) 10.6;

        System.out.println(i); // 10

        //System.out.println("Bonjour");
        // /** : doxygen */

        // String : StringBuffer (constante) & StringBuilder (modifiable)
        // 1 est threads safe et pas le second
        
        StringBuffer s1     = new StringBuffer("Test String Buffer");

        StringBuffer s1v2   = new StringBuffer("Bonjour");
        StringBuffer s2v2   = s1v2;

        System.out.println(s2v2);

        s1v2.append(" les ZZ");
        s1v2.append(2);

        System.out.println(s1v2);
        System.out.println(s1v2);

        System.out.println(s1v2);
        
        // Longueur
        System.out.println(s1v2.length());
        
        // Capacity
        System.out.println(s2v2.capacity());
        
        /*
        La capacité d'un StringBuffer est le nombre de caractères 
        qu'il peut contenir avant qu'il ne doive augmenter sa taille interne 
        pour accueillir davantage de caractères 
        */

        StringBuilder s2 = new StringBuilder("Test String Builder"); // par capacity aussi
        System.out.println(s2);
    }
}
