public class Percabangan {
    public static void main(String[] args){
        var nilai1 = 10;
        var nilai2 = 20;

        //------ if statement ------//
        if(nilai1 >=5 && nilai2 <=100){
            System.out.println("Statement if");
        } else if (nilai1 == 20 || nilai2 == 30) {
            System.out.println("Satement else if");
        } else {
            System.out.println("Statement else");
        }

        //------ switch statement (lebih sederhana dari if) ------//
        switch(nilai1){
            case 5:
                System.out.println("Statement switch 1");
                break;
            case 10:
                System.out.println("Statement switch 2");
                break;
            case 15:
                System.out.println("Statement switch 3");
                break;
            default:
                System.out.println("Statement default");
                break;
        }

        //------ Switch dengan lambda (cara lebih sederhana menggunakan switch - untuk java 14 keatas) ------//
        switch(nilai2){
            case 10 -> System.out.println("Statement lambda 1");
            case 20, 30 -> System.out.println("Statement lambda 2");
            case 40 -> System.out.println("Statement lambda 3");
            default -> {
                System.out.println("Statement lambda default");
            }
        }

        //------ Switch dengan yield (agar bisa return nilai dari switch case - untuk java 14 keatas) ------//
        String ucapan = switch (nilai2){
            case 10:
                yield "nilai anda adalah 10";
            case 20:
                yield "nilai anda adalah 20";
            default:
                yield "nilai anda adalah " + nilai2;
        };
        System.out.println(ucapan);

        //------ Tenary operator (operator sederhana dari if else) ------//
        String kalimat = nilai1 >= 10 ? "statement tenary true": "Statement tenary false";
        System.out.println(kalimat);
    }
}
