package com.p280ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12462c.C12463a;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.model.FeedCompoundConfig;
import java.net.URI;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.ss.android.ugc.aweme.feed.api.FeedCompoundInterceptor */
public class FeedCompoundInterceptor implements C12469a {

    /* renamed from: a */
    private static final String f74324a = UUID.randomUUID().toString();

    /* renamed from: b */
    private static AtomicInteger f74325b = new AtomicInteger(-1);

    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C28217e.m92757a(this, aVar);
    }

    /* renamed from: b */
    public static C12534t m92744b(C12470a aVar) throws Exception {
        if (C28344a.m93119j()) {
            return aVar.mo30457a(aVar.mo30456a());
        }
        int i = f74325b.get();
        FeedCompoundConfig k = C28344a.m93120k();
        List<String> list = k.requestDomains;
        C12462c a = aVar.mo30456a();
        C12463a a2 = a.mo30443a();
        String str = a.f33098b;
        if (TextUtils.isEmpty(str)) {
            return aVar.mo30457a(a);
        }
        f74325b.getAndIncrement();
        if (i == -1) {
            a2.mo30447a(m92743a(NetworkUtils.filterUrl(str), "rid", f74324a));
            return aVar.mo30457a(a2.mo30449a());
        }
        try {
            if (list.size() > i) {
                str = m92742a((String) list.get(i), str);
            }
            if (str.contains(k.path)) {
                str = str.replace(k.path, k.replacePath);
            }
            a2.mo30447a(m92743a(NetworkUtils.filterUrl(str), "rid", f74324a));
        } catch (Throwable unused) {
        }
        return aVar.mo30457a(a2.mo30449a());
    }

    /* renamed from: a */
    private static String m92742a(String str, String str2) {
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
    private static String m92743a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        C19290j jVar = new C19290j(str);
        jVar.mo51188a(str2, str3);
        return jVar.toString();
    }
}
