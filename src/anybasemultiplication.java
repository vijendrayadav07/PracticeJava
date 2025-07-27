import java.util.Scanner;

public class anybasemultiplication {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int d2=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(anybasemultiplications(d,d2,b));
    }
    static int anybasemultiplications(int n1,int n2,int b){
        int ans=0;
        int p=1;
        while(n2>0){
            int d2=n2%10;
            n2=n2/10;

            //sprd single product
            int sprd=singledigit(n1,d2,b);
            ans=anybaseaddition(ans,sprd*p,b);
            p=p*10;
        }
        return ans;

    }
    static int singledigit(int n1,int d2,int b){
        int ans=0;
        int p=1;
        int c=0;
        while (n1>0||c>0){
            int d1=n1%10;
            n1=n1/10;

            int d=d1*d2+c;
            c=d/b;
            d=d%10;
            ans=ans+ d*p;
            p=p*10;
        }
        return ans;
    }
    static  int anybaseaddition(int n1,int n2,int b){
        int c=0; //carry
        int ans=0;
        int p=1;
        int count=0;
        while (n1>0||n2>0||c>0){
            int d1=n1%10;  //first digit
            int d2=n2%10;  //second digit
            n1=n1/10;
            n2=n2/10;
            int d=d1+d2+c;
            c=d/b;
            d=d%b;

            ans+=d*p;
            p=p*10;

        }


        return ans;
    }
}
