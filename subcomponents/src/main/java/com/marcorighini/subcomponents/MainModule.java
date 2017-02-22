package com.marcorighini.subcomponents;

import dagger.Module;
import dagger.Provides;
import javax.inject.Singleton;

@Module
public class MainModule {
    @Provides @Singleton MainDependency providesMainDependency(){
        return new MainDependency();
    }
}
