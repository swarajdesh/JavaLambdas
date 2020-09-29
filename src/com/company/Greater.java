package com.company;

public class Greater {

   public void greet(Greeting greeting){
    greeting.perform();
   }


    public static void main(String[] args) {
	// write your code here
        Greater greater = new Greater();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greater.greet(helloWorldGreeting);

        Greeting myLambdaFunction = () -> System.out.println("Hello World!!");
        greater.greet(myLambdaFunction);
    }
}
