import java.util.Scanner;
public class initializingArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5];
        for(int i = 0; i < 5; i++){
            array[i] = scanner.nextInt();
        }
        scanner.close();
        for(int i = 0; i < 5; i++){
            System.out.println(array[i]);
        }
    }
}
