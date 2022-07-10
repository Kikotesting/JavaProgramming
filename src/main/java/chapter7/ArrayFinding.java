package chapter7;

public class ArrayFinding {
    public static void main(String[] args) {
        int[] numbers = {4, 9, 7, 3, 2, 8};
        int value = 9;
        int index = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == value) {
                index = i;
                break;
            }
        }
        System.out.println("Index of " + index + " is : " + value);

        for (int i = 0; i < numbers.length; i++) {
            if (value == numbers[i]) {
                value = numbers[i];
                break;
            }
        }

        System.out.println("value of " + value + " is : " + index);

    }
}
