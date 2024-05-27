package com.xiao.Study11;

/**
 * ClassName: Status
 * Package: com.xiao.Study11
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 16:08
 * @Version 1.0
 */
public enum Status {
    FREE("空闲"), USED("在用"), SCRAP("报废");
    private final String description;
    private final int value;

    Status(String description) {
        this.value = ordinal();
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static Status getByValue(int value){
        return Status.values()[value];
    }

    @Override
    public String toString() {
        return description;
    }
}
