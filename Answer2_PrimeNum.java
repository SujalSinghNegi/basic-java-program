import java.util.Scanner;
class Prime {
    int l, r;
    int[] p; 
    Prime(int l, int r) {
        this.l = l;
        this.r = r;
        this.p = new int[r + 1]; 
        for (int i = 0; i <= r; i++) {
            p[i] = 1;
        }

        p[0] = p[1] = 0; 
        for (int i = 2; i * i <= r; i++) {
            if (p[i] == 1) {
                for (int j = i * i; j <= r; j += i) {
                    p[j] = 0;
                }
            }
        }
    }

    void printPrimes() {
        for (int i = l; i <= r; i++) {
            if (p[i] == 1) { 
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

public class Answer2_PrimeNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        s.close(); 

        Prime p = new Prime(n1, n2);
        p.printPrimes();
    }
}
