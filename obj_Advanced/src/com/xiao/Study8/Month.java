package com.xiao.Study8;

/**
 * ClassName: Month
 * Package: com.xiao.Study8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 15:45
 * @Version 1.0
 */
public enum Month {
    JANUARY(1,"1月份是一年的开始"),
    FEBRUARY(2,"2月份是一年中最短的一个月"),
    MARCH(3,"3月春暖花开"),
    APRIL(4,"4月阳光明媚"),
    MAY(5,"5月清凉初夏"),
    JUNE(6,"6月骄阳似火"),
    JULY(7,"7月下半年的第一个月"),
    AUGUST(8,"8月人已晒干"),
    SEPTEMBER(9,"秋风送爽"),
    OCTOBER(10,"10月全国同欢"),
    NOVEMBER(11,"11月寻找秋裤"),
    DECMEBER(12,"12月冰天雪地");
    private int value;
    private String description;

    Month(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public static Month getByValue(int value){
        return Month.values()[value-1];
    }

    @Override
    public String toString() {
        return this.value+"->"+name()+"->"+description;
    }
}
