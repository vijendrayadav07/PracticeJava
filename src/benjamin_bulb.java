import java.util.Scanner;

public class benjamin_bulb {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i*i <=n ; i++) {
            System.out.println(i*i);

        }
    }
}
