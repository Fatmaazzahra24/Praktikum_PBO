public class DemoAccesPoint {
    public static void main(String[] args) {
        AccesPoint ap1 = new AccesPoint();
        ap1.merk = "TP-Link";
        ap1.type = "Archer C6";
        ap1.harga = 550000;
        ap1.kecepatanMax = 300;
        ap1.ssid = "Wifi princess fatma";

        AccesPoint ap2 = new AccesPoint();
        ap2.merk = "Cisco";
        ap2.type = "Aironet 1850";
        ap2.harga = 3500000;
        ap2.kecepatanMax = 1200;
        ap2.ssid = "Keluarga sejahtera"; 

        System.out.println("----- Access Point 1 -----");
        System.out.println(ap1.tampilkanDetailSpesifikasi());
        System.out.println("----- Access Point 2 -----");
        System.out.println(ap2.tampilkanDetailSpesifikasi());


        System.out.println("--- Update Access Point 1 ---");
        ap1.setKecepatanMaks(650);
        ap1.gantiNamaJaringan("Wifi error");
        ap1.menghubungkanJaringan("Lenovo ASUS");
        ap1.restartJaringan();

        System.out.println("--- Update Access Point 2 ---");
        ap2.setKecepatanMaks(1000);
        ap2.gantiNamaJaringan("hospot gratis");
        ap2.menghubungkanJaringan("VIVO Y33T");
        ap2.restartJaringan();
    }
}
