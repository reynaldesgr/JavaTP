package src;

import java.util.Arrays;
public class Trier implements Algorithme 
{

    @Override
    public void appliquer(double[] d) 
    {
        Arrays.sort(d);

        for (double values : d)
        {
            System.out.println(values + " ");
        }

        System.out.println();
    }
    
}
