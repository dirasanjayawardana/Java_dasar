public class Perulangan {
    public static void main(String[] args) {
        // ------ looping for ------//
        for (int i = 0; i <= 10; i++) {
            System.out.println("looping for ke-" + i);
        }

        // ------ looping while ------//
        var counter = 1;
        while (counter <= 10) {
            System.out.println("Looping while ke-" + counter);
            counter++;
        }

        // ------ do while loop (perulangan dilakukan baru pengecekan - jadi ada minimal
        // 1 kali perulangan) ------//
        var parameter = 1;
        do {
            System.out.println("Lopping do while ke-" + parameter);
            parameter++;
        } while (parameter <= 10);

        // ------ forEach (enhanced for loop) (perulangan untuk mengambil data dari setiap element array)
        // ------//
        int[] array = { 10, 20, 30, 40, 50 };
        for (var value : array) {
            System.out.println("isi array = " + value);
        }

        // ------ break menghentikan perulangan secara keseluruhan ------//
        // ------ continue hanya menghentikan iterasi saat ini dan tetap akan
        // melanjutkan iterasi berikutnya ------//
        var parameter2 = 1;
        while (true) {
            System.out.println("perulangan break ke-" + parameter2);
            parameter2++;

            if (parameter2 > 10) {
                break;
            }
        }

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }

            System.out.println("perulangan continue ke-" + i);
        }
    }
}
