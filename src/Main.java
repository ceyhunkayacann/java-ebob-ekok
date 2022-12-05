import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2;
        int ebob = 0;
        int ekok = 0;


        Scanner input = new Scanner(System.in);

        System.out.print("n1 sayısı : ");
        n1 = input.nextInt();

        System.out.print("n2 sayısı : ");
        n2 = input.nextInt();


        int i = 1;
        while (i != Math.min(n1, n2)) {
            if(n1 % i == 0 && n2 % i == 0  ){
                ebob = i;
            }
            i++;
        }
        System.out.println("EBOB : " + ebob);

        int k = 1;
        while (k != (n1 * n2)) {
            if(k % n1 == 0 && k % n2 == 0 ){
                ekok = k;
                break;
            }
            k++;
        }

        System.out.println("EKOK : " + ekok);


    }
}
