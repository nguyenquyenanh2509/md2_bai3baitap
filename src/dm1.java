import java.util.Scanner;

public class dm1 {
    public static void main(String[] args) {
        // khai bao mang 1 chieu gom 5 phan tu so nguyen
        int[] arrInt = new int[5];
        // khai bao mang 1 chieu chuoi gom 3 phan tu
        String[] arrStr = new String[3];
        // khoi tao gia tri cac phan tu cho mang arrInt
        arrInt[0]= 4;
        arrInt[1]= 2;
        arrInt[2]= 3;
        arrInt[3]= 1;
        arrInt[4]= 5;
        // Khoi tao mang co ten C kieu chuoi gom 3 phan tu
        String[] arrStudent = {"hoang thai hung","hoang thai ha","hoang thai tu"};
        /// in ra cac phan tu cua mang arrInt
        System.out.println("Gia tri cac phan tu trong arrInt la: ");
        for (int i = 0; i < arrInt.length; i++){
            System.out.printf("%d\t",arrInt[i]);
        }
        System.out.printf("\n");
        // Nhap gia tri cac phan tu cua mang arrString tu ban phim
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrStr.length; i++){
            System.out.printf("Nhap gia tri phan tu thu %d", (i+1));
            arrStr[i] = sc.nextLine();
        }
        // in gia tri cacs phan tu trong mang arrString
        System.out.println("Gia tri cac phan tu trong mang la: ");
        for (int i = 0; i < arrStr.length; i++){
            System.out.printf("%s\t",arrStr[i]);
        }
        System.out.printf("\n");
        // Sx mang Int tang dan
        for (int i =0; i< arrInt.length; i++){
            for (int j = i+1; j < arrInt.length;j++){
                if (arrInt[i] > arrInt[j]){
                    // doi cho i va j
                    int temp = arrInt[i];
                    arrInt[i] = arrInt[j];
                    arrInt[j] = temp;
                }
            }
        }
        System.out.println("Gia tri cac phan tu trong arrInt la: ");
        for (int i = 0; i < arrInt.length; i++){
            System.out.printf("%d\t",arrInt[i]);
        }
        System.out.printf("\n");
    }
}

