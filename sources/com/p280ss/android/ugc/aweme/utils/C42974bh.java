package com.p280ss.android.ugc.aweme.utils;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: com.ss.android.ugc.aweme.utils.bh */
public final class C42974bh {
    /* renamed from: c */
    private static boolean m136435c(Context context, String str) {
        if (str.contains("微信")) {
            return C43106er.m136727b(context, "com.tencent.mm");
        }
        return true;
    }

    /* renamed from: d */
    private static boolean m136436d(Context context, String str) {
        if (str.contains("微博")) {
            return C43106er.m136727b(context, "com.sina.weibo");
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m136433a(Context context, String str) {
        if (!TextUtils.isEmpty(str) && C43145l.m136849a() && m136434b(context, str) && m136436d(context, str) && m136435c(context, str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private static boolean m136434b(Context context, String str) {
        if (str.contains("QQ") || str.contains("qq") || str.contains("Qq") || str.contains("qQ")) {
            return C43106er.m136727b(context, "com.tencent.mobileqq");
        }
        return true;
    }
}
