public class J15_Narrowing_Int_Conversion {
    
    public static void main ( String[]args){
        int i  = 214;

        // char c=i;
        // short s=i;
        // byte b=i;

        // System.out.println(i);
        // System.out.println(c);
        // System.out.println(s);
        // System.out.println(b);

        char c1=(char)i;
        short s1=(short)i;
        byte b1=(byte)i;

        System.out.println(i);
        System.out.println(c1);
        System.out.println(s1);
        System.out.println(b1);

    }
}




