package com.p280ss.android.ugc.aweme.net.interceptor;

import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12462c.C12463a;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.bytedance.ttnet.p671c.C12960e;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import java.net.URI;
import java.security.GeneralSecurityException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* renamed from: com.ss.android.ugc.aweme.net.interceptor.FeedRetryInterceptorTTNet */
public class FeedRetryInterceptorTTNet implements C12469a {

    /* renamed from: a */
    public static final Pattern f88846a = Pattern.compile(".*/aweme/v\\d/feed.*");

    /* renamed from: a */
    private static String m109725a(boolean z, boolean z2) {
        return (!z || !z2) ? !z2 ? "ssl" : "protocol" : "both";
    }

    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34080j.m109747a(this, aVar);
    }

    /* renamed from: b */
    public final C12534t mo86746b(C12470a aVar) throws Exception {
        try {
            return aVar.mo30457a(aVar.mo30456a());
        } catch (Exception e) {
            if (!(e instanceof ApiServerException)) {
                C12462c a = aVar.mo30456a();
                C12960e eVar = new C12960e();
                C12463a a2 = a.mo30443a();
                a2.mo30446a((Object) eVar);
                String str = a.f33098b;
                if (!f88846a.matcher(str).matches()) {
                    throw e;
                } else if (!TextUtils.isEmpty(str)) {
                    boolean z = true;
                    boolean z2 = !str.startsWith(WebKitApi.SCHEME_HTTPS);
                    if ((e instanceof SSLException) || (e instanceof GeneralSecurityException)) {
                        z = false;
                    }
                    String a3 = m109723a(C6399b.m19926b().f18690a, str);
                    a2.mo30447a(m109724a(NetworkUtils.filterUrl(a3), "retry_reason", m109725a(z2, z)));
                    a2.mo30447a(m109726b(NetworkUtils.filterUrl(a3), "first_retry"));
                    return aVar.mo30457a(a2.mo30449a());
                } else {
                    throw new IllegalArgumentException("url is empty!");
                }
            } else {
                throw e;
            }
        }
    }

    /* renamed from: b */
    private static String m109726b(String str, String str2) {
        return m109724a(str, "retry_type", str2);
    }

    /* renamed from: a */
    private static String m109723a(String str, String str2) {
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
    private static String m109724a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C19290j jVar = new C19290j(str);
        jVar.mo51188a(str2, str3);
        return jVar.toString();
    }
}
