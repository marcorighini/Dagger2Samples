package com.marcorighini.dagger2sample;

import com.marcorighini.dagger2sample.main.MainComponent;
import com.marcorighini.dagger2sample.main.MainModule;
import dagger.Component;

@Component
public interface ApplicationComponent {
    MainComponent mainComponent(MainModule module);
}
