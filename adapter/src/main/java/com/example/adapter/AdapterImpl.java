package com.example.adapter;

public class AdapterImpl implements Adapter {

    @Override
    public float twiceOf(float num) {
        return (float) Math.twoTime((double) num);
    }

    @Override
    public float halfOf(float num) {
        System.out.println("절반 함수 호출 시작");
        return (float) Math.half((double) num);
    }
}
