public class J17_Narrowing_Float_Conversion {
    public static void main ( String[]args){
        float f  = 327.567f;

        // long l=f;
        // int i=f;
        // char c=f;
        // short s=f;
        // byte b=f;

        // System.out.println(f);
        // System.out.println(l);
        // System.out.println(i);
        // System.out.println(c);
        // System.out.println(s);
        // System.out.println(b);

        long l1=(long)f;
        int i1=(int)f;
        char c1=(char)f;
        short s1=(short)f;
        byte b1=(byte)f;

        System.out.println(f);
        System.out.println(l1);
        System.out.println(i1);
        System.out.println(c1);
        System.out.println(s1);
        System.out.println(b1);

    }
}

