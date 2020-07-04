package com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge;

import android.content.Context;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.sdk.webview.DMTJsBridge;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.OnLoadMoreRequestMethod;
import com.p280ss.android.ugc.aweme.discover.p1185ui.search.jsbridge.detail.OpenDetailVideoListMethod;
import com.p280ss.android.ugc.aweme.framework.bridge.C29954b;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.search.jsbridge.c */
public final class C27076c {

    /* renamed from: a */
    public static final C27076c f71433a = new C27076c();

    /* renamed from: b */
    private static final String f71434b = f71434b;

    /* renamed from: c */
    private static final String f71435c = f71435c;

    /* renamed from: d */
    private static final String f71436d = f71436d;

    /* renamed from: e */
    private static final String f71437e = f71437e;

    /* renamed from: f */
    private static final String f71438f = "searchKeywordChange";

    /* renamed from: g */
    private static final String f71439g = "searchKeywordChange";

    /* renamed from: h */
    private static final String f71440h = f71440h;

    /* renamed from: i */
    private static final String f71441i = f71441i;

    /* renamed from: j */
    private static final String f71442j = f71442j;

    /* renamed from: k */
    private static final String f71443k = f71443k;

    private C27076c() {
    }

    /* renamed from: a */
    public static String m88869a() {
        return f71435c;
    }

    /* renamed from: b */
    public static String m88872b() {
        return f71437e;
    }

    /* renamed from: c */
    public static String m88873c() {
        return f71439g;
    }

    /* renamed from: a */
    public static void m88870a(DMTJsBridge dMTJsBridge, WeakReference<Context> weakReference) {
        C7573i.m23587b(dMTJsBridge, "dmtJsBridge");
        C7573i.m23587b(weakReference, "contextRef");
        C11087a aVar = dMTJsBridge.f54455b;
        if (aVar != null) {
            dMTJsBridge.mo53855a(f71434b, (C11093e) new OpenDetailVideoListMethod(weakReference, aVar));
            dMTJsBridge.mo53855a(f71436d, (C11093e) new OnLoadMoreRequestMethod(aVar));
            dMTJsBridge.mo53855a(f71438f, (C11093e) new SearchKeywordChangeMethod(aVar));
            dMTJsBridge.mo53855a(f71440h, (C11093e) new ShowEasterEggMethod(weakReference, aVar));
            dMTJsBridge.mo53855a(f71441i, (C11093e) new PerformanceMonitorMethod(weakReference, aVar));
            dMTJsBridge.mo53855a(f71442j, (C11093e) new SuicidePreventMethod(weakReference, aVar));
            dMTJsBridge.mo53855a(f71443k, (C11093e) new DisableInterceptMethod(weakReference, aVar));
        }
    }

    /* renamed from: a */
    public static void m88871a(C29954b bVar, Context context) {
        C7573i.m23587b(bVar, "processor");
        C7573i.m23587b(context, "context");
        bVar.mo76115a(f71434b, new OpenDetailVideoListMethod(new WeakReference(context)));
        bVar.mo76115a(f71436d, new OnLoadMoreRequestMethod());
        bVar.mo76115a(f71438f, new SearchKeywordChangeMethod());
        bVar.mo76115a(f71440h, new ShowEasterEggMethod(new WeakReference(context)));
        bVar.mo76115a(f71441i, new PerformanceMonitorMethod(new WeakReference(context)));
        bVar.mo76115a(f71442j, new SuicidePreventMethod(new WeakReference(context)));
        bVar.mo76115a(f71443k, new DisableInterceptMethod(new WeakReference(context)));
    }
}
