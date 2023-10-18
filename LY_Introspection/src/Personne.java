package src;

public class Personne 
{
    private String name;

    public Personne()
    {
       this.name = "Nobody";
    }

    public Personne(String name)
    {
        this.name = name;
    }


    public void afficherClasse()
    {
        System.out.println("Je suis de la classe " + this.getClass().getSimpleName());
    }

    public String getNom()
    {
        return this.name;
    }
  
}
