package com.p280ss.android.sdk.webview;

import android.webkit.WebResourceResponse;
import com.p280ss.android.sdk.webview.C20140h.C20141a;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.ss.android.sdk.webview.i */
public class C20142i implements C20141a {

    /* renamed from: a */
    private static volatile C20142i f54517a;

    /* renamed from: b */
    private Set<C20141a> f54518b = new LinkedHashSet();

    private C20142i() {
    }

    /* renamed from: a */
    public static C20142i m66380a() {
        if (f54517a == null) {
            synchronized (C20142i.class) {
                if (f54517a == null) {
                    f54517a = new C20142i();
                }
            }
        }
        return f54517a;
    }

    /* renamed from: a */
    public final void mo53905a(C20141a aVar) {
        synchronized (this) {
            this.f54518b.add(aVar);
        }
    }

    /* renamed from: a */
    public final WebResourceResponse mo53904a(String str) {
        HashSet<C20141a> hashSet = new HashSet<>();
        synchronized (this) {
            hashSet.addAll(this.f54518b);
        }
        WebResourceResponse webResourceResponse = null;
        if (hashSet.isEmpty()) {
            return null;
        }
        for (C20141a a : hashSet) {
            webResourceResponse = a.mo53904a(str);
            if (webResourceResponse != null) {
                break;
            }
        }
        return webResourceResponse;
    }
}
