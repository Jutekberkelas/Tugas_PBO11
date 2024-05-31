import java.io.*;

public class Test3 {
    public void methodA(){
        System.out.println("Method A");
    }
    
    public void methodB() {
        try {
            System.out.println(20 / 0); 
            System.out.println("Method B");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero");
        }
    }
}

class Utama {
    public static void main(String[] args) {
        Test3 c = new Test3();
        c.methodA();
        try{
            c.methodB();
        }
        catch(Exception e){
            System.out.println("error di Method B");
        }
        finally{
            System.out.println("Ini selalu dicetak");
        }
    }
}
