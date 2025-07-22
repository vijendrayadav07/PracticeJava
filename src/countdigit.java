import java.util.Scanner;

public class countdigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int digit=sc.nextInt();
        int n=Math.abs(digit);
        int count=0;
        if(n==0){
            count =1;

        }
        else {
            while(n>0){
                count++;
                n=n/10;
            }
        }
        System.out.println(count);
    }
}
