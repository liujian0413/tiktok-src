package com.bytedance.apm.p238b.p466b;

import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.p238b.C6171a;
import com.bytedance.apm.p238b.p467c.C9586i;
import com.bytedance.apm.p245h.C9603b;
import com.bytedance.apm.p252m.C6273b;
import com.bytedance.apm.util.C6292i;
import com.bytedance.frameworks.core.apm.p257a.p259b.C6357a;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.bytedance.apm.b.b.a */
public final class C9571a {

    /* renamed from: a */
    public volatile boolean f26147a;

    /* renamed from: b */
    public String f26148b;

    /* renamed from: c */
    public final LinkedList<C9603b> f26149c;

    /* renamed from: d */
    private String f26150d;

    /* renamed from: e */
    private C6357a f26151e;

    /* renamed from: com.bytedance.apm.b.b.a$a */
    static class C9574a {

        /* renamed from: a */
        public static final C9571a f26155a = new C9571a();
    }

    /* renamed from: a */
    public static C9571a m28319a() {
        return C9574a.f26155a;
    }

    private C9571a() {
        this.f26148b = "";
        this.f26149c = new LinkedList<>();
    }

    /* renamed from: d */
    private C6357a m28325d() {
        if (this.f26151e == null) {
            this.f26151e = C6357a.m19743f();
        }
        return this.f26151e;
    }

    /* renamed from: b */
    public final void mo23886b() {
        C6273b.m19475a().mo15066a((Runnable) new Runnable() {
            public final void run() {
                LinkedList linkedList;
                C9571a.this.mo23888c();
                C9571a.this.f26147a = true;
                synchronized (C9571a.this.f26149c) {
                    linkedList = new LinkedList(C9571a.this.f26149c);
                    C9571a.this.f26149c.clear();
                }
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    C9571a.this.mo23885a((C9603b) it.next());
                }
            }
        });
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo23888c() {
        boolean z;
        if (C6174c.m19145c()) {
            C9575b bVar = new C9575b();
            List a = m28320a(true, 0);
            if (!C6292i.m19525a(a)) {
                try {
                    z = m28322a(bVar, a);
                } catch (Exception unused) {
                    z = false;
                }
                C9603b bVar2 = (C9603b) a.get(a.size() - 1);
                long j = bVar2.f26256a;
                long j2 = bVar2.f26258c;
                if (!z) {
                    if (C6174c.m19149g()) {
                        new String[1][0] = "report main proccess data failed, clean data and stop calc data of other process";
                    }
                    m28321a(j);
                    return;
                }
                if (C6174c.m19149g()) {
                    new String[1][0] = "report main proccess data over, begin handle other process data";
                }
                List<C9603b> a2 = m28320a(false, j2);
                HashMap hashMap = new HashMap(4);
                for (C9603b bVar3 : a2) {
                    String str = bVar3.f26265j;
                    if (hashMap.containsKey(str)) {
                        ((List) hashMap.get(str)).add(bVar3);
                    } else {
                        LinkedList linkedList = new LinkedList();
                        linkedList.add(bVar3);
                        hashMap.put(str, linkedList);
                    }
                }
                try {
                    for (List a3 : hashMap.values()) {
                        m28322a(bVar, a3);
                    }
                } catch (Exception unused2) {
                }
                bVar.mo23893b();
                m28321a(j);
            }
        }
    }

    /* renamed from: a */
    private void m28321a(long j) {
        try {
            m28325d().mo15264b(j);
        } catch (Exception unused) {
        }
    }

    /* renamed from: c */
    private void m28324c(C9603b bVar) {
        try {
            if (C6174c.m19149g()) {
                StringBuilder sb = new StringBuilder("saveBatteryLog into db: ");
                sb.append(bVar);
                String[] strArr = {sb.toString()};
            }
            m28325d().mo15262a(bVar);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo23885a(final C9603b bVar) {
        if (bVar != null) {
            if (C6174c.m19149g()) {
                StringBuilder sb = new StringBuilder("record batteryLog: ");
                sb.append(bVar.toString());
                String[] strArr = {sb.toString()};
            }
            C6273b.m19475a().mo15066a((Runnable) new Runnable() {
                public final void run() {
                    C9571a.this.mo23887b(bVar);
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo23887b(C9603b bVar) {
        if (C6174c.m19149g()) {
            StringBuilder sb = new StringBuilder("record batteryLog: ");
            sb.append(bVar.toString());
            sb.append(" , mReportedInMainProcess: ");
            sb.append(this.f26147a);
            String[] strArr = {sb.toString()};
        }
        if (this.f26147a || !C6174c.m19145c()) {
            if (TextUtils.isEmpty(this.f26150d)) {
                this.f26150d = String.valueOf(System.currentTimeMillis());
            }
            bVar.f26266k = C6174c.m19145c();
            bVar.f26265j = C6174c.m19141b();
            bVar.f26267l = this.f26150d;
            if (TextUtils.isEmpty(bVar.f26261f)) {
                bVar.f26261f = this.f26148b;
            }
            m28324c(bVar);
            return;
        }
        bVar.f26261f = this.f26148b;
        synchronized (this.f26149c) {
            if (this.f26149c.size() > 100) {
                this.f26149c.poll();
            }
            this.f26149c.add(bVar);
        }
    }

    /* renamed from: a */
    private List<C9603b> m28320a(boolean z, long j) {
        try {
            return m28325d().mo15263a(z, j);
        } catch (Exception unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    private boolean m28322a(C9575b bVar, List<C9603b> list) throws Exception {
        boolean z;
        m28323b(bVar, list);
        int i = 0;
        if (!bVar.f26173o || (bVar.mo23894c() && bVar.mo23895d())) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            bVar.mo23891a();
            if (C6174c.m19149g()) {
                new String[1][0] = "main process front or back duration is not valid, stop report ";
            }
            return false;
        }
        List<C9586i> list2 = C6171a.m19119a().f18152a;
        int size = list.size();
        int i2 = bVar.f26161c;
        int i3 = bVar.f26162d;
        if (i3 - i2 <= 0) {
            return false;
        }
        if (i2 >= 0 && i2 < size) {
            i = i2;
        }
        if (i3 <= 0 || i3 >= size) {
            i3 = size - 1;
        }
        for (C9586i a : list2) {
            a.mo23906a(bVar, list, i, i3);
        }
        return bVar.mo23892a(true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ab  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m28323b(com.bytedance.apm.p238b.p466b.C9575b r27, java.util.List<com.bytedance.apm.p245h.C9603b> r28) {
        /*
            r0 = r27
            r1 = r28
            int r2 = r28.size()
            int r3 = r28.size()
            r4 = 1
            int r3 = r3 - r4
            java.lang.StringBuffer r5 = new java.lang.StringBuffer
            r5.<init>()
            r10 = 0
            r15 = r3
            r12 = r10
            r3 = 0
            r4 = -1
            r6 = 0
            r10 = 0
            r13 = 0
            r16 = 0
            r18 = 0
            r20 = 0
        L_0x0024:
            if (r3 >= r2) goto L_0x00e6
            java.lang.Object r22 = r1.get(r3)
            r8 = r22
            com.bytedance.apm.h.b r8 = (com.bytedance.apm.p245h.C9603b) r8
            java.lang.String r9 = r8.f26259d
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x00d9
            java.lang.String r9 = r8.f26267l
            if (r12 != 0) goto L_0x0045
            r5.append(r9)
            java.lang.String r12 = ","
            r5.append(r12)
        L_0x0042:
            r25 = r2
            goto L_0x0074
        L_0x0045:
            if (r12 == 0) goto L_0x0042
            boolean r22 = android.text.TextUtils.equals(r12, r9)
            if (r22 != 0) goto L_0x0042
            r22 = 0
            int r16 = (r10 > r22 ? 1 : (r10 == r22 ? 0 : -1))
            if (r16 <= 0) goto L_0x0062
            java.lang.Object r16 = r1.get(r15)
            r25 = r2
            r2 = r16
            com.bytedance.apm.h.b r2 = (com.bytedance.apm.p245h.C9603b) r2
            long r0 = r2.f26258c
            long r0 = r0 - r10
            long r13 = r13 + r0
            goto L_0x0064
        L_0x0062:
            r25 = r2
        L_0x0064:
            r5.append(r12)
            java.lang.String r0 = ","
            r5.append(r0)
            r10 = 0
            r16 = 0
            r18 = 0
            r20 = 0
        L_0x0074:
            boolean r0 = r8.mo23950a()
            if (r0 == 0) goto L_0x00ab
            r0 = 0
            int r2 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x00a6
            long r10 = r8.f26258c
            int r2 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            if (r2 <= 0) goto L_0x009f
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 != 0) goto L_0x009f
            r26 = r9
            long r8 = r8.f26258c
            long r20 = r8 - r18
            int r2 = (r20 > r0 ? 1 : (r20 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x009c
            long r6 = r6 + r20
            r0 = -1
            r18 = 0
            r20 = 0
            goto L_0x00a2
        L_0x009c:
            r20 = r8
            goto L_0x00a1
        L_0x009f:
            r26 = r9
        L_0x00a1:
            r0 = -1
        L_0x00a2:
            if (r4 != r0) goto L_0x00a9
            r4 = r3
            goto L_0x00a9
        L_0x00a6:
            r26 = r9
            r0 = -1
        L_0x00a9:
            r15 = r3
            goto L_0x00d6
        L_0x00ab:
            r26 = r9
            r0 = -1
            boolean r1 = r8.f26257b
            if (r1 == 0) goto L_0x00d6
            r23 = 0
            int r1 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            if (r1 != 0) goto L_0x00d6
            int r1 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r1 <= 0) goto L_0x00d6
            long r1 = r8.f26258c
            long r16 = r1 - r10
            int r9 = (r16 > r23 ? 1 : (r16 == r23 ? 0 : -1))
            if (r9 < 0) goto L_0x00c9
            long r13 = r13 + r16
            r1 = r23
            r10 = r1
        L_0x00c9:
            int r9 = (r18 > r23 ? 1 : (r18 == r23 ? 0 : -1))
            if (r9 != 0) goto L_0x00d4
            long r8 = r8.f26258c
            r16 = r1
            r18 = r8
            goto L_0x00d6
        L_0x00d4:
            r16 = r1
        L_0x00d6:
            r12 = r26
            goto L_0x00dc
        L_0x00d9:
            r25 = r2
            r0 = -1
        L_0x00dc:
            int r3 = r3 + 1
            r2 = r25
            r0 = r27
            r1 = r28
            goto L_0x0024
        L_0x00e6:
            r1 = 0
            int r0 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00f9
            r0 = r28
            java.lang.Object r1 = r0.get(r15)
            com.bytedance.apm.h.b r1 = (com.bytedance.apm.p245h.C9603b) r1
            long r1 = r1.f26258c
            long r1 = r1 - r10
            long r13 = r13 + r1
            goto L_0x00fb
        L_0x00f9:
            r0 = r28
        L_0x00fb:
            r1 = r27
            r1.f26159a = r6
            r1.f26160b = r13
            r1.f26161c = r4
            r1.f26162d = r15
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.bytedance.apm.h.b r0 = (com.bytedance.apm.p245h.C9603b) r0
            boolean r2 = r0.f26266k
            r1.f26173o = r2
            java.lang.String r2 = r0.f26265j
            r1.f26174p = r2
            java.lang.String r2 = r5.toString()
            r1.f26175q = r2
            boolean r1 = com.bytedance.apm.C6174c.m19149g()
            if (r1 == 0) goto L_0x0146
            r1 = 1
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "computeValidIndexAndDuration ret, frontDuraion: "
            r2.<init>(r3)
            r2.append(r6)
            java.lang.String r3 = "ms, backTotalDuration: "
            r2.append(r3)
            r2.append(r13)
            java.lang.String r3 = " ms, processName: "
            r2.append(r3)
            java.lang.String r0 = r0.f26265j
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r2 = 0
            r1[r2] = r0
        L_0x0146:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.apm.p238b.p466b.C9571a.m28323b(com.bytedance.apm.b.b.b, java.util.List):void");
    }
}
