package day3.day4Test;

public class SecondLargest {
    public static int solution(int[] arr){
        int largest = Integer.MIN_VALUE;
        int slargest = Integer.MAX_VALUE;

        for(int i = 0;i < arr.length; i++){
            if(arr[i] > largest){
              slargest = largest;
              largest = arr[i];

            }else if(arr[i] < largest && arr[i] > slargest){
                slargest = arr[i];
            }
        }

        return slargest;
        
    }

    public static void main(String[] args) {
        int[] arr = {8,12,7,-1};

        System.out.println(solution(arr));
    }
}
