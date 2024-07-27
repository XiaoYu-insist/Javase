package com.xiao.lianxi9;

public class Exercise9 {
    public static void main(String[] args) {
        PrintLetter p = new PrintLetter();
        new Thread("小写字母"){
            @Override
            public void run() {
                while (true){
                    p.printLower();
                }

            }
        }.start();
        new Thread("大写字母"){
            @Override
            public void run() {
                while (true){
                    p.printUpper();
                }
            }
        }.start();
    }
}
