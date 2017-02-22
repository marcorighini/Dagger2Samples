package com.marcorighini.subcomponentsbuilder;

import com.marcorighini.subcomponentsbuilder.dependent.DependentComponent;

public class Sample {
    public static void main(String[] args) {
        DependentComponent dp =  ((DependentComponent.Builder) DaggerMainComponent.create().subcomponentBuilders().get(DependentComponent.Builder.class).get()).build();
        System.out.println(dp.toString());
    }
}
