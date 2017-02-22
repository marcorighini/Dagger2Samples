package com.marcorighini.dagger2sample.main;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    private final MainActivity activity;

    public MainModule(MainActivity activity){
        this.activity = activity;
    }

    @Provides MainActivity provideMainActivity(){
        return activity;
    }

    @Provides MainPresenter provideMainPresenter(MainActivity mainActivity){
        return new MainPresenter(mainActivity);
    }
}
