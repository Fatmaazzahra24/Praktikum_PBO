import java.util.*;
public class kalkulator {
    public static void main(String[] args) {
        Scanner input = new  Scanner(System.in);
        int angka1,angka2, op, hasil = 0;

        System.out.print ("masukkan angka pertama : ");
        angka1 =input.nextInt();

        System.out.println("Pilih operator ");
        System.out.println("1. + ");
        System.out.println("2. - ");
        System.out.println("3. * ");
        System.out.println("4. / ");
        System.out.print("masukkan pilihan : ");
        op = input.nextInt();

        System.out.print("masukkan angka kedua : ");
        angka2= input.nextInt();

       switch (op) {
            case 1:
                hasil = angka1 + angka2;
                break;
            case 2:
                hasil = angka1 - angka2;
                break;
            case 3:
                hasil = angka1 * angka2;
                break;
            case 4:
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Error: pembagian dengan nol!");
                    return; 
                }
                break;
            default:
                System.out.println("Pilihan operator tidak valid!");
                return;
        }
        System.out.println("Hasil: " + hasil);
    }
}
 
