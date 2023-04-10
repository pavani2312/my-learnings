package com.collections;

import java.util.ArrayList;

public class ArraysAndCollections {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 10.5, 5674);
        //Employee employee = new Employee("Rajesh", )

        ArrayList arrayList = new ArrayList();
        arrayList.add(1);
        arrayList.add("Hello");
        arrayList.add(12.98);
        arrayList.add('A');
        arrayList.add(car);
        System.out.println(arrayList);
    }
}
