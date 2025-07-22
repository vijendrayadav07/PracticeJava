import java.util.Scanner;

public class rotateNo {
    public static void main(String[] args) {
        //n=12340056
        //k=3
        //op==05612340

        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        sc.close();
        int temp=n;
        int nd=0;//no of digit
        while(temp>0){
            nd++;
            temp=temp/10;



        }
        k=k%nd;//if k>nd
        int divisor=(int)Math.pow(10,k);
        int rem=n%divisor;

        int multiplier=(int)Math.pow(10,nd-k);
        int qutient=n/divisor;
        int ans=rem*multiplier+qutient;
        System.out.println(ans);

    }
}
