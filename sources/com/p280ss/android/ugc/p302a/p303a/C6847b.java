package com.p280ss.android.ugc.p302a.p303a;

import com.p280ss.android.ugc.p302a.C6854g;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.a.a.b */
public final class C6847b extends C6854g {

    /* renamed from: c */
    private List<C6854g> f19490c = new ArrayList();

    /* renamed from: a */
    private void m21287a() {
        this.f19490c.add(new C6846a());
    }

    /* renamed from: b */
    private <T> T m21288b(String str) {
        return null;
    }

    public C6847b() {
        m21287a();
    }

    /* renamed from: b */
    private <T> List<T> m21289b(Class<T> cls) {
        if (this.f19496b.get(cls) != null) {
            return mo16716a((List) this.f19496b.get(cls), new Object[0]);
        }
        return null;
    }

    /* renamed from: a */
    public final C6854g mo16709a(Class cls) {
        if (this.f19496b.get(cls) != null) {
            return this;
        }
        for (C6854g gVar : this.f19490c) {
            if (gVar.mo16709a(cls) != null) {
                return gVar;
            }
        }
        return this;
    }

    /* renamed from: a */
    public final C6854g mo16710a(String str) {
        if (this.f19495a.contains(str)) {
            return this;
        }
        for (C6854g gVar : this.f19490c) {
            if (gVar.mo16710a(str) != null) {
                return gVar;
            }
        }
        return this;
    }

    /* renamed from: a */
    public final <T> T mo16707a(String str, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return m21288b(str);
        }
        return null;
    }

    /* renamed from: a */
    public final <T> List<T> mo16708a(Class<T> cls, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return m21289b(cls);
        }
        if (this.f19496b.get(cls) != null) {
            return mo16716a((List) this.f19496b.get(cls), objArr);
        }
        return null;
    }
}
