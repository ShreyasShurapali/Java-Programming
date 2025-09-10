public class DecelarationAndInitialization {
    public static void main(String[] args) {
        // Different ways to create arrays
        int[] arr1 = new int[5];                    // All elements are 0
        int[] arr2 = {1, 2, 3, 4, 5};             // Direct initialization
        int[] arr3 = new int[]{10, 20, 30};       // Alternative syntax
        
        System.out.println("Array created successfully!");
        System.out.println("arr1 length: " + arr1.length);
        System.out.println("arr2 length: " + arr2.length);  
        
    }
}
