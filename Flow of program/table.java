import java.util.Scanner;
public class table {
public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number for table:");
    int num1 = input.nextInt();
    for(int i=1; i<=10; i++)
    System.out.println(num1 + " * " + i + " = " + num1 * i);
    
}

}