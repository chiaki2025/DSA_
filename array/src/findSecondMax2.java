import java.util.*;
public class findSecondMax2 {
    public int findSecond(int[] array){
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for(int i = 0; i < array.length; i++){
            if(array[i] > max){
                secondMax = max;
                max = array[i];
            }
            else if(array[i] > secondMax && array[i] != max){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args){
        findSecondMax2 arrayUtil = new findSecondMax2();
        int[] array = {1, 2, 3, 4, 5, 5, 6, 6, 5, 7};
        int secondMax = arrayUtil.findSecond(array);
        System.out.println(secondMax);
    }
}
