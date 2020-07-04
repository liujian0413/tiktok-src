package com.p280ss.android.ugc.p302a;

import com.p280ss.android.ugc.p302a.p303a.C6847b;
import java.util.List;

/* renamed from: com.ss.android.ugc.a.c */
public abstract class C6849c {

    /* renamed from: a */
    private static C6854g f19493a;

    /* renamed from: a */
    private static void m21295a() {
        if (f19493a == null) {
            f19493a = new C6847b();
        }
    }

    /* renamed from: a */
    public final <T> T mo16711a(String str, Object... objArr) {
        m21295a();
        if (f19493a != null) {
            return f19493a.mo16710a(str).mo16707a(str, objArr);
        }
        return null;
    }

    /* renamed from: a */
    public final <T> List<T> mo16712a(Class<T> cls, Object... objArr) {
        m21295a();
        if (f19493a != null) {
            return f19493a.mo16709a((Class) cls).mo16708a(cls, objArr);
        }
        return null;
    }
}
