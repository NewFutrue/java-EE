package com.sjp.service;


public class ServiceB implements PaService {
    @Override
    public void add() {
        System.out.println("B添加成功");
    }

    @Override
    public void delete() {
        System.out.println("B删除成功");
    }

    @Override
    public void alter() {
        System.out.println("B修改成功");
    }

    @Override
    public void select() {
        System.out.println("B查找成功");
    }
}
