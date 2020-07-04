package com.p280ss.android.ugc.aweme.web;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.sdk.webview.DMTJsBridge;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.web.IAmeJsMessageHandlerService */
public interface IAmeJsMessageHandlerService {
    List<String> getSafeHosts();

    boolean isSafeDomain(String str);

    void registerJavaMethod(DMTJsBridge dMTJsBridge, WeakReference<Context> weakReference, Activity activity);
}
