public class GameDemo {
    public static void main(String[] args) {
        KucingVirtual kucing = new KucingVirtual("lula", 85);
        IkanVirtual ikan = new IkanVirtual("lele", 30);
        AnjingVirtual anjing = new AnjingVirtual("Bolt", 70);

        System.out.println("---------- Info Game Virtual Terkini --------");
        kucing.info();
        ikan.info();
        anjing.info() ;

        System.out.println("\n=== Aktivitas Lula ===");
        kucing.makan();
        kucing.bergerak();
        kucing.bersuara();
        kucing.bergerak();
        kucing.minumAir();

        System.out.println("\n=== Aktivitas Lele ===");
        ikan.makan();
        ikan.bergerak();
        ikan.berenang();

        System.out.println("\n=== Aktivitas Bolt ===");
        anjing.makan();
        anjing.bergerak();
        anjing.bersuara();
        anjing.berenang();
        anjing.bergerak();

        System.out.println("\n=== Info Game Virtual Terupdate ===");
        kucing.info();
        ikan.info();
        anjing.info();
    }
}
