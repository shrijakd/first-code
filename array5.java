import java.util.*;
public class array5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("enter your numbers to find out how many Even and Odd no. present in Array");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        int evenCount = 0;
        int oddCount = 0;

        for (int num : number) {
            if (num % 2 == 0) {
                evenCount = evenCount + 1;
            }
            else {
                oddCount = oddCount + 1;
            }
        }
        System.out.println("Even :" + evenCount);
        System.out.println("Odd :" + oddCount);

    }
}