package com.marcorighini.dagger2sample.main;

import dagger.Subcomponent;

@Subcomponent(modules = MainModule.class)
public interface MainComponent {
    void inject(MainActivity activity);
}
