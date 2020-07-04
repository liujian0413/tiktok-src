package com.p280ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.i18n.C6927n;
import java.net.URI;
import okhttp3.HttpUrl;
import okhttp3.HttpUrl.Builder;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.UrlTransformInterceptorTTNet */
public class UrlTransformInterceptorTTNet implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34088r.m109752a(this, aVar);
    }

    /* renamed from: a */
    private static boolean m109738a(String str) {
        if ("vas_ad_track".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static C12534t m109739b(C12470a aVar) throws Exception {
        C12462c a = aVar.mo30456a();
        return aVar.mo30457a(a.mo30443a().mo30447a(m109737a(a.f33098b, a.f33106j)).mo30449a());
    }

    /* renamed from: b */
    private static String m109740b(String str, String str2) {
        String str3;
        if (str2 == null || str2.length() <= 0 || str == null || str.length() <= 0) {
            return str2;
        }
        try {
            String host = URI.create(str2).getHost();
            if (host != null) {
                str3 = str2.replace(host, str);
            } else {
                str3 = str2;
            }
            return str3;
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: a */
    private static String m109737a(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        if (((Boolean) SharePrefCache.inst().getUseHttps().mo59877d()).booleanValue() && !m109738a(str2)) {
            if (!str.contains("https://") && !str.contains("http://")) {
                StringBuilder sb = new StringBuilder("https://");
                sb.append(str);
                str = sb.toString();
            } else if (str.contains("http://")) {
                str = str.replace("http://", "https://");
            }
        }
        Builder newBuilder = HttpUrl.parse(str).newBuilder();
        HttpUrl build = newBuilder.build();
        if (str.contains("/passport/auth/login/") || str.contains("/passport/auth/login_only/")) {
            if (TextUtils.isEmpty(build.queryParameter("access_token"))) {
                return str;
            }
            String replaceAll = build.queryParameter("access_token").replaceAll(" ", "+");
            Builder removeAllQueryParameters = build.newBuilder().removeAllQueryParameters("access_token");
            removeAllQueryParameters.addQueryParameter("access_token", replaceAll);
            return removeAllQueryParameters.build().url().toString();
        } else if (str.contains("/service/settings/v2/")) {
            return m109740b(C6399b.m19926b().f18690a, str);
        } else {
            if (str.contains("/service/settings/v3/")) {
                return m109740b(C6399b.m19926b().f18690a, str);
            }
            if (str.contains("/location/sulite")) {
                str = build.newBuilder().host(C6399b.m19926b().f18690a).build().url().toString();
            }
            if (str.contains("push/get_service_addrs")) {
                str = build.newBuilder().host(C6399b.m19926b().f18690a).build().url().toString();
            }
            if (C6399b.m19944t() && str.contains("/service/settings/v2")) {
                String str4 = "googleServiceEnable";
                if (C6927n.m21573a()) {
                    str3 = "1";
                } else {
                    str3 = "0";
                }
                newBuilder.addQueryParameter(str4, str3);
                str = newBuilder.build().url().toString();
            }
            return str;
        }
    }
}
