package com.xiao.Study4;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.util.Iterator;

/**
 * ClassName: MyArrayList
 * Package: com.xiao.Study4
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 14:09
 * @Version 1.0
 */
public class MyArrayList implements Iterable {
    private Object[] all = new Object[10];
    private int total;
    public void add(Object element){
        if(total >= all.length){
            System.out.println("空间已满，不添加了");
            return;
        }
        all[total++] = element;
    }
    public void remove(int index){
        if(index<0||index >= total){
            System.out.println("没有这个元素");
            return;
        }
        System.arraycopy(all,index+1,all,index,total-index-1);
        all[--total] = null;
    }
    public void set(int index, Object value){
        if(index<0||index >= total){
            System.out.println("没有这个元素");
            return;
        }
        all[index] = value;
    }
    public Object get(int index){
        if(index<0||index >= total){
            System.out.println("没有这个元素");
            return null;
        }
        return all[index];
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }

    public class Itr implements Iterator{
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
