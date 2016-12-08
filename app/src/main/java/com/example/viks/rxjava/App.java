package com.example.viks.rxjava;

import android.app.Application;

import com.example.viks.rxjava.data.component.DaggerNetComponent;
import com.example.viks.rxjava.data.component.NetComponent;
import com.example.viks.rxjava.data.module.AppModule;
import com.example.viks.rxjava.data.module.NetModule;

/**
 * Created by viks on 12/8/16.
 */

public class App extends Application {

    private NetComponent mNetComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mNetComponent = DaggerNetComponent.builder()
                .appModule(new AppModule(this))
                .netModule(new NetModule("http://jsonplaceholder.typicode.com/"))
                .build();
    }

    public NetComponent getNetComponent() {
        return mNetComponent;
    }
}
