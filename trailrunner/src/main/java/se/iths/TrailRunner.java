package se.iths;

import java.util.Scanner;

public class TrailRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        MainMenu mainMenu = new MainMenu(scanner);

        mainMenu.showMainMenu();
    }
}
