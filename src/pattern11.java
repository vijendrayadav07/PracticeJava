import java.util.Scanner;

public class pattern11 {
    /*
    1
    2 3
    4 5 6
    7 8 9 10*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=1;
        for (int i = 1; i <=n ; i++) {
             int j=1 ;
             while(j<=i){
                 System.out.print(count+" ");
                 count++;
                 j++;

            }
            System.out.println();

        }
    }
}
