package com.marcorighini.dagger2sample.main;

public class MainPresenter {

    private final MainActivity view;

    MainPresenter(MainActivity view) {
        this.view = view;
    }

    void doSomething(){
        System.out.println(view.toString());
    }
}
