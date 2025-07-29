package Arrays;

import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int [] arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= sc.nextInt();

        }
        int target=sc.nextInt();
        System.out.println(saerchindex(arr,target));
    }
    public static int saerchindex(int[] arr,int k){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==k){
                return i;
            }

        }
        return -1;
    }
}
