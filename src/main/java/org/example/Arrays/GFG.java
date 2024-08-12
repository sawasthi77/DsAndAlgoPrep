package org.example.Arrays;
// Constraint would be that elements of the array have to be smaller as compared to the size of the array.
public class GFG {

    static void findDuplicate(int arr[]){
        int slow = arr[0];
        int fast = arr[0];

        while(true){
            slow = arr[slow];
            fast = arr[arr[fast]];

            if(slow == fast)
                break;
        }

        fast = arr[slow];
        int length = 1;
        while(slow != fast){
            fast = arr[fast];
            length ++;
        }

        System.out.println(length);
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1,2 };

        // Function Call
        findDuplicate(arr);
    }
}
