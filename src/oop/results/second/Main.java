package oop.results.second;

public class Main {
    public static void main(String[] args) {

        JSPrompt jsp = new JSPrompt();
        String name = jsp.prompt("Your name?:");
        int age = jsp.promptInt("Your age?:");
        System.out.println("Hi " + name + "! You are " + age + " old");
    }
}