package com.p280ss.android.ugc.aweme.net;

import android.os.Build.VERSION;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.HashSet;
import java.util.Set;
import okhttp3.Interceptor.Chain;
import okhttp3.Response;

/* renamed from: com.ss.android.ugc.aweme.net.a */
public final class C7177a {

    /* renamed from: a */
    private static final Set<String> f20103a;

    static {
        HashSet hashSet = new HashSet();
        f20103a = hashSet;
        hashSet.add("api.twitter.com");
        f20103a.add("twitter.com");
        f20103a.add("api-h2.tiktokv.com");
        f20103a.add("api.tiktokv.com");
        f20103a.add("api2-16-h2.musical.ly");
    }

    /* renamed from: a */
    public static void m22405a(Chain chain, Response response) {
        if (C7163a.m22363a() && VERSION.SDK_INT >= 21 && response.code != 101 && !"websocket".equals(response.header("Upgrade"))) {
            String header = response.header("Content-Type");
            if (header != null && !header.contains("video") && !header.contains("audio") && !header.contains("image") && !header.contains("application")) {
                if (!(response.request == null || response.request.url == null)) {
                    String str = response.request.url.host;
                    if (!TextUtils.isEmpty(str) && f20103a.contains(str)) {
                        return;
                    }
                }
                if (!(response.request == null || response.request.url == null)) {
                    String str2 = response.request.url.host;
                    if ((TextUtils.isEmpty(str2) || !f20103a.contains(str2)) && chain.request().url.url().getPath().contains("v1/play")) {
                    }
                }
            }
        }
    }
}
