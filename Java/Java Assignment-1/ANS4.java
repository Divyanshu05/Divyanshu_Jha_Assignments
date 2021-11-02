import java.util.*;
public class ANS4 {
    public static void main(String[] args) {
        int s1, s2, s3 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Marks in Subject 1 : ");
        s1 = sc.nextInt();
        System.out.println("Enter Marks in Subject 2 : ");
        s2 = sc.nextInt();
        System.out.println("Enter Marks in Subject 3 : ");
        s3 = sc.nextInt();

        

        if(s1>=60 && s2>=60 && s3>=60){
            System.out.println("Passed");
        }
        else if ((s1>=60 && s2>=60)||(s2>=60 && s3>=60)||(s1>=60 && s3>=60)){
            System.out.println("Promoted");
        }
        else{
            System.out.println("Failed");
        }
    }
}
