import java.util.Scanner;
public class Tugas {
    public static int Iteratif(int n) {
        int total = 0;
        for (int i=1; i<=n; i++) {
            total += i;
            System.out.print(i);
            if (i<n) {
                System.out.print("+");
            }
        }
        return total;
    }
    public static int Rekursif(int n) {
        if (n==1) {
            System.out.print("1");
            return 1;
        } else {
            System.out.print(n + "+");
            return n + Rekursif(n-1);
        }
    }
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka(N): ");
        int n = sc.nextInt();
        System.out.print("Hitung iteratif: ");
        int hasilIteratif = Iteratif(n);
        System.out.println(" = " + hasilIteratif);
        System.out.print("Hitung rekursif: ");
        int hasilRekursif = Rekursif(n);
        System.out.println(" = " + hasilRekursif);
        sc.close();
    }
}
