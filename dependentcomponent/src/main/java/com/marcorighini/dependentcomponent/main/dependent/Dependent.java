package com.marcorighini.dependentcomponent.main.dependent;

import com.marcorighini.dependentcomponent.main.MainDependency;
import javax.inject.Inject;

public class Dependent {
    @Inject
    public Dependent(MainDependency dep){}
}
