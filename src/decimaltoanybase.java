import java.util.Scanner;

public class decimaltoanybase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(dacimaltoanybases(d,b));

    }
    static  int dacimaltoanybases(int x,int b){
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
