package com.p280ss.android.message.push.connection.p887a;

import com.p280ss.android.pushmanager.app.C20039a;
import com.p280ss.android.pushmanager.app.C20039a.C20041a;
import com.p280ss.android.pushmanager.setting.C20090b;

/* renamed from: com.ss.android.message.push.connection.a.i */
public class C19883i {

    /* renamed from: b */
    private static volatile C19883i f53941b;

    /* renamed from: a */
    public C20039a f53942a = new C20039a(10);

    private C19883i() {
        this.f53942a.mo53653a(C20090b.m66187a().mo53785k());
    }

    /* renamed from: a */
    public static C19883i m65654a() {
        if (f53941b == null) {
            synchronized (C19883i.class) {
                if (f53941b == null) {
                    f53941b = new C19883i();
                }
            }
        }
        return f53941b;
    }

    /* renamed from: a */
    public final boolean mo53280a(C20041a aVar) {
        return this.f53942a.mo53654a(aVar);
    }

    /* renamed from: b */
    public final void mo53281b(C20041a aVar) {
        this.f53942a.mo53656c(aVar);
        C20090b.m66187a().mo53773e(this.f53942a.mo53652a());
    }

    /* renamed from: a */
    public final C20041a mo53279a(long j, long j2) {
        C20039a aVar = this.f53942a;
        aVar.getClass();
        C20041a aVar2 = new C20041a();
        aVar2.f54233a = Long.valueOf(j);
        aVar2.f54234b = j2;
        return aVar2;
    }
}
