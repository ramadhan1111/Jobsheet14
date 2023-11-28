public class DeretDescendingRekursif25 {

    public static void tampilDeretRekursif(int n) {
        if (n == 0) {
            return;
        }

        System.out.println(n);
        tampilDeretRekursif(n - 1);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(System.console().readLine("Masukkan n: "));
        tampilDeretRekursif(n);
    }
}
