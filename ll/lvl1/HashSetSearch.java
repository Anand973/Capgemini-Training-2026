import java.util.HashSet;

public class HashSetSearch {
    public static boolean search(int[] arr, int target) {
        HashSet<Integer> set = new HashSet<>();
        for (int x : arr) set.add(x);
        return set.contains(target); 
    }
}
