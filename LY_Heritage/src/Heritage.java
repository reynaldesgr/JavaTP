public class Heritage {
   
    public static class Mere {
        protected String nom;

        public Mere()
        {
            System.out.println("Constructin de mere par defaut");
        }

        public Mere(String nom)
        {
            this.nom = nom;
        }

        /* Eviter la redefinition */

        /*
         * final public void m()
         * {
         *      System.out.println("Je suis ta mere ["+nom"]");
         * }
         */

        public void m()
        {
            System.out.println("Methode de mere");
        }
    }

    public static class Fille extends Mere
    {
        // Constructeur
        public Fille()
        {
            System.out.println("Construction de fille");
            this.nom = "Fille";
        }

        public Fille(String nom)
        {
            super(nom);
        }

        @Override
        public void m()
        {
            System.out.println("Methode de fille");
        }
    }

    public static void main(String arg[])
    {
        Fille f = new Fille();

        /* Constructeur de Mere(string nom) n'est pas hérité dans Fille */
        
        Fille f1 = new Fille("essai"); 

        /*
         * Pour appeler le bon constructeur Mere, il faut préciser : super(nom)
         * afin d'appeler le constructeur prenant en paramètre une string
         * 
         * La détermination de la bonne méthode se fait à l'exécution pas à la compilation
         * = méthode virtuelle
         */
        
        f.m();
        
        f1.m();
    }
    
    /*
     * A savoir : 
     * - vérifier les visibilités
     * - connaitre le lien entre protected et package
     * - pas d'héritage multiple en Java 
     * - seules les méthodes de la classe mère permettent d'accéder aux attributs spécifiques de la classe mère
     */
}
