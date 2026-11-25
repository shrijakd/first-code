import java.util.*;
public class array6 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("Enter your no.");
        for (int i = 0 ; i < number.length; i++) {
            number[i] = sc. nextInt();
        }

        System.out.print("entyer your no. to search : ");
        int x = sc.nextInt();

        for (int i = 0; i < number.length; i++) {
            if (number[i] == x) {
                System.out.println("Congrats your no. is exitist on the index :" + i );
            }
            
        }
        //System.out.println("Congrats your no. is exit :" number[i]);
    }
}