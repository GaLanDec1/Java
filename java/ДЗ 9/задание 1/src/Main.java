package src;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Тестирование CollectionUtils
        System.out.println("1. Тестирование удаления дубликатов:");
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1); list.add(2); list.add(2); list.add(3);
        ArrayList<Integer> uniqueList = CollectionUtils.removeDuplicates(list);
        System.out.println("Список без дубликатов: " + uniqueList);

        // Тестирование SearchUtils
        System.out.println("\n2. Тестирование линейного поиска:");
        int[] array = {1, 2, 3, 4, 5};
        int target = 3;
        int position = SearchUtils.linearSearch(array, target);
        System.out.println("Элемент " + target + " найден на позиции: " + position);

        // Тестирование ArrayUtils с Circle
        System.out.println("\n3. Тестирование поиска наибольшего круга:");
        Circle[] circles = {new Circle(1.0), new Circle(2.5), new Circle(3.0)};
        Circle largestCircle = ArrayUtils.findLargestCircle(circles);
        System.out.println("Наибольший круг: " + largestCircle);

        // Тестирование MultiArrayUtils с двумерным массивом Circle
        System.out.println("\n4. Тестирование поиска наибольшего круга в двумерном массиве:");
        Circle[][] circleMatrix = {
                {new Circle(1.0), new Circle(2.5)},
                {new Circle(3.0), new Circle(0.5)}
        };
        Circle largestIn2D = MultiArrayUtils.findLargestIn2DArray(circleMatrix);
        System.out.println("Наибольший круг в двумерном массиве: " + largestIn2D);
    }
}
