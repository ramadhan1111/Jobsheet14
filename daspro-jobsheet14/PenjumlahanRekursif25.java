public class PenjumlahanRekursif25 {

    public static int jumlah(int n) {
        if (n == 0) {
            return 0;
        } else {
            return jumlah(n - 1) + n;
        }
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Masukkan n: "));
        int hasil = jumlah(n);
        System.out.println("Hasil penjumlahan = " + hasil);
    }
}
