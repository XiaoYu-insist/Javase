package com.xiao.Study8;

/**
 * ClassName: UsernameAlreadyExistsException
 * Package: com.xiao.Study8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:37
 * @Version 1.0
 */
public class UsernameAlreadyExistsException extends Exception{
    public UsernameAlreadyExistsException() {
    }

    public UsernameAlreadyExistsException(String message) {
        super(message);
    }
}
