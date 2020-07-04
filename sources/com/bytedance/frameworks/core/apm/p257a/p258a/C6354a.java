package com.bytedance.frameworks.core.apm.p257a.p258a;

import android.content.ContentValues;
import android.text.TextUtils;
import com.bytedance.apm.C6174c;
import com.bytedance.apm.C6179d;
import com.bytedance.apm.p245h.C6213e;
import com.bytedance.apm.util.C6292i;
import com.bytedance.frameworks.core.apm.p257a.C6350a;
import com.bytedance.frameworks.core.apm.p257a.C6350a.C6352a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.frameworks.core.apm.a.a.a */
public abstract class C6354a<T extends C6213e> extends C6350a<T> implements C6352a<T> {

    /* renamed from: a */
    private long f18629a = -1;

    /* renamed from: b */
    private int f18630b;

    /* renamed from: h */
    private synchronized long m19719h() {
        return mo15245b("is_sampled = 1", null);
    }

    /* renamed from: g */
    public final synchronized int mo15261g() {
        return mo15237a("is_sampled = 1", null);
    }

    /* renamed from: f */
    public final synchronized long mo15260f() {
        if (C6174c.m19149g()) {
            StringBuilder sb = new StringBuilder();
            sb.append(getClass().getSimpleName());
            sb.append(" -> getLogSampledCount, mTotalSampleCount: ");
            sb.append(this.f18629a);
            sb.append(" , mFastReadSampleTimes: ");
            sb.append(this.f18630b);
            m19718b(sb.toString());
        }
        if (this.f18629a >= 0) {
            if (this.f18630b <= 10) {
                this.f18630b++;
            }
        }
        this.f18629a = m19719h();
        this.f18630b = 0;
        return this.f18629a;
    }

    /* renamed from: b */
    private static void m19718b(String str) {
        new String[1][0] = str;
    }

    /* renamed from: c */
    public final synchronized int mo15259c(List<Long> list) {
        if (C6292i.m19525a(list)) {
            return -1;
        }
        int a = mo15253a(C6292i.m19523a(list, ","));
        this.f18629a -= (long) a;
        return a;
    }

    /* renamed from: a */
    public final synchronized int mo15253a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        StringBuilder sb = new StringBuilder("_id in ( ");
        sb.append(str);
        sb.append(" )");
        return mo15237a(sb.toString(), null);
    }

    /* renamed from: b */
    public final synchronized int mo15257b(long j) {
        if (j == -1) {
            return mo15237a("is_sampled = 0", null);
        }
        return mo15237a("is_sampled = 0 AND timestamp < ? ", new String[]{String.valueOf(j)});
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0029, code lost:
        return r2;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo15254a(T r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            r0 = -1
            if (r9 != 0) goto L_0x0007
            monitor-exit(r8)
            return r0
        L_0x0007:
            android.content.ContentValues r2 = r8.mo15239a(r9)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            if (r2 != 0) goto L_0x000f
            monitor-exit(r8)
            return r0
        L_0x000f:
            long r2 = r8.mo15238a(r2)     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            boolean r9 = r9.f18299l     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            if (r9 == 0) goto L_0x0028
            long r4 = r8.f18629a     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r6 = 0
            int r9 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r9 >= 0) goto L_0x0021
            r8.f18629a = r6     // Catch:{ Exception -> 0x002d, all -> 0x002a }
        L_0x0021:
            long r4 = r8.f18629a     // Catch:{ Exception -> 0x002d, all -> 0x002a }
            r6 = 1
            long r4 = r4 + r6
            r8.f18629a = r4     // Catch:{ Exception -> 0x002d, all -> 0x002a }
        L_0x0028:
            monitor-exit(r8)
            return r2
        L_0x002a:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        L_0x002d:
            monitor-exit(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.p257a.p258a.C6354a.mo15254a(com.bytedance.apm.h.e):long");
    }

    /* renamed from: b */
    public final synchronized void mo15258b(List<T> list) {
        Object obj;
        if (!C6292i.m19525a(list)) {
            int size = list.size();
            int i = ((size - 1) / 50) + 1;
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = i2 * 50;
                int min = Math.min(i3 + 50, size);
                ArrayList arrayList = new ArrayList(min - i3);
                while (i3 < min) {
                    C6213e eVar = (C6213e) list.get(i3);
                    try {
                        obj = mo15239a(eVar);
                    } catch (Throwable th) {
                        C6179d a = C6179d.m19171a();
                        StringBuilder sb = new StringBuilder("apm_AbsLogDao_");
                        sb.append(eVar.f18294g);
                        sb.append(eVar.f18295h);
                        a.mo14890a(th, sb.toString());
                        obj = null;
                    }
                    if (obj == null) {
                        list.set(i3, null);
                    } else {
                        arrayList.add(obj);
                        if (eVar.f18299l) {
                            if (this.f18629a < 0) {
                                this.f18629a = 0;
                            }
                            this.f18629a++;
                        }
                        list.set(i3, null);
                    }
                    i3++;
                }
                mo15243a((List<ContentValues>) arrayList);
                arrayList.clear();
            }
            list.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0072, code lost:
        return java.util.Collections.emptyList();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:14:0x006d */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<? extends com.bytedance.apm.p245h.C6213e> mo15256a(java.util.List<java.lang.String> r7, int r8) {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "is_sampled = ? "
            boolean r1 = com.bytedance.apm.util.C6292i.m19525a(r7)     // Catch:{ Throwable -> 0x006d }
            r2 = 0
            r3 = 1
            if (r1 != 0) goto L_0x0051
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006d }
            r1.<init>()     // Catch:{ Throwable -> 0x006d }
            r1.append(r0)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = " AND type IN ( "
            r1.append(r0)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = ","
            int r4 = r7.size()     // Catch:{ Throwable -> 0x006d }
            java.lang.String r5 = "?"
            java.util.List r4 = java.util.Collections.nCopies(r4, r5)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = android.text.TextUtils.join(r0, r4)     // Catch:{ Throwable -> 0x006d }
            r1.append(r0)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = " ) "
            r1.append(r0)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r0 = r1.toString()     // Catch:{ Throwable -> 0x006d }
            int r1 = r7.size()     // Catch:{ Throwable -> 0x006d }
            int r1 = r1 + r3
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch:{ Throwable -> 0x006d }
            java.lang.String r3 = "1"
            r1[r2] = r3     // Catch:{ Throwable -> 0x006d }
        L_0x003f:
            int r3 = r7.size()     // Catch:{ Throwable -> 0x006d }
            if (r2 >= r3) goto L_0x0057
            int r3 = r2 + 1
            java.lang.Object r2 = r7.get(r2)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ Throwable -> 0x006d }
            r1[r3] = r2     // Catch:{ Throwable -> 0x006d }
            r2 = r3
            goto L_0x003f
        L_0x0051:
            java.lang.String[] r1 = new java.lang.String[r3]     // Catch:{ Throwable -> 0x006d }
            java.lang.String r7 = "1"
            r1[r2] = r7     // Catch:{ Throwable -> 0x006d }
        L_0x0057:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x006d }
            java.lang.String r2 = "_id ASC  LIMIT "
            r7.<init>(r2)     // Catch:{ Throwable -> 0x006d }
            r7.append(r8)     // Catch:{ Throwable -> 0x006d }
            java.lang.String r7 = r7.toString()     // Catch:{ Throwable -> 0x006d }
            java.util.List r7 = r6.mo15241a(r0, r1, r7, r6)     // Catch:{ Throwable -> 0x006d }
            monitor-exit(r6)
            return r7
        L_0x006b:
            r7 = move-exception
            goto L_0x0073
        L_0x006d:
            java.util.List r7 = java.util.Collections.emptyList()     // Catch:{ all -> 0x006b }
            monitor-exit(r6)
            return r7
        L_0x0073:
            monitor-exit(r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.p257a.p258a.C6354a.mo15256a(java.util.List, int):java.util.List");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:15|16|17|18) */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0061, code lost:
        return java.util.Collections.emptyList();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x005c */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized java.util.List<T> mo15255a(long r2, long r4, java.lang.String r6, java.lang.String r7) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r6)     // Catch:{ all -> 0x0062 }
            if (r0 == 0) goto L_0x000d
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)
            return r2
        L_0x000d:
            r0 = 3
            java.lang.String[] r0 = new java.lang.String[r0]     // Catch:{ Throwable -> 0x005c }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ Throwable -> 0x005c }
            r3 = 0
            r0[r3] = r2     // Catch:{ Throwable -> 0x005c }
            java.lang.String r2 = java.lang.String.valueOf(r4)     // Catch:{ Throwable -> 0x005c }
            r4 = 1
            r0[r4] = r2     // Catch:{ Throwable -> 0x005c }
            r2 = 2
            r0[r2] = r6     // Catch:{ Throwable -> 0x005c }
            java.lang.String r5 = ","
            java.lang.String[] r5 = r7.split(r5)     // Catch:{ Throwable -> 0x005c }
            java.lang.String r6 = ""
            int r7 = r5.length     // Catch:{ Throwable -> 0x005c }
            if (r7 != r2) goto L_0x0046
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x005c }
            java.lang.String r6 = " LIMIT "
            r2.<init>(r6)     // Catch:{ Throwable -> 0x005c }
            r4 = r5[r4]     // Catch:{ Throwable -> 0x005c }
            r2.append(r4)     // Catch:{ Throwable -> 0x005c }
            java.lang.String r4 = " OFFSET "
            r2.append(r4)     // Catch:{ Throwable -> 0x005c }
            r3 = r5[r3]     // Catch:{ Throwable -> 0x005c }
            r2.append(r3)     // Catch:{ Throwable -> 0x005c }
            java.lang.String r6 = r2.toString()     // Catch:{ Throwable -> 0x005c }
        L_0x0046:
            java.lang.String r2 = "timestamp >= ? AND timestamp <= ?  AND type2 = ? "
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x005c }
            java.lang.String r4 = "_id ASC "
            r3.<init>(r4)     // Catch:{ Throwable -> 0x005c }
            r3.append(r6)     // Catch:{ Throwable -> 0x005c }
            java.lang.String r3 = r3.toString()     // Catch:{ Throwable -> 0x005c }
            java.util.List r2 = r1.mo15241a(r2, r0, r3, r1)     // Catch:{ Throwable -> 0x005c }
            monitor-exit(r1)
            return r2
        L_0x005c:
            java.util.List r2 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0062 }
            monitor-exit(r1)
            return r2
        L_0x0062:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.core.apm.p257a.p258a.C6354a.mo15255a(long, long, java.lang.String, java.lang.String):java.util.List");
    }
}
