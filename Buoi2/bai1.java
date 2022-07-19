import java.util.Scanner;

public class bai1 {
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao ngay: ");
        int ngay = sc.nextInt();
        System.out.print("Nhap vao thang: ");
        int thang = sc.nextInt();
        System.out.println("Nhap vao nam: ");
        int nam = sc.nextInt();
        switch (thang) {
            case 1:
                if (ngay >= 20 && ngay <= 31) System.out.println("Bao Binh");
                else System.out.println("Ma ket");
                break;
            case 2:
                if (ngay >= 1 && ngay <= 18) System.out.println("Bao Binh");
                else {
                    if (nam % 4 == 0 && nam % 100 != 0 || nam % 400 == 0) {
                        if (ngay >= 19 && ngay <= 29) System.out.println("Song Ngu");
                    } else if (ngay >= 19 && ngay <= 28) System.out.println("Song Ngu");
                }
                break;
            case 3:
                if (ngay >= 1 && ngay <= 20) System.out.println("Song Ngu");
                else if (ngay >= 21 && ngay <= 31) System.out.println("Bach Duong");
                break;
            case 4:
                if (ngay >= 1 && ngay <= 20) System.out.println("Bach Duong");
                else if (ngay >= 21 && ngay <= 30) System.out.println("Kim Nguu");
                break;
            case 5:
                if (ngay >= 1 && ngay <= 20) System.out.println("Kim Nguu");
                else if (ngay >= 21 && ngay <= 31) System.out.println("Song Tu");
                break;
            case 6:
                if (ngay >= 1 && ngay <= 21) System.out.println("Song Tu");
                else if (ngay >= 22 && ngay <= 30) System.out.println("Cu Giai");
                break;
            case 7:
                if (ngay >= 1 && ngay <= 22) System.out.println("Cu Giai");
                else if (ngay >= 23 && ngay <= 31) System.out.println("Su Tu");
                break;
            case 8:
                if (ngay >= 1 && ngay <= 22) System.out.println("Su Tu");
                else if (ngay >= 23 && ngay <= 31) System.out.println("Xu Nu");
                break;
            case 9:
                if (ngay >= 1 && ngay <= 22) System.out.println("Xu Nu");
                else if (ngay >= 23 && ngay <= 30) System.out.println("Thien Binh");
                break;
            case 10:
                if (ngay >= 1 && ngay <= 23) System.out.println("Thien Binh");
                else if (ngay >= 24 && ngay <= 31) System.out.println("Bo Cap");
                break;
            case 11:
                if (ngay >= 1 && ngay <= 22) System.out.println("Bo Cap");
                else if (ngay >= 23 && ngay <= 30) System.out.println("Nhan Ma");
                break;
            case 12:
                if (ngay >= 1 && ngay <= 22) System.out.println("Nhan Ma");
                else if (ngay >= 23 && ngay <= 31) System.out.println("Ma Ket");
                break;
            default:
                System.out.println("Khong ton tai");
        }
    }
}
