package variables;

import java.util.List;

public class ListInterface
{
    public static void removeEverySecond(List<Integer> list) {
        for (int i = 1; i < list.size(); i += 2) {
            list.remove(i);
        }
        System.out.println(list);
    }

    public static void main(String[] args) {
        List<Integer> myList = List.of(22,58,78,5165,7553,5276);
        removeEverySecond(myList);
    }
}