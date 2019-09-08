package sortingAlgorithm;

/**
 * 插入排序
 * 时间复杂度：O(n^2)
 * 近乎有序的插入排序：O(n)  性能优于选择排序，甚至好于快排
 * 完全有序的插入排序：O(n)
 */
public class InsertSort {
    public void insertSort(int[] arr){
        for (int i = 1; i < arr.length-1;i++){
            int temp = arr[i];
            int j;
            for (j = i-1 ; j >= 0 ; j--){
                if (temp< arr[j]){
                    arr[j+1] = arr[j];
                } else{
                    break;
                }
            }
            arr[j+1] = temp;
        }
        for (int i = 0 ; i < arr.length;i++){
            System.out.print(arr[i] + " " );
        }
    }
}
