public class pattern5 {
    /*
    *   *
    *  ***
    * *****
    *  ***
    *   *       */

    public static void main(String[] args) {
        int n=3;
        for (int i = 1; i <=n ; i++) {
//            System.out.print("*");
            for (int j = 1;j <=n-i ; j++) {
                System.out.print(" ");

            }


            for (int k = 1; k <2*i ; k++) {
                System.out.print("*");

            }
            System.out.println();

        }
        for (int i = n-1; i >=1 ; i--) {
            for (int j = 1;j <=n-i ; j++) {
                System.out.print(" ");

            }


            for (int k = 1; k <2*i ; k++) {
                System.out.print("*");

            }
            System.out.println();


        }
    }
}
