import java.lang.instrument.ClassDefinition;

// static --> attribute atau method dipanggil dari class
// non-static --> attribute atau method dipanggil dari object

public class MethodOrFunction {
    public static void main(String[] args){
        sayHello();
        helloPerson("Dira", "Sanjaya");
        System.out.println(sum(10, 20));

        int[] nilai = {80, 70, 70,80, 90};
        sayCongrats("Dira", nilai);

        sayCongrats2("Dira", 70, 80, 80, 60, 90);
        helloPerson("Dira sanjaya wardana");
        System.out.println(factorialRecursive(5));
    }

    //------ tanpa parameter/argument ------//
    static void sayHello(){
        System.out.println("Hello world");
    }

    //------ dengan parameter ------//
    static void helloPerson(String firstName, String lastName){
        System.out.println("Hello " + firstName + " " + lastName);
    }

    //------ dengan return value (menyembalikan nilai) ------//
    static int sum(int value1, int value2){
        var total = value1 + value2;
        return total;
    }

    //------ method variabel argument (jumlah parameternya tidak pasti) ------//
    //------ dengan parameter array (tanpa variabel argument) ------//
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var item:values){
            total += item;
        }
        var finalValue = total/ values.length;

        if (finalValue >=75) {
            System.out.println("selamat " + name + ", anda lulus");
        } else {
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    }

    //------ dengan variabel argument ------//
    static void sayCongrats2(String name, int... values){
        var total = 0;
        for (var item:values){
            total += item;
        }
        var finalValue = total/ values.length;

        if (finalValue >=75) {
            System.out.println("selamat " + name + ", anda lulus");
        } else {
            System.out.println("Maaf " + name + ", anda tidak lulus");
        }
    }

    //------ method overloading (kemampuan membuat method dengan nama yang sama) ------//
    //------ parameter data harus berbeda, bisa jumlah parameternya atau tipe data parameternya ------//
    static void helloPerson(String name){
        System.out.println("Hello " + name);
    }

    //------ Recursive method (kemampuan method memanggil dirinya sendiri) ------//
    //------ dengan perulangan biasa (tanpa recursive method) ------//
    static int factorial(int value){
        var result = 1;
        for (int i = 1; i <= value ; i++){
            result *= value;
        }

        return result;
    }

    //------ dengan recursive method ------//
    static int factorialRecursive(int value) {
        if (value == 1){
            return 1;
        } else {
            return value * factorialRecursive(value - 1);
        }
    }
}