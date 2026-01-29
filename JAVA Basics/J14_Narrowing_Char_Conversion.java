public class J14_Narrowing_Char_Conversion {

    
    public static void main ( String[]args){
        char c  = 214;
        
        // short s=c;
        // byte b=c;

        // System.out.println(c);
        // System.out.println(s);
        // System.out.println(b);

        short s1=(short)c;
        byte b1=(byte)c;

        System.out.println(c);
        System.out.println(s1);
        System.out.println(b1);

    }
}





