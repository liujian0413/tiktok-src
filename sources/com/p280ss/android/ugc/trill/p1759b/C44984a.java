package com.p280ss.android.ugc.trill.p1759b;

import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.net.C34037b;
import com.p280ss.android.ugc.aweme.net.HttpType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.trill.b.a */
public final class C44984a {

    /* renamed from: a */
    public static final String f115657a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v1/report/info/");
        f115657a = sb.toString();
    }

    /* renamed from: a */
    public static void m141937a(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19565e("facebook_code_start_url", str));
        new C34037b(f115657a, HttpType.POST, (List<C19565e>) arrayList, String.class).mo86727a();
    }
}
