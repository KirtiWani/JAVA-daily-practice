public class J18_Narrowing_Double_Conversion {
    public static void main ( String[]args){
        double d = 327.567;

        // float f=d;
        // long l=d;
        // int i=d;
        // char c=d;
        // short s=d;
        // byte b=d;

        // System.out.println(d);
        // System.out.println(f);
        // System.out.println(l);
        // System.out.println(i);
        // System.out.println(c);
        // System.out.println(s);
        // System.out.println(b);

        float f1=(float)d;
        long l1=(long)d;
        int i1=(int)d;
        char c1=(char)d;
        short s1=(short)d;
        byte b1=(byte)d;

        System.out.println(d);
        System.out.println(f1);
        System.out.println(l1);
        System.out.println(i1);
        System.out.println(c1);
        System.out.println(s1);
        System.out.println(b1);

    }
}
