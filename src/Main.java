import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Task 1");
        int [] array = new int [3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        System.out.println(array[0] + ", " + array[1] + ", " + array[2] );
        double [] fraction = new double[] { 1.57, 7.654, 9.986};
        double one = fraction[0];
        double two = fraction[1];
        double three = fraction[2];
        System.out.println(one + ", " + two + ", " + three);
        int[] arrayNew = new int [] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        System.out.println("Task 2");
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(fraction));
        System.out.println(Arrays.toString(arrayNew));

        System.out.println("Task 3");
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < fraction.length / 2; i++) {
            int temp = (int) fraction[i];
            fraction[i] = fraction[fraction.length - 1 - i];
            fraction[fraction.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(fraction));

        for (int i = 0; i < arrayNew.length / 2; i++) {
            int temp = arrayNew[i];
            arrayNew [i] = arrayNew[arrayNew.length - 1 - i];
            arrayNew[arrayNew.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(arrayNew));





        System.out.println("Task 4");
        int [] arr = new int[]{1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                arr[i]++;
            }
        }
        System.out.println(Arrays.toString(arr));


    }
}