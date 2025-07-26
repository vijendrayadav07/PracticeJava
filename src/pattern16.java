import java.util.Scanner;

public class pattern16 {
    /* 1           1
       1 2       2 1
       1 2 3   3 2 1
       1 2 3 4 3 2 1
                    */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(j+"\t");

            }



            for (int j = 1; j <= (2*n-2*i) ; j++) {
                System.out.print("\t");
            }

            for (int j = i; j>=1 ; j--) {
                    System.out.print(j+"\t");


            }
            System.out.println();




        }
    }
}
