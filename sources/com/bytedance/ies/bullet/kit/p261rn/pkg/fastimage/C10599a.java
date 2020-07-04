package com.bytedance.ies.bullet.kit.p261rn.pkg.fastimage;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.rn.pkg.fastimage.a */
public final class C10599a implements ReactPackage {
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        C7573i.m23587b(reactApplicationContext, "reactContext");
        return C7525m.m23457a(new FastImageViewModule(reactApplicationContext));
    }

    public final List<ViewManager<?, ?>> createViewManagers(ReactApplicationContext reactApplicationContext) {
        C7573i.m23587b(reactApplicationContext, "reactContext");
        return C7525m.m23457a(new TTReactImageManager());
    }
}
