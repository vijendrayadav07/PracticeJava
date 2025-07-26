import java.util.Scanner;

public class pattern14 {
    /*
     x*1=x
     x*2=2x
     x*3=3x
     x*4=4x
     x*5=5x
     x*6=6x
      .
      .
      */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        for (int i = 1; i <=10 ; i++) {
            System.out.println(x+"*"+i+"="+(x*i));


        }
    }
}
