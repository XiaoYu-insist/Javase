package com.xiao.lianxi6;

import java.util.Scanner;

public class ChatThread extends Thread{
    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("是否结束（Y/N）");
            String answer = scanner.nextLine();
            if(!"".equals(answer)&&Character.toUpperCase(answer.charAt(0))=='Y'){
                break;
            }
        }
        scanner.close();
    }
}
