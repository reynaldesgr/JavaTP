package src;
public class Trooper implements Cloneable 
{
    private static int      cpt;
    private        int      id;
    private        String   nom;
    private        int      nivSante;
    private        Arme     arme;
    //private        Ceinture ceinture;

    private        Grade    grade;

    @Override
    public String toString()
    {
        String str = "[Trooper] Nom : " + this.nom + "\nIdentifiant : " + id + "\nNiveau de sante : " + this.nivSante;
               str +=  "\nArme : \n" + this.arme + "\nGrade : " + this.grade;
        return str;
    } 


    Trooper(String nom, int nivSante, Arme arme, Grade grade)
    {
        this.nom        = nom;
        this.nivSante   = nivSante;
        this.arme       = arme;
        this.grade      = grade;
        this.id         = cpt;

        cpt++;
    }

    @Override
    public Object clone()
    {
        Trooper object = null;
        try
        {
            object = (Trooper) super.clone();
            System.out.println("Clone de Jango Felt #"+ id);

            this.id = cpt;
            
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return object;
    }

    /*Trooper(Trooper trooperToClone)
    {
        this.nom        = trooperToClone.nom;
        this.nivSante   = trooperToClone.nivSante;
        this.arme       = trooperToClone.arme;
        this.grade      = trooperToClone.grade;

        System.out.println("Clone de Jango Felt #"+trooperToClone.id);
        cpt++;

        this.id = cpt;
    }*/

}
