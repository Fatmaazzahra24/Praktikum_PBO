public class Kapal extends Kendaraan {
    String jenisLayar;

    Kapal(String nama, String bahanBakar, int kecepatanMaks, int kapasitas, String jenisLayar) {
        super(nama, bahanBakar, kecepatanMaks, kapasitas);
        this.jenisLayar = jenisLayar;
    }

    void bergerak() {
        System.out.println(nama + " berlayar di laut dengan layar bertipe " + jenisLayar + ".");
    }

    void berhenti() {
        System.out.println(nama + " menurunkan jangkar dan berhenti di pelabuhan.");
    }
}
