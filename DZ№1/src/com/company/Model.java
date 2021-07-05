package com.company;

import java.util.Scanner;

import static com.company.View.*;

public class Model {
    private Scanner scanner = new Scanner(System.in);

    public String processMessage() {
        String input = scanner.nextLine();
        String result = input.equals(HELLO) || input.equals(WORLD) ? input : WRONG_INPUT_DATA;
        return result;
    }
}
