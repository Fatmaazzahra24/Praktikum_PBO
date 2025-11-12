public class IkanVirtual extends HewanPeliharaan implements ISwimable {

    public IkanVirtual(String nama, int energi) {
        super(nama, energi);
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " bergerak dengan siripnya.");
        setEnergi(getEnergi() - 2);
        System.out.println("Energi " + getNama() + " berkurang 2.");
    }

    @Override
    public void berenang() {
        System.out.println(getNama() + " sedang berenang.");
    }
}
