package logicalprogram;
import java.util.Scanner;
public class PerfectNumber {
    private static Scanner sc;
    public static void main(String[] args) {
        int i, Number, Sum = 0 ;
        sc = new Scanner(System.in);
        Number = sc.nextInt();
        System.out.println("\n Please Enter any Number: ");

        for(i = 1 ; i < Number ; i++) {
            if(Number % i == 0)  {
                Sum = Sum + i;
            }
        }
        if (Sum == Number) {
            System.out.format("\n% d is a Perfect Number", Number);
        }
        else {
            System.out.format("\n% d is NOT a Perfect Number", Number);
        }
    }
}
