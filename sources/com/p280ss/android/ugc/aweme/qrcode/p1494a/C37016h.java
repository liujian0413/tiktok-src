package com.p280ss.android.ugc.aweme.qrcode.p1494a;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.qrcode.C37055c;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37004a.C37005a;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.qrcode.a.h */
public final class C37016h extends C37004a {
    public C37016h(C37005a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final boolean mo59069a(String str, int i) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String host = parse.getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        if (host.contains("amemv.com") || host.contains("douyin.com") || host.contains("tiktok.com") || host.contains("tiktokv.com") || host.contains("musical.ly")) {
            List pathSegments = parse.getPathSegments();
            if (!C6307b.m19566a((Collection<T>) pathSegments) && pathSegments.size() >= 3) {
                if (TextUtils.equals("share", (String) pathSegments.get(0))) {
                    String str2 = (String) pathSegments.get(2);
                    int a = C37055c.m119143a((String) pathSegments.get(1));
                    this.f96938a = C37055c.m119144b(a, str2);
                    return this.f96939b.mo93444a(a, str2, str, i, null);
                }
            }
        }
        return false;
    }
}
