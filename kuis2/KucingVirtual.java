
public class KucingVirtual extends HewanPeliharaan implements Iaudible, IMinum {

    public KucingVirtual(String nama, int energi) {
        super(nama, energi);
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " sedang berjalan bersama pemiliknya .");
        setEnergi(getEnergi() - 5);
        System.out.println("Energi " + getNama() + " berkurang 5.");
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " bersuara  Meong Meong");
    }
    @Override
    public void minumAir() {
        System.out.println(getNama() + " sedang minum air karena haus");
    }
}
