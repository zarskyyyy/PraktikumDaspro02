import java.util.Scanner;

public class StudiKasus2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, jenis;
        int jumlahDokumen, peringkat, statusPKM;

        System.out.print("Nama mahasiswa : ");
        nama = input.nextLine();
        System.out.print("Jenis kegiatan (BELMAWA/BAKORMA/MANDIRI/PKM/LAINNYA) : ");
        jenis = input.nextLine();

        // Cabang lomba
        if (jenis.equalsIgnoreCase("BELMAWA") || jenis.equalsIgnoreCase("BAKORMA")
                || jenis.equalsIgnoreCase("MANDIRI")) {

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Peringkat juara : ");
            peringkat = input.nextInt();

            if (peringkat >= 1 && peringkat <= 3) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Bukan Juara 1, 2, atau 3. Dana penghargaan tidak diberikan.");
            }

        // Cabang PKM
        } else if (jenis.equalsIgnoreCase("PKM")) {

            System.out.print("Jumlah dokumen : ");
            jumlahDokumen = input.nextInt();
            System.out.print("Status pendanaan PKM (1 = lolos, 0 = tidak lolos) : ");
            statusPKM = input.nextInt();

            if (statusPKM == 1) {
                if (jumlahDokumen == 4) {
                    System.out.println("Status : Dokumen lengkap. Dana penghargaan diberikan.");
                } else {
                    System.out.println("Status : Dokumen tidak lengkap (kurang "
                            + (4 - jumlahDokumen) + " dokumen). Dana penghargaan tidak diberikan.");
                }
            } else {
                System.out.println("Status : Tim tidak lolos pendanaan. Dana penghargaan tidak diberikan.");
            }

        // Cabang Lainnya
        } else if (jenis.equalsIgnoreCase("LAINNYA")) {
            System.out.println("Status : Kegiatan lainnya tidak memperoleh dana penghargaan.");

        } else {
            System.out.println("Status : Jenis kegiatan tidak dikenal.");
        }

        input.close();
    }
}