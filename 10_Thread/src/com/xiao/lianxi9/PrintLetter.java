package com.xiao.lianxi9;

public class PrintLetter {
    private char letter = 'a';
    public synchronized void printLower(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+":"+letter);
            letter++;
            if(letter > 'z'){
                letter = 'a';
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void printUpper(){
        for (int i = 0; i < 3; i++) {
            System.out.println(Thread.currentThread().getName()+":"+(char)(letter-32));
            letter++;
            if(letter > 'z'){
                letter = 'a';
            }
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        try {
            this.wait();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
