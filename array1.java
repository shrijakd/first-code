import java.util.*;
public class array1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        //for input
        System.out.println("Enter 5 numbers: ");
        for (int i = 0;  i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }
        // for output
        System.out.println("the numbers you entered are: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


    }
}