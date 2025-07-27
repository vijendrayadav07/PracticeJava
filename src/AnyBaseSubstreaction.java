import java.util.Scanner;

public class AnyBaseSubstreaction {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        int d2=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(anybasesubstraction(d,d2,b));
    }
    static  int anybasesubstraction(int n1,int n2,int b){
        int ans=0;
        int p=1;
        //carry
        int c=0;
        while (n2>0){
            int d1=n1%10;//first digit
            n1=n1/10;
            int d2=n2%10;  //second digit
            n2=n2/10;
            int d=0;
            d2=d2+c;
            if(d2>=d1){
                c=0;
                d=d2-d1;
            }
            else {
                c=-1;
                d=d2+b-d1;
            }



            ans+=d*p;
            p=p*10;

        }


        return ans;
    }
}
