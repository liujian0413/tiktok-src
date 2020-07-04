package com.p280ss.android.ugc.aweme.router;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.router.RouteIntent;
import com.bytedance.router.interceptor.IInterceptor;
import com.p280ss.android.ugc.aweme.crossplatform.abtest.DynamicChannelExperiment;
import com.p280ss.android.ugc.aweme.utils.C42983bo;
import java.util.Set;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.router.i */
public final class C37271i implements IInterceptor {

    /* renamed from: a */
    public static final C37272a f97395a = new C37272a(null);

    /* renamed from: com.ss.android.ugc.aweme.router.i$a */
    public static final class C37272a {
        private C37272a() {
        }

        /* renamed from: a */
        public static boolean m119728a() {
            if (C6384b.m19835a().mo15287a(DynamicChannelExperiment.class, true, "bundle_dynamic_load", C6384b.m19835a().mo15295d().bundle_dynamic_load, 0) == 1) {
                return true;
            }
            return false;
        }

        public /* synthetic */ C37272a(C7571f fVar) {
            this();
        }

        /* renamed from: b */
        public static boolean m119729b(Uri uri) {
            Boolean bool;
            if (C7573i.m23585a((Object) uri.getAuthority(), (Object) "reactnative")) {
                String queryParameter = uri.getQueryParameter("channel");
                if (queryParameter != null) {
                    bool = Boolean.valueOf(C42983bo.m136455a().contains(queryParameter));
                } else {
                    String queryParameter2 = uri.getQueryParameter("channel_name");
                    if (queryParameter2 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(queryParameter2);
                        sb.append("_android");
                        String sb2 = sb.toString();
                        if (sb2 != null) {
                            bool = Boolean.valueOf(C42983bo.m136455a().contains(sb2));
                        }
                    }
                    bool = null;
                }
                if (bool != null) {
                    return bool.booleanValue();
                }
            }
            return false;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:5:0x0040, code lost:
            if (r0 == null) goto L_0x0042;
         */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final java.lang.String mo93883a(android.net.Uri r5) {
            /*
                r4 = this;
                java.lang.String r0 = r5.getAuthority()
                java.lang.String r1 = "reactnative"
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x0054
                java.lang.String r0 = "fallback_url"
                java.lang.String r0 = r5.getQueryParameter(r0)
                if (r0 == 0) goto L_0x0042
                java.lang.String r1 = "fallback_url"
                android.net.Uri r0 = android.net.Uri.parse(r0)
                java.lang.String r2 = "Uri.parse(it)"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                java.lang.String r2 = "dynamic"
                java.lang.String r3 = "1"
                android.net.Uri r0 = m119727a(r0, r2, r3)
                java.lang.String r0 = r0.toString()
                java.lang.String r2 = "replaceQuery(\n          …             ).toString()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r2)
                android.net.Uri r0 = m119727a(r5, r1, r0)
                java.lang.String r1 = "dynamic"
                java.lang.String r2 = "1"
                android.net.Uri r0 = m119727a(r0, r1, r2)
                java.lang.String r0 = r0.toString()
                if (r0 != 0) goto L_0x005d
            L_0x0042:
                java.lang.String r0 = "dynamic"
                java.lang.String r1 = "1"
                android.net.Uri r5 = m119727a(r5, r0, r1)
                java.lang.String r5 = r5.toString()
                java.lang.String r0 = "replaceQuery(uri, CrossP….DYNAMIC, \"1\").toString()"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                return r5
            L_0x0054:
                java.lang.String r0 = r5.toString()
                java.lang.String r5 = "uri.toString()"
                kotlin.jvm.internal.C7573i.m23582a(r0, r5)
            L_0x005d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.router.C37271i.C37272a.mo93883a(android.net.Uri):java.lang.String");
        }

        /* renamed from: a */
        private static Uri m119727a(Uri uri, String str, String str2) {
            Builder clearQuery = uri.buildUpon().clearQuery();
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            C7573i.m23582a((Object) queryParameterNames, "uri.queryParameterNames");
            for (String str3 : queryParameterNames) {
                if (!C7573i.m23585a((Object) str3, (Object) str)) {
                    clearQuery.appendQueryParameter(str3, uri.getQueryParameter(str3));
                }
            }
            clearQuery.appendQueryParameter(str, str2);
            Uri build = clearQuery.build();
            C7573i.m23582a((Object) build, "uri.buildUpon().clearQue…                }.build()");
            return build;
        }
    }

    public final boolean matchInterceptRules(RouteIntent routeIntent) {
        if (routeIntent != null && C37272a.m119728a()) {
            Uri parse = Uri.parse(routeIntent.getUrl());
            C7573i.m23582a((Object) parse, "Uri.parse(routeIntent.url)");
            if (C37272a.m119729b(parse)) {
                return true;
            }
        }
        return false;
    }

    public final boolean onInterceptRoute(Context context, RouteIntent routeIntent) {
        if (routeIntent != null) {
            C37272a aVar = f97395a;
            Uri parse = Uri.parse(routeIntent.getUrl());
            C7573i.m23582a((Object) parse, "Uri.parse(url)");
            routeIntent.setUrl(aVar.mo93883a(parse));
        }
        return false;
    }
}
