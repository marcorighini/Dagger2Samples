package com.marcorighini.dependentcomponent.main;

import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    MainDependency mainDependency();
}
