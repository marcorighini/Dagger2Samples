package com.marcorighini.subcomponents;

import com.marcorighini.subcomponents.dependent.DependentComponent;

public class Sample {
    public static void main(String[] args) {
        DependentComponent dp = DaggerMainComponent.create().dependentComponent();
        System.out.println(dp.toString());
    }
}
