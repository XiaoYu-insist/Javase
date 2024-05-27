package com.xiao.Study8;

/**
 * ClassName: User
 * Package: com.xiao.Study8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:39
 * @Version 1.0
 */
public class User {
    private String username;
    private String paseword;

    public User() {
    }

    public User(String username, String paseword) {
        this.username = username;
        this.paseword = paseword;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPaseword() {
        return paseword;
    }

    public void setPaseword(String paseword) {
        this.paseword = paseword;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", paseword='" + paseword + '\'' +
                '}';
    }
}
