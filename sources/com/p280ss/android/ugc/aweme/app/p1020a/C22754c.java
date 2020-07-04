package com.p280ss.android.ugc.aweme.app.p1020a;

import android.content.Context;
import com.bytedance.frameworks.baselib.network.http.exception.HttpResponseException;
import com.bytedance.ies.ugc.aweme.network.C10944e;
import com.google.gson.C6600e;
import com.p280ss.android.http.legacy.p296a.C19565e;
import com.p280ss.android.ugc.aweme.C21659as;
import com.p280ss.android.ugc.aweme.app.api.Api;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.a.c */
public final class C22754c implements C21659as {
    /* renamed from: a */
    public final C6600e mo57916a() {
        return C10944e.m32113a();
    }

    /* renamed from: a */
    public final int mo57915a(Context context, Throwable th) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(th, "e");
        if (!(th instanceof HttpResponseException)) {
            return 0;
        }
        if (((HttpResponseException) th).getStatusCode() == 503) {
            return -19;
        }
        return -16;
    }

    /* renamed from: a */
    public final <T> T mo57917a(String str, int i, String str2, Class<T> cls, String str3, List<? extends C19565e> list) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(str2, "path");
        C7573i.m23587b(cls, "cls");
        C7573i.m23587b(str3, "key");
        if (list != null) {
            return Api.m75211a(str, i, str2, cls, str3, list);
        }
        return Api.m75210a(str, i, str2, cls, str3);
    }
}
