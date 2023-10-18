package src;

public class Afficher implements Algorithme
{

    @Override
    public void appliquer(double[] d) 
    {
        for (double values : d)
        {
            System.out.println(values + " ");
        }

        System.out.println();
    }

    
}
