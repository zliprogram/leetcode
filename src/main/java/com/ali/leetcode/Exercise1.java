package com.ali.leetcode;

/**
 * @Description: two-sum 两数之和
 * @Author: 张黎 zliprogram@163.com 15972037154
 * @CreateDate: 2023-08-16 20:09
 * @UpdateUser:
 * @UpdateDate: 2023-08-16 20:09
 * @UpdateRemark:
 * @Version: 1.0
 * Copyright (c) 2023,南方数码
 * All rights reserved.
 */

public class Exercise1 {

    public static void main(String[] args) {
        int array [] = {1,3,6,8};
        int target = 9;
        twoSum(array,target);
    }

    public static int [] twoSum(int [] array,int target) {
        for (int i = 0; i < array.length; ++i) {
            for (int j = i + 1; j < array.length; ++j) {
                if (array[i] + array[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

}
