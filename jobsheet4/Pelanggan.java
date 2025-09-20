public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noHP;

    public Pelanggan(String idPelanggan, String nama, String noHP) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noHP = noHP;
    }
    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public String getIdPelanggan() {
        return idPelanggan;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNama() {
        return nama;
    }
    public void setNoHP(String noHP) {
        this.noHP = noHP;
    }
    public String getNoHP() {
        return noHP;
    }

    public String getInfo() {
        return "ID: " + idPelanggan + 
               ", Nama: " + nama + 
               ", No HP: " + noHP;
    }
}
