package com.p280ss.android.account.token;

import android.content.Context;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.ss.android.account.token.a */
public final class C18897a {

    /* renamed from: a */
    private static volatile boolean f50939a = false;

    /* renamed from: b */
    private static volatile boolean f50940b = true;

    /* renamed from: c */
    private static Set<String> f50941c = Collections.synchronizedSet(new HashSet());

    /* renamed from: a */
    public static void m61681a() {
        if (f50939a) {
            C18900c.m61692a().mo50270b();
        }
    }

    /* renamed from: a */
    public static Map<String, String> m61680a(String str) {
        if (f50939a) {
            return C18900c.m61693a(str);
        }
        return null;
    }

    /* renamed from: a */
    public static void m61683a(Collection<String> collection) {
        if (f50939a) {
            C18900c.m61692a().mo50268a(collection);
            return;
        }
        if (f50941c != null) {
            f50941c.addAll(collection);
        }
    }

    /* renamed from: a */
    public static void m61684a(boolean z) {
        if (f50939a && z != f50940b) {
            C18900c.m61692a().mo50269a(z);
            if (z) {
                C18900c.m61692a().mo50270b();
            } else {
                C18900c.m61692a().mo50272d();
            }
            f50940b = z;
        }
    }

    /* renamed from: a */
    public static void m61682a(Context context, C18898b bVar) {
        if (!f50939a) {
            C18900c.m61694a(context, bVar);
            C18900c.m61692a().mo50269a(f50940b);
            f50939a = true;
            if (f50941c.size() != 0) {
                C18900c.m61692a().mo50268a((Collection<String>) f50941c);
                f50941c.clear();
                f50941c = null;
            }
        }
    }
}
