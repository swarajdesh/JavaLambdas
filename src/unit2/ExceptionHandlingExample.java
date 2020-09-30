package unit2;

import java.util.function.BiConsumer;

public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int[] scoreNumbers = {1,2,3,4,5};
        int key = 0;

        process(scoreNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] scoreNumbers, int key, BiConsumer<Integer , Integer> consumer) {
        for (int i:
             scoreNumbers) {
            consumer.accept(i,key);
        }
    }

    private static BiConsumer<Integer , Integer> wrapperLambda(BiConsumer<Integer , Integer> consumer){
      return (v, k) -> {
          try {
              consumer.accept(v, k);
          }catch (ArithmeticException e){
              System.out.println("Exception caught in wrapper lambda");
          }
      };
    }
}
