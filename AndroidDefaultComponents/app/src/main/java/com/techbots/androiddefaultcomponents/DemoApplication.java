package com.techbots.androiddefaultcomponents;

import android.app.Application;
import android.content.Context;

import com.techbots.androiddefaultcomponents.data.DataManager;
import com.techbots.androiddefaultcomponents.di.components.ApplicationComponent;
import com.techbots.androiddefaultcomponents.di.components.DaggerApplicationComponent;
import com.techbots.androiddefaultcomponents.di.modules.ApplicationModule;

import javax.inject.Inject;

public class DemoApplication extends Application {

    private ApplicationComponent mApplicationComponent;

    @Inject
    DataManager mDataManager;

    public static DemoApplication get(Context context) {
        return (DemoApplication) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();

        mApplicationComponent = DaggerApplicationComponent.builder().
                applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return mApplicationComponent;
    }

}
