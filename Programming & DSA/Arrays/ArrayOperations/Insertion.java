public class Insertion {
    public static int[] insert(int[] arr, int element, int position) {
        int[] newArr = new int[arr.length + 1];
        
        // Copy elements before position
        for (int i = 0; i < position; i++) {
            newArr[i] = arr[i];
        }
        
        // Insert new element
        newArr[position] = element;
        
        // Copy remaining elements
        for (int i = position; i < arr.length; i++) {
            newArr[i + 1] = arr[i];
        }
        
        return newArr;
    }
    
    // Add this main method to test your insertion
    public static void main(String[] args) {
        // Test the insertion method
        int[] original = {1, 2, 3, 4, 5};
        System.out.println("Original Array:");
        for (int num : original) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Insert element 99 at position 2
        int[] updated = insert(original, 99, 2);
        System.out.println("After inserting 99 at position 2:");
        for (int num : updated) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Insert element 0 at beginning
        int[] updated2 = insert(original, 0, 0);
        System.out.println("After inserting 0 at beginning:");
        for (int num : updated2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
