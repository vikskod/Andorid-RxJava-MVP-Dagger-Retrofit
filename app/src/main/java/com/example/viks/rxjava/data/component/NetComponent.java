package com.example.viks.rxjava.data.component;

import com.example.viks.rxjava.data.module.AppModule;
import com.example.viks.rxjava.data.module.NetModule;

import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by viks on 12/8/16.
 */

@Singleton
@Component(modules = {AppModule.class, NetModule.class})
public interface NetComponent {
    // downstream components need these exposed with the return type
    // method name does not really matter
    Retrofit retrofit();
}
