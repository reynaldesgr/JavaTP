public class StringCMD 
{
    public static void main(String arg[])
    {
        int t;
        if ( (t = arg.length) > 1){
            for (int i = 0; i < t; i++)
            {
                System.out.println("Param "+i+" : "+arg[i]);
            }
        }
    }
    
}
