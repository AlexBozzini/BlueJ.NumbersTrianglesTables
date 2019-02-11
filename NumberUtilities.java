

import java.lang.Math;
public class NumberUtilities {

    public static String getRange(int stop) {
       String s = "";
        for (int i = 0; i < stop; i++){
            s += i;
        }
        return s;
    }

    public static String getRange(int start, int stop) {
        String s = "";
        for (int i = start; i < stop; i++){
            s += i;
        }
        return s;
    }


    public static String getRange(int start, int stop, int step) {
        String s = "";
        for (int i = start; i < stop; i += step){
            s += i;
        }
        return s;
    }

    public static String getEvenNumbers(int start, int stop) {
        String s = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 0){
                s += i;
            }
        }
        return s;
    }


    public static String getOddNumbers(int start, int stop) {
        String s = "";
        for (int i = start; i < stop; i++){
            if (i % 2 == 1){
                s += i;
            }
        }
        return s;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String s = "";
        for (int i = start; i <= stop; i++){
            s += (int)(Math.pow(i, exponent));
        }
        return s;
    }
}
