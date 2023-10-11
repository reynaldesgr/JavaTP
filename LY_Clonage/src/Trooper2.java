package src;

public class Trooper2 extends Trooper 
{
    public Trooper2(String nom, int nivSante, Grade grade)
    {
        super(nom, nivSante, grade);
    }

    @Override
    public Object clone()
    {
        Trooper object = null;
        object = (Trooper2) super.clone();
        object.setArme((Arme) getArme().clone());
       
        return object;
    }
    
}
