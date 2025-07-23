import java.util.Scanner;

public class pythagorean_triplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();//base
        int p= sc.nextInt();//height
        int h=sc.nextInt();//hypotaneous

        boolean ans=false;
        if(b*b+p*p==h*h||b*b+h*h==p*p||p*p+h*h==b*b){
            ans=true;
        }

        System.out.println(ans);
    }
}
