package com.tst.java;

/**
 * @author
 * @create 10:36
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User(); //隐式加载

        try {
            Class clazz = Class.forName("com.tst.java.User"); //显式加载
            ClassLoader.getSystemClassLoader().loadClass("com.tst.java.User");//显式加载
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
