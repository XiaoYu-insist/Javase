package com.xiao.Study8;

/**
 * ClassName: LoginFailException
 * Package: com.xiao.Study8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:38
 * @Version 1.0
 */
public class LoginFailException extends Exception{
    public LoginFailException() {
    }

    public LoginFailException(String message) {
        super(message);
    }
}
