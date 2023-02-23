package test;

import javafx.util.Pair;

/**
 * @date 2022/3/28 - 20:42
 */
public class _shabifanxing {
    public static void main(String[] args) {

    }
}
class ArrayAlg{
    public static <T extends Comparable> Pair minmax(T[] a){
        if(a == null || a.length == 0)
            return null;
        T min = a[0];
        T max = a[0];
        for(int i =1; i < a.length; i++){
            if(min.compareTo(a[i]) > 0) min = a[i];
            if(max.compareTo(a[i]) < 0) max = a[i];
        }
        return new Pair<>(min,max);
    }
}
