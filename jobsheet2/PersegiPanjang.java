public class PersegiPanjang {
    public int panjang,lebar ;

    void displayInfo() {
        System.out.println("Panjang: " + panjang);
        System.out.println("Lebar  : " + lebar);
    }
    int getLuas() {
        return panjang * lebar;
    }
    int getKeliling() {
        return 2 * (panjang + lebar);
    }
}
