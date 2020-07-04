package com.p280ss.android.ugc.aweme.account.login.twostep;

import com.p280ss.android.ugc.aweme.account.p943f.C21175b;
import com.p280ss.android.ugc.aweme.account.p943f.C21176c;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.f */
public class C21634f {

    /* renamed from: a */
    private static volatile C21634f f58064a;

    /* renamed from: b */
    private static final Object f58065b = new Object();

    /* renamed from: c */
    private C21175b f58066c;

    private C21634f() {
    }

    /* renamed from: a */
    public static C21634f m72433a() {
        if (f58064a == null) {
            synchronized (C21634f.class) {
                if (f58064a == null) {
                    f58064a = new C21634f();
                }
            }
        }
        return f58064a;
    }

    /* renamed from: a */
    public final void mo57846a(C21175b bVar) {
        synchronized (f58065b) {
            this.f58066c = bVar;
        }
    }

    /* renamed from: a */
    public final void mo57847a(C21176c cVar) {
        synchronized (f58065b) {
            if (this.f58066c != null) {
                this.f58066c.onComplete(cVar);
                this.f58066c = null;
            }
        }
    }
}
