package com.p280ss.android.ugc.aweme.feed.preload;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.feed.preload.a */
public abstract class C28653a<Data> implements C28659e<Data> {

    /* renamed from: a */
    public Data f75496a;

    /* renamed from: b */
    private C1592h<Data> f75497b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Data mo73714a() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo73715a(Data data) throws Exception;

    /* renamed from: d */
    public void mo73718d() {
        this.f75497b = null;
    }

    /* renamed from: b */
    public void mo73716b() {
        this.f75497b = C1592h.m7853a((Callable<TResult>) new Callable<Data>() {
            public final Data call() throws Exception {
                if (!C28653a.this.mo73723e()) {
                    return null;
                }
                System.currentTimeMillis();
                return C28653a.this.mo73714a();
            }
        });
        this.f75497b.mo6885c((C1591g<TResult, TContinuationResult>) new C1591g<Data, Void>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public Void then(C1592h<Data> hVar) throws Exception {
                if (!hVar.mo6889d()) {
                    Data e = hVar.mo6890e();
                    if (e == null) {
                        C7163a.m22363a();
                        return null;
                    }
                    C28653a.this.f75496a = e;
                }
                return null;
            }
        });
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:4|(2:6|7)|8|9|(1:11)|15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0021, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a() != false) goto L_0x002e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0033, code lost:
        throw new java.lang.IllegalStateException(r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0013 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x001b A[Catch:{ Exception -> 0x0021 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Data mo73717c() {
        /*
            r2 = this;
            bolts.h<Data> r0 = r2.f75497b
            if (r0 != 0) goto L_0x0006
            r0 = 0
            return r0
        L_0x0006:
            bolts.h<Data> r0 = r2.f75497b
            boolean r0 = r0.mo6882b()
            if (r0 != 0) goto L_0x0013
            bolts.h<Data> r0 = r2.f75497b     // Catch:{ InterruptedException -> 0x0013 }
            r0.mo6892g()     // Catch:{ InterruptedException -> 0x0013 }
        L_0x0013:
            bolts.h<Data> r0 = r2.f75497b     // Catch:{ Exception -> 0x0021 }
            boolean r0 = r0.mo6889d()     // Catch:{ Exception -> 0x0021 }
            if (r0 != 0) goto L_0x0028
            Data r0 = r2.f75496a     // Catch:{ Exception -> 0x0021 }
            r2.mo73715a(r0)     // Catch:{ Exception -> 0x0021 }
            goto L_0x0028
        L_0x0021:
            r0 = move-exception
            boolean r1 = com.p280ss.android.ugc.aweme.p331m.C7163a.m22363a()
            if (r1 != 0) goto L_0x002e
        L_0x0028:
            r2.mo73718d()
            Data r0 = r2.f75496a
            return r0
        L_0x002e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.feed.preload.C28653a.mo73717c():java.lang.Object");
    }
}
