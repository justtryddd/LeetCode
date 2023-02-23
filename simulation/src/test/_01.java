package test;

import java.util.Scanner;

/**
 * @date 2022/3/21 - 22:01
 */
public class _01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] str = null;

    }
}

class Solution {
    public int maxArea(int[] height) {
        int sumx = 0;
        int tail = height.length-1 ;
        int measure;
        int measure1 = 0;
        for(int i=1; i<tail; i++){
            sumx = Math.abs(i-tail);
            measure = sumx * Math.min(height[i],height[tail]);
            if(measure>measure1){
                measure1 = measure;
            }
        }
        return measure1;
    }
}
