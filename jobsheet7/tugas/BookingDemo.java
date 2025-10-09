package tugas;

public class BookingDemo {
    public static void main(String[] args) {

        Pemesanan p1 = new Pemesanan("A101", "Deluxe", 500000, "Fatma Azzahra", 3);
        Pemesanan p2 = new Pemesanan("B202", "Suite", 750000, "Alif Hidayah", 2);

       
        System.out.println("=== PEMESANAN 1 ===");
        System.out.println(p1.getInfo());

        System.out.println("\n=== PEMESANAN 2 ===");
        System.out.println(p2.getInfo());
    }
}
