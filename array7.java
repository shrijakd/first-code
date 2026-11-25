import java.util.*;
public class array7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }
        System.out.println(size-1);
        for (int i = size-1; i >= 0; i--) {
            System.out.println(number[i] + ",");

        }
    }
}