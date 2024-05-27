package com.xiao.Study6;

/**
 * ClassName: NoLifeValueException
 * Package: com.xiao.Study6
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:17
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException{
    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }
}
