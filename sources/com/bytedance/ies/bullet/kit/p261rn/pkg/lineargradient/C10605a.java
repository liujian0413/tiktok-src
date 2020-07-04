package com.bytedance.ies.bullet.kit.p261rn.pkg.lineargradient;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C7525m;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.lineargradient.a */
public final class C10605a implements ReactPackage {
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return new ArrayList<>();
    }

    public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return C7525m.m23466c(new LinearGradientManager());
    }
}
