package com.example.viks.rxjava.mainscreen;

import com.example.viks.rxjava.data.component.NetComponent;
import com.example.viks.rxjava.util.CustomScope;

import dagger.Component;

/**
 * Created by viks on 12/8/16.
 */

@CustomScope
@Component(dependencies = NetComponent.class, modules = MainScreenModule.class)
public interface MainScreenComponent {
    void inject(MainActivity activity);
}