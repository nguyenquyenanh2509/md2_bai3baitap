import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        //b1. Nhap so phan tu va khoi tao mang
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] old = new int[n];
        System.out.println("Nhap cac gia tri cua mang: ");
        for (int i = 0; i < old.length; i++){
            System.out.printf("old[%d]=",i);
            old[i] = Integer.parseInt(sc.nextLine());
        }
        System.out.println("Gia tri cua cac phan tu truoc khi chen: ");
        for (int i = 0; i < old.length; i++){
            System.out.printf("%d\t",old[i]);

        }
        System.out.printf("\n");
        System.out.println("Nhap gia tri can them vao mang: ");
        int valueInsert = Integer.parseInt(sc.nextLine());
        System.out.println("Nhap vao chi so can chen vao mang: ");
        int indexInsert = Integer.parseInt(sc.nextLine());
        int[] arrNew = new int[old.length+1];
        for (int i = 0; i < arrNew.length; i++){
            if (i<indexInsert){
                arrNew[i]=old[i];
            } else if (i==indexInsert) {
                arrNew[i]=valueInsert;
            }else {
                arrNew[i]=old[i-1];
            }
        }
        System.out.println("Gia tri cac phan tu sau khi thay moi: ");
        for (int i = 0; i < arrNew.length; i++){
            System.out.printf("%d\t",arrNew[i]);
        }
        System.out.printf("\n");
    }
}
