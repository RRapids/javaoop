package com.soft1841.oop.Exception;

/**
 * 数组下标越界的异常练习
 */
public class BoundsException {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + " ");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.arr.println("下标越界！");
        }
    }
}
