package com.p280ss.android.ugc.aweme.account.network.p980a;

import android.content.Context;
import com.bytedance.sdk.account.C12789c;
import com.p280ss.android.ugc.aweme.C21084a;
import com.p280ss.android.ugc.aweme.account.network.C22208c;
import java.util.Map;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.network.a.b */
public final class C22206b implements C12789c {
    /* renamed from: a */
    public final String mo31339a(int i, String str) {
        C7573i.m23587b(str, "url");
        return C22208c.f59306b.mo58583a(i, str);
    }

    /* renamed from: a */
    public final int mo31338a(Context context, Throwable th) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(th, "e");
        return C21084a.m71115b().mo57915a(context, th);
    }

    /* renamed from: a */
    public final String mo31340a(int i, String str, Map<String, String> map) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(map, "postParams");
        return C22208c.f59306b.mo58584a(i, str, map);
    }
}
