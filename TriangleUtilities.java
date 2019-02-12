 
import java.lang.Math;
public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String s = "";
        for (int i = 0; i < numberOfStars; i++){
            s += "*";
        }
        return s;
    }
    
    public static String getTriangle(int numberOfRows) {
        String s = "";
        for (int i = 1; i <= numberOfRows; i++){
            s += getRow(i) + "\n"; 
        }
        return s;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
