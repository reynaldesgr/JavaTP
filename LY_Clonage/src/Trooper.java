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


    Trooper(String nom, int nivSante,  Grade grade)
    {
        this.nom        = nom;
        this.arme       = Math.random() > 0.5 ? new Pistolet() : new Fusil();
        this.nivSante   = nivSante;
        this.grade      = grade;
        this.id         = ++cpt;
    }

    @Override
    public Object clone()
    {
        Trooper object = null;
        try
        {
            object = (Trooper) super.clone();
            System.out.println("Clone de Jango Felt #"+ id);
            object.id = ++cpt;
            
        }
        catch (CloneNotSupportedException cnse)
        {
            cnse.printStackTrace(System.err);
        }
        return object;
    }

    public void setNom(String nom)
    {
        this.nom = nom;
    }

    public void setNiveauSante(int nivSante)
    {
        this.nivSante = nivSante;
    }

    public void setArme(Arme a)
    {
        this.arme = a;
    }

    public Arme getArme()
    {
        return this.arme;
    }


}
