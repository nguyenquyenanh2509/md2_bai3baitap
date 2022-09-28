import java.util.Scanner;

public class Session03_Baitap_Xoaphantu {
    public static void main(String[] args) {
        /*
         *Input
         * Nhap so phan tu cua mang,khoi tao mang
         * Nhap gia tri phan tu can xoa
         * Output
         * Xoa tat ca cac phan tu co gia tri nhap vao
         *
         */
        //B1. Nhap
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao so phan tu cua mang: ");
        int n = Integer.parseInt(sc.nextLine());
        int[] old = new int[n];
        System.out.println("Nhap gia tri ccac phan tu cua mang: ");
        for (int i = 0; i < old.length; i++){
            System.out.printf("old[%d]=",i);
            old[i] = Integer.parseInt(sc.nextLine());
        }
        // B2 In ra cac phan tu truoc khi xoa
        System.out.println("Gia tri cac phan tu truocs khi xoa: ");
        for (int i = 0; i < old.length; i++){
            System.out.printf("%d\t",old[i]);
        }
        System.out.printf("\n");
        ///b3 Nhap gia tri can xoa trong mang
        System.out.println("Nhap gia tri can xoa: ");
        int deleteValue = Integer.parseInt(sc.nextLine());
        int cnt = 0;
        for (int i = 0; i < old.length; i++){
            if (old[i]==deleteValue){
                cnt++;
            }
        }
        int[] arrNew = new int[old.length-cnt];
        ///--- copy cac phan tu khong bi xoa tu old sang new
        int index = 0;
        for (int i = 0; i < old.length; i++){
            if (old[i]==deleteValue){
                // dang o phan tu can xoa o mang old
                continue;
            }else{
                // dang o phan tu cann copy sang mang new
                arrNew[index] = old[i];
                index++;
            }
        }
        // b5 in gia tri cac phan tu ra mang new
        System.out.println("Gia tri cac phan tu trong mang sau khi xoa: ");
        for (int i = 0; i < arrNew.length; i++){
            System.out.printf("%d\t",arrNew[i]);
        }
        System.out.printf("\n");
    }
}



