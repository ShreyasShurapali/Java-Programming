public class ArrayTraversal{
    public static void main(String[] args){
        int arr[] = {10,20,40,60,100};

        //Method 1: Traditional for Loop
        for(int i =0;i<arr.length;i++){
            System.out.println("Element at index " + i + ":" +arr[i]);

        }

        //Method 2: Enhanced for Loop
        for(int element : arr){
            System.out.println("array elements are  " + element + " " );
        }

    }
}