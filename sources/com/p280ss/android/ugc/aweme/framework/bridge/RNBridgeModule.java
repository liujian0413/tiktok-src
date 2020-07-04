package com.p280ss.android.ugc.aweme.framework.bridge;

import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "aweme-bridge")
/* renamed from: com.ss.android.ugc.aweme.framework.bridge.RNBridgeModule */
public class RNBridgeModule extends ReactContextBaseJavaModule {
    public String getName() {
        return "aweme-bridge";
    }

    public RNBridgeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void call(final String str, final ReadableMap readableMap, final Callback callback) {
        if (!TextUtils.isEmpty(str)) {
            UiThreadUtil.runOnUiThread(new Runnable() {
                public final void run() {
                    C29954b.m98216a(RNBridgeModule.this.getReactApplicationContext()).mo76116a(str, readableMap, callback);
                }
            });
        }
    }
}
