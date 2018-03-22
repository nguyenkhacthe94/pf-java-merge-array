import java.util.Scanner;

public class MergeArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size1, size2;
        do {
            System.out.print("Enter first array size: ");
            size1 = input.nextInt();
            if (size1 < 1 || size1 > 20) System.out.print("Size should not exceed 20.");
        } while (size1 < 1 || size1 > 20);
        int array1[] = new int[size1];
        int i = 0;
        while (i < array1.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array1[i] = input.nextInt();
            i++;
        }
        do {
            System.out.print("Enter second array size: ");
            size2 = input.nextInt();
            if (size2 < 1 || size2 > 20) System.out.print("Size should not exceed 20.");
        } while (size2 < 1 || size2 > 20);
        int j = 0;
        int array2[] = new int[size2];
        while (j < size2) {
            System.out.print("Enter element " + (j + 1) + ": ");
            array2[j] = input.nextInt();
            j++;
        }
        int size3 = size1 + size2;
        int[] array3 = new int[size3];
        for (i = 0; i < size1; i++) {
            array3[i] = array1[i];
        }
        for (j = 0; j < size2; j++) {
            array3[size1 + j] = array2[j];
        }
        for (i = 0; i < size3; i++) {
            System.out.print(array3[i] + "\t");
        }
    }
}
