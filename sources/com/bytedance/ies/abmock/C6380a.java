package com.bytedance.ies.abmock;

import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.ies.abmock.a */
public final class C6380a {

    /* renamed from: a */
    public static final C6380a f18674a = new C6380a();

    private C6380a() {
    }

    /* renamed from: a */
    public static final void m19832a(String str) {
        C7573i.m23587b(str, C38347c.f99553h);
        C6384b a = C6384b.m19835a();
        C7573i.m23582a((Object) a, "ABManager.getInstance()");
        if (a.mo15293b()) {
            StringBuilder sb = new StringBuilder("@=>abmock  ");
            sb.append(str);
            System.out.println(sb.toString());
        }
    }
}
