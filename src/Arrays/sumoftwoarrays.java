package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class sumoftwoarrays {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] first=new int[n];
        for (int i = 0; i < n; i++) {
            first[i]= sc.nextInt();

        }
        int [] second=new int[n];
        for (int i = 0; i < n; i++) {
            second[i] = sc.nextInt();
        }
        int [] ans=new int[n];
        ans=sum(first,second);
        System.out.println(Arrays.toString(ans));




    }
    public static int[] sum(int[]first,int[]second){
        for (int i = 0; i < first.length; i++) {
            first[i]=first[i]+second[i];

        }
        return first;

    }
}
