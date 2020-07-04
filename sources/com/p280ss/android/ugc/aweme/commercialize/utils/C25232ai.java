package com.p280ss.android.ugc.aweme.commercialize.utils;

import com.p280ss.android.ugc.aweme.common.C6907h;
import kotlin.C7579l;
import kotlin.Pair;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.commercialize.utils.ai */
public final class C25232ai {

    /* renamed from: a */
    public static final C25232ai f66570a = new C25232ai();

    /* renamed from: b */
    private static final String f66571b = C25232ai.class.getSimpleName();

    private C25232ai() {
    }

    /* renamed from: a */
    public static void m82957a(String str, String str2, String str3, String str4) {
        C7573i.m23587b(str, "type");
        C7573i.m23587b(str2, "msg");
        C6907h.m21524a("aweme_ad_rank_result", C7507ae.m23393a((Pair<? extends K, ? extends V>[]) new Pair[]{C7579l.m23633a("type", str), C7579l.m23633a("message", str2), C7579l.m23633a("item_list_before", str3), C7579l.m23633a("item_list_after", str4)}));
    }
}
