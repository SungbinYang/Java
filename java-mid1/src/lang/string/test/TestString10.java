package lang.string.test;

public class TestString10 {
    public static void main(String[] args) {
        String fruits = "apple,banana,orange";
        String[] splitFruits = fruits.split(",");

        for (String fruit : splitFruits) {
            System.out.println(fruit);
        }

        String joinedFruit = String.join("->", splitFruits);
        System.out.println(joinedFruit);
    }
}
