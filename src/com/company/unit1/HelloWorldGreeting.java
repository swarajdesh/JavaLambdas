package com.company.unit1;

import com.company.unit1.Greeting;

public class HelloWorldGreeting implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello World !!!!");
    }
}
