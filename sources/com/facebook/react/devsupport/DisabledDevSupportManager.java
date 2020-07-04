package com.facebook.react.devsupport;

import com.facebook.react.bridge.DefaultNativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactBridge;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.devsupport.interfaces.DevOptionHandler;
import com.facebook.react.devsupport.interfaces.DevSupportManager;
import com.facebook.react.devsupport.interfaces.ErrorCustomizer;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.devsupport.interfaces.StackFrame;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.util.RNVersionUtils;
import java.io.File;
import org.json.JSONObject;

public class DisabledDevSupportManager implements DevSupportManager {
    private final DefaultNativeModuleCallExceptionHandler mDefaultNativeModuleCallExceptionHandler = new DefaultNativeModuleCallExceptionHandler();

    public void addCustomDevOption(String str, DevOptionHandler devOptionHandler) {
    }

    public void deleteJSBundleFile() {
    }

    public File downloadBundleResourceFromUrlSync(String str, File file) {
        return null;
    }

    public DeveloperSettings getDevSettings() {
        return null;
    }

    public boolean getDevSupportEnabled() {
        return false;
    }

    public String getDownloadedJSBundleFile() {
        return null;
    }

    public String getJSBundleURLForRemoteDebugging() {
        return null;
    }

    public StackFrame[] getLastErrorStack() {
        return null;
    }

    public String getLastErrorTitle() {
        return null;
    }

    public String getSourceMapUrl() {
        return null;
    }

    public String getSourceUrl() {
        return null;
    }

    public void handleReloadJS() {
    }

    public boolean hasUpToDateJSBundleInCache() {
        return false;
    }

    public void hideRedboxDialog() {
    }

    public void isPackagerRunning(PackagerStatusCallback packagerStatusCallback) {
    }

    public void onNewReactContextCreated(ReactContext reactContext) {
    }

    public void onReactInstanceDestroyed(ReactContext reactContext) {
    }

    public void registerErrorCustomizer(ErrorCustomizer errorCustomizer) {
    }

    public void reloadJSFromServer(String str) {
    }

    public void reloadSettings() {
    }

    public void setDevSupportEnabled(boolean z) {
    }

    public void showDevOptionsDialog() {
    }

    public void showNewJSError(String str, ReadableArray readableArray, int i) {
    }

    public void showNewJavaError(String str, Throwable th) {
    }

    public void startInspector() {
    }

    public void stopInspector() {
    }

    public void updateJSError(String str, ReadableArray readableArray, int i) {
    }

    public void handleException(Exception exc) {
        if (!(exc instanceof JSException)) {
            StringBuilder sb = new StringBuilder(exc.getMessage());
            for (Throwable cause = exc.getCause(); cause != null; cause = cause.getCause()) {
                sb.append("\n\n");
                sb.append(cause.getMessage());
            }
            String sb2 = sb.toString();
            StackFrame[] convertJavaStackTrace = StackTraceHelper.convertJavaStackTrace(exc);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("Version", RNVersionUtils.getVersion());
                jSONObject.put("NativeErrorTitle", sb2);
                jSONObject.put("NativeErrorStack", StackTraceHelper.formatStackTrace(convertJavaStackTrace, false));
            } catch (Exception unused) {
            }
            ReactBridge.uploadJSException(jSONObject);
        }
        this.mDefaultNativeModuleCallExceptionHandler.handleException(exc);
    }
}
