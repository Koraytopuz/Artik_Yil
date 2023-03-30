import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int yil;
        Scanner inp=new Scanner(System.in);
        System.out.println("Yıl Giriniz: ");
        yil= inp.nextInt();
        if (yil==1700||yil==1800||yil==1900){
            System.out.println(yil+" bir artık yıl değildir!");
        } else if (yil%4==0) {
            System.out.println(yil+" bir artık yıldır!");
        } else {
            System.out.println(yil+" bir artık yıl değildir!");
        }
    }
}