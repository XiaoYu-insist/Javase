package com.xiao.lianxi11;

/**
 * ClassName: ComparableCircle
 * Package: com.xiao.lianxi11
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/13 14:25
 * @Version 1.0
 */
public class ComparableCircle extends Circle implements Compareobject{
    public ComparableCircle(double redius) {
        super(redius);
    }

    public ComparableCircle() {
    }

    @Override
    public int compareTo(Object o) {
        if(this == o){
            return 0;
        }
        if (o instanceof ComparableCircle){
            ComparableCircle c = (ComparableCircle) o;
            return Double.compare(this.getRedius(),c.getRedius());
        }else {
            return 2;
        }
    }
}


