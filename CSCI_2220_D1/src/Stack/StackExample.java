package Stack;

import java.util.*;

public class StackExample {

    public static void main(String[] args) {

        Stack<String> stack1 = new Stack<String>();

        System.out.println("Pushing an A");
        stack1.push("A");

        System.out.println("Pushing a B");
        stack1.push("B");

        System.out.println("Pushing a C");
        stack1.push("C");

        int B_Location = stack1.search("B");

        System.out.println("The size of the stack is: " 
                + stack1.size() 
                + " and there is a B at location " 
                + B_Location);

        System.out.println("Popping the stack now...");
        System.out.println(stack1.pop());

        System.out.println("Popping the stack now...");
        System.out.println(stack1.pop());

        System.out.println("Popping the stack now...");
        System.out.println(stack1.pop());

        System.out.println("Push a Z on to the stack...");
        stack1.push("Z");

        if (stack1.pop().equals("Z")) {
            System.out.println("We popped the stack and it was a Z");
        }
    }
}