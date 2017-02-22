package com.marcorighini.subcomponents.dependent;

import com.marcorighini.subcomponents.MainDependency;
import javax.inject.Inject;

public class Dependent {
    @Inject
    public Dependent(MainDependency dep){}
}
