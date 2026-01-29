import java.util.Scanner;

public class UserInfo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Name:");
        String name = sc.nextLine();

        System.out.println("Enter Your Age:");
        int age = sc.nextInt();
    

        System.out.println("Enter Your Contact No.:");
        long cNo = sc.nextLong();
        sc.nextLine();

        System.out.println("Enter Your Salary:");
        double sal = sc.nextDouble();
        sc.nextLine();

        System.out.println("Enter Your College Name:");
        String cName = sc.nextLine();
        

        System.out.println(name);
        System.out.println(age);
        System.out.println(cNo);
        System.out.println(sal);
        System.out.println(cName);
    }
}
