package com.p280ss.android.ttve.editorInfo;

import com.p280ss.android.ttve.nativePort.TENativeLibsLoader;
import java.util.HashMap;

/* renamed from: com.ss.android.ttve.editorInfo.TEEditorInfoInvoker */
public class TEEditorInfoInvoker {
    static {
        TENativeLibsLoader.m67986c();
    }

    public static native void nativeInit();

    public static void onNativeCallback_onEditorInfoFloat(String str, float f) {
        C20455a.m67870a(str, f);
    }

    public static void onNativeCallback_onEditorInfoInt(String str, long j) {
        C20455a.m67871a(str, j);
    }

    public static void onNativeCallback_onEditorInfoJson(String str, String str2) {
        C20455a.m67872a(str, str2);
    }

    public static void onNativeCallback_onEditorInfoMap(String str, HashMap hashMap) {
        C20455a.m67873a(str, hashMap);
    }
}
