package com.p280ss.android.ugc.aweme.bullet.p1075b;

import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.p261rn.p545b.C10489a;
import com.bytedance.ies.bullet.kit.web.p550d.C10635a;
import com.p280ss.android.ugc.aweme.app.C22903bl;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import java.util.Set;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.bullet.b.a */
public final class C23564a {

    /* renamed from: a */
    public static final C23564a f62167a = new C23564a();

    private C23564a() {
    }

    /* renamed from: a */
    private static C10635a m77367a(String str) {
        Uri parse = Uri.parse(str);
        C7573i.m23582a((Object) parse, "Uri.parse(url)");
        return new C10635a(parse);
    }

    /* renamed from: c */
    private static String m77369c(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".android.jsbundle");
        return sb.toString();
    }

    /* renamed from: d */
    private static String m77370d(String str, String str2) {
        if (!TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (str == null || C7634n.m23723c(str, "_android", false)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("_android");
        return sb.toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0010, code lost:
        if (r5 == null) goto L_0x0012;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.net.Uri m77366a(java.lang.String r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "schema"
            kotlin.jvm.internal.C7573i.m23587b(r4, r0)
            com.bytedance.ies.bullet.core.c.b r0 = new com.bytedance.ies.bullet.core.c.b
            r0.<init>()
            if (r5 == 0) goto L_0x0012
            java.util.List r5 = kotlin.collections.C7525m.m23457a(r5)
            if (r5 != 0) goto L_0x0016
        L_0x0012:
            java.util.List r5 = kotlin.collections.C7525m.m23461a()
        L_0x0016:
            com.bytedance.ies.bullet.core.c.b r5 = r0.mo25108a(r5)
            java.lang.String r0 = "http"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.C7634n.m23721b(r4, r0, false)
            r1 = 1
            if (r0 != r1) goto L_0x003d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "aweme://webview/"
            r0.<init>(r1)
            java.lang.String r1 = "?fallback_url="
            r0.append(r1)
            java.lang.String r4 = android.net.Uri.encode(r4)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
        L_0x003d:
            android.net.Uri r4 = android.net.Uri.parse(r4)
            java.lang.String r0 = "fallback_url"
            java.lang.String r0 = r4.getQueryParameter(r0)
            if (r0 != 0) goto L_0x004f
            java.lang.String r0 = "url"
            java.lang.String r0 = r4.getQueryParameter(r0)
        L_0x004f:
            java.lang.String r1 = "rn_schema"
            java.lang.String r4 = r4.getQueryParameter(r1)
            if (r4 == 0) goto L_0x005f
            android.net.Uri r4 = m77368b(r4, r0)
            r5.mo25106a(r4)
            goto L_0x006a
        L_0x005f:
            if (r0 == 0) goto L_0x006a
            com.bytedance.ies.bullet.kit.web.d.a r4 = m77367a(r0)
            com.bytedance.ies.bullet.core.params.e r4 = (com.bytedance.ies.bullet.core.params.C10462e) r4
            r5.mo25107a(r4)
        L_0x006a:
            android.net.Uri$Builder r4 = r5.mo25247b()
            android.net.Uri r4 = r4.build()
            java.lang.String r5 = "BulletLoaderParamsUriBui…er()\n            .build()"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.bullet.p1075b.C23564a.m77366a(java.lang.String, java.lang.String):android.net.Uri");
    }

    /* renamed from: b */
    private static Uri m77368b(String str, String str2) {
        Uri parse = Uri.parse(str);
        C10489a aVar = new C10489a();
        String c = m77369c(parse.getQueryParameter("bundle_name"), parse.getQueryParameter("bundle"));
        if (c != null) {
            aVar.mo25281b(c);
        }
        String d = m77370d(parse.getQueryParameter("channel_name"), parse.getQueryParameter("channel"));
        if (d != null) {
            aVar.mo25280a(d);
        }
        String queryParameter = parse.getQueryParameter("module_name");
        if (queryParameter != null) {
            aVar.mo25282c(queryParameter);
        }
        if (str2 != null) {
            aVar.mo25124a(m77367a(str2));
        }
        Builder c2 = aVar.mo25247b();
        SharePrefCache inst = SharePrefCache.inst();
        C7573i.m23582a((Object) inst, "SharePrefCache.inst()");
        C22903bl rnFallback = inst.getRnFallback();
        C7573i.m23582a((Object) rnFallback, "SharePrefCache.inst().rnFallback");
        Object d2 = rnFallback.mo59877d();
        C7573i.m23582a(d2, "SharePrefCache.inst().rnFallback.cache");
        if (((Boolean) d2).booleanValue()) {
            c2.appendQueryParameter("force_h5", "1");
        }
        C7573i.m23582a((Object) parse, "it");
        Set<String> queryParameterNames = parse.getQueryParameterNames();
        if (queryParameterNames != null) {
            for (String str3 : queryParameterNames) {
                if (str3 != null) {
                    boolean z = true;
                    if (!(!C7573i.m23585a((Object) str3, (Object) "bundle_name")) || !(!C7573i.m23585a((Object) str3, (Object) "channel_name")) || !(!C7573i.m23585a((Object) str3, (Object) "channel")) || !(!C7573i.m23585a((Object) str3, (Object) "bundle")) || !(!C7573i.m23585a((Object) str3, (Object) "module_name"))) {
                        z = false;
                    }
                    if (!z) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        c2.appendQueryParameter(str3, parse.getQueryParameter(str3));
                    }
                }
            }
        }
        Uri build = c2.build();
        C7573i.m23582a((Object) build, "BaseRnKitParamsBuilder()…                }.build()");
        C7573i.m23582a((Object) build, "Uri.parse(url).let {\n   …          }.build()\n    }");
        return build;
    }
}
