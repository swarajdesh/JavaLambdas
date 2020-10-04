package unit3;

public class MethodReferenceExample1 {

    public static void main(String[] args) {

        Thread t = new Thread(MethodReferenceExample1::printmessage);
        //MethodReferenceExample1::printmessage == () -> printMessage()
        t.start();

    }

    public static void printmessage(){
        System.out.println("Hello");
    }
}
