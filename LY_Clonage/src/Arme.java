
abstract public class Arme
{
    private String nom;
    private int    numSerie;

    Arme(String nom, int numSerie)
    {
        this.nom      = nom;
        this.numSerie = numSerie;
    }

    Arme(String nom)
    {
        this.nom      = nom;
        this.numSerie = 1;
    }

    @Override
    public String toString()
    {
        String str = "Nom : " + this.nom + "\n Num. Serie : " + this.numSerie;
        return str;
    }

    public String getNom()
    {
        return String.copyValueOf(this.nom.toCharArray());
    }

    public int getNumSerie()
    {
        return this.numSerie;
    }
}

