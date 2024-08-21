import java.util.Scanner;

public class soal1 {
    public static void main(String[] args) {
        double hargaBarang;
        double persentaseDiskon;
        int jumlahBarang;
        double diskonPerBarang;
        double hargaSetelahDiskon;
        double totalHarga;

            Scanner scan=new Scanner(System.in);
            System.out.println("Masukkan harga barang: ");
            hargaBarang = scan.nextDouble();

            System.out.println("Masukkan persentase diskon (tanpa %): "); 
            persentaseDiskon = scan.nextDouble();

            System.out.println("Masukkan jumlah barang yang dibeli: ");
            jumlahBarang = scan.nextInt();    

                diskonPerBarang = hargaBarang * (persentaseDiskon / 100);
                hargaSetelahDiskon = hargaBarang - diskonPerBarang;
                totalHarga = hargaSetelahDiskon * jumlahBarang;

        System.out.println("Total harga setelah diskon adalah: Rp " + totalHarga);
    }
}
