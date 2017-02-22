package com.marcorighini.subcomponentsbuilder.dependent;

import com.marcorighini.subcomponentsbuilder.MainDependency;
import dagger.Subcomponent;

@DependentScope
@Subcomponent
public interface DependentComponent {
    Dependent dependent();
    MainDependency mainDependency();

    @Subcomponent.Builder
    interface Builder extends SubcomponentBuilder<DependentComponent> {
    }
}

