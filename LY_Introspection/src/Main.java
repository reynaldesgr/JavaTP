package src;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import java.util.Random;
import java.util.Scanner;

public class Main 
{
    public static void main(String[] args) throws Exception
    {
        Personne p = new Personne();
        p.afficherClasse();
        
        Enfant e = new Enfant();
        e.afficherClasse();

        Personne e2 = new Enfant();
        e2.afficherClasse();

        try
        {
            String className = "src.Personne";
            
            // ? : Type générique inconnu ou non spécifié
            Class<?> clazz = Class.forName(className);

            Object instance = clazz.getDeclaredConstructor().newInstance(); // java 9 et +

            if (instance instanceof Personne)
            {
                Personne personne = (Personne) instance;
                personne.afficherClasse();
                
                System.out.println("L'instance est-il une instance de Enfant ?");
                System.out.println((instance instanceof Enfant)?"vrai":"faux");
            }
            else
            {
                System.out.println("L'instance n'est pas de type Personne.");
                
            }

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodError | InvocationTargetException excp) 
        {
            excp.printStackTrace();
        }


        try
        {
            Class<?> enfantClass = Class.forName("src.Enfant");
            
            Object enfantInstance = enfantClass.getDeclaredConstructor().newInstance();

            Class<?> parentClass = enfantClass.getSuperclass();
            System.out.println("La classe mere de l'objet Enfant est : " + parentClass.getSimpleName());

            // Introspection
            Constructor<?>[] constructors = Personne.class.getDeclaredConstructors();

            System.out.println("Constructeurs de la classe Personne : ");

            for (Constructor<?> constructor : constructors)
            {
                System.out.println(constructor);
            }

            // Tentative de création d'un objet Personne avec newInstance() et des args.
            try
            {
                // Récupération du constructeur avec param String
                Constructor<Personne> personneConstructor = Personne.class.getConstructor(String.class);

                Personne personneString = personneConstructor.newInstance("Cynthia");

                System.out.println("Nom de la personne instancee avec param. :  " + personneString.getNom());
            }
            catch (NoSuchMethodError excp)
            {
                System.out.println("Le constructeur avec des args. n'existe pas");
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException | InvocationTargetException excp) {
            excp.printStackTrace();
        }

        // Greffon non générique
        double[] tab = new double[10];
        Random rd = new Random();

        for (int i = 0; i < tab.length; i++)
        {
            tab[i] = rd.nextDouble() * 100; // entre 0 et 100
        }

        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nom d'une classe implementant l'interface Algorithme (avec package) : ");
        String nomClazz = scanner.nextLine();

        try
        {
            // Récupérer la classe
            Class<?> classe = Class.forName(nomClazz);

            // Vérifier que la classe implémente Algorithme
            if (Algorithme.class.isAssignableFrom(classe))
            {
                Algorithme algorithme = (Algorithme) classe.getDeclaredConstructor().newInstance();
                algorithme.appliquer(tab);
            }
            else
            {
                System.out.println("La classe ne respecte pas l'interface Algorithme.");

            }
        }
        catch (ClassCastException | ClassNotFoundException | InstantiationException | IllegalAccessException | NoSuchMethodException excp) {
            excp.printStackTrace();
            System.out.println("Erreur lors de la creation de la classe.");
        }

    }

   
    
}
