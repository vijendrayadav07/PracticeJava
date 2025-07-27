import java.util.Scanner;

public class function {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r= sc.nextInt();
        int nfact=permutation(n);
        int nrfact=permutation(n-r);
        int npr=nfact/nrfact;
        System.out.println(npr);
        System.out.println(f(n));
        //nPr=n!/(n-r)!
    }
    static int permutation(int n){
        int nfact=1;
        for (int i = 1; i <=n ; i++) {
            nfact*=i;

        }



        return nfact;


    }
    static int f(int x){
        int xsquare=x*x;
        return xsquare;
    }
}
