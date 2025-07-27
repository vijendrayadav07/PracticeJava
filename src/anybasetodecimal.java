import java.util.Scanner;

public class anybasetodecimal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(anybaseTodecmal(d,b));

    }
    static  int anybaseTodecmal(int d,int b){
        int ans=0,count=0;
        while (d>0){
            int rem=d%10;
            ans+=rem*Math.pow(b,count);
            count++;
            d=d/10;
        }
        return  ans;

    }
}

