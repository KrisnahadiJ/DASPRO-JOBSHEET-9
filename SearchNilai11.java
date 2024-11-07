import java.util.Scanner;

public class SearchNilai11 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput : ");
        int banyakNilai = sc.nextInt();

        int[] arrNilai = new int[banyakNilai];
        int key;
        int hasil = 0;
        boolean ditemukan = false;

        for (int i = 0; i < arrNilai.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" +(i+1)+ " : ");
            arrNilai[i] = sc.nextInt();
        }

        System.out.print("Masukkan nilai yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrNilai.length; i++) {
            if (key == arrNilai[i]) {
                hasil = i + 1;
                ditemukan = true;
                break;
            }
        }

        System.out.println();
        if (ditemukan) {
            System.out.println("Nilai " + key + " merupakan nilai mahasiswa ke-" + hasil);
        } else {
            System.out.println("Nilai yang dicari tidak ditemukan");
        }
        System.out.println();
    }
}