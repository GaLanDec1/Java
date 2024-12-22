package src;
public class ArrayUtils {
    public static Circle findLargestCircle(Circle[] circles) {
        if (circles == null || circles.length == 0) {
            return null; // или выбросить исключение
        }
        Circle largest = circles[0];
        for (Circle circle : circles) {
            if (circle.compareTo(largest) > 0) {
                largest = circle;
            }
        }
        return largest;
    }
}
