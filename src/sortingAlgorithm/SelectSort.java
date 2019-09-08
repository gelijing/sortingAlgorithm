package sortingAlgorithm;

import java.util.Scanner;

/**
 * 选择排序
 * 思路：选择最小的数放在最前面
 * 时间复杂度：O(n^2)
 */
public class SelectSort {
    public void select(int[] arr){
        for (int i = 0 ; i < arr.length;i++){
            int min = i;
            for (int j = i; j < arr.length;j++){
                if (arr[min] > arr[j]){
                    min = j;
                }
            }
            swap(arr,min,i);
        }
        for (int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }

    private void swap(int[] arr, int min, int i) {
        int temp = arr[min];
        arr[min] = arr[i];
        arr[i] = temp;
    }
}
