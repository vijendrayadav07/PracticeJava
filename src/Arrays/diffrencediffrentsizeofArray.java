package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class diffrencediffrentsizeofArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] first=new int[n];
        for (int i = 0; i < n; i++) {
            first[i]= sc.nextInt();

        }
        int m= sc.nextInt();
        int [] second=new int[n];
        for (int i = 0; i < m; i++) {
            second[i] = sc.nextInt();
        }
        int [] ans=new int[n];
        ans=diffrencebtwdiffrentSize(first,second);
        System.out.println(Arrays.toString(ans));




    }
    public static int[] diffrencebtwdiffrentSize(int[]first,int[]second){
        if(first.length== second.length){
            for (int i = 0; i < first.length; i++) {
                first[i]=first[i]-second[i];
            }
            return first;

        } else if (first.length> second.length) {
            for (int i = 0; i < first.length; i++) {
                first[i]=first[i]-second[i];

            }
            return first;

        }
        for (int i = 0; i < second.length; i++) {
            second[i]=second[i]-first[i];

        }
        return second;

    }
}
