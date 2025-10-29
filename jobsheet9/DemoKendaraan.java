public class DemoKendaraan {
    public static void main(String[] args) {
        
        Kereta kereta = new Kereta("Kereta Argo Bromo", "Listrik", 120, 600, 8);
        Kapal kapal = new Kapal("Kapal Nusantara", "Solar", 70, 300, "Segitiga");

        System.out.println("=== INFO KERETA ===");
        kereta.infoKendaraan();
        kereta.bergerak();
        kereta.berhenti();

        System.out.println("\n=== INFO KAPAL ===");
        kapal.infoKendaraan();
        kapal.bergerak();
        kapal.berhenti();
    }
}
