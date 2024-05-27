package com.xiao.Study5;

/**
 * ClassName: Exercise20
 * Package: com.xiao.Study5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:09
 * @Version 1.0
 */
public class Exercise20 {
    public static void main(String[] args) {
        try {
            GraphicTools.printRectangle(5, 5, '*');
        } catch (InvalidValueException e) {
            e.printStackTrace();
        }
    }
}