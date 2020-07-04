package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48008s;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.f */
public final class C30380f {

    /* renamed from: a */
    public static final C30380f f79869a = new C30380f();

    /* renamed from: b */
    private static final C30420z<C30391k> f79870b = new C30420z<>(C7575l.m23595a(C30391k.class), C30381a.f79871a);

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.f$a */
    static final class C30381a extends Lambda implements C48008s<Uri, C30379e, String, String, JSONObject, C30382g> {

        /* renamed from: a */
        public static final C30381a f79871a = new C30381a();

        C30381a() {
            super(5);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return m99268a((Uri) obj, (C30379e) obj2, (String) obj3, (String) obj4, (JSONObject) obj5);
        }

        /* renamed from: a */
        private static C30382g m99268a(Uri uri, C30379e eVar, String str, String str2, JSONObject jSONObject) {
            boolean z;
            Uri uri2;
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(eVar, "providerFactory");
            C7573i.m23587b(str, "chromeVersion");
            if (C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTP) || C7573i.m23585a((Object) uri.getScheme(), (Object) WebKitApi.SCHEME_HTTPS)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                uri2 = uri;
            } else {
                uri2 = null;
            }
            if (uri2 == null) {
                return null;
            }
            C30382g gVar = new C30382g(uri, eVar, str, str2, jSONObject);
            return gVar;
        }
    }

    private C30380f() {
    }

    /* renamed from: a */
    public static C30420z<C30391k> m99267a() {
        return f79870b;
    }
}
