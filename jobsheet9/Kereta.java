public class Kereta extends Kendaraan {
    int jumlahGerbong;

    Kereta(String nama, String bahanBakar, int kecepatanMaks, int kapasitas, int jumlahGerbong) {
        super(nama, bahanBakar, kecepatanMaks, kapasitas);
        this.jumlahGerbong = jumlahGerbong;
    }
    void bergerak() {
        System.out.println(nama + " melaju di rel dengan " + jumlahGerbong + " gerbong.");
    }
    void berhenti() {
        System.out.println(nama + " berhenti di stasiun.");
    }
}
