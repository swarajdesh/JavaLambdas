package unit2;

public class ClosuresExample {

    public static void main(String[] args) {
        int a = 10;
        int b = 10;

        doProcess(a, i -> System.out.println(i + b));
    }

    public static void doProcess(int i, Process p) {
        p.Process(i);
    }

}
interface Process{
    void Process(int i);
}
