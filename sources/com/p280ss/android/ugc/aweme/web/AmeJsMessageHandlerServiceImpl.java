package com.p280ss.android.ugc.aweme.web;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.sdk.webview.DMTJsBridge;
import com.p280ss.android.ugc.aweme.net.C34090k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.web.AmeJsMessageHandlerServiceImpl */
public class AmeJsMessageHandlerServiceImpl implements IAmeJsMessageHandlerService {
    private List<String> safeHostList = new ArrayList<String>() {
        {
            add("iesdouyin.com");
            add("douyincdn.com");
            add("douyinact.com");
            add("douyin.com");
            add("tiktok.com");
            add("tiktokv.com");
            add("musical.ly");
        }
    };

    public List<String> getSafeHosts() {
        return this.safeHostList;
    }

    public void registerJavaMethod(DMTJsBridge dMTJsBridge, WeakReference<Context> weakReference, Activity activity) {
    }

    public boolean isSafeDomain(String str) {
        if (C34090k.m109754a(str, "tiktokv.com") || C34090k.m109754a(str, "tiktok.com") || C34090k.m109754a(str, "amemv.com") || C34090k.m109754a(str, "snssdk.com") || C34090k.m109754a(str, "toutiao.com") || C34090k.m109754a(str, "neihanshequ.com") || C34090k.m109754a(str, "youdianyisi.com") || C34090k.m109754a(str, "admin.bytedance.com") || C34090k.m109754a(str, "musical.ly")) {
            return true;
        }
        return false;
    }
}
