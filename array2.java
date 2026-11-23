import java.util.*;
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] numbers = new int[5];
        //for input
        System.out.println("Enter your numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        // for output
        System.out.println ("sum of all numerss is:");
        int sum = 0;
        int average = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            average = sum / numbers.length;
        }
        System.out.println(sum);
        System.out.println("Average of all numbers is : " + average);
    }
}