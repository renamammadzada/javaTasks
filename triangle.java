package Examples;
import java.util.Arrays;
public class triangle {
    public static void main(String[] args) {
        swapValues(new double[] {2.5, 5.0}); // -> [5.0, 2.5]
        swapValues(new double[] {0.0, 1.0}); //  -> [1.0, 0.0]
        swapValues(new double[] {99, 9}); // -> [9.0, 99.0]
        swapValues(new double[] {10.1, 19.3}); // -> [19.3, 10.1]
    }

    public static void swapValues(double [] arr){
        //implement here
        int j = 0;
        for(int i = 0; i < arr.length; i++){
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}