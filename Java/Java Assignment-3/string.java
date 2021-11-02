public class string {
    public static void main(String[] args) {
        
        //String assignment
        String s1 = new String("Hello World");
        String s2 = new String("Hello");
        String s3 = new String("How are you?");
        String s4 = new String("Java String pool refers to collection of Strings ehich are stored in heap memory");
        String s5;
        int s6;
        boolean s7;

        s6 = s1.length();
        System.out.println("Ans-1: "+ s6);

        s5 = s2.concat(s3);
        System.out.println("Ans-2: "+ s5);

        s5 = s4.toLowerCase();
        System.out.println("Ans-3_a.: "+ s5);

        s5 = s4.toUpperCase();
        System.out.println("Ans-3_b.: "+ s5);

        s5 = s4.replace('a','$');
        System.out.println("Ans-3_c.: "+ s5);

        s7 = s4.contains("collection");
        System.out.println("Ans-3_d.: "+ s7);

        s6 = s4.compareTo("Java String pool refers to collection of Strings which are stored in heap memory");
        System.out.println("Ans-3_e.: "+ s6);

        s7 = s4.equals("Java String pool refers to collection of Strings which are stored in heap memory");
        System.out.println("Ans-3_e.: "+ s7);

        s7 = (s4 == "Java String pool refers to collection of Strings which are stored in heap memory");
        System.out.println("Ans-3_f.: "+ s7);

        // String Buffer Assignment
        StringBuffer sb = new StringBuffer("Welcome");

        sb.append(" Divyanshu Jha");
        System.out.println("SB/Ans-1.: "+ sb);

        sb.insert(7," Mr.");
        System.out.println("SB/Ans-2.: "+ sb);

        sb.reverse();
        System.out.println("SB/Ans-3.: "+ sb);

        // String Builder Assignment
        StringBuilder SB = new StringBuilder("Welcome");

        SB.append(" Divyanshu Jha");
        System.out.println("SB/Ans-1.: "+ SB);

        SB.insert(7," Mr.");
        System.out.println("SB/Ans-2.: "+ SB);

        SB.reverse();
        System.out.println("SB/Ans-3.: "+ SB);

    }
    
}
