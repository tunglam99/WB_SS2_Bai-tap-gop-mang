import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        int[] arr1 = new int[5];
        int[] arr2 = new int[6];
        int[] arr3 = new int[arr1.length+ arr2.length];
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap mang thu nhat");
        for (int i =0; i< arr1.length; i++) {
            System.out.println("nhap gia tri thu "+ i);
            arr1[i]= scanner.nextInt();
            arr3[i] = arr1[i];
        }
        System.out.println("nhap mang thu 2");
        for (int i = 0; i<arr2.length;i++) {
            System.out.println("nhap gia tri thu: "+i);
            arr2[i] = scanner.nextInt();
            arr3[arr1.length+i] = arr2[i];
        }

        System.out.println("Mang 1 la: ");
        for (int i=0; i<arr1.length; i++) {
            System.out.println(arr1[i] + " ");
        }

        System.out.println("Mang 2 la: ");
        for (int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i] + " ");
        }

        System.out.println("Mang gop la: ");
        for (int i=0; i<arr3.length; i++) {
            System.out.println(arr3[i] + " ");
        }
    }
}
