package se.iths;

import java.util.Scanner;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import org.mockito.*;
import static org.mockito.Mockito.*;

import java.time.LocalDate;

public class MainMenuTest {
    @Test
    public void enteredStringGetsReturned() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextLine()).thenReturn("Test");

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals("Test", mainMenu.saveEnteredString());

        verify(mockScanner).nextLine();
    }

    @Test
    public void enteredDoubleGetsReturned() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextDouble()).thenReturn(2.5);

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals(2.5, mainMenu.saveEnteredDouble());

        verify(mockScanner).nextDouble();
    }
    
    @Test
    public void enteredIntGetsReturned() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextInt()).thenReturn(2);

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals(2, mainMenu.saveEnteredInt());

        verify(mockScanner).nextInt();
    }
    
    @Test
    public void whenUserEntersSixASixIsReturned() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextInt()).thenReturn(6);

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals(6, mainMenu.getUserOption());

        verify(mockScanner).nextInt();
    }
    
    @Test
    public void whenUserTypesInOneRunOneGetsSelectedForDeletion() {   
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextInt()).thenReturn(1);

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals(1, mainMenu.chooseRunToDelete());

        verify(mockScanner).nextInt();
    }
    
    @Test
    public void whenUserTypesInOneRunOneGetsSelectedForDetailViewing() {  
        Scanner mockScanner = mock(Scanner.class);
        when(mockScanner.nextInt()).thenReturn(1);

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals(1, mainMenu.chooseRunToViewDetailsFor());

        verify(mockScanner).nextInt();
    }

    // @Test
    // public void whenUserEntersSixCheckIfHandleRunDeletionGetsCalled() {  
    //     MainMenu mockMainMenu = mock(MainMenu.class);

    //     mockMainMenu.processOption(6);

    //     verify(mockMainMenu, times(0)).handleRunDeletion();
        
        
    //     MainMenu mockMainMenu = mock(MainMenu.class);
    //     when(mockMainMenu.getUserOption()).thenReturn(6);

    //     mockMainMenu.processOption(mockMainMenu.getUserOption());

    //     verify(mockMainMenu, never()).handleRunDeletion();
    // }

    @Test
    public void enteredHeightGetsReturned() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextInt()).thenReturn(180);

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals(180, mainMenu.saveEnteredHeight());

        verify(mockScanner).nextInt();
    }

    @Test
    public void enteredWeightGetsReturned() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextDouble()).thenReturn(50.5);

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals(50.5, mainMenu.saveEnteredWeight());

        verify(mockScanner).nextDouble();
    }
    
    @Test
    public void whenHeight180EnteredUserHeightReturns180() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextInt()).thenReturn(180);

        MainMenu mainMenu = new MainMenu(mockScanner);

        User user = new User();
        user.setUserHeight(mainMenu.saveEnteredHeight());

        assertEquals(180.0, user.getUserHeight());

        verify(mockScanner).nextInt();
    }

    @Test
    public void whenWeight60EnteredUserWeightReturns60() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextDouble()).thenReturn(60.0);

        MainMenu mainMenu = new MainMenu(mockScanner);

        User user = new User();
        user.setWeight(mainMenu.saveEnteredWeight());

        assertEquals(60.0, user.getWeight());

        verify(mockScanner).nextDouble();
    }
    
    @Test
    public void enteredHeight180AndWeight60ReturnsBMIEighteenPointFive() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextInt()).thenReturn(180);
        when(mockScanner.nextDouble()).thenReturn(60.0);

        MainMenu mainMenu = new MainMenu(mockScanner);

        User user = new User();
        user.setUserHeight(mainMenu.saveEnteredHeight());
        user.setWeight(mainMenu.saveEnteredWeight());

        assertEquals(18.5, user.calculateUserBMI());

        verify(mockScanner).nextInt();
        verify(mockScanner).nextDouble();
    }
    
    @Test
    public void enteredWeightIsReturnedByMethod() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextDouble()).thenReturn(5.5);

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals(5.5, mainMenu.saveEnteredDistance());

        verify(mockScanner).nextDouble();
    }
    
    @Test
    public void enteredTimeIsReturnedByMethod() {
        Scanner mockScanner = mock(Scanner.class);

        when(mockScanner.nextLine()).thenReturn("0:12:30");

        MainMenu mainMenu = new MainMenu(mockScanner);

        assertEquals("0:12:30", mainMenu.saveEnteredTime());

        verify(mockScanner, times(2)).nextLine();
    }     


//    @Test
//     public void whenUserEntersFiveCheckIfHandleRunDetailPrintingRuns() {  
//         MainMenu mockMainMenu = mock(MainMenu.class);

//         mockMainMenu.processOption(5);

//         verify(mockMainMenu, times(1)).handleRunDetailPrinting();
//     }     

    // @Test
    // public void whenUserEntersFiveCheckIfprintAverageRunDistanceRan() {
    //     MainMenu mockMainMenu = mock(MainMenu.class);
    //     when(mockMainMenu.getUserOption()).thenReturn(5);

    //     int selectedOption = mockMainMenu.getUserOption();
    //     mockMainMenu.processOption(selectedOption);

    //     verify(mockMainMenu, times(0)).printRunDetails();        
    // }
}
