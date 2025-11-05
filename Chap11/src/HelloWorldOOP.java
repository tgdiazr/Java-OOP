/*
 * Student Name: Tania Diaz
 * Date: August 30, 2025
 * Program: Hello World OOP
 * This program prints "Hello World!" five times using Object-Oriented Programming.
 * Time spent: 1 hour
 * Honor Code: I pledge that this program represents my own program code.
 * I received help from: no one.
 */

public class HelloWorldOOP {
    
    // field
    private String message;
    
    // constructor
    public HelloWorldOOP(String message) {
        this.message = message;
    }
    
    // getter
    public String getMessage() {
        return message;
    }
    
    // setter
    public void setMessage(String message) {
        this.message = message;
    }
    
    // override toString
    @Override
    public String toString() {
        return getMessage();
    }
    
    // main method
    public static void main(String[] args) {
        HelloWorldOOP obj = new HelloWorldOOP("Hello World!");
        
        // Print message 5 times
        System.out.println(obj);
        System.out.println(obj);
        System.out.println(obj);
        System.out.println(obj);
        System.out.println(obj);
    }
}

