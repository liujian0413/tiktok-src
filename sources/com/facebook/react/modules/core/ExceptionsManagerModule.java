package com.facebook.react.modules.core;

import com.facebook.common.p686c.C13286a;
import com.facebook.react.bridge.BaseJavaModule;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.util.JSStackTrace;
import com.facebook.react.util.RNVersionUtils;
import org.json.JSONObject;

@ReactModule(name = "ExceptionsManager")
public class ExceptionsManagerModule extends BaseJavaModule {
    private final DevSupportManager mDevSupportManager;

    public String getName() {
        return "ExceptionsManager";
    }

    @ReactMethod
    public void dismissRedbox() {
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            this.mDevSupportManager.hideRedboxDialog();
        }
    }

    public ExceptionsManagerModule(DevSupportManager devSupportManager) {
        this.mDevSupportManager = devSupportManager;
    }

    @ReactMethod
    public void reportFatalException(String str, ReadableArray readableArray, int i) {
        showOrThrowError(str, readableArray, i);
    }

    @ReactMethod
    public void updateExceptionMessage(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            this.mDevSupportManager.updateJSError(str, readableArray, i);
        }
    }

    @ReactMethod
    public void reportSoftException(String str, ReadableArray readableArray, int i) {
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            this.mDevSupportManager.showNewJSError(str, readableArray, i);
        } else {
            C13286a.m38863d("ReactNative", JSStackTrace.format(str, readableArray));
        }
    }

    private void showOrThrowError(String str, ReadableArray readableArray, int i) {
        StackFrame[] convertJsStackTrace = StackTraceHelper.convertJsStackTrace(readableArray);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("Version", RNVersionUtils.getVersion());
            jSONObject.put("JSErrorTitle", str);
            jSONObject.put("JSErrorStack", StackTraceHelper.formatStackTrace(convertJsStackTrace, false));
        } catch (Exception unused) {
        }
        ReactBridge.uploadJSException(jSONObject);
        if (this.mDevSupportManager.getDevSupportEnabled()) {
            this.mDevSupportManager.showNewJSError(str, readableArray, i);
        }
    }
}
