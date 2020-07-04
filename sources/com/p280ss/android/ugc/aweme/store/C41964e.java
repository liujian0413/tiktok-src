package com.p280ss.android.ugc.aweme.store;

import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.store.LocalStore.Type;

/* renamed from: com.ss.android.ugc.aweme.store.e */
public final class C41964e {

    /* renamed from: a */
    public final int f109031a;

    /* renamed from: b */
    public final Aweme f109032b;

    /* renamed from: c */
    public final Type f109033c;

    /* renamed from: d */
    public volatile int f109034d;

    /* renamed from: e */
    private String f109035e;

    /* renamed from: a */
    public final void mo102981a() {
        try {
            m133437a(1);
            this.f109033c.getPreloader().mo102974a(this.f109032b, this.f109035e);
            m133437a(4);
        } catch (Exception unused) {
            m133437a(3);
        }
    }

    /* renamed from: b */
    public final void mo102982b() {
        switch (this.f109034d) {
            case 0:
            case 1:
                m133437a(2);
                break;
            case 3:
                m133437a(6);
                return;
            case 4:
                m133437a(5);
                return;
            case 5:
                return;
        }
    }

    /* renamed from: a */
    private void m133437a(int i) {
        if (i > this.f109034d && this.f109034d != 2 && this.f109034d != 5 && this.f109034d != 6) {
            this.f109034d = i;
        }
    }

    public C41964e(Aweme aweme, int i, String str, Type type) {
        this.f109032b = aweme;
        this.f109031a = i;
        this.f109033c = type;
        this.f109035e = str;
    }
}
