package com.p280ss.android.ugc.aweme.sdk;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.sdk.api.C37315a;
import com.p280ss.android.ugc.aweme.sdk.bean.C37321a;
import com.p280ss.android.ugc.aweme.sdk.bean.C37322b;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.sdk.d */
public class C37325d {

    /* renamed from: b */
    private static C37325d f97470b;

    /* renamed from: a */
    public C37321a f97471a;

    private C37325d() {
        m119825e();
    }

    /* renamed from: e */
    private void m119825e() {
        this.f97471a = new C37321a();
    }

    /* renamed from: c */
    public final long mo93937c() {
        if (this.f97471a == null) {
            return 0;
        }
        return this.f97471a.f97463b;
    }

    /* renamed from: d */
    public final void mo93938d() {
        if (this.f97471a != null) {
            this.f97471a.f97463b = 0;
        }
    }

    /* renamed from: a */
    public static C37325d m119824a() {
        if (f97470b == null) {
            synchronized (C37325d.class) {
                if (f97470b == null) {
                    f97470b = new C37325d();
                }
            }
        }
        return f97470b;
    }

    /* renamed from: b */
    public final C1592h<Long> mo93936b() {
        return C1592h.m7853a((Callable<TResult>) new Callable<C37322b>() {
            /* renamed from: a */
            private static C37322b m119831a() throws Exception {
                return C37315a.m119813a();
            }

            public final /* synthetic */ Object call() throws Exception {
                return m119831a();
            }
        }).mo6876a((C1591g<TResult, TContinuationResult>) new C1591g<C37322b, Long>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Long then(C1592h<C37322b> hVar) {
                if (hVar.mo6889d() || hVar.mo6887c()) {
                    return Long.valueOf(-1);
                }
                C37322b bVar = (C37322b) hVar.mo6890e();
                C37325d.this.mo93935a(bVar.f97467a);
                return Long.valueOf(bVar.f97467a.f97463b);
            }
        }, C1592h.f5958b);
    }

    /* renamed from: a */
    public final void mo93935a(C37321a aVar) {
        this.f97471a = aVar;
    }
}
