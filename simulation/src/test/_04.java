package test;

import java.util.Scanner;

/**
 * @date 2022/3/27 - 22:41
 */
public class _04 {


        static int search(int[] nums, int target) {
            int left = 0;
            int right = nums.length-1;
            while(left <= right){
                int midlle = (right - left) / 2 + left;//应该赋值的时候才会造成溢出
                if(nums[midlle] > target){
                    right = midlle-1;   //-1因为while条件是等号
                }
                if(nums[midlle] < target){
                    left = midlle+1;
                }
                else{
                    return midlle;
                }
            }
            return -1;
        }





}

/*
class love {

    public boolean kiss(String name) {
        System.out.println("DO you wanna kiss " + name + "?");
        Scanner in = new Scanner(System.in);
        String answer = in.next();
        if (answer.equals("Yes")) {
            System.out.println("祝你幸福");
            return true;
        } else
            System.out.println("祝你快乐");
            return false;
    }

}*/
