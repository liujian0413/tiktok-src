package com.p280ss.android.ugc.aweme.commercialize.api;

import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.net.C34037b;
import com.p280ss.android.ugc.aweme.net.C34065d;
import com.p280ss.android.ugc.aweme.net.HttpType;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.commercialize.api.f */
public final class C24547f {

    /* renamed from: a */
    private static final String f64793a;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f60502b);
        sb.append("/aweme/v2/commit/item/top/");
        f64793a = sb.toString();
    }

    /* renamed from: a */
    public static void m80571a(C34065d dVar, String str, boolean z) {
        String str2;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C19565e("aweme_id", str));
        String str3 = "need_top";
        if (z) {
            str2 = "1";
        } else {
            str2 = "0";
        }
        arrayList.add(new C19565e(str3, String.valueOf(str2)));
        C34037b bVar = new C34037b(f64793a, HttpType.POST, (List<C19565e>) arrayList, String.class);
        bVar.mo86728a(dVar);
        bVar.f88788g = false;
        bVar.mo86727a();
    }
}
