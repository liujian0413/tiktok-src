package com.bytedance.android.p109c.p112b;

import android.util.LruCache;
import com.bytedance.android.p109c.p112b.C2292f.C2293a;
import com.bytedance.android.p109c.p112b.p113a.C2283b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.bytedance.android.c.b.d */
final class C2289d implements C2291e, C2293a {

    /* renamed from: a */
    static boolean f7580a = true;

    /* renamed from: b */
    final boolean f7581b;

    /* renamed from: c */
    private final C2292f f7582c;

    /* renamed from: d */
    private final LruCache<String, Object> f7583d;

    /* renamed from: a */
    public final void mo8098a() {
        this.f7583d.evictAll();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo8102b() {
        this.f7582c.mo8108a();
    }

    C2289d() {
        this.f7583d = new LruCache<>(Integer.MAX_VALUE);
        this.f7582c = new C2292f() {
            /* renamed from: a */
            public final int mo8105a(String str, String str2) {
                return 1;
            }

            /* renamed from: a */
            public final int mo8106a(String str, List<String> list) {
                return 1;
            }

            /* renamed from: a */
            public final C2283b mo8107a(String str) {
                return null;
            }

            /* renamed from: a */
            public final void mo8108a() {
            }

            /* renamed from: b */
            public final void mo8109b() {
            }

            /* renamed from: b */
            public final void mo8110b(String str) {
            }
        };
    }

    /* renamed from: d */
    public final void mo8104d(String str) {
        this.f7583d.remove(str);
    }

    /* renamed from: c */
    public final void mo8103c(String str) {
        this.f7582c.mo8110b(str);
        this.f7583d.remove(str);
    }

    /* renamed from: a */
    public final String mo8097a(String str) {
        if (this.f7581b) {
            this.f7582c.mo8109b();
        }
        Object obj = this.f7583d.get(str);
        if (obj != null) {
            return (String) obj;
        }
        C2283b a = m9855a(str, 8);
        if (a == null) {
            return null;
        }
        return a.f7564h;
    }

    /* renamed from: b */
    public final List<String> mo8101b(String str) {
        if (this.f7581b) {
            this.f7582c.mo8109b();
        }
        Object obj = this.f7583d.get(str);
        if (obj != null) {
            return (List) obj;
        }
        C2283b a = m9855a(str, 10);
        if (a == null) {
            return null;
        }
        return a.f7566j;
    }

    /* renamed from: a */
    public final void mo8099a(String str, String str2) {
        this.f7582c.mo8105a(str, str2);
        this.f7583d.put(str, str2);
    }

    /* renamed from: a */
    public final void mo8100a(String str, Collection<String> collection) {
        this.f7582c.mo8106a(str, (List<String>) new ArrayList<String>(collection));
        this.f7583d.put(str, collection);
    }

    /* renamed from: a */
    private C2283b m9855a(String str, int i) {
        C2283b a = this.f7582c.mo8107a(str);
        if (a == null) {
            return null;
        }
        if (a.f7558b == i) {
            return a;
        }
        StringBuilder sb = new StringBuilder("Wrong type with key: ");
        sb.append(str);
        sb.append(", expected: ");
        sb.append(C2283b.m9819a(Integer.valueOf(i)));
        sb.append(", found: ");
        sb.append(C2283b.m9819a(Integer.valueOf(a.f7558b)));
        throw new IllegalStateException(sb.toString());
    }

    C2289d(String str, int i, boolean z) throws IOException {
        this.f7581b = z;
        this.f7583d = new LruCache<>(i);
        this.f7582c = new C2295h(str, z, this);
    }
}
