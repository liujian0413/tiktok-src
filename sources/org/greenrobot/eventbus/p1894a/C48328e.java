package org.greenrobot.eventbus.p1894a;

import org.greenrobot.eventbus.ThreadMode;

/* renamed from: org.greenrobot.eventbus.a.e */
public final class C48328e {

    /* renamed from: a */
    final String f123383a;

    /* renamed from: b */
    final ThreadMode f123384b;

    /* renamed from: c */
    final Class<?> f123385c;

    /* renamed from: d */
    final int f123386d;

    /* renamed from: e */
    final boolean f123387e;

    public C48328e(String str, Class<?> cls) {
        this(str, cls, ThreadMode.POSTING, 0, false);
    }

    public C48328e(String str, Class<?> cls, ThreadMode threadMode) {
        this(str, cls, threadMode, 0, false);
    }

    public C48328e(String str, Class<?> cls, ThreadMode threadMode, int i, boolean z) {
        this.f123383a = str;
        this.f123384b = threadMode;
        this.f123385c = cls;
        this.f123386d = i;
        this.f123387e = z;
    }
}
