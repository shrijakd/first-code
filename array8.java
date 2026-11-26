import java.util.*;
public class array8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("kindly enter your array size : ");
        int size = sc.nextInt();
        int number[] = new int[size];

        System.out.println("kindly enter your array elemets : ");
        for(int i = 0; i < number.length; i++) {
            number[i] = sc.nextInt();
        }

        int postvCount = 0;
        int negativeCount = 0;
        int zeroCount = 0;

        for (int i=0; i < number.length; i++) {
            if (number[i] == 0) {
                zeroCount = zeroCount + 1;
            }
            else if (number[i] < 0 ) {
                negativeCount = negativeCount + 1;
            }
            else {
                postvCount = postvCount + 1;
            }
        }
        System.out.println("Positive Count :" + postvCount);
        System.out.println("Negative Count : " + negativeCount);
        System.out.println("Zero value : " + zeroCount);
    }
}