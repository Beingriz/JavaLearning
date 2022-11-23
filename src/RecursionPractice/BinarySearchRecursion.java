package RecursionPractice;

public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int target = 8;
        System.out.println(search(arr, target, 0, arr.length-1));
    }
    static int search(int[] arr, int target, int start, int end){
        // Base condition if start is greater than end element is not found
        if(start > end) return  -1;

        // Find the Mid Element, Variable inside the body
        int mid = start+(end-start)/2;

        // check if mid is target, if yes return (it shuld match the return type of a funciton)
        if(target == arr[mid]) return mid;

        if(target < arr[mid])
            // return the  sub recursive  / function call becaus it has return type as integer.
            return search(arr, target, start, mid-1);
        return search(arr, target, mid+1, end);

    }
}
