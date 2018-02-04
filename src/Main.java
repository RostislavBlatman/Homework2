import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i = 1;
        double an = 0.0;
        float e;
        System.out.println("Введите число е: ");
        Scanner x = new Scanner(System.in);
        e = x.nextFloat();
        do{

            an = 1 / java.lang.Math.pow (i + 1 , 2 );
            System.out.println("a[" + i + "] = " + an);
            i++;
        }
        while(an < e );
    }
}
