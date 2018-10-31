package com.sjp.service;


public class ServiceA implements PaService {
    @Override
    public void add() {
        System.out.println("A添加成功");
    }

    @Override
    public void delete() {
        System.out.println("A删除成功");
    }

    @Override
    public void alter() {
        System.out.println("A修改成功");
    }

    @Override
    public void select() {
        System.out.println("A查找成功");
    }
}
