package sortingAlgorithm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int l = sc.nextInt();
        int r = sc.nextInt();
        int[] arr = generateRandomArray(m,l,r);
        //选择排序方法调用
        SelectSort selectSort = new SelectSort();
        selectSort.select(arr);
        System.out.println();
        System.out.println("--------------------");
        //插入排序方法调用
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(arr);
    }
    private static int[] generateRandomArray(int n , int l,int r){
        int[] arr = new int[n];
        for (int i = 0 ; i < arr.length;i++){
            arr[i] = (int)(Math.random()*(r-l+1)+l);
        }
        return arr;
    }
}
