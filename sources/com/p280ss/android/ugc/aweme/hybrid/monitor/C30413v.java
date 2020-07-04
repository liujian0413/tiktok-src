package com.p280ss.android.ugc.aweme.hybrid.monitor;

import android.net.Uri;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C48008s;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.v */
public final class C30413v {

    /* renamed from: a */
    public static final C30413v f79922a = new C30413v();

    /* renamed from: b */
    private static final C30420z<C30395o> f79923b = new C30420z<>(C7575l.m23595a(C30395o.class), C30414a.f79924a);

    /* renamed from: com.ss.android.ugc.aweme.hybrid.monitor.v$a */
    static final class C30414a extends Lambda implements C48008s<Uri, C30379e, String, String, JSONObject, C30415w> {

        /* renamed from: a */
        public static final C30414a f79924a = new C30414a();

        C30414a() {
            super(5);
        }

        public final /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            return m99381a((Uri) obj, (C30379e) obj2, (String) obj3, (String) obj4, (JSONObject) obj5);
        }

        /* renamed from: a */
        private static C30415w m99381a(Uri uri, C30379e eVar, String str, String str2, JSONObject jSONObject) {
            Uri uri2;
            C7573i.m23587b(uri, "uri");
            C7573i.m23587b(eVar, "providerFactory");
            C7573i.m23587b(str, "chromeVersion");
            if (C7573i.m23585a((Object) uri.getScheme(), (Object) "react-native")) {
                uri2 = uri;
            } else {
                uri2 = null;
            }
            if (uri2 == null) {
                return null;
            }
            C30415w wVar = new C30415w(uri, eVar, str, str2, jSONObject);
            return wVar;
        }
    }

    private C30413v() {
    }

    /* renamed from: a */
    public static C30420z<C30395o> m99380a() {
        return f79923b;
    }
}
