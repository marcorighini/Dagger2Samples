package com.marcorighini.dagger2sample;

import android.app.Application;
import android.support.annotation.VisibleForTesting;

public class DaggerSampleApplication extends Application {

    private ApplicationComponent component;

    @Override public void onCreate() {
        super.onCreate();

        if(component == null){
            component = DaggerApplicationComponent.create();
        }
    }

    public ApplicationComponent getComponent() {
        return component;
    }

    @VisibleForTesting public void setComponent(ApplicationComponent component){
        this.component = component;
    }



}
