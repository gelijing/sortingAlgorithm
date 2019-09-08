package sortingAlgorithm;

/**
 * 快排
 * 时间复杂度 O(NlogN)
 * 近乎有序的数组 因为不能保持平衡性，时间复杂度降退化为O(n^2)
 * 优化方案：
 *     一、随机选择一个元素，与最左侧元素交换
 *     二、重复元素太多的情况 不平衡 退化为O(n^2)  三路快排
 *     三、数组长度小于15时，插入排序更优
 */
public class QuickSort {
}
