public abstract class HewanPeliharaan {
    private String nama;
    private int energi;

    public HewanPeliharaan(String nama, int energi) {
        this.nama = nama;
        this.energi = energi;
    }

    public String getNama() {
        return nama;
    }

    public int getEnergi() {
        return energi;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setEnergi(int energi) {
        this.energi = energi;
    }

    public void makan() {
        energi += 5;
        System.out.println(nama + " sedang makan lezat.");
    }

    abstract void bergerak();

    public void info() {
        System.out.println("Nama: " + nama);
        System.out.println("Energi: " + energi + " %");
    }
}