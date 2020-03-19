package com.atguigu.heap;


public class MinHeap {

    public int[] data;

    public static void main(String[] args) {
        MinHeap heapSort = new MinHeap();
        int[] data = { 3, 5, 8, 9, 1, 2 };
        heapSort.data = data;
        heapSort.buildHeap(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[0] + ",");
            data[0] = Integer.MAX_VALUE;
            heapSort.buildHeap(data);
        }

    }

    public void buildHeap(int[] array){
        // 完全二叉树只有数组下标小于或等于 (data.length) / 2 - 1 的元素有孩子结点，遍历这些结点。
        for (int i = array.length/2 -1 ; i >=0 ; i--) {
            heapify(array,i);
        }
    }


    private void heapify(int[] array, int i){
        int l= 2*i+1;
        int r= 2*i+2;
        // 这是一个临时变量，表示 根结点、左结点、右结点中最小的值的结点的下标
        int smallest=i;

        if(l<array.length&& array[l]<array[i]){
            smallest=l;
        }
        // 存在右结点，且右结点的值小于以上比较的较小值
        if(r<array.length&& array[r]<array[smallest]){
            smallest=r;
        }
        if(i==smallest){
            return;
        }
        //交换
        int temp=array[i];
        array[i]= array[smallest];
        array[smallest]=temp;

        // 由于替换后左右子树会被影响，所以要对受影响的子树再进行heapify
        heapify(array,smallest);

    }
}


