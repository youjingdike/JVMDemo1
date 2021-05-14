package com.tst.java1;

/**
 * @author
 * @create 2020-09-05 18:53
 */
public class SeniorDemo {
    private int num = 1;
    public final String info = "tst";
    boolean[] counts;

    public SeniorDemo(){

    }
    public SeniorDemo(int count){
        this.counts = new boolean[count];
    }

    public String getInfo(){
        return info;
    }
    public void addNum(int n){
        num += n;
        System.out.println(num);
    }
}
