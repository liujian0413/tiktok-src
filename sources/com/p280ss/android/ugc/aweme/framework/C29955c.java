package com.p280ss.android.ugc.aweme.framework;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.p280ss.android.ugc.aweme.framework.bridge.RNBridgeModule;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.framework.c */
public final class C29955c implements ReactPackage {
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        return Collections.emptyList();
    }

    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new RNBridgeModule(reactApplicationContext));
        List a = ReactInstance.getConfig().mo67290a(reactApplicationContext);
        if (a != null) {
            arrayList.addAll(a);
        }
        return arrayList;
    }
}
