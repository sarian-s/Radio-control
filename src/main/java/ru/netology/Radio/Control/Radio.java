package ru.netology.Radio.Control;

public class Test1 {
    ;
    private int maxSkorost = 50;
    private int minSkorost =10;
    private int srednyaSkorost;
    public Test1(int maxSkorost, int minSkorost){
        this.maxSkorost = maxSkorost;
        this.minSkorost = minSkorost;
    }
    public Test1(int size){
        maxSkorost = minSkorost + size;
        this.srednyaSkorost = (maxSkorost + minSkorost) / 2;
    }

    public int getMaxSkorost(){
        return maxSkorost;
    }
    public int getMinSkorost(){
        return minSkorost;
    }
    public int getSrednyaSkorost() {
        return srednyaSkorost;
    }
    public void setMaxSkorost(int newMaxSkorost){
        if(newMaxSkorost > 50){
            return;
        }
        if(newMaxSkorost < 10){
            return;
        }
        maxSkorost = newMaxSkorost;
    }

}