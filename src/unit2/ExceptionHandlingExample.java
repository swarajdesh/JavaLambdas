package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] scoreNumbers = {1,2,3,4,5};
        int key = 0;

        process(scoreNumbers, key, (i,k) -> System.out.println(i / k));
    }

    private static void process(int[] scoreNumbers, int key, BiConsumer<Integer , Integer> consumer) {
        for (int i:
             scoreNumbers) {
            consumer.accept(i,key);
        }
        
    }
}
