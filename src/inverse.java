import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        ///no      8 1 4 5 6 2 7 3
        ///index   8 7 6 5 4 3 2 1
        ///inverse 8 2 4 5 6 1 3 7     index se change krte h
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int inv=0;//inverse
        int op=1;//original place
        while(n!=0){
            int od=n%10; //original digit
            int id=op;//invertede digit
            int ip=od;//inverted place
            // make change to inv using ip and id
            inv=inv+id*(int)Math.pow(10,ip-1);

            n=n/10;
            op++;



        }

        System.out.println(inv);
    }
}
