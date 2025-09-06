// Bubble sort
// Bubble sort is a simple sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order.
// The pass through the list is repeated until the list is sorted.
// The algorithm gets its name from the way smaller elements "bubble" to the top of the list.
// The time complexity of bubble sort is O(n^2) in the worst and average cases, and O(n) in the best case (when the array is already sorted).
// The space complexity is O(1) because it only requires a constant amount of additional memory for the temporary variable used for swapping.
// Bubble sort is a stable sort, meaning that it preserves the relative order of equal elements.
// It is not a good choice for large datasets compared to more advanced algorithms like quicksort, heapsort, or mergesort.
// However, it is simple to implement and can be useful for small datasets or when memory usage is a concern.

import java.util.*;


class Sorting {
   public static void printArray(int arr[]) {
       for(int i=0; i<arr.length; i++) {
           System.out.print(arr[i]+" ");
       }
       System.out.println();
   }


   public static void main(String args[]) {
       int arr[] = {7, 8, 1, 3, 2};


       //bubble sort
       for(int i=0; i<arr.length-1; i++) {
           for(int j=0; j<arr.length-i-1; j++) {
               if(arr[j] > arr[j+1]) {
                   //swap
                   int temp = arr[j];
                   arr[j] = arr[j+1];
                   arr[j+1] = temp;
               }
           }
       }


       printArray(arr);
   }
