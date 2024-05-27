package com.xiao.Study5;

/**
 * ClassName: InvalidValueException
 * Package: com.xiao.Study5
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 10:53
 * @Version 1.0
 */
public class InvalidValueException extends Exception{
//    static final long serialVersionUID = -3387529948L;
    public InvalidValueException() {
    }

    public InvalidValueException(String message) {
        super(message);
    }
}
