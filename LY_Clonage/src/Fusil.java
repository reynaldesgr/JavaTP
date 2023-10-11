package src;
public class Fusil extends Arme
{
    Fusil(String nom, int numSerie)
    {
        super(nom, numSerie);
    }

    Fusil(String nom)
    {
        super(nom);
    }

    Fusil()
    {
        super("Fusil");
    }

    @Override
    public String toString()
    {
        String str = "Nom : " + super.nom + "\nNum. Serie : " + this.numSerie;
        return str;
    }

}
