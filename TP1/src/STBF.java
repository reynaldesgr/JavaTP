public class STBF {
    
    public static void main(String[] arg)
    {
        System.out.println("-- String --");
        String s = new String("loic");
        afficherObjetEtHashCode(s);
        s = new String("yon");
        afficherObjetEtHashCode(s);
        /* Erreur de compilation : s n'est pas un tableau !
         * s[0] = 'i';
         */
        s = "i" + s.substring(1); // Nouvelle allocation mémoire
        afficherObjetEtHashCode(s);

        System.out.println("-- String Buffer --");
        StringBuffer sb = new StringBuffer("loic");
        afficherObjetEtHashCode(sb);
        sb = new StringBuffer("yon");
        afficherObjetEtHashCode(sb);
        /* Erreur de compilation : sb n'est pas un tableau ! 
         * sb[0] = 'i';
        */
        sb.replace(0, 1, "i");
        afficherObjetEtHashCode(sb);
    }

    public static void afficherObjetEtHashCode(Object object)
    {
        System.out.println(object);
        System.out.println(object.hashCode());
    }
    
}
