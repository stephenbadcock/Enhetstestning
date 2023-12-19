package se.iths;

/* 
add(int, int) - adderar två heltal och returnerar summan.

divide(int, int) - adderar två heltal och returnerar kvoten som en double.

isEven(int) - returnerar true om ett heltal är jämnt.

stringLength(String, String) - Tar emot två strings och räknar hur många tecken det finns i dem sammanlagt, exklusive mellanslag.
 */

public class Calculator {

    public int add(int addend, int augend) {
        int result = addend + augend;

        return result;
    }

    public double divide(int denominator, int nominator) {
        int result = denominator / nominator;
        return result;
    }

    public boolean isEven(int num) {
        return num % 2 == 0;
    }

    public int stringLength(String str1, String str2) {
        String totalStr = str1 + str2;
        return totalStr.length();
    }
}