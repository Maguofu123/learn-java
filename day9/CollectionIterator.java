package com.colloection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionIterator {
    public static void main(String[] args) {
        Collection arrayList = new ArrayList();

        //存入对象
        arrayList.add(new Book("A", "B", 10));
        arrayList.add(new Book("C", "D", 5));
        arrayList.add(new Book("E", "F", 7));

        System.out.println(arrayList);

        //遍历col集合
        //先得到迭代器
        Iterator iterator = arrayList.iterator();
        //while循环遍历
        while (iterator.hasNext()){//判断是否还有数据
            Object obj = iterator.next();
            System.out.println(obj);

        }

        }
    }

class Book{
    private String name;
    private String author;
    private double price;

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}