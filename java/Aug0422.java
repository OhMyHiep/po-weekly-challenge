public class Aug0422{

    public static void main (String[] args){
        Aug0422 hw= new Aug0422();
        int [] nums={1,2,3,4,5,6};
        int[] result=hw.selReverse(nums,10);
        System.out.println();
        //  for(int i:result){
        //     System.out.print(i+" ");
        //  }
        //  System.out.println();
        System.out.println(10%3);
    }


    /*
    Create a function that takes an array and a number 
    and selectively reverse the order of the array based on the number you're given (second argument).
    If you're given the arguments [1,2,3,4,5,6] and 2, you would return the array [2,1, 4,3, 6,5].
    Examples
    selReverse([1,2,3,4,5,6], 2) ➞ [2,1, 4,3, 6,5]
    selReverse([2,4,6,8,10,12,14,16], 3) ➞ [6,4,2, 12,10,8, 16,14]
    selReverse([5,7,2,6,0,4,6], 100) ➞ [6,4,0,6,2,7,5]
    Notes
    If the array you're given can't be broken up into equal parts, just reverse the remaining numbers (see 2nd expample).
    If len exceeds the array length, reverse everything.
    If len is zero, return the original array.
     */
    public int[] selReverse(int[] nums,int interval){
        if (nums.length==0) return nums;
        int start=0;
        int end=interval-1;
        while(start<nums.length-1){ //loop entire array for each interval 
            // System.out.println(end);
            if(end>=nums.length) end=nums.length-1;
            intervalReverse(start, end,nums);
            start=end+1;
            end+=interval;
        }
        return nums;
    }

    private void intervalReverse(int start, int end,int[] nums){ //reverse for 1 interval
        while (end>start){
            int temp=nums[start];
            nums[start]=nums[end];
            nums[end]=temp;  
            // System.out.print(nums[start]);
            // System.out.print(nums[end]);
            end--;
            start++;  
        }
    }

}