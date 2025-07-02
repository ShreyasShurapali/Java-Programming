//Insertion sort
// Insertion sort is a simple and efficient sorting algorithm that builds the final sorted array (or list) one item at a time.  
// It is much less efficient on large lists than more advanced algorithms such as quicksort, heapsort, or mergesort.
// The algorithm works by dividing the input array into two parts: a sorted part and an unsorted part.
// It iteratively takes one element from the unsorted part and finds the correct position for it in the sorted part.
// The time complexity of insertion sort is O(n^2) in the worst and average cases, and O(n) in the best case (when the array is already sorted).
// The space complexity is O(1) because it only requires a constant amount of additional memory for the temporary variable used for swapping.
// Insertion sort is a stable sort, meaning that it preserves the relative order of equal elements.
// It is a good choice for small datasets or when the array is already partially sorted.
// It is also adaptive, meaning that it is efficient for data sets that are already substantially sorted.
// Insertion sort is not a good choice for large datasets compared to more advanced algorithms like quicksort, heapsort, or mergesort.
// The algorithm is simple to implement and can be useful for small datasets or when memory usage is a concern.
import java.util.*;

class Sorting{
    public static void printArray( int arr []){
        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void main(String args[]){
        int arr[] = {7,8,1,3,2};
        
        for(int i=1;i<arr.length;i++){
            int current = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > current){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = current;
        }
        printArray(arr);
    }
}