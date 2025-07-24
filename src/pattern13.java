import java.util.Scanner;

public class pattern13 {
    /*
    *pascal triangle
     1
     1 1
     1 2 1
     1 3 3 1*/

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = 0; i <n ; i++) {
            int val=1;  //binarsy coeff
            for (int j = 0; j <=i; j++) {
                System.out.print(val+" ");
                int valp1= val*(i-j)/(j+1);//val+1
                val=valp1;


            }
            System.out.println();

        }
//        for (int i = 1; i <=n ; i++) {
//            for (int j = 1; j <=i; j++) {
//                System.out.println((int)Math.pow(11,j-1));
//
//            }
//            System.out.println();
//
//        }
    }
}
