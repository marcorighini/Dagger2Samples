package com.marcorighini.subcomponentsbuilder;

import com.marcorighini.subcomponentsbuilder.dependent.DependentComponent;
import com.marcorighini.subcomponentsbuilder.dependent.SubcomponentBuilder;
import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module(subcomponents={ DependentComponent.class })
public abstract class MainBinders {
    // Provide the builder to be included in a mapping used for creating the builders.
    @Binds @IntoMap @SubcomponentKey(DependentComponent.Builder.class)
    public abstract SubcomponentBuilder dependentComponent(DependentComponent.Builder impl);
}

