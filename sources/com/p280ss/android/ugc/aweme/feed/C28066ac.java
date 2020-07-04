package com.p280ss.android.ugc.aweme.feed;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.main.C32904bi;

/* renamed from: com.ss.android.ugc.aweme.feed.ac */
public final class C28066ac {
    /* renamed from: a */
    public static boolean m91704a(int i) {
        return i == 1;
    }

    /* renamed from: a */
    public static boolean m91705a(String str) {
        return TextUtils.equals(str, "homepage_hot");
    }

    /* renamed from: b */
    public static boolean m91706b(String str) {
        if (!C32904bi.m106498c() || !TextUtils.equals(str, "homepage_follow")) {
            return false;
        }
        return true;
    }
}
