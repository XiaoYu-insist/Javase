package com.xiao.Study6;

/**
 * ClassName: Person
 * Package: com.xiao.Study6
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:18
 * @Version 1.0
 */
public class Person {
    private String name;
    private int lifeValue;

    public Person() {
        super();
    }

    public Person(int lifeValue, String name) {
        super();
        setLifeValue(lifeValue);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue < 0) {
            throw new NoLifeValueException("生命值不能为负数：" + lifeValue);
        }
        this.lifeValue = lifeValue;

    }
}
