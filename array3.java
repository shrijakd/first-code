import java. util.*;
public class array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numbers[] = new int[5];
         System.out.println("enter your no.");
         for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
         }

        System.out.println("largest no. among of the given no. is:");
        int largest = numbers[0];
        //System.out.println(numbers[0]);
        //System.out.println(largest + ": this is the value stored in the largest variable");
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        System.out.println(largest);

    }
}