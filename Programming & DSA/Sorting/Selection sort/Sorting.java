// Selection sort is a simple and efficient sorting algorithm that divides the input array into two parts: a sorted part and an unsorted part.
// It repeatedly selects the smallest (or largest) element from the unsorted part and moves it to the end of the sorted part.
// The algorithm maintains two subarrays in a given array:
// 1. The subarray which is already sorted.
// 2. The remaining subarray which is unsorted.
// The algorithm works by repeatedly selecting the smallest (or largest) element from the unsorted subarray and moving it to the sorted subarray.
// The time complexity of selection sort is O(n^2) in all cases (worst, average, and best) because it always goes through the entire unsorted part to find the minimum element.
// The space complexity is O(1) because it only requires a constant amount of additional memory for the temporary variable used for swapping.
// Selection sort is not a stable sort, meaning that it does not preserve the relative order of equal elements.
// It is not a good choice for large datasets compared to more advanced algorithms like quicksort, heapsort, or mergesort.
// However, it is simple to implement and can be useful for small datasets or when memory usage is a concern.
class Sorting {
    
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
       int arr[] = {7,8,3,1,2};
        for(int i = 0; i<arr.length; i++){
             int smallest = i;
             for(int j = i+1; j<arr.length; j++){
                 if(arr[j] < arr[smallest]){
                     smallest = j;
                 }
             }
             int temp = arr[smallest];
             arr[smallest] = arr[i];
             arr[i] = temp;
            
        }
        printArray(arr);
    }
}