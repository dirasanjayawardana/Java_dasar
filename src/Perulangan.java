public class Perulangan {
    public static void main(String[] args){
        //------ looping for ------//
        for (int i=0; i<=10; i++){
            System.out.println("looping for ke-" + i);
        }

        //------ looping while ------//
        var counter = 1;
        while (counter <= 10){
            System.out.println("Looping while ke-" + counter);
            counter++;
        }

        //------ do while loop (perulangan dilakukan baru pengecekan - jadi ada minimal 1 kali perulangan) ------//
        var parameter = 1;
        do {
            System.out.println("Lopping do while ke-" + parameter);
            parameter ++;
        } while(parameter <= 10);
    }
}
