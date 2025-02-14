public class findSecondMax1 {
    public int[] createNewArray(int[] array){       //Create new array without maximum elements
        int max = array[0];
        for(int i = 0; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
            }
        }
        int count = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != max){
                count++;
            }
        }
        int[] newArray = new int[count];
        int index = 0;
        for(int i = 0; i < array.length; i++){
            if(array[i] != max){
                newArray[index] = array[i];
                index++;
            }
        }
        return newArray;
    }
    public int secondMax(int[] array){
        findSecondMax1 arrayUtil = new findSecondMax1();
        int[] newArray = arrayUtil.createNewArray(array);
        int secondMaximum = newArray[0];
        for(int i = 0; i < newArray.length; i++){
            if(secondMaximum < newArray[i]){
                secondMaximum = newArray[i];
            }
        }
        return secondMaximum;
    }
    public static void main(String[] args){
        findSecondMax1 arrayUtil = new findSecondMax1();
        int[] array = {2, 5, 3, 5, 7, 2};
        System.out.println(arrayUtil.secondMax(array));
    }
}
/*
1. Find first maximum.
2. Create new array without first maximum elements.
3. Find second maximum.
Time complexity is O(n) but space complexity is 2n (using 2 arrays)
 */

