package com.marcorighini.subcomponents.dependent;

import com.marcorighini.subcomponents.MainDependency;
import dagger.Subcomponent;

@DependentScope
@Subcomponent
public interface DependentComponent {
    Dependent dependent();
    MainDependency mainDependency();
}
