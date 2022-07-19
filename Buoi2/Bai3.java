import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap Vao gia tri n: ");
        int n = sc.nextInt();
        int s = 0;
        for(int i=1;i<=sqrt(n);i++){
            if(n%i==0) s+=i;
            if(i != n/i) s += n/i;
        }
        System.out.print("Tong cac uoc cua n: "+s);
    }
}
