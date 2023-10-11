package src;

import java.util.Random;

abstract public class Arme implements Cloneable
{
    protected String nom;
    protected int    numSerie;

    Arme(String nom, int numSerie)
    {
        this.nom      = nom;
        this.numSerie = numSerie;
    }

    Arme(String nom)
    {
        Random r      = new Random();
        this.nom      = nom;
        this.numSerie = r.nextInt(100);
    }


    @Override
    public String toString()
    {
        String str = "Nom : " + this.nom + "\nNum. Serie : " + this.numSerie;
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

    public void setNumSerie(int numSerie)
    {
        this.numSerie = numSerie;
    }

    @Override 
    public Object clone()
    {
        Arme object = null;
        try
        {
            object = (Arme) super.clone();
            
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return object;
    }
}

