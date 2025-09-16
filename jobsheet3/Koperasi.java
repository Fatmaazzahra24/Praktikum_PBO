public class Koperasi {
    private String ktp;
    private String nama;
    private float limitPinjaman;
    private float jml_pinjaman = 0; 

    public Koperasi(String ktp, String nama, float limitPinjaman) {
        this.ktp = ktp;
        this.nama = nama;
        this.limitPinjaman = limitPinjaman;
    }

    public String getKtp() {
        return ktp;
    }
    public String getNama() {
        return nama;
    }
    public float getLimitPinjaman() {
        return limitPinjaman;
    }
    public float getJmlPinjaman() {
        return jml_pinjaman;
    }

    public void setKtp(String ktp) {
        this.ktp = ktp;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setLimitPinjaman(float limitPinjaman) {
        this.limitPinjaman = limitPinjaman;
    }
    public void setJmlPinjaman(float jml_pinjaman) {
        this.jml_pinjaman = jml_pinjaman;
    }

    public void meminjam(float uang) {
        if (uang > limitPinjaman) {
            System.out.println("Pinjaman melebihi limit!");
        } else {
            jml_pinjaman += uang;
        }
    }
    public void membayar(float uang) {
        float minimalBayar = 0.1f * jml_pinjaman;
        if (uang <  minimalBayar) {
            System.out.println("jumlah nominal angsuran minimal 10% dari totalpinjaman");
            System.out.println("anda harus membayar minimal : " + minimalBayar); 
        } else { 
            jml_pinjaman -= uang; 
    }
}
}
