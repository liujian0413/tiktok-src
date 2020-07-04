package com.bytedance.ies.bullet.kit.web.p549c;

import android.content.Context;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.ies.p555c.C10702a;
import com.bytedance.ies.p555c.C10713b;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.bullet.kit.web.c.b */
public final class C10631b {

    /* renamed from: a */
    public static final C10632a f28483a = new C10632a(null);

    /* renamed from: d */
    private static final String f28484d = f28484d;

    /* renamed from: b */
    private final C10702a f28485b;

    /* renamed from: c */
    private C10633b f28486c;

    /* renamed from: com.bytedance.ies.bullet.kit.web.c.b$a */
    public static final class C10632a {
        private C10632a() {
        }

        public /* synthetic */ C10632a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.ies.bullet.kit.web.c.b$b */
    public interface C10633b {
        /* renamed from: a */
        WebResourceResponse mo25488a(String str);
    }

    /* renamed from: a */
    public final C10631b mo25484a(C10633b bVar) {
        C7573i.m23587b(bVar, "interceptor");
        this.f28486c = bVar;
        return this;
    }

    /* renamed from: a */
    public final C10631b mo25485a(C10713b bVar) {
        C7573i.m23587b(bVar, "offlineSourceCheck");
        this.f28485b.mo25585a(bVar);
        return this;
    }

    /* renamed from: a */
    public final C10631b mo25486a(List<Pattern> list) {
        C7573i.m23587b(list, "cachePrefix");
        this.f28485b.mo25586a(list);
        return this;
    }

    /* renamed from: a */
    public final C10631b mo25487a(boolean z) {
        this.f28485b.mo25587a(z);
        return this;
    }

    /* renamed from: a */
    public final synchronized WebResourceResponse mo25483a(WebView webView, String str) {
        C7573i.m23587b(str, "url");
        C10633b bVar = this.f28486c;
        if (bVar != null) {
            WebResourceResponse a = bVar.mo25488a(str);
            if (a != null) {
                return a;
            }
        }
        try {
            return this.f28485b.mo25584a(webView, str);
        } catch (Exception unused) {
            return null;
        }
    }

    public C10631b(Context context, String str, String str2, String str3) {
        C7573i.m23587b(str, C38347c.f99551f);
        C7573i.m23587b(str2, "deviceId");
        C7573i.m23587b(str3, "cacheDir");
        C10702a a = C10702a.m31260a(context, str, str2, str3);
        C7573i.m23582a((Object) a, "IESOfflineCache.create(\n…d,\n        cacheDir\n    )");
        this.f28485b = a;
    }
}
