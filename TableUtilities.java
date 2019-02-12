import java.lang.Math; 
import java.util.Scanner;
public class TableUtilities {
   
    public static String getSmallMultiplicationTable() {
        return getMultiplicationTable(5);
    } 

    public static String getLargeMultiplicationTable() {
        return getMultiplicationTable(10);
    }

    public static String getMultiplicationTable(int tableSize) {
        String table = "";
        int width = 0;
        int height = 0;
        
        for(width = 1; width <= tableSize; width++){
            for(height = 1; height <= tableSize; height ++){
                table = table + String.format("%3d", width*height) + " |";
            }
            table += "\n";
        }
        return table;
    }
}
