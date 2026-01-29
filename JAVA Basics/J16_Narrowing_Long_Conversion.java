
    public class J16_Narrowing_Long_Conversion {
    public static void main ( String[]args){
        long l  = 327517l;

        // int i=l;
        // char c=l;
        // short s=l;
        // byte b=l;

        // System.out.println(l);
        // System.out.println(i);
        // System.out.println(c);
        // System.out.println(s);
        // System.out.println(b);

        int i1=(int)l;
        char c1=(char)l;
        short s1=(short)l;
        byte b1=(byte)l;

        System.out.println(l);
        System.out.println(i1);
        System.out.println(c1);
        System.out.println(s1);
        System.out.println(b1);

    }
}


