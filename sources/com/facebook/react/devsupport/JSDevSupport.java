package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.devsupport.JSCHeapCapture.CaptureException;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "JSDevSupport", needsEagerInit = true)
public class JSDevSupport extends ReactContextBaseJavaModule {
    private volatile DevSupportCallback mCurrentCallback;

    public interface DevSupportCallback {
        void onFailure(Exception exc);

        void onSuccess(String str);
    }

    public interface JSDevSupportModule extends JavaScriptModule {
        void getJSHierarchy(String str);
    }

    public String getName() {
        return "JSDevSupport";
    }

    public JSDevSupport(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public synchronized void setResult(String str, String str2) {
        if (this.mCurrentCallback != null) {
            if (str2 == null) {
                this.mCurrentCallback.onSuccess(str);
            } else {
                this.mCurrentCallback.onFailure(new RuntimeException(str2));
            }
        }
        this.mCurrentCallback = null;
    }

    public synchronized void getJSHierarchy(String str, DevSupportCallback devSupportCallback) {
        if (this.mCurrentCallback != null) {
            devSupportCallback.onFailure(new RuntimeException("JS Hierarchy download already in progress."));
            return;
        }
        JSDevSupportModule jSDevSupportModule = (JSDevSupportModule) getReactApplicationContext().getJSModule(JSDevSupportModule.class);
        if (jSDevSupportModule == null) {
            devSupportCallback.onFailure(new CaptureException("JSDevSupport module not registered."));
            return;
        }
        this.mCurrentCallback = devSupportCallback;
        jSDevSupportModule.getJSHierarchy(str);
    }
}
