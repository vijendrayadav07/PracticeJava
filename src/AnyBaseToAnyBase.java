import java.util.Scanner;

public class AnyBaseToAnyBase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int b=sc.nextInt();
        int b2=sc.nextInt();
        int decimal=anybasetodecimal(d,b);
        int ans=dacimaltoanybases(decimal,b2);
        System.out.println(ans);

    }
    static  int anybasetodecimal(int d,int b){//base b to decima;
        int ans=0,count=0;
        while (d>0){
            int rem=d%10;
            ans+=rem*Math.pow(b,count);
            count++;
            d=d/10;
        }

        return  ans;

    }
    static  int dacimaltoanybases(int x,int b){  //decimat to base
        int ans=0,count=0;
        while (x>0){
            int rem=x%b;
            ans+=rem*Math.pow(10,count);
            count++;
            x=x/b;
        }
        return  ans;

    }
}
