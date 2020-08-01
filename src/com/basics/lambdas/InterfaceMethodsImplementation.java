package com.basics.lambdas;

/*
    Lambda expressions are used primarily to define inline implementation of a functional interface, i.e., an interface
    with a single method only. In the following example, I've used various types of lambda expressions to define the
    operation method of MathOps interface. Then we have defined the implementation of sayMessage of GreetingService.

    Lambda expression eliminates the need of anonymous class and gives a very simple yet powerful functional programming
    capability to Java
*/

public class InterfaceMethodsImplementation {
    interface MathOps {
        int operation(int a, int b);
    }
    interface GreetingService {
        void greet(String s);
    }
    public static void main(String[] args) {

        // complete type declaration along with return stmt
        MathOps addition = (int a, int b) -> { return (a+b); };
        // without type declaration
        MathOps subtraction = (a, b) -> { return a-b; };
        // without return stmt as well
        MathOps multiplication = (int a, int b) -> a*b;
        // without type declaration & return stmt
        MathOps division = (a, b) -> (b!=0)?(a/b):-111;

        // addition
        System.out.println("10+17="+operate(9, 18, addition));
        // subtraction
        System.out.println("36-9="+operate(36, 9, subtraction));
        // multiplication
        System.out.println("9X3="+operate(9, 3, multiplication));
        // division
        System.out.println("81/3="+operate(81, 3, division));

        GreetingService srvc = message -> System.out.println("Hello "+message); // (message) also works
        srvc.greet("Sharad");
    }

    static int operate(int a, int b, MathOps opcode) {
        return opcode.operation(a,b);
    }
}
