package com.p280ss.android.ugc.aweme.account.api;

import android.content.Context;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.net.C34037b;
import com.p280ss.android.ugc.aweme.net.C34065d;
import com.p280ss.android.ugc.aweme.net.HttpType;

/* renamed from: com.ss.android.ugc.aweme.account.api.a */
public final class C21106a {

    /* renamed from: a */
    public static final String f56679a = Api.f60502b;

    /* renamed from: b */
    public static final String f56680b;

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(f56679a);
        sb.append("/passport/cancel/do/");
        f56680b = sb.toString();
    }

    /* renamed from: a */
    public static void m71180a(Context context, int i, C34065d dVar) {
        C19290j jVar = new C19290j(f56680b);
        jVar.mo51188a("type", "0");
        C34037b bVar = new C34037b(jVar.toString(), HttpType.GET, String.class);
        bVar.mo86728a(dVar);
        bVar.mo86727a();
    }
}
