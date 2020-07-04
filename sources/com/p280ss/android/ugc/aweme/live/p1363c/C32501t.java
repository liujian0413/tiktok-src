package com.p280ss.android.ugc.aweme.live.p1363c;

import android.webkit.CookieManager;
import android.webkit.WebResourceResponse;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdkapi.host.C9466h;
import com.bytedance.android.livesdkapi.p450f.C9407c;
import com.bytedance.retrofit2.p637a.C12461b;
import com.p280ss.android.account.token.C18900c;
import com.p280ss.android.common.util.NetworkUtils;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.sdk.webview.C20140h;
import com.p280ss.android.ugc.aweme.web.C43442e;
import com.p280ss.android.ugc.aweme.web.C43447i;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.ss.android.ugc.aweme.live.c.t */
public final class C32501t implements C9466h {

    /* renamed from: a */
    private C20140h f84764a = new C20140h(C19936f.m65765a().mo53441g().mo53916a()).mo53900a(C32502u.f84765a).mo53903a(C43447i.m137873d()).mo53902a(C9407c.f25891d);

    /* renamed from: a */
    public final List<String> mo23271a() {
        return C43442e.f112516a;
    }

    C32501t() {
        C3596c.m13174a(C9466h.class, this);
    }

    /* renamed from: c */
    public final WebResourceResponse mo23275c(String str) {
        return this.f84764a.mo53899a(null, str);
    }

    /* renamed from: a */
    public final List<String> mo23272a(String str) {
        return NetworkUtils.getShareCookie(CookieManager.getInstance(), str);
    }

    /* renamed from: a */
    public final void mo23273a(List<Pattern> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        list.addAll(C9407c.f25891d);
        if (this.f84764a != null) {
            this.f84764a.mo53902a(list);
        }
    }

    /* renamed from: b */
    public final Map<String, String> mo23274b(String str) {
        ArrayList<C12461b> arrayList = new ArrayList<>();
        C18900c.m61696a(str, (List<C12461b>) arrayList);
        HashMap hashMap = new HashMap();
        for (C12461b bVar : arrayList) {
            hashMap.put(bVar.f33095a, bVar.f33096b);
        }
        return hashMap;
    }
}
