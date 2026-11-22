import java.util.*;
public class cntrlflow7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a;
        do {
             System.out.println("Enter 1 to continue and 0 to stop");
              a = sc.nextInt();
             if ( a==1) {
                System.out.println("Enter your marks ");
                int b = sc.nextInt();
                if (b >= 90 && b <= 100){
                    System.out.println("this is Good");
                }
                else if (89 >= b && b >= 60) {
                    System.out.println("This is also good");
                }
                else if (59 >= b && b>= 0) {
                    System.out.println("this is Good as well");
                }
                else {
                    System. out.println("you eneter invalid number");
                }
            }
        } while ( a == 1);
        System.out.println("You enter 0 so the program is stopped");
        //sc.close();

    }
}
