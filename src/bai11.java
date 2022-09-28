import java.util.Scanner;

public class bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap so phan tu cua mang:");
        int n = Integer.parseInt(sc.nextLine());
        int[] arrInt = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("nhap gia tri phan tu:");
            arrInt[i] = Integer.parseInt(sc.nextLine());

        }
        System.out.println("mang truoc khi xoa:");
        for (int i = 0; i < n; i++) {
            System.out.printf ("%d\t", arrInt[i]);

        }
        System.out.println(" nhap vao phan tu can xoa");
        int index = Integer.parseInt(sc.nextLine());
        int[] arrIntNew = new int[n - 1];
        for (int i = 0; i < n; i++) {
            if (i < index) {
                arrIntNew[i]=arrInt[i];
            } else if (i==index) {
                continue;
            }else {
                arrIntNew[i-1]=arrInt[i];
            }
        }
        System.out.println("mang sau khi xoa:");
        for (int i = 0; i < n-1; i++) {
            System.out.printf("%d\t",arrIntNew[i]);

        }
        System.out.println("\n");
    }
}