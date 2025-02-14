import java.util.*;
public class findMinimum {
    public int minArray(int[] array){
        int min = array[0];
        for(int i = 0; i < array.length; i++){
            if(min > array[i]){
                min = array[i];
            }
        }
        return min;
    }
    public static void main(String[] args){
        findMinimum arrayUtil = new findMinimum();
        int[] array = {10, 20, -100, 0, 3, 4};
        int min = arrayUtil.minArray(array);
        System.out.println(min);
    }
}
