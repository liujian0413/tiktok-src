package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.webkit.WebResourceRequest;
import java.util.Collections;
import java.util.Map;

@C6505uv
public final class aoj {

    /* renamed from: a */
    public final String f40867a;

    /* renamed from: b */
    public final Uri f40868b;

    /* renamed from: c */
    public final Map<String, String> f40869c;

    /* renamed from: d */
    private final String f40870d;

    public aoj(WebResourceRequest webResourceRequest) {
        this(webResourceRequest.getUrl().toString(), webResourceRequest.getUrl(), webResourceRequest.getMethod(), webResourceRequest.getRequestHeaders());
    }

    public aoj(String str) {
        this(str, Uri.parse(str), null, null);
    }

    private aoj(String str, Uri uri, String str2, Map<String, String> map) {
        this.f40867a = str;
        this.f40868b = uri;
        if (str2 == null) {
            str2 = "GET";
        }
        this.f40870d = str2;
        if (map == null) {
            map = Collections.emptyMap();
        }
        this.f40869c = map;
    }
}
