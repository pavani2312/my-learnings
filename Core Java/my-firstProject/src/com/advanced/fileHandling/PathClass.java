package com.advanced.fileHandling;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClass {
    public static void main(String[] args) {
        Path path = Paths.get("src/com/advanced/fileHandling/JuliusCesar.txt").toAbsolutePath();

        System.out.println("toString: " + path.toString());
        System.out.println("getFileName: " + path.getFileName());
        System.out.println("getName(0): " + path.getName(0));
        System.out.println("getNameCount: " + path.getNameCount());
        System.out.println("subpath(0,2): " + path.subpath(0,2));
        System.out.println("getParent: " + path.getParent());
        System.out.println("getRoot: " + path.getRoot());

    }
    }

