
public class ortBulmaDizi {
    public static void main(String[] args) {


        int[] arr = {3,61,9,7,45,12,36};
        double avarage = 0.0;
        int sum = 0;

        for (int i = 0 ; i<arr.length ; i++){
            sum += arr[i];
        }

        double avaragex = (double)sum / arr.length;

        System.out.println(avaragex);
        }
    }