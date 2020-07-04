package com.p280ss.android.ugc.aweme.feed.api;

import android.text.TextUtils;
import com.bytedance.retrofit2.p637a.C12462c;

/* renamed from: com.ss.android.ugc.aweme.feed.api.d */
public final class C28216d {

    /* renamed from: a */
    public static volatile long f74331a;

    /* renamed from: b */
    public static volatile String f74332b;

    /* renamed from: a */
    public static boolean m92755a(String str) {
        return str.contains("/aweme/v1/feed/");
    }

    /* renamed from: b */
    public static boolean m92756b(String str) {
        return str.contains("/aweme/v2/feed/");
    }

    /* renamed from: a */
    public static boolean m92754a(C12462c cVar) {
        if (cVar == null) {
            return false;
        }
        String b = cVar.mo30444b();
        if (TextUtils.isEmpty(b) || (!m92755a(b) && !m92756b(b))) {
            return false;
        }
        return true;
    }
}
