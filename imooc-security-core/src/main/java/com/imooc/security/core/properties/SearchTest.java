package com.imooc.security.core.properties;

import org.apache.commons.lang3.RandomUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeSet;

/**
 * Created by 钟宇雷 on 2018/12/3.
 */
public class SearchTest {
    public static void main(String[] args) {
        int r = RandomUtils.nextInt(0, 1000000);

        TreeSet<Integer> treeSet = new TreeSet<>();
        ArrayList<Integer> list = new ArrayList<>(1000000);
        HashMap<Integer, Integer> map = new HashMap<>(1000000);

        long stratTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            treeSet.add(i);
        }
        long endTime = System.nanoTime();
        System.out.println("treeSet添加耗时：" + (endTime - stratTime) / 1000000000.0 + "s");

        stratTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }
        endTime = System.nanoTime();
        System.out.println("list添加耗时：" + (endTime - stratTime) / 1000000000.0 + "s");

        stratTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            map.put(i, i);
        }
        endTime = System.nanoTime();
        System.out.println("hasMap添加耗时：" + (endTime - stratTime) / 1000000000.0 + "s");

        stratTime = System.nanoTime();
        if (treeSet.contains(r)) {
            endTime = System.nanoTime();
            System.out.println("treeSet搜索耗时：" + (endTime - stratTime) / 1000000000.0 + "s");
        }


        stratTime = System.nanoTime();
        for (Integer i2 : list) {
            if (r == i2) {
                break;
            }
        }
        endTime = System.nanoTime();
        System.out.println("list搜索耗时：" + (endTime - stratTime) / 1000000000.0 + "s");

        stratTime = System.nanoTime();
        if (map.containsKey(r)) {
            endTime = System.nanoTime();
            System.out.println("hashMap搜索耗时：" + (endTime - stratTime) / 1000000000.0 + "s");
        }

        System.out.println(r);


    }


}
