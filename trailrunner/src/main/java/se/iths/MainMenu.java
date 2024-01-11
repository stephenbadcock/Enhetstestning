package se.iths;

import java.util.Scanner;

public class MainMenu {
    RunLibrary runLibrary = new RunLibrary();
    private Scanner scanner;

    public MainMenu(Scanner scanner) {
        this.scanner = scanner;
    }

    public String saveEnteredString() {
        return scanner.nextLine();
    }

    public double saveEnteredDouble() {
        return scanner.nextDouble();
    }

    public int saveEnteredInt() {
        return scanner.nextInt();
    }

    public void showMainMenu() {
        System.out.println("TrailRunner");
        System.out.println();
        System.out.println("1. Spara en löprunda");
        System.out.println("2. Beräkna ditt BMI");
        System.out.println("3. Beräkna din totaldistans");
        System.out.println("4. Beräkna din medeldistans");
        System.out.println("5. Visa detaljer för en löprunda");
        System.out.println("6. Radera en löprunda");
        System.out.println();
        System.out.println("7. Avsluta programmet");
        System.out.println();

        // int chosenOption = getUserOption();
        // processOption(chosenOption);
    }

    public int getUserOption() {
        System.out.print("Välj ett alternativ: ");
        int chosenOption = scanner.nextInt();
        scanner.nextLine();

        return chosenOption;
    }

    public void processOption(int menuOption) {
        switch(menuOption) {
            case 2 :
                handleUserBMI();
                break;
            case 3 :
                runLibrary.printTotalDistanceRun();
                showMainMenu();
                break;
            case 4 :runLibrary
                .printAverageRunDistance();
                showMainMenu();
                break;
            // case 5 :
            //     runLibrary.
            case 6 :
                handleRunDeletion();
                break;                
            default :
                showMainMenu();
                break;     
        }
    }

    public int chooseRunToDelete() {
        System.out.print("Ange ID-numret på den löprundan du vill radera från historiken: ");
        int runID = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        return runID;
    }

    public void handleRunDeletion() {
        // int runID = chooseRunToDelete();
        // System.out.println(runLibrary.deleteRun(runID));
        // showMainMenu();
    }

    // public void handleRunDetailPrinting() {

    // }
    
    public int chooseRunToViewDetailsFor() {
        System.out.print("Ange ID-numret på den löprundan du vill se detaljer för: ");
        int runID = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        return runID;
    }

    public int saveEnteredHeight() {
        System.out.print("Ange din längd (cm): ");
        int height = scanner.nextInt();
        scanner.nextLine();
        System.out.println();

        return height;
    }

    public double saveEnteredWeight() {
        System.out.print("Ange din vikt (kg): ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        System.out.println();

        return weight;
    }

    public void handleUserBMI() {
        User user = new User();

        user.setUserHeight(saveEnteredHeight());
        user.setWeight(saveEnteredWeight());
    }
    // public void printRunDetails() {

    // }
}
