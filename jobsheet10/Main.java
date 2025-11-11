public class Main {
    public static void main(String[] args) {

        Kipas kipas = new Kipas("Angin Duduk", 150000, "Putih", "Miyako");
        TV tv = new TV("LED", 15, 3500000, "Hitam", "Samsung");
        Kulkas kulkas = new Kulkas(2, 2500000, "Silver", "LG");
        SmartFridge smartFridge = new SmartFridge(10, 3, 7500000, "Abu-abu", "Panasonic");

        System.out.println(kipas.getInfo());
        System.out.println(tv.getInfo());
        System.out.println(kulkas.getInfo());
        System.out.println(smartFridge.getInfo());
    }
}
