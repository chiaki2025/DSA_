import java.util.*;
public class addingArray {
    public void printArray(int[] arr){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public void demo() {
        int[] myArray = new int[5]; //default value
        myArray[0] = 5;
        myArray[1] = 5;
        myArray[2] = 5;
        myArray[3] = 5;
        myArray[4] = 50;
        myArray[2] = 10;
        printArray(myArray);
    }
    public void demo2(){
        int[] array = {5, 8, 1, 10};
        printArray(array);
    }
    public static void main(String[] args){
        addingArray arrUtil = new addingArray();
        arrUtil.demo2();
    }
}
