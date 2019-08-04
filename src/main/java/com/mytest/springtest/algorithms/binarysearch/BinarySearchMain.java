package com.mytest.springtest.algorithms.binarysearch;

public class BinarySearchMain {

    /**
     * 从arry中查找a是否存在
     *
     * 递归太占内存，每调用一次binarySearch方法就创建一个方法栈
     * @param array
     * @param a
     * @return
     */
    public static boolean binarySearch(int[] array,int a,int minIndex,int maxIndex){
        while (minIndex < maxIndex){
            int midIndex = (minIndex+maxIndex)/2;
            int mid = array[midIndex];

            if(mid > a){
                //在左边
                return binarySearch(array,a,0,midIndex);
            }else if(mid<a){
                //在右边
                return binarySearch(array,a,midIndex+1,maxIndex);
            }else{
                return true;
            }
        }
        return false;
    }


    /**
     * 隐藏了二分查找法的内部实现，不需要关注数组的长度。
     *
     * @param array
     * @param a
     * @return
     */
    public static int binarySearchNew(int[] array,int a){
        int minIndex = 0;
        int maxIndex = array.length-1;
        int i=0;
        while (minIndex<=maxIndex){
            i++;
            System.out.println("seartchCount="+i);
            int midInx = (minIndex+maxIndex)/2;
            if(a<array[midInx]){
                maxIndex = midInx-1;
            }else if(a>array[midInx]){
                minIndex = midInx+1;
            }else
                return midInx;

        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array={1,3,5,7,9,11};
        int a=12;
        System.out.println(binarySearchNew(array,a));
    }
}
