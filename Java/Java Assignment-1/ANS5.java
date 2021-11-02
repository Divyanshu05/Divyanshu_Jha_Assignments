import java.util.*;
public class ANS5 {

    public static void main(String[] args) {
        double CTC;
        double Tax = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your CTC / Salary : ");
        CTC = sc.nextFloat();

        if (CTC <= 180000){
            Tax = 0;
        }
        else if (CTC <= 300000){
            Tax = CTC * 0.1;
        }
        else if (CTC <= 500000){
            Tax = CTC * 0.2;
        }
        else if (CTC <= 1000000){
            Tax = CTC * 0.3;
        }
        else{
            System.out.println("Enter a Vaild amount");
        }
        System.out.println("Your Taxable Amount is "+ Tax);
    }
}
