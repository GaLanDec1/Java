package src;
import java.util.ArrayList;

public class CollectionUtils {
    public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list) {
        ArrayList<T> uniqueList = new ArrayList<>();
        for (T element : list) {
            if (!uniqueList.contains(element)) {
                uniqueList.add(element);
            }
        }
        return uniqueList;
    }
}
