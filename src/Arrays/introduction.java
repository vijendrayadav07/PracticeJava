package Arrays;

import java.util.Arrays;

public class introduction {
    public static void main(String[] args) {
        int []arr=new int[5];
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        int []two =arr;
        two[1]=400;

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(two));
        swap(arr,0,4);
        System.out.println(Arrays.toString(arr));

    }
    public static void swap(int [] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
