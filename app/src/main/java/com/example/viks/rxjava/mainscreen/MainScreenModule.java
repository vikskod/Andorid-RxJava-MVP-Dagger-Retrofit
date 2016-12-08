package com.example.viks.rxjava.mainscreen;

import com.example.viks.rxjava.util.CustomScope;

import dagger.Module;
import dagger.Provides;

/**
 * Created by viks on 12/8/16.
 */

@Module
public class MainScreenModule {
    private final MainScreenContract.View mView;


    public MainScreenModule(MainScreenContract.View mView) {
        this.mView = mView;
    }

    @Provides
    @CustomScope
    MainScreenContract.View providesMainScreenContractView() {
        return mView;
    }
}
