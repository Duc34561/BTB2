import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap vao 3 canh cua tam giac: ");
        System.out.print("Nhap a = ");
        int a = sc.nextInt();
        System.out.print("Nhap b = ");
        int b = sc.nextInt();
        System.out.print("Nhap c = ");
        int c = sc.nextInt();
        if(a+b >c && a+c >b && b+c > a){
            if(a==b && a == c) System.out.println("Tam Giac Deu");
            else if(a == c || a == b || b == c){
                if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) System.out.println("Tam Giac Vuong Can");
                else System.out.println("Tam Giac Can");
            }else if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a) System.out.println("Tam Giac Vuong");
            else System.out.println("Tam Giac Thuong");
        }else System.out.println("3 canh khong tao thanh 1 tam giac");
    }
}
