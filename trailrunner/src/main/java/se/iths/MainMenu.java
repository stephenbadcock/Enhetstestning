package se.iths;

public class MainMenu {
    RunLibrary runLibrary = new RunLibrary();

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
    }

    public void processOption(int menuOption) {
        switch(menuOption) {
            case 3 :
                runLibrary.printTotalDistanceRun();
                showMainMenu();
            case 4 :
                runLibrary.printAverageRunDistance();
                showMainMenu();
        }
    }
}
