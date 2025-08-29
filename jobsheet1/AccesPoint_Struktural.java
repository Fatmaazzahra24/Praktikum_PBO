public class AccesPoint_Struktural {
    public static void main(String[] args) {
        
        String merek,merek2,merek3,merek4, merek5, merek6, merek7, 
        merek8,merek9, merek10,
               SSID,SSID2, SSID3, SSID4, SSID5, SSID6,SSID7,
               SSID8, SSID9, SSID10 ;
        double harga, harga2, harga3, harga4, harga5, 
               harga6, harga7, harga8, harga9, harga10;

        merek = "TP-Link"; SSID = "JTI-Polinema"; harga = 1240;
        merek2 = "Mikrotik"; SSID2 = "Polinema Hebat"; harga2 = 1800;
        merek3 = "Cisco"; SSID3 = "SIB 2D"; harga3 = 1550;
        merek4 = "D-Link"; SSID4 = "Hotspot Kantin"; harga4 = 2100;
        merek5 = "Asus"; SSID5 = "Warnet Pro"; harga5 = 1950;
        merek6 = "Huawei"; SSID6 = "IndiHome"; harga6 = 1750;
        merek7 = "Tenda"; SSID7 = "SmartHome"; harga7 = 1300;
        merek8 = "Xiaomi"; SSID8 = "Mi Router"; harga8 = 1100;
        merek9 = "Linksys"; SSID9 = "Office WiFi"; harga9 = 2250;
        merek10 = "Netgear"; SSID10 = "Gaming House"; harga10 = 2500;

        System.out.println("========== DATA ACCES POINT ======== ");
        System.out.println("merek : " +merek+ " | SSID : " +SSID+ " | harga = Rp." + harga);
        System.out.println("merek : " +merek2+ " | SSID : " +SSID2+ " | harga = Rp." + harga2);
        System.out.println("merek : " +merek3+ " | SSID : " +SSID3+ " | harga = Rp." + harga3);
        System.out.println("merek : " +merek4+ " | SSID : " +SSID4+ " | harga = Rp." + harga4);
        System.out.println("merek : " +merek5+ " | SSID : " +SSID5+ " | harga = Rp." + harga5);
        System.out.println("merek : " +merek6+ " | SSID : " +SSID6+ " | harga = Rp." + harga6);
        System.out.println("merek : " +merek7+ " | SSID : " +SSID7+ " | harga = Rp." + harga7);
        System.out.println("merek : " +merek8+ " | SSID : " +SSID8+ " | harga = Rp." + harga8);
        System.out.println("merek : " +merek9+ " | SSID : " +SSID9+ " | harga = Rp." + harga9);
        System.out.println("merek : " +merek10+ " | SSID : " +SSID10+ " | harga = Rp." + harga10);

        SSID = gantinamaSSID(SSID, "JTI-Oke");
        int maxUser = batasiPengguna(10, 5);
        SSID2 = gantinamaSSID(SSID2, "Keluarga Sehat");
        int maxUser2 = batasiPengguna(7, 15);
    }

    public static String gantinamaSSID(String ssidLama,String ssidBaru){
        ssidLama = ssidBaru;
        return ssidBaru;
    }

    public static int batasiPengguna(int maxUserLama, int maxUserBaru) {
        maxUserLama = maxUserBaru;
        return maxUserBaru;
    }
}
