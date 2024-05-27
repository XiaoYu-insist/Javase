package com.xiao.service;

/**
 * ClassName: TeamException
 * Package: com.xiao.service
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/23 14:58
 * @Version 1.0
 */
public class TeamException extends Exception{
    static final long serialVersionUID = -3384332948L;

    public TeamException() {
    }

    public TeamException(String message) {
        super(message);
    }
}
