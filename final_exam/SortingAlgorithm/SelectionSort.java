/**
 * @date 2023/2/13 - 11:19
 */
public class SelectionSort {

//  递归算阶乘
    public static int SelectionSort(int n){
        if(n == 0 || n == 1)return 1;
        else return n*SelectionSort(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(SelectionSort(n));;
    }

//
//    public static int ass(int[] arr,int low,int high){
//
//        int i = low;
//        int j = high;
//        int pivot = arr[low];
//        int temp = 0;
//        while(i<j && arr[j] > pivot) {
//            j--;
//            if (i < j) {
//                temp = arr[i];
//                arr[i++] = arr[j];
//                arr[j] = temp;
//            }
//        }
//        while(i < j && arr[i] <= pivot){
//            i++;
//            if(i < j){
//                temp = arr[i];
//                arr[i] = arr[j];
//                arr[j--] = temp;
//            }
//        }
//        return i;
//    }
//
//    public static void main(String[] args) {
//        int[] arr = {1,2,3,2,1};
//        ass(arr,0,arr.length);
//        for(int i=0;i<arr.length;i++){
//            System.out.println(arr[i]);
//        }
//    }
}
