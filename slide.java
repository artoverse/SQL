import java.util.*;
import java.io.*;


public class slide {
    public static void main(String arg[]){
        int arr[] = {1,2,1};

        int s = arr.length;
        int sum = arr.length;
        for(int i = 0 ;i < sum;){

            if(i == arr.length-1){
                if(s==arr.length) break; 
                i += s;
                s--;
            }
            i++;
            System.out.print(arr[i]+" ");
          //  sum += arr[i]*arr[i];
        }
        System.out.print(sum);

    }
}
