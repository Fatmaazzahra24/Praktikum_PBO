public abstract class Kendaraan {
    String nama;
    String bahanBakar;
    int kecepatanMaks;
    int kapasitas;
    
    Kendaraan(String nama, String bahanBakar, int kecepatanMaks, int kapasitas) {
        this.nama = nama;
        this.bahanBakar = bahanBakar;
        this.kecepatanMaks = kecepatanMaks;
        this.kapasitas = kapasitas;
    }

    abstract void bergerak();
    abstract void berhenti();

    void infoKendaraan() {
        System.out.println("Nama: " + nama);
        System.out.println("Bahan Bakar: " + bahanBakar);
        System.out.println("Kecepatan Maks: " + kecepatanMaks + " km/jam");
        System.out.println("Kapasitas Penumpang: " + kapasitas + " orang");
    }
}

