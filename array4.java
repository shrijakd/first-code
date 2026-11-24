import java.util.*;
public class array4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];
        System.out.println("Enter your numbers:");
        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("Smallest elemet in this arary is:");
        int smallest = number[0];
        for (int i = 1 ; i < number.length; i++) {
            if (number[i] < smallest) {
                smallest = number[i];
            }
        }
        System.out.println(smallest);

    }
}