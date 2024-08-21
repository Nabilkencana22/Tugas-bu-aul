import java.util.Scanner;

public class soal2 {
    public static void main(String[] args) {
        double jamKerja,tarifPerJam,gajiKotor,gajiBersih,Pajak;
       
            Scanner scan = new Scanner(System.in);      
            System.out.print("berapa jam kerja: ");
            jamKerja = scan.nextDouble();

        
            System.out.print("berapa tarif per jam: ");
            tarifPerJam = scan.nextDouble();

        
            gajiKotor = jamKerja * tarifPerJam;  
            Pajak = gajiKotor * 0.10;     
            gajiBersih = gajiKotor - Pajak;
       
        System.out.println("Gaji Kotor: Rp " + gajiKotor);
        System.out.println("Pajak (10%): Rp " + Pajak);
        System.out.println("Gaji Bersih: Rp " + gajiBersih);
    }
}
 