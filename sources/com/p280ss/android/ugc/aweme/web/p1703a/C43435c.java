package com.p280ss.android.ugc.aweme.web.p1703a;

import android.content.Context;
import com.bytedance.ies.dmt.p262ui.widget.util.C10832b;
import com.p280ss.android.sdk.webview.C20140h.C20141a;
import com.p280ss.android.sdk.webview.C20142i;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.web.a.c */
public final class C43435c {

    /* renamed from: c */
    private static volatile C43435c f112501c;

    /* renamed from: a */
    public Map<String, String> f112502a;

    /* renamed from: b */
    public Context f112503b;

    private C43435c() {
    }

    /* renamed from: b */
    private static void m137839b() {
        C20142i.m66380a().mo53905a((C20141a) new C43434b());
    }

    /* renamed from: a */
    public static C43435c m137838a() {
        if (f112501c == null) {
            synchronized (C10832b.class) {
                if (f112501c == null) {
                    f112501c = new C43435c();
                }
            }
        }
        return f112501c;
    }

    /* renamed from: a */
    public final void mo105372a(Context context, Map<String, String> map) {
        if (context != null) {
            this.f112503b = context.getApplicationContext();
        }
        this.f112502a = map;
        m137839b();
    }
}
