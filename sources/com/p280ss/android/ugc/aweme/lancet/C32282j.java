package com.p280ss.android.ugc.aweme.lancet;

import android.net.Uri;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.app.C22689a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.lancet.j */
public final class C32282j {
    /* renamed from: a */
    public static void m104804a(String str) {
        if (!TextUtils.isEmpty(str) && str.startsWith("aweme://user/profile/")) {
            Uri parse = Uri.parse(str);
            List pathSegments = parse.getPathSegments();
            if (pathSegments != null && pathSegments.size() >= 2) {
                C22689a.m74979a((String) pathSegments.get(1), parse);
            }
        }
    }
}
