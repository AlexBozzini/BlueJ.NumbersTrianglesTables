 
import java.util.Scanner;
public class TableUtilities {
   public static String getFormattedNumber(int number){
      return String.format("%3d ", number);
    }
    
    public static String getRow(int rowSize){
        String s = "";
        for (int i = 1; i <= rowSize; i++){
            
        }
        return null;
    }
    public static String getSmallMultiplicationTable() {
        String s = "";
        int a;
        int b;
        for (a = 1; a <=4; a++){
            for (b = 1; b <=4; b++){
                s += " " + b + "|" + "\n";
            }
            s += a + "\n";
        }
        System.out.println(s);
        new Scanner(System.in).next();
        return s;
    } 

    public static String getLargeMultiplicationTable() {
        return null;
    }

    public static String getMultiplicationTable(int tableSize) {
        return null;
    }
}
