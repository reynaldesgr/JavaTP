public class TestString 
{
    public static void main(String[] arg)
    {
        System.out.println("--- Test s1 ---");
        StringBuffer s1 = new StringBuffer("essai");
        StringBuffer s3 = s1;
        System.out.println("S1 (append) : " + s1.append(" de concatenation"));
        System.out.println("S1 : " + s1);
        System.out.println("S3 : " + s3);

        System.out.println("\r\n --- Test s2 ---");
        String s2 = new String("essai");
        System.out.println("S2 (replace) : " + s2.replace('s', 'Z'));
        System.out.println("S2 : " + s2);
        s2.concat(" de concatenation");
        System.out.println("S2 : " + s2);
        s2 = new String("changement valide");
        System.out.println("S2 : " + s2);
    }
}
