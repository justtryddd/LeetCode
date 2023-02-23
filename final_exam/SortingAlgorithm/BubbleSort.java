import java.util.Scanner;



/**
 * @date 2023/2/13 - 11:10
 */
public class BubbleSort {
    public static void BulleSort(int[] arr){

        int length = arr.length;
        int temp = 0;
        for(int i=0; i<length; i++){
            for(int j=1; j<i; j++){
                if(arr[i] < arr[j])
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
            }
        }
    }


    public static void main(String[] args) {
        int[] arr;

    }
}
