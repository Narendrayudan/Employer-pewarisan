import java.util.Scanner;

public class employer {

    String nama;
    String kelas;
    String absen;
    String alamat;
    char jk;
    private  String jeniskel;
    String kakaem;
    int jmlnilai;
    int nilai;
    int rerata = 0;

    public void datadiri(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Nama Anda");
        nama = input.nextLine();

        System.out.println("Masukkan Absen Anda");
        absen = input.nextLine();

        System.out.println("Masukkan Kelas Anda");
        kelas = input.nextLine();

        System.out.println("Masukkan Alamat Anda");
        alamat = input.nextLine();

    }

    public void ssjk(){
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan Jenis Kelamin ( L / P )");

        jk = input.next().charAt(0);

        if (jk == 'L') {
            jeniskel = "Laki Laki";
        } else if (jk == 'P'){
            jeniskel = "Peremmpuan";
        } else {
            System.out.println("Undefined");
        }
    }

    public void  buatnimai(){
        Scanner inputan = new Scanner(System.in);

        System.out.println("Berapa nilai yang ingin anda masukkan");
        jmlnilai = inputan.nextInt();

        for (int i = 1; i <= jmlnilai; i++) {
            System.out.println("Masukkan Nilai Ke "+i);
            nilai = inputan.nextInt();
            rerata += nilai;
        }

        rerata /= jmlnilai;

        if (rerata >= 75) {
            kakaem = ("Diatas KKM\nAnda Lulus");
        } else if (rerata < 75) {
            kakaem = ("Dibawah KKM\nAnda Gagal");
        }
    }

    public static void main(String[] args) {

        employer obj = new employer();

        obj.datadiri();
        obj.ssjk();
        obj.buatnimai();

        System.out.println("=====================================================");
        System.out.println("Nama \t\t\t= "+obj.nama);
        System.out.println("No Absen \t\t= "+obj.absen);
        System.out.println("Kelas \t\t\t= "+obj.kelas);
        System.out.println("Alamat \t\t\t= "+obj.alamat);

        System.out.println("Jenis Kelamin \t= "+obj.jeniskel);

        System.out.println("Nilai Rata-Rata Anda "+obj.rerata +" Dan Berada Di "+obj.kakaem);
        System.out.println("=====================================================");

    }
}