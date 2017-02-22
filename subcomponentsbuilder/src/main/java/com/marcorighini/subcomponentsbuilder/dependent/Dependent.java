package com.marcorighini.subcomponentsbuilder.dependent;

import com.marcorighini.subcomponentsbuilder.MainDependency;
import javax.inject.Inject;

public class Dependent {
    @Inject
    public Dependent(MainDependency dep){}
}
