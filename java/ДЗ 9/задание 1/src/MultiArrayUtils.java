package src;
public class MultiArrayUtils {
    public static Circle findLargestIn2DArray(Circle[][] array) {
        if (array == null || array.length == 0) {
            return null; // или выбросить исключение
        }
        Circle largest = null;
        for (Circle[] row : array) {
            for (Circle circle : row) {
                if (largest == null || circle.compareTo(largest) > 0) {
                    largest = circle;
                }
            }
        }
        return largest;
    }
}
