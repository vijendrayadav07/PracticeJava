import java.util.Scanner;

public class pattern6 {
    /*
    *   * * *   * * *   3-1-3
    *   * *       * *   2-3-2
    *   *           *   1-5-1
    *   * *       * *   2-3-2
    *   * * *   * * *   3-1-3 */


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int st=n/2+1;  //start n/2+1
        int sp=1;// space=1

        for (int i = 1; i <=n ; i++) {

            for (int j = 1; j <=st ; j++) {
                System.out.print("*");

            }
            for (int j = 1; j <=sp; j++) {
                System.out.print(" ");

            }
            for (int j = 1; j <=st ; j++) {
                System.out.print("*");

            }

//            System.out.println(st+"-"+sp+"-"+st);
            if(i<=n/2){
                st--;
                sp+=2;
            }else{
                st++;
                sp-=2;
            }
            System.out.println();
        }

    }
}
