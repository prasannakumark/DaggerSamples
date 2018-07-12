package com.techbots.androiddefaultcomponents.di.modules;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import com.techbots.androiddefaultcomponents.di.ApplicationContext;
import com.techbots.androiddefaultcomponents.di.DataBaseInformation;

import dagger.Module;
import dagger.Provides;

/**
 * Created by prasanna on 12/7/18.
 */
@Module
public class ApplicationModule {

    private final Application mApplication;

    public ApplicationModule(Application application) {
        this.mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext() {
        return mApplication;
    }

    @Provides
    @ApplicationContext
    Application provideApplication() {
        return mApplication;
    }

    @Provides
    @DataBaseInformation
    String provideDataName() {
        return "student_database.db";
    }

    @Provides
    @DataBaseInformation
    Integer provideDataVersion() {
        return 2;
    }

    @Provides
    SharedPreferences provideSharedPreferences() {
        return mApplication.getSharedPreferences("preferance_name", Context.MODE_PRIVATE);
    }
}
