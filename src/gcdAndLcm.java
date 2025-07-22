import java.util.Scanner;

public class gcdAndLcm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int original_n1=n1;
        int original_n2=n2;
        while(n2!=0){
            int rem=n1%n2;
            n1=n2;
            n2=rem;

        }
        int gcd=n1;
        int lcm= (original_n1*original_n2)/gcd;
        System.out.println(gcd);
        System.out.println(lcm);


    }
}
