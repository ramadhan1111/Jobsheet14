public class PopulasiMarmutRekursif {

    public static int populasi(int bulan) {
        if (bulan == 1) {
            return 1;
        } else {
            return populasi(bulan - 2) * 2;
        }
    }

    public static void main(String[] args) {
        int bulan = 12;
        int populasi = populasi(bulan);

        System.out.println("Bulan | Populasi");
        System.out.println("------- | --------");
        for (int i = 1; i <= bulan; i++) {
            System.out.println(i + " | " + populasi(i));
        }
    }
}
