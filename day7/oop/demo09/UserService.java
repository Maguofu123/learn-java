package com.oop.demo09;


//锻炼抽象思维
//关键字interface
public interface UserService {

    //常量 不常用
    int AGE = 99;

    void add(String name);
    void delete(String name);
    void update(String name);
    void query(String name);
}
