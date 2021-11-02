public class Ans1 {
    public static void main(String[] args) {
        singelton Objx = singelton.getInstance();
        
    }
}

class singelton{
    static singelton obj = new singelton();
    private singelton(){

    }
    public static singelton getInstance(){
        return obj;
    }
}

