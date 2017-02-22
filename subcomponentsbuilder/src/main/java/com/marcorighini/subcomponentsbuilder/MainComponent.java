package com.marcorighini.subcomponentsbuilder;

import com.marcorighini.subcomponentsbuilder.dependent.SubcomponentBuilder;
import dagger.Component;
import java.util.Map;
import javax.inject.Provider;
import javax.inject.Singleton;

@Singleton
@Component(modules = { MainModule.class, MainBinders.class })
public interface MainComponent {
    Map<Class<?>, Provider<SubcomponentBuilder>> subcomponentBuilders();
    MainDependency mainDependency();
}
