public class DemoPersegiPanjang {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang =10;
        pp.lebar = 5;

        pp.displayInfo();
        System.out.println("Luas : panjang * lebar = " + pp.getLuas());
        System.out.println("Keliling : 2 * (panjang + lebar) = " + pp.getKeliling());
    }
}
