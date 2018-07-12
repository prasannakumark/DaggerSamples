package com.techbots.androiddefaultcomponents.di.components;

import com.techbots.androiddefaultcomponents.MainActivity;
import com.techbots.androiddefaultcomponents.di.PerAcitivity;
import com.techbots.androiddefaultcomponents.di.modules.ActivityModule;

import dagger.Component;

/**
 * Created by prasanna on 12/7/18.
 */
@PerAcitivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {
    void inject(MainActivity mainActivity);
}
