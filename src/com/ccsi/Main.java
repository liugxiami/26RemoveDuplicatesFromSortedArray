package com.ccsi;

public class Main {

    public static void main(String[] args) {
	    int[] arr={1,2,2,3,4,5,5,6,7,7};
        System.out.println(removeDuplicates(arr));
    }
    //Given a sorted array,remove the duplicates in place such that each element appear only once
    //and return the new length.
    //Do not allocate extra space for another array, you must do this in place with constant memeory
    public static int removeDuplicates(int[] nums){
        if(nums==null||nums.length==0)return 0;
        int newLen=0;
        for (int i = 0; i < nums.length; i++) {
            if(i-1>=0&&nums[i]==nums[i-1])continue;
            else{
                nums[newLen++]=nums[i];
            }
        }

        return newLen;
    }
}
