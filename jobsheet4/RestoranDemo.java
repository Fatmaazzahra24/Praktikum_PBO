public class RestoranDemo {
    public static void main(String[] args) {
        Pelanggan p1 = new Pelanggan("C01", "Fatma", "08123456789");

        Item i1 = new Item("Nasi Goreng", 20000, 2);
        Item i2 = new Item("Es Teh", 5000, 3);
        Item i3 = new Item("Ayam Bakar", 25000, 1);

        Pesanan pesanan1 = new Pesanan("P001", p1);
        pesanan1.tambahItem(i1);
        pesanan1.tambahItem(i2);
        pesanan1.tambahItem(i3);

        System.out.println(pesanan1.getInfo());
    }
}
