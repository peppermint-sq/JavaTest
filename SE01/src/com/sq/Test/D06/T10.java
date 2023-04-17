package com.sq.Test.D06;

public class T10 {
    public static void main(String[] args) {
//需求：定义一个方法copyOfRange(int[] arr,int from, int to)
//功能：将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）
// 的元素复制到新数组中，并将新数组返回。
        int[] arr = {1,2,3,4,5,6,7};
        copyOfRange(arr,2,4);
    }

    public static int[] copyOfRange(int[] arr,int from, int to){

        int[] arr1 = new int[to-from];
        for (int i = from; i < to; i++) {
            for (int j = 0; j < to-from; j++) {
                arr1[j] = arr[i];
                System.out.print(arr1[j]+" ");
                break;
            }
        }
        return arr1;
    }
}
