package tugas;
public class Pemesanan extends Kamar {
    public String namaTamu;
    public int lamaMenginap;

    public Pemesanan() {
        System.out.println("Objek dari class Pemesanan dibuat (tanpa parameter)");
    }

    public Pemesanan(String noKamar, String tipeKamar, double hargaPerMalam, String namaTamu, int lamaMenginap) {
        super(noKamar, tipeKamar, hargaPerMalam);
        this.namaTamu = namaTamu;
        this.lamaMenginap = lamaMenginap;
    }

    // Overriding
   public String getInfo() {
        double totalBayar = hargaPerMalam * lamaMenginap;

        String info = super.getInfo();
        info += "\nNama Tamu : " + namaTamu;
        info += "\nLama Menginap : " + lamaMenginap + " malam";
        info += "\nTotal Bayar : Rp" + totalBayar;

        return info;
    }

}
