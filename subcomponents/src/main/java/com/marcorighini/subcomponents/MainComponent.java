package com.marcorighini.subcomponents;

import com.marcorighini.subcomponents.dependent.DependentComponent;
import dagger.Component;
import javax.inject.Singleton;

@Singleton
@Component(modules = MainModule.class)
public interface MainComponent {
    MainDependency mainDependency();
    DependentComponent dependentComponent();
}
