package com.techbots.androiddefaultcomponents.di.components;

import android.app.Application;
import android.content.Context;

import com.techbots.androiddefaultcomponents.DemoApplication;
import com.techbots.androiddefaultcomponents.data.DataManager;
import com.techbots.androiddefaultcomponents.data.DbHelper;
import com.techbots.androiddefaultcomponents.data.SharedPrefsHelper;
import com.techbots.androiddefaultcomponents.di.ApplicationContext;
import com.techbots.androiddefaultcomponents.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by prasanna on 12/7/18.
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject(DemoApplication demoApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

    DataManager getDataManager();

    SharedPrefsHelper getPreferenceHelper();

    DbHelper getDbHelper();

}
