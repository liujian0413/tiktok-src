package com.p280ss.android.ugc.aweme.commercialize.link;

import com.p280ss.android.ugc.aweme.common.C6907h;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;

/* renamed from: com.ss.android.ugc.aweme.commercialize.link.d */
public final class C24775d {

    /* renamed from: a */
    public static final C24775d f65266a = new C24775d();

    private C24775d() {
    }

    /* renamed from: a */
    public static final void m81304a() {
        C6907h.m21524a("show_link_toast", (Map) new LinkedHashMap());
    }

    /* renamed from: a */
    public static final void m81305a(String str) {
        C6907h.m21524a("show_link_entrance", C7507ae.m23400b((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("entrance_location", str)}));
    }

    /* renamed from: b */
    public static final void m81306b(String str) {
        C6907h.m21524a("click_link_entrance", C7507ae.m23400b((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("entrance_location", str)}));
    }
}
