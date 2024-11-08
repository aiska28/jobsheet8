import java.util.Scanner;

public class AverangeValue04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float totalNilai;
        float rataNilai;

        
        int i=1;
        while (i<=5) {
            System.out.print("Input Nilai Mahasiswa ke ");
            i = sc.nextInt();
            totalNilai=0;
            for (int j=1; j<=5;j++) {
                System.out.print("Nilai ke-" + j + " = ");
                int nilaiMhs=sc.nextInt();
                totalNilai+=nilaiMhs;
            }
            rataNilai=totalNilai/5;
            System.out.print("Rata-rata Nilai Mahasiswa ke " + i + " adalah " + rataNilai);
            i++;
            System.out.println();
        }
    }    
}
