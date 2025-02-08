package collection.set.test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SetOperationsTest {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(List.of(1, 2, 3, 4, 5));
        Set<Integer> set2 = new HashSet<>(List.of(3, 4, 5, 6, 7));

        Set<Integer> sumSet = new TreeSet<>();
        sumSet.addAll(set1);
        sumSet.addAll(set2);

        Set<Integer> sameSet = new TreeSet<>(set1);
        sameSet.retainAll(set2); // 찾아봐서 해결

        Set<Integer> diffSet = new TreeSet<>(sumSet);
        diffSet.removeAll(set2);

        System.out.println("합집합: " + sumSet);
        System.out.println("교집합: " + sameSet);
        System.out.println("차집합: " + diffSet);

    }
}
