public class CekPrimaRekursif25 {

    public static boolean prima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Masukkan n: "));
        boolean hasil = prima(n);
        System.out.println("n = " + n + " adalah bilangan prima: " + hasil);
    }
}