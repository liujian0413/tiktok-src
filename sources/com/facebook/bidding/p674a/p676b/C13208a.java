package com.facebook.bidding.p674a.p676b;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.bidding.p674a.p680f.C13217a;
import com.facebook.bidding.p674a.p681h.p682a.C13221a;
import com.facebook.bidding.p674a.p681h.p682a.C13228h;
import java.nio.charset.Charset;

/* renamed from: com.facebook.bidding.a.b.a */
public final class C13208a {
    /* renamed from: a */
    public static C13228h m38606a(Context context, int i, String str) {
        C13221a a = C13217a.m38625a(context);
        a.f35036a = i;
        return a.mo32412a(m38607a(), "application/x-www-form-urlencoded;charset=UTF-8", str.getBytes(Charset.forName("UTF-8")));
    }

    /* renamed from: a */
    private static String m38607a() {
        String urlPrefix = AdSettings.getUrlPrefix();
        return TextUtils.isEmpty(urlPrefix) ? "https://an.facebook.com/placementbid.ortb" : "https://an.%s.facebook.com/placementbid.ortb".replace("%s", urlPrefix);
    }
}
