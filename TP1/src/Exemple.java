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
        
        StringBuffer s1 = new StringBuffer("Test String Buffer");
        System.out.println(s1);

        StringBuilder s2 = new StringBuilder("Test String Builder"); // par capacity aussi
        System.out.println(s2);
    }
}
