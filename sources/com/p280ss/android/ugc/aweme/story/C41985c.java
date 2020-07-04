package com.p280ss.android.ugc.aweme.story;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.story.c */
public final class C41985c implements C41965a {

    /* renamed from: a */
    private static C41985c f109063a;

    /* renamed from: b */
    private Set<String> f109064b = new HashSet();

    private C41985c() {
    }

    /* renamed from: a */
    public static C41985c m133446a() {
        if (f109063a == null) {
            synchronized (C41985c.class) {
                if (f109063a == null) {
                    f109063a = new C41985c();
                }
            }
        }
        return f109063a;
    }

    /* renamed from: a */
    public final boolean mo103105a(String str) {
        return this.f109064b.contains(str);
    }
}
