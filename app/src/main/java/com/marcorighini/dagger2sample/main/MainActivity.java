package com.marcorighini.dagger2sample.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.marcorighini.dagger2sample.DaggerSampleApplication;
import com.marcorighini.dagger2sample.R;
import dagger.internal.DaggerCollections;
import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    @Inject MainPresenter presenter;

    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((DaggerSampleApplication)getApplicationContext()).getComponent().mainComponent(new MainModule(this)).inject(this);

        presenter.doSomething();
    }
}
