import java.util.Scanner;

public class leapYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the year");
        int year = input.nextInt();
        if(year%4==0 && year%400==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("It is not a leap year");
        }

    }
}