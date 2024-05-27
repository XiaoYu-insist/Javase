package com.xiao.Study3;

import java.util.Arrays;

/**
 * ClassName: MyArrayList
 * Package: com.xiao.Study3
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 11:01
 * @Version 1.0
 */
public class MyArrayList implements Touchable{
    private Object[] all = new Object[2];
    private int total;

    public void add(Object element){
        if(total>=all.length){
            all = Arrays.copyOf(all, all.length*2);
        }
        all[total++] = element;
    }

    public void remove(int index){
        if(index < 0 || index >= total){
            System.out.println("没有这个元素");
            return;
        }
        System.arraycopy(all, index+1, all, index, total-index-1);
        all[--total]=null;
    }

    public void set(int index, Object value){
        if(index < 0 || index >= total){
            System.out.println("没有这个元素");
            return;
        }
        all[index] = value;
    }

    public Object get(int index){
        if(index < 0 || index >= total){
            System.out.println("没有这个元素");
            return null;
        }
        return all[index];
    }

    @Override
    public Selector select() {
        return new MySelector();
    }

    private class MySelector implements Selector{
        private int cursor;
        @Override
        public boolean hasNext() {
            return cursor != total;
        }

        @Override
        public Object next() {
            return all[cursor++];
        }

    }
}
