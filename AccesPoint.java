public class AccesPoint {
    
    public String merk, type, ssid;
    public double  harga;
    public int kecepatanMax; 

    public void menghubungkanJaringan(String perangkatId) {
        System.out.println("Perangkat dengan ID " + perangkatId + " berhasil terhubung ke jaringan " + ssid);
    }

    public void gantiNamaJaringan(String ssidBaru) {
        System.out.println("SSID lama: " + this.ssid);
        this.ssid = ssidBaru;
        System.out.println("SSID berhasil diubah menjadi: " + this.ssid);
    }
    public String tampilkanDetailSpesifikasi() {
        return "Merk: " + merk + "\n" +
               "Type: " + type + "\n" +
               "Harga: Rp" + harga + "\n" +
               "Kecepatan Max: " + kecepatanMax + " Mbps\n" +
               "SSID: " + ssid;
    }
    public void setKecepatanMaks(int mbps) {
        this.kecepatanMax = mbps;
        System.out.println("Kecepatan maksimal diubah menjadi: " + this.kecepatanMax + " Mbps");
    }
    public void restartJaringan() {
        System.out.println("Jaringan dengan SSID " + this.ssid + " sedang direstart...");
        System.out.println("Jaringan berhasil direstart!");
    }
}