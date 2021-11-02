import java.util.*;

public class ANS3 {
	public static void main (String [] args) {
	double p, r, t, SI, CI ;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Principle Amount : ");
	p = sc.nextDouble();
	System.out.println("Enter Rate of Intrest : ");
	r = sc.nextDouble();
	System.out.println("Enter Time Duration : ");
	t = sc.nextDouble();
	SI = (p*r*t)/100;
	CI = p*Math.pow(1+r/100,t) - p;
	System.out.println("Simple Intrest = "+ SI);
	System.out.println("Compound Intrest = "+ CI);
    }
}