public class TipeData {
    public static void main(String[] args) {
        // Tipe Data Number Decimal
        // 1. Float
        // Ukuran: 32-bit
        // Presisi: Sekitar 7 digit desimal
        // Kapan digunakan: Gunakan Float ketika Anda membutuhkan nilai desimal dengan presisi yang lebih rendah dan ukuran data yang kecil, serta ketika memori dan performa adalah prioritas. Misalnya, dalam grafik atau game di mana kecepatan lebih penting daripada akurasi.
        // contoh : float value = 3.14159f;
        
        // 2. Double
        // Ukuran: 64-bit
        // Presisi: Sekitar 15 digit desimal
        // Kapan digunakan: Gunakan Double ketika Anda memerlukan keseimbangan antara presisi dan kinerja. Double adalah tipe data default untuk angka desimal di Java dan sering digunakan dalam aplikasi ilmiah, keuangan, atau engineering yang memerlukan presisi sedang.
        // contoh : double value = 3.141592653589793;
        
        // 3. BigDecimal
        // Ukuran: Arbitrary-precision
        // Presisi: Sangat tinggi, sesuai kebutuhan
        // Kapan digunakan: Gunakan BigDecimal ketika Anda membutuhkan presisi yang sangat tinggi, seperti dalam aplikasi keuangan yang tidak mentoleransi kesalahan pembulatan (misalnya, transaksi moneter). Operasi dengan BigDecimal lebih lambat dibandingkan dengan Float atau Double, tetapi presisi dan akurasinya jauh lebih tinggi.
        // contoh : BigDecimal value = new BigDecimal("10000000000000.0123");

        byte iniByte = 100;
        short iniShort = 1000;
        int iniInt = 10000000;
        long iniLong = 10000000000L; // tambahkan L dibelakang angka
        float iniFloat = 10.05F; // tambahkan F dibelakang angka
        double iniDouble = 10.05;

        int decimalInt = 25;
        int hexInt = 0xA132B; // tambahkan 0x didepan angka
        int binaryDecimal = 0b0101010; // tambahkan 0b didepan angka

        long balance = 1_000_000_000_000L; // bisa gunakan underscore untuk memisahkan agar tidak membingungkan

        // konversi angka otomatis (widening casting): byte -> short -> int -> long -> float -> double
        short konversiShort = iniByte;

        // konversi angka manual (narrowing casting): double -> float -> long -> int -> char -> short -> byte
        int konversiInt = (int) iniLong;

        boolean benar = true;
        char karakter = 'A';
        String firstName = "dira";
        String lastName = "sanjaya wardana";
        String fullName = firstName + " " + lastName;

        // mengubah isi variabel
        String name;
        name = "Dira Sanjaya Wardana";

        // menggunakan var (tidak perlu mendeklarasikan tipe data, data yang dimasukkan pertama akan menjadi tipe datanya)
        var cobaVar = "test variabel var"; // maka tipe datanya otomatis adalah String

        // kata kunci yang datanya tidak bisa diubah (final --> konstant)
        final String cobaFinal = "nilai ini tidak bisa diubah";

        // Tipe data primitif (tidak memiliki refference class, memiliki nilai default saat pertama dideklarai --> false/""/0/0.0)
        // byte - short - int - long - float - double

        // Tipe data non primitif (memiliki refference class, tidak memiliki nilai default --> null)
        // Byte - Short - Integer - Long - Float - Double - Boolean - String

        // konversi tipe data primitif ke non primitif
        int intPrimitif = 10;
        Integer nonPrimitif = intPrimitif;

        // konversi tipe data non primitif ke primitif
        short primitifShort = nonPrimitif.shortValue(); // method seperti ini hanya dimiliki tipe data non primitif

        // tipe data array (kumpulan data dengan tipe yang sama)
        String[] kumpulanNama;
        kumpulanNama = new String[3];
        kumpulanNama[0] = "dira";
        kumpulanNama[2] = "sanjaya";
        kumpulanNama[2] = "wardana";

        // cara lain membuat array
        int[] arrayInt = new int[]{1, 2, 3, 4, 5};
        int[] arrayInt2 = {1, 2, 3, 4, 5};

        // cara menghapus data array (secara umum panjang array sudah fix, hanya dapat menghapus dengan memberi nilai default)
        arrayInt2[0] = 0;

        // membuat array didalam array
        String[][] members = {
                {"Dira", "Sanjaya", "Wardana"},
                {"BUdi", "Dodi", "Deni"},
                {"Andi", "Yogi", "Diki"},
        };

        System.out.print(members[0][0]);
    }
}
