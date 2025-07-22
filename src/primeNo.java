import java.math.BigInteger;
import java.util.Scanner;

public class primeNo {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();

        for (int i = 0; i < a; i++) {

            int p = sc.nextInt();
            int count=0;
            for (int div = 2; div*div < p ; div++) {
                if(p % div==0){
                    count++;
                    break;
                }


            }
            if(count==0){
                System.out.println(" prime");
            }else{
                System.out.println("Not prime");
            }
        }
    }
}
