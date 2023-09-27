public class Trooper 
{
    private static int      id;
    private        String   nom;
    private        int      nivSante;
    private        Arme     arme;
    //private        Ceinture ceinture;

    private        Grade    grade;

    @Override
    public String toString()
    {
        String str = "[Trooper] Nom : " + this.nom + "\nIdentifiant : " + id + "\nNiveau de santé : " + this.nivSante;
               str +=  "\nArme : " + this.arme + "\nGrade : " + this.grade;
        return str;
    } 
}
