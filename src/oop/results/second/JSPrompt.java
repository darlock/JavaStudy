package oop.results.second;

import java.util.Scanner;

public class JSPrompt {

    Scanner sc;
    String input;

    JSPrompt() {
        this.sc = new Scanner(System.in, "Windows-1250");
        this.input = "";
    }

    String prompt(String text) {
        System.out.print(text);
        this.input = sc.nextLine();
        return this.input;
    }

    int promptInt(String text) {
        return Integer.parseInt(this.prompt(text));
    }

    String lastInput() {
        return this.input;
    }

}
