package com.p280ss.android.common.util;

import android.content.Context;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.lancet.C7112h;
import com.p280ss.android.ugc.aweme.net.p333a.C7178a;

/* renamed from: com.ss.android.common.util.i */
final class C6777i {
    /* renamed from: a */
    static String m20957a(Context context) {
        if (TextUtils.isEmpty(C7112h.m22207a())) {
            C7112h.f19977a = C6776h.m20952d(context);
        }
        return C7112h.f19977a;
    }

    /* renamed from: a */
    static String m20958a(String str) {
        return C7178a.m22406a().mo18654a(str);
    }
}
