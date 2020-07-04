package com.bytedance.ies.bullet.kit.p261rn.pkg.animation;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.animation.b */
public final class C10593b implements ReactPackage {
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        C7573i.m23587b(reactApplicationContext, "reactContext");
        return C7525m.m23461a();
    }

    public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        C7573i.m23587b(reactApplicationContext, "reactContext");
        return C7525m.m23457a(new AnimatedReactImageManager());
    }
}
