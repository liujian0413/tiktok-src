package com.p280ss.android.ugc.aweme.commercialize.log;

import java.util.HashSet;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.commercialize.log.an */
public class C24945an {

    /* renamed from: b */
    private static C24945an f65781b;

    /* renamed from: a */
    public boolean f65782a = false;

    /* renamed from: c */
    private Set<String> f65783c = new HashSet();

    /* renamed from: d */
    private Set<String> f65784d = new HashSet();

    /* renamed from: b */
    public final void mo65223b() {
        this.f65784d.clear();
    }

    /* renamed from: a */
    public static C24945an m81853a() {
        if (f65781b == null) {
            synchronized (C24945an.class) {
                if (f65781b == null) {
                    f65781b = new C24945an();
                }
            }
        }
        return f65781b;
    }

    /* renamed from: a */
    public final void mo65222a(String str) {
        this.f65783c.add(str);
    }

    /* renamed from: c */
    public final boolean mo65225c(String str) {
        return this.f65783c.contains(str);
    }

    /* renamed from: d */
    public final boolean mo65226d(String str) {
        return this.f65784d.contains(str);
    }

    /* renamed from: e */
    public final void mo65227e(String str) {
        this.f65784d.add(str);
    }

    /* renamed from: b */
    public final void mo65224b(String str) {
        if (this.f65783c.contains(str)) {
            this.f65783c.remove(str);
        }
    }
}
