package com.p280ss.android.ugc.aweme.framework;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;

/* renamed from: com.ss.android.ugc.aweme.framework.e */
public final class C29959e {
    /* renamed from: a */
    public static void m98229a(String str, WritableMap writableMap) {
        for (C29943a aVar : ReactInstance.getHostMap().values()) {
            WritableMap createMap = Arguments.createMap();
            createMap.merge(writableMap);
            ReactContext currentReactContext = aVar.getReactInstanceManager().getCurrentReactContext();
            if (currentReactContext != null) {
                ((RCTDeviceEventEmitter) currentReactContext.getJSModule(RCTDeviceEventEmitter.class)).emit(str, createMap);
            }
        }
    }

    /* renamed from: a */
    public static void m98228a(ReactContext reactContext, String str, WritableMap writableMap) {
        if (reactContext != null) {
            ((RCTDeviceEventEmitter) reactContext.getJSModule(RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }
}
