package com.xiao.Study7;

/**
 * ClassName: Color
 * Package: com.xiao.Study7
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/15 15:30
 * @Version 1.0
 */
public enum Color {
    RED(255, 0, 0, "赤"),
    ORANGE(255, 128, 0, "橙"),
    YELLOW(255, 255, 0, "黄"),
    GREEN(0, 255, 0, "绿"),
    CYAN(0, 255, 255, "青"),
    BLUE(0, 0, 255, "蓝"),
    PURPLE(128, 0, 255, "紫");

    private final int red;
    private final int green;
    private final int blue;
    private final String description;

    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return name() + "(" + red + "," + green + "," + green + ")->" + description;
    }
}
