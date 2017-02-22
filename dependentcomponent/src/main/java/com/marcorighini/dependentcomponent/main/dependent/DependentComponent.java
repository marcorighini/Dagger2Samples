package com.marcorighini.dependentcomponent.main.dependent;

import com.marcorighini.dependentcomponent.main.MainComponent;
import com.marcorighini.dependentcomponent.main.MainDependency;
import dagger.Component;

@DependentScope
@Component(dependencies = MainComponent.class)
public interface DependentComponent {
    Dependent dependent();
    MainDependency mainDependency();
}
