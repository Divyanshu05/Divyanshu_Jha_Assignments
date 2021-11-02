import java.util.Scanner;

public class Answer1 {
    public static void main(String[] args) {
    try{
    float i,j, div;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter divident: ");
    i = sc.nextFloat();
    System.out.println("Enter divisor: ");
    j = sc.nextFloat();
    sc.close();


    div = i/j;
    System.out.println("Result of Division = " + div);
    }
    catch (ArithmeticException e) {
        System.out.println("Division by 0");
        e.printStackTrace();
        System.out.println("Enter valid numbers to be printed");
    }   
}   
}
