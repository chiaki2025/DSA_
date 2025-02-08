import java.util.*;
public class removeEvenintegers {
    public void printElements(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
    public int[] removeEven(int[] array){
        int oddCount = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                oddCount++;
            }
        }
        int[] result = new int[oddCount];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 != 0){
                result[index] = array[i];
                index++;
            }
        }
        return result;
    }
    public static void main (String[] args){
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        removeEvenintegers arrayUtil = new removeEvenintegers();
        int[] result = arrayUtil.removeEven(array);
        arrayUtil.printElements(result);
    }
}
