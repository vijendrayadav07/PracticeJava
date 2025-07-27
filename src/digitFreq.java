import java.util.Scanner;

public class digitFreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        System.out.println(frequency(n,x));

    }
    static  int frequency(int n,int x){

        int count=0;
        while(n>0){
            int rem=n%10;
            if(rem==x){
                count++;

            }
            n=n/10;
        }
        return count;

    }
}
