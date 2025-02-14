import java.util.*;
public class ReverseArray {
    public void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.printf(array[i] + " ");
        }
    }
    public void reverse(int[] array, int start, int end){
        while(start < end){
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public static void main(String[] args){
        ReverseArray arrayUtil = new ReverseArray();
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        arrayUtil.reverse(array, 0, array.length - 1);
        arrayUtil.printArray(array);
    }
}
