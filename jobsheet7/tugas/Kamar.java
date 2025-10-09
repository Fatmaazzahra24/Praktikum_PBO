package tugas;
public class Kamar {
    public String noKamar;
    public String tipeKamar;
    public double hargaPerMalam;

    public Kamar() {
        System.out.println("Objek dari class Kamar dibuat (tanpa parameter)");
    }

    public Kamar(String noKamar, String tipeKamar, double hargaPerMalam) {
        this.noKamar = noKamar;
        this.tipeKamar = tipeKamar;
        this.hargaPerMalam = hargaPerMalam;
    }

    public String getInfo() {
        return "No Kamar : " + noKamar + 
               "\nTipe Kamar : " + tipeKamar + 
               "\nHarga per Malam : Rp" + hargaPerMalam;
    }
}
