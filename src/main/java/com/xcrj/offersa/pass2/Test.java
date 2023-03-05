package com.xcrj.offersa.pass2;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;
public class Test {
    public static void main(String[] args) {
        int[] ints=new int[]{1,2,3};
        String r=Arrays.stream(ints).boxed().map(Object::toString).collect(Collectors.joining("."));
        System.out.println(r);
    }
}
