package src;

public class Enfant extends Personne 
{
    public Enfant()
    {
        super();
    }

    public Enfant(String name)
    {
        super(name);
    }

    @Override
    public void afficherClasse()
    {
        System.out.println("Je suis de la classe " + this.getClass().getSimpleName());
    }
    
}
