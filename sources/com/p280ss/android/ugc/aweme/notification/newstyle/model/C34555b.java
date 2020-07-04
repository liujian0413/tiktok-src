package com.p280ss.android.ugc.aweme.notification.newstyle.model;

import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.notification.api.NoticeApiManager;
import com.p280ss.android.ugc.aweme.notification.p1432a.C34382b;
import java.util.HashSet;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.b */
public final class C34555b extends C25640a<C34382b> {

    /* renamed from: b */
    public static final C34556a f90144b = new C34556a(null);

    /* renamed from: a */
    public boolean f90145a;

    /* renamed from: c */
    private final HashSet<String> f90146c = new HashSet<>();

    /* renamed from: d */
    private final String f90147d;

    /* renamed from: e */
    private final boolean f90148e;

    /* renamed from: f */
    private final int f90149f;

    /* renamed from: g */
    private final long f90150g;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.b$a */
    public static final class C34556a {
        private C34556a() {
        }

        public /* synthetic */ C34556a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.model.b$b */
    static final class C34557b<TTaskResult, TContinuationResult> implements C1591g<C34382b, Object> {

        /* renamed from: a */
        final /* synthetic */ C34555b f90151a;

        C34557b(C34555b bVar) {
            this.f90151a = bVar;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m111733a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m111733a(C1592h<C34382b> hVar) {
            C7573i.m23582a((Object) hVar, "task");
            if (!hVar.mo6889d()) {
                this.f90151a.handleData((C34382b) hVar.mo6890e());
                if (this.f90151a.mNotifyListeners != null) {
                    for (C25678f b : this.f90151a.mNotifyListeners) {
                        b.mo56977b();
                    }
                }
            } else if (this.f90151a.mNotifyListeners != null) {
                for (C25678f a : this.f90151a.mNotifyListeners) {
                    a.mo57296a(hVar.mo6891f());
                }
            }
        }
    }

    public final boolean checkParams(Object... objArr) {
        C7573i.m23587b(objArr, "params");
        return true;
    }

    /* renamed from: a */
    public final void mo87857a() {
        this.f90145a = false;
        m111728a(0, 0);
    }

    /* renamed from: b */
    public final void mo87859b() {
        long j;
        this.f90145a = true;
        C34382b bVar = (C34382b) getData();
        long j2 = 0;
        if (bVar != null) {
            j = bVar.f89645c;
        } else {
            j = 0;
        }
        C34382b bVar2 = (C34382b) getData();
        if (bVar2 != null) {
            j2 = bVar2.f89646d;
        }
        m111728a(j, j2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00a6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void handleData(com.p280ss.android.ugc.aweme.notification.p1432a.C34382b r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L_0x0006
            r9.mData = r0
            return
        L_0x0006:
            java.util.List<com.ss.android.ugc.aweme.notification.a.a> r1 = r10.f89648f
            java.util.Collection r1 = (java.util.Collection) r1
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x0017
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0015
            goto L_0x0017
        L_0x0015:
            r1 = 0
            goto L_0x0018
        L_0x0017:
            r1 = 1
        L_0x0018:
            if (r1 == 0) goto L_0x001e
            r10.f89643a = r3
            goto L_0x00ab
        L_0x001e:
            java.util.List<com.ss.android.ugc.aweme.notification.a.a> r1 = r10.f89648f
            if (r1 == 0) goto L_0x005b
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.HashSet r4 = new java.util.HashSet
            r4.<init>()
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0032:
            boolean r6 = r1.hasNext()
            if (r6 == 0) goto L_0x0053
            java.lang.Object r6 = r1.next()
            r7 = r6
            com.ss.android.ugc.aweme.notification.a.a r7 = (com.p280ss.android.ugc.aweme.notification.p1432a.C34381a) r7
            com.ss.android.ugc.aweme.profile.model.User r7 = r7.f89641a
            if (r7 == 0) goto L_0x0048
            java.lang.String r7 = r7.getUid()
            goto L_0x0049
        L_0x0048:
            r7 = r0
        L_0x0049:
            boolean r7 = r4.add(r7)
            if (r7 == 0) goto L_0x0032
            r5.add(r6)
            goto L_0x0032
        L_0x0053:
            java.util.List r5 = (java.util.List) r5
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r1 = kotlin.collections.C7525m.m23509d(r5)
        L_0x005b:
            r10.f89648f = r1
            long r0 = r9.f90150g
            r4 = 0
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x009f
            java.util.List<com.ss.android.ugc.aweme.notification.a.a> r0 = r10.f89648f
            if (r0 == 0) goto L_0x009f
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L_0x0079
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L_0x0079
            goto L_0x009f
        L_0x0079:
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
        L_0x007e:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L_0x00a0
            java.lang.Object r4 = r0.next()
            com.ss.android.ugc.aweme.notification.a.a r4 = (com.p280ss.android.ugc.aweme.notification.p1432a.C34381a) r4
            long r4 = r4.f89642b
            long r6 = r9.f90150g
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L_0x0094
            r4 = 1
            goto L_0x0095
        L_0x0094:
            r4 = 0
        L_0x0095:
            if (r4 == 0) goto L_0x007e
            int r1 = r1 + 1
            if (r1 >= 0) goto L_0x007e
            kotlin.collections.C7525m.m23467c()
            goto L_0x007e
        L_0x009f:
            r1 = 0
        L_0x00a0:
            java.lang.Object r0 = r9.mData
            com.ss.android.ugc.aweme.notification.a.b r0 = (com.p280ss.android.ugc.aweme.notification.p1432a.C34382b) r0
            if (r0 == 0) goto L_0x00a8
            int r3 = r0.f89647e
        L_0x00a8:
            int r3 = r3 + r1
            r10.f89647e = r3
        L_0x00ab:
            r9.mData = r10
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.notification.newstyle.model.C34555b.handleData(com.ss.android.ugc.aweme.notification.a.b):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m111728a(long j, long j2) {
        NoticeApiManager.m111257a(j, j2, 20, this.f90148e, this.f90149f, this.f90147d).mo6876a((C1591g<TResult, TContinuationResult>) new C34557b<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    public C34555b(String str, boolean z, int i, long j) {
        C7573i.m23587b(str, "refId");
        this.f90147d = str;
        this.f90148e = z;
        this.f90149f = i;
        this.f90150g = j;
    }
}
