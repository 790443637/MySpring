package com.ld.domain;

public class SomeBeanCon {

    private String name;
    private Long max;
    private OtherBean other;

    public SomeBeanCon(Long max, OtherBean other) {
        this("aaa",max,other);
    }

    public SomeBeanCon(String name, Long max, OtherBean other) {
        this.name = name;
        this.max = max;
        this.other = other;
    }

    @Override
    public String toString() {
        return "SomeBeanCon{" +
                "name='" + name + '\'' +
                ", max=" + max +
                ", other=" + other +
                '}';
    }
}
