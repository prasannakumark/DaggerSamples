package com.techbots.androiddefaultcomponents.di.modules;

import android.app.Activity;
import android.content.Context;

import com.techbots.androiddefaultcomponents.di.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by prasanna on 12/7/18.
 */
@Module
public class ActivityModule {

    private final Activity mActivity;

    public ActivityModule(Activity activity) {
        this.mActivity = activity;
    }

    @Provides
    @ActivityContext
    Context provideContext() {
        return mActivity;
    }

    @Provides
    Activity provideActivity() {
        return mActivity;
    }
}
