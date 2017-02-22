package com.marcorighini.dependentcomponent.main;

import com.marcorighini.dependentcomponent.main.dependent.DaggerDependentComponent;
import com.marcorighini.dependentcomponent.main.dependent.DependentComponent;

public class Sample {
    public static void main(String[] args) {
        DependentComponent dp = DaggerDependentComponent.builder().mainComponent(DaggerMainComponent.create()).build();
        System.out.println(dp.toString());
    }
}
