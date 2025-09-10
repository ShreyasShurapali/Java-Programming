class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
       int left = 0;
       int right = nums.length -1;

    while (left < right) {
        int sum = nums[left] + nums[right];

        if(sum ==  target){
            //Convert 0-based indices to 1-based indices
            return new int[] {left + 1,right + 1};
        }
        else if(sum<target){
            left++;             //Need larger number
        }
        else{   
            right--;            // Need Smaller number
        }
    }
    return new int[] {-1,-1};
    }

    public static void main (String[] args){
        int[] nums = {3,2,4};
        int target = 6;
        int[] result = twoSum(nums,target);
        System.out.println("indices: [" + result[0] + " " + result[1] + "]");
    }
}


// left = 0, right = 2  
// Array: [2,  7, 11, 15]
//         ↑       ↑
//       left    right

// Current sum = 2 + 11 = 13
// Target = 9  
// 13 > 9 (sum is STILL TOO BIG)



// left = 0, right = 1
// Array: [2,  7, 11, 15]
//         ↑   ↑
//       left right

// Current sum = 2 + 7 = 9
// Target = 9
// 9 == 9  FOUND IT!





