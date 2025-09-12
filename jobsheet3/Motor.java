public class Motor {
     private String platnomor;
     private boolean isMesinOn;
     private int kecepatan;

    public String getPlatNomor () {
        return platnomor;
    }
    public void setPlatNomor(String platNomor) {
    this.platnomor = platNomor; 
    }
    public boolean isIsMesinon () {
        return isMesinOn;
    }
    public void setIsMesinon (boolean isMesinon) {
         this.isMesinOn =  isMesinon;
    }
    public int getKecepatan () {
        return kecepatan;
    }
    public void setKecepatan(int kecepatan) {
        if (kecepatan < 0) {
            System.out.println("Kecepatan tidak boleh negatif!");
            this.kecepatan = 0;
        } else if (kecepatan > 100) {
            System.out.println("Kecepatan maksimal 100!");
            this.kecepatan = 100;
        } else if (!this.isMesinOn && kecepatan > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
            this.kecepatan = 0;
        } else {
            this.kecepatan = kecepatan;
        }
    }


    public void displayStatus() {
        System.out.println("Plat Nomor: " + this. platnomor);
        System.out.println("Mesin: " + (isMesinOn ? "On" : "Off"));
        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("===================================");
    }
    
}