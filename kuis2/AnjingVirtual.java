public class AnjingVirtual extends HewanPeliharaan implements Iaudible, ISwimable {

    public AnjingVirtual(String nama, int energi) {
        super(nama, energi);
    }

    @Override
    public void bergerak() {
        System.out.println(getNama() + " berlari dengan cepat.");
        setEnergi(getEnergi() - 7);
    }

    @Override
    public void bersuara() {
        System.out.println(getNama() + " sedang menggonggong Guk guk!");
    }

    @Override
    public void berenang() {
        System.out.println(getNama() + " sedang berenang.");
    }
}
