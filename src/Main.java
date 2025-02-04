import java.util.Arrays;

public class Main {

    public static int findMissingNumber(int[] numbers) {
        int missingNumber = 0;

        Arrays.sort(numbers);

        for (int i = 0; i < numbers.length; i++) {
            int j = i + 1;
            if (numbers[i] != j) {
                missingNumber = j;
                break;
            }
        }
        
        return missingNumber;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 4, 5, 6};
        int[] numbers2 = {2, 3, 1, 5};
        System.out.println("La liste des nombres : " + Arrays.toString(numbers));
        System.out.println("Le nombre manquant est : " + findMissingNumber(numbers));
        System.out.print("\n");
        System.out.println("La liste des nombres : " + Arrays.toString(numbers2));
        System.out.println("Le nombre manquant est : " + findMissingNumber(numbers2));
    }
}