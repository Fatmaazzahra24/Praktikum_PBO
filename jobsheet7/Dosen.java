public class Dosen extends Pegawai {
    public String nidn;

    public String getInfo(){
        return "NIDN : " + this.nidn + "\n";
    }
    public String getAllInfo(){
        String info = this.getInfo();
        info += "NIDN : "   + nidn + "\n";
        return info;
    }
     public Dosen(String nip,String nama,double gaji,String nidn){
        super(nip, nama, gaji);
        this.nidn = nidn;
    }
}
