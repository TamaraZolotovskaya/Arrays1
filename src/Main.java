public class Main {
    public static void main(String[] args) {
        //Task 1-2
        int[] array1 = new int[3];
        for (int i = 0; i < 3; i++) {
            array1[i] = i + 1;
            System.out.print(array1[i] + ", ");
        }
        System.out.print("\b");
        System.out.print("\b");
        System.out.println();
        double[] array2 = {1.57, 7.654, 9.986};
        for (int i = 0; i < 3; i++) {
            System.out.print(array2[i] + ", ");
        }
        System.out.print("\b");
        System.out.print("\b");
        System.out.println();
        int[] array3 = new int[10];
        for (int i = 0; i < 10; i++) {
            array3[i] = (i + 1) * 10;
            System.out.print(array3[i] + ", ");
        }
        System.out.print("\b");
        System.out.print("\b");
        System.out.println();


        //Task 3
        for (int i = array1.length; i > 0; i--) {
            System.out.print(array1[i - 1] + ", ");
        }
        System.out.print("\b");
        System.out.print("\b");
        System.out.println();
        for (int i = array2.length; i > 0; i--) {
            System.out.print(array2[i - 1] + ", ");
        }
        System.out.print("\b");
        System.out.print("\b");
        System.out.println();
        for (int i = array3.length; i > 0; i--) {
            System.out.print(array3[i - 1] + ", ");
        }
        System.out.print("\b");
        System.out.print("\b");
        System.out.println();

        //Task 4
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 != 0) {
                array1[i] = array1[i] + 1;
            }
            System.out.print(array1[i] + ", ");
        }
        System.out.print("\b");
        System.out.print("\b");


    }
}