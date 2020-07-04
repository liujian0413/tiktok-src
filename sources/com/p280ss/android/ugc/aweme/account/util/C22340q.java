package com.p280ss.android.ugc.aweme.account.util;

import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.main.p1385g.C33029o;
import com.p280ss.android.ugc.aweme.main.p1385g.C33034t;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.account.util.q */
public final class C22340q {

    /* renamed from: a */
    public static final C22340q f59607a = new C22340q();

    private C22340q() {
    }

    /* renamed from: a */
    public static String m73949a(String str) {
        C7573i.m23587b(str, "projectKey");
        String c = ((C33029o) C21671bd.m72521a(C33029o.class)).mo60029c();
        String b = ((C33034t) C21671bd.m72521a(C33034t.class)).mo60002b();
        StringBuilder sb = new StringBuilder("https://www.tiktok.com/in_app/redirect?region=");
        sb.append(b);
        sb.append("&language=");
        sb.append(c);
        sb.append("&projectKey=");
        sb.append(str);
        return sb.toString();
    }
}
