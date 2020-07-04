package com.bytedance.android.live.network;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.bytedance.android.live.network.l */
final class C3467l {

    /* renamed from: a */
    private static final Set<String> f10287a;

    static {
        HashSet hashSet = new HashSet();
        f10287a = hashSet;
        hashSet.add("/webcast/feed/");
    }

    /* renamed from: a */
    static boolean m12829a(String str) {
        return f10287a.contains(str);
    }
}
