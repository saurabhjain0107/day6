package logicalprogram;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        int num =2345,reversed=0;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number : ");
        for(;num != 0; num /= 10) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
