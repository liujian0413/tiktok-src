package com.bytedance.polaris.p634b;

import android.content.Context;
import android.net.Uri;
import android.net.Uri.Builder;
import android.text.TextUtils;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.depend.C12434l;

/* renamed from: com.bytedance.polaris.b.q */
public final class C12366q {
    /* renamed from: a */
    public static String m35914a(int i, String str, boolean z) {
        C12434l b = C12428i.m36151b();
        StringBuilder sb = new StringBuilder();
        sb.append(m35915a(b.mo30345a(), null, null, "1", z));
        sb.append("&hide_bar=1&bounce_disable=1");
        return sb.toString();
    }

    /* renamed from: a */
    private static String m35915a(String str, String str2, String str3, String str4, boolean z) {
        String str5;
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Builder buildUpon = Uri.parse(str).buildUpon();
        if (!TextUtils.isEmpty(str2)) {
            buildUpon.appendQueryParameter("enter_from", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            buildUpon.appendQueryParameter("profit_type", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            buildUpon.appendQueryParameter("report", str4);
        }
        String str6 = "is_full_screen";
        if (z) {
            str5 = "1";
        } else {
            str5 = "0";
        }
        buildUpon.appendQueryParameter(str6, str5);
        buildUpon.appendQueryParameter("status_bar_height", String.valueOf(C12352g.m35876a((Context) C12428i.m36153c(), false)));
        return buildUpon.toString();
    }
}
