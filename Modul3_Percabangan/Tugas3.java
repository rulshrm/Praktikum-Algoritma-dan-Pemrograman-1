import java.util.Scanner;

public class Tugas3 {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int tes_akademik, tes_keterampilan, tes_psikologi;
    
    System.out.print("Masukan Nilai Test Akademik: ");
    tes_akademik = input.nextInt();
    System.out.print("Masukan Nilai Test Keterampilan: ");
    tes_keterampilan = input.nextInt();
    System.out.print("Masukan Nilai Test Psikologi: ");
    tes_psikologi = input.nextInt();

    if (tes_akademik >  tes_keterampilan || tes_akademik > tes_psikologi) {
      System.out.print("Diterima di Bagian Administrasi");
    } else {
      System.out.print("Tidak Diterima di Bagian Administrasi");
    }
  }
}