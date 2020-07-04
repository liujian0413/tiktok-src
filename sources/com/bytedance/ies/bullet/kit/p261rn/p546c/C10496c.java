package com.bytedance.ies.bullet.kit.p261rn.p546c;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule.RCTDeviceEventEmitter;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.rn.c.c */
public final class C10496c {

    /* renamed from: a */
    public static final C10496c f28232a = new C10496c();

    private C10496c() {
    }

    /* renamed from: a */
    public static void m30891a(ReactContext reactContext, String str, WritableMap writableMap) {
        C7573i.m23587b(str, "eventName");
        if (reactContext != null) {
            RCTDeviceEventEmitter rCTDeviceEventEmitter = (RCTDeviceEventEmitter) reactContext.getJSModule(RCTDeviceEventEmitter.class);
            if (rCTDeviceEventEmitter != null) {
                rCTDeviceEventEmitter.emit(str, writableMap);
            }
        }
    }
}
