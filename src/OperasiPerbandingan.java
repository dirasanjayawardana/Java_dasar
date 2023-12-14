public class OperasiPerbandingan {
    public static void main(String[] args){
        var a = 10;
        var b = 20;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a >= b);
        System.out.println(a <= b);
        System.out.println(a == b);
        System.out.println(a != b);

        // operasi boolean
        // (&& --> and), (|| --> or), (! --> kebalikan)
        System.out.println((a < b) && (a != b));
    }
}
