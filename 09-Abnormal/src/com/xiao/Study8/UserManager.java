package com.xiao.Study8;

/**
 * ClassName: UserManager
 * Package: com.xiao.Study8
 * Description:
 *
 * @Author xiao-yu
 * @Create 2024/5/21 14:41
 * @Version 1.0
 */
public class UserManager {
    //存储已经注册的用户
    private static User[] arr;
    //存储实际注册的用户数量
    private static int total;

    public UserManager() {
        arr = new User[5];
    }

    public void checkUsernameExists(String username) throws UsernameAlreadyExistsException {
        for (int i = 0;i< total;i++){
            if (username.equals(arr[i].getUsername())){
                throw new UsernameAlreadyExistsException("用户名已存在");
            }
        }
    }

    public void add(User user){
        if (total >= arr.length){
            User[] newArr = new User[arr.length + (arr.length >> 2)];
            for (int i = 0;i < total;i++){
                newArr[i] = arr[i];
            }
            arr = newArr;
        }
        arr[total++]=user;
    }

    public void login(User user) throws LoginFailException {
        for (int i = 0;i < total; i++){
            if (user.getUsername().equals(arr[i].getUsername())&&user.getPaseword().equals(arr[i].getPaseword())){
                return;
            }
        }
        throw new LoginFailException("登陆失败");
    }
}
