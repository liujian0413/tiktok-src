package com.p280ss.android.ugc.aweme.fastimage;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.fastimage.a */
public final class C21727a implements ReactPackage {

    /* renamed from: a */
    private String f58174a;

    public C21727a(String str) {
        this.f58174a = str;
    }

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new FastImageViewModule(reactApplicationContext));
    }

    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.singletonList(new TTReactImageManager());
    }
}
