package com.collections.map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class TreeMapFunctions {
    public static void main(String[] args) {
        TreeMap<String, Double> productPricesTreeMap = new TreeMap<>();
        productPricesTreeMap.put("Chocolate bar", 1.5);
        productPricesTreeMap.put("Pasta", 1.1);
        productPricesTreeMap.put("Cereals", 1.7);
        productPricesTreeMap.put("Apple", 0.15);
        productPricesTreeMap.put("Orange", 0.25);
        productPricesTreeMap.put("TeaBox", 3.2);

        System.out.println("TreeMap:");
        for (String product : productPricesTreeMap.keySet()) {
            System.out.println(product + " $ " + productPricesTreeMap.get(product));
        }
        System.out.println();
        System.out.println("The First Element in the map: " +productPricesTreeMap.firstKey());
        System.out.println("The Last Element in the map: " +productPricesTreeMap.lastKey());

        System.out.println();
        //descendingMap()
        /*System.out.println("Descending TreeMap:");
        for (String product : productPricesTreeMap.descendingKeySet()) {
            System.out.println(product + " $ " + productPricesTreeMap.get(product));
        }*/
        System.out.println("Descending TreeMap: ");
        NavigableMap<String, Double> productPricesNavigableMap = productPricesTreeMap.descendingMap();
        for (String product : productPricesNavigableMap.keySet()) {
            System.out.println(product + " $ " + productPricesNavigableMap.get(product));
        }

        System.out.println();
        System.out.println("The Lower Value: " +productPricesTreeMap.lowerKey("Pasta"));
        System.out.println("The Floor Value: " +productPricesTreeMap.floorKey("Pasta"));
        System.out.println("The Higher Value: " +productPricesTreeMap.higherKey("Pasta"));
        System.out.println("The Ceiling Value: " +productPricesTreeMap.ceilingKey("Pasta"));

        System.out.println();
        System.out.println("Poll first entry: " + productPricesTreeMap.pollFirstEntry());
        System.out.println("The first entry: " + productPricesTreeMap.firstEntry());
        System.out.println("The last entry: " + productPricesTreeMap.lastEntry());

        System.out.println();
        System.out.println("Lower entry: " + productPricesTreeMap.lowerEntry("Pasta"));
        System.out.println("Floor entry: " + productPricesTreeMap.floorEntry("Pasta"));
        System.out.println("Higher entry: " + productPricesTreeMap.higherEntry("Pasta"));
        System.out.println("Ceiling entry: " + productPricesTreeMap.ceilingEntry("Pasta"));
        System.out.println();
        System.out.println("Tail map: " + productPricesTreeMap.tailMap("Orange", true));
        System.out.println("Head map: " + productPricesTreeMap.headMap("Orange", true));
        System.out.println("Sub map: " + productPricesTreeMap.subMap("Orange",false, "TeaBox", false));

    }
}
