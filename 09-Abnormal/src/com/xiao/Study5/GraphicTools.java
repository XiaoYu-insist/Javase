package com.xiao.Study5;

/**
 * ClassName: GraphicTools
 * Package: com.xiao.Study5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 10:54
 * @Version 1.0
 */
public class GraphicTools {
    public static void printRectangle(int line, int column, char sign) throws InvalidValueException {
        if (line <= 0 || column <= 0) {
            throw new InvalidValueException("矩形的长和宽必须是正整数");
        }
        if (sign < 33 || sign > 126) {
            throw new InvalidValueException("组成矩形的必字符必须是数字字母和基本标点符号");
        }
        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sign);
            }
            System.out.println();
        }
    }
}

