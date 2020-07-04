package com.bytedance.frameworks.baselib.p511a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.frameworks.baselib.p511a.C10071b.C10073b;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.a.f */
final class C10080f extends Thread {

    /* renamed from: a */
    private final Context f27426a;

    /* renamed from: b */
    private final Object f27427b = new Object();

    /* renamed from: c */
    private final AtomicBoolean f27428c;

    /* renamed from: d */
    private final C10069a f27429d;

    /* renamed from: e */
    private long f27430e = -1;

    /* renamed from: f */
    private long f27431f = 0;

    /* renamed from: g */
    private long f27432g = 120000;

    /* renamed from: h */
    private C10079e f27433h;

    /* renamed from: i */
    private final LinkedList<C10075c> f27434i;

    /* renamed from: e */
    private boolean m29951e() {
        return this.f27428c.get();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo24731a() {
        synchronized (this.f27427b) {
            this.f27427b.notify();
        }
    }

    /* renamed from: b */
    private void m29948b() {
        if (!m29951e()) {
            Map<String, C10071b> map = this.f27433h.f27421a;
            if (map != null && !map.isEmpty()) {
                for (String str : map.keySet()) {
                    if (m29951e()) {
                        break;
                    }
                    C10071b bVar = (C10071b) map.get(str);
                    if (bVar != null) {
                        C10073b bVar2 = bVar.f27406c;
                        if (bVar2 != null) {
                            this.f27429d.mo24723a(str, bVar2.mo23967c(), 604800000);
                        }
                    }
                }
            }
            this.f27429d.mo24723a(null, -1, 864000000);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002d, code lost:
        if (r0 == null) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0040, code lost:
        if (r6.f27429d.mo24720a(r0.f27417f, r0.f27413b) < Long.MAX_VALUE) goto L_0x004d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0042, code lost:
        r6.f27429d.mo24722a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0048, code lost:
        r6.f27429d.mo24722a();
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m29949c() {
        /*
            r6 = this;
            boolean r0 = r6.m29951e()
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            r0 = 0
            java.util.LinkedList<com.bytedance.frameworks.baselib.a.c> r2 = r6.f27434i
            monitor-enter(r2)
            boolean r3 = r6.m29951e()     // Catch:{ all -> 0x004e }
            if (r3 == 0) goto L_0x0014
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            return r1
        L_0x0014:
            java.util.LinkedList<com.bytedance.frameworks.baselib.a.c> r1 = r6.f27434i     // Catch:{ all -> 0x004e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x004e }
            if (r1 != 0) goto L_0x0024
            java.util.LinkedList<com.bytedance.frameworks.baselib.a.c> r0 = r6.f27434i     // Catch:{ all -> 0x004e }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x004e }
            com.bytedance.frameworks.baselib.a.c r0 = (com.bytedance.frameworks.baselib.p511a.C10075c) r0     // Catch:{ all -> 0x004e }
        L_0x0024:
            java.util.LinkedList<com.bytedance.frameworks.baselib.a.c> r1 = r6.f27434i     // Catch:{ all -> 0x004e }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x004e }
            r1 = r1 ^ 1
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            if (r0 == 0) goto L_0x004d
            com.bytedance.frameworks.baselib.a.a r2 = r6.f27429d     // Catch:{ SQLiteFullException -> 0x0048 }
            java.lang.String r3 = r0.f27417f     // Catch:{ SQLiteFullException -> 0x0048 }
            byte[] r0 = r0.f27413b     // Catch:{ SQLiteFullException -> 0x0048 }
            long r2 = r2.mo24720a(r3, r0)     // Catch:{ SQLiteFullException -> 0x0048 }
            r4 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x004d
            com.bytedance.frameworks.baselib.a.a r0 = r6.f27429d     // Catch:{ SQLiteFullException -> 0x0048 }
            r0.mo24722a()     // Catch:{ SQLiteFullException -> 0x0048 }
            goto L_0x004d
        L_0x0048:
            com.bytedance.frameworks.baselib.a.a r0 = r6.f27429d
            r0.mo24722a()
        L_0x004d:
            return r1
        L_0x004e:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x004e }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.p511a.C10080f.m29949c():boolean");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r6 = this;
        L_0x0000:
            boolean r0 = r6.m29951e()
            if (r0 != 0) goto L_0x0043
            boolean r0 = r6.m29949c()
            boolean r1 = r6.m29951e()
            if (r1 != 0) goto L_0x0043
            boolean r1 = r6.m29950d()
            if (r1 != 0) goto L_0x001b
            if (r0 == 0) goto L_0x0019
            goto L_0x001b
        L_0x0019:
            r0 = 0
            goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            boolean r1 = r6.m29951e()
            if (r1 != 0) goto L_0x0043
            if (r0 != 0) goto L_0x0000
            java.lang.Object r0 = r6.f27427b
            monitor-enter(r0)
            long r1 = r6.f27432g     // Catch:{ InterruptedException -> 0x003f }
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x0035
            java.lang.Object r1 = r6.f27427b     // Catch:{ InterruptedException -> 0x003f }
            r1.wait()     // Catch:{ InterruptedException -> 0x003f }
            goto L_0x003f
        L_0x0035:
            java.lang.Object r1 = r6.f27427b     // Catch:{ InterruptedException -> 0x003f }
            long r2 = r6.f27432g     // Catch:{ InterruptedException -> 0x003f }
            r1.wait(r2)     // Catch:{ InterruptedException -> 0x003f }
            goto L_0x003f
        L_0x003d:
            r1 = move-exception
            goto L_0x0041
        L_0x003f:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            goto L_0x0000
        L_0x0041:
            monitor-exit(r0)     // Catch:{ all -> 0x003d }
            throw r1
        L_0x0043:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.p511a.C10080f.run():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00bc, code lost:
        if ((r12 - r8.f27410g) >= r16) goto L_0x00c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x014a, code lost:
        r9 = r10;
     */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x0203  */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x0205  */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m29950d() {
        /*
            r27 = this;
            r1 = r27
            boolean r0 = r27.m29951e()
            r2 = 0
            if (r0 == 0) goto L_0x000a
            return r2
        L_0x000a:
            long r3 = r1.f27430e
            r5 = 0
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x002b
            long r3 = java.lang.System.currentTimeMillis()
            long r7 = r1.f27431f
            long r3 = r3 - r7
            r7 = 600000(0x927c0, double:2.964394E-318)
            int r0 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r0 <= 0) goto L_0x002b
            r1.f27430e = r5
            r27.m29948b()
            long r3 = java.lang.System.currentTimeMillis()
            r1.f27431f = r3
        L_0x002b:
            android.content.Context r0 = r1.f27426a
            boolean r0 = com.bytedance.frameworks.baselib.p511a.C10076d.m29938a(r0)
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            if (r0 != 0) goto L_0x0039
            r1.f27432g = r3
            return r2
        L_0x0039:
            com.bytedance.frameworks.baselib.a.a r0 = r1.f27429d
            long r7 = r1.f27430e
            com.bytedance.frameworks.baselib.a.c r7 = r0.mo24721a(r7)
            r0 = 0
            if (r7 != 0) goto L_0x0064
            long r7 = r1.f27430e
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 != 0) goto L_0x0057
            com.bytedance.frameworks.baselib.a.a r7 = r1.f27429d
            long r7 = r7.mo24719a(r0)
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x0057
            r1.f27432g = r5
            return r2
        L_0x0057:
            long r5 = r1.f27430e
            r7 = -1
            int r0 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r0 != 0) goto L_0x0061
            r1.f27432g = r3
        L_0x0061:
            r1.f27430e = r7
            return r2
        L_0x0064:
            long r8 = r1.f27430e
            long r10 = r7.f27412a
            int r12 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r12 >= 0) goto L_0x0071
            long r8 = r7.f27412a
            r1.f27430e = r8
            goto L_0x0078
        L_0x0071:
            long r8 = r1.f27430e
            r10 = 1
            long r8 = r8 + r10
            r1.f27430e = r8
        L_0x0078:
            byte[] r8 = r7.f27413b
            r9 = 1
            if (r8 == 0) goto L_0x01f7
            byte[] r8 = r7.f27413b
            int r8 = r8.length
            if (r8 > 0) goto L_0x0084
            goto L_0x01f7
        L_0x0084:
            com.bytedance.frameworks.baselib.a.e r8 = r1.f27433h
            java.lang.String r10 = r7.f27417f
            com.bytedance.frameworks.baselib.a.b r8 = r8.mo24728a(r10)
            if (r8 != 0) goto L_0x008f
            return r9
        L_0x008f:
            com.bytedance.frameworks.baselib.a.b$b r10 = r8.f27406c
            com.bytedance.frameworks.baselib.a.b$c r11 = r8.f27409f
            long r12 = java.lang.System.currentTimeMillis()
            long r14 = r10.mo23968d()
            if (r11 == 0) goto L_0x0181
            boolean r16 = r11.mo23969a()
            if (r16 == 0) goto L_0x00aa
            r19 = r10
            r11 = 1
        L_0x00a6:
            r18 = 0
            goto L_0x01fd
        L_0x00aa:
            long r16 = r11.mo23970b()
            long r2 = r8.f27411h
            int r0 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00c1
            r19 = r10
            long r9 = r8.f27410g
            long r9 = r12 - r9
            int r0 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x00bf
            goto L_0x00c3
        L_0x00bf:
            r2 = 1
            goto L_0x00d0
        L_0x00c1:
            r19 = r10
        L_0x00c3:
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00d1
            long r9 = r8.f27410g
            long r9 = r12 - r9
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r0 >= 0) goto L_0x00d1
            goto L_0x00bf
        L_0x00d0:
            return r2
        L_0x00d1:
            long r2 = java.lang.System.currentTimeMillis()
            r8.f27410g = r2
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ed
            int r0 = r7.f27415d
            if (r0 <= 0) goto L_0x00ed
            long r2 = r7.f27416e
            long r12 = r12 - r2
            int r0 = r7.f27415d
            long r2 = (long) r0
            long r14 = r14 * r2
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x00ed
            r2 = 1
            return r2
        L_0x00ed:
            r2 = 1
            java.lang.String r3 = r8.f27408e
            java.util.List r0 = r19.mo23966b()
            if (r0 != 0) goto L_0x00f7
            return r2
        L_0x00f7:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x0170 }
            if (r2 != 0) goto L_0x0105
            byte[] r2 = r7.f27413b     // Catch:{ Throwable -> 0x0170 }
            boolean r2 = m29947a(r8, r3, r2)     // Catch:{ Throwable -> 0x0170 }
            r9 = 1
            goto L_0x0107
        L_0x0105:
            r2 = 0
            r9 = 0
        L_0x0107:
            if (r2 != 0) goto L_0x016c
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Throwable -> 0x0169 }
            r10 = r2
            r2 = 0
        L_0x010f:
            boolean r12 = r4.hasNext()     // Catch:{ Throwable -> 0x0167 }
            if (r12 == 0) goto L_0x014a
            java.lang.Object r12 = r4.next()     // Catch:{ Throwable -> 0x0167 }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ Throwable -> 0x0167 }
            boolean r13 = r11.mo23971c()     // Catch:{ Throwable -> 0x0167 }
            if (r13 != 0) goto L_0x0123
            if (r9 != 0) goto L_0x014a
        L_0x0123:
            boolean r13 = r27.m29951e()     // Catch:{ Throwable -> 0x0167 }
            if (r13 == 0) goto L_0x012b
            r13 = 1
            return r13
        L_0x012b:
            boolean r13 = android.text.TextUtils.isEmpty(r12)     // Catch:{ Throwable -> 0x0167 }
            if (r13 != 0) goto L_0x0147
            boolean r13 = r12.equals(r3)     // Catch:{ Throwable -> 0x0167 }
            if (r13 == 0) goto L_0x0138
            goto L_0x0147
        L_0x0138:
            byte[] r9 = r7.f27413b     // Catch:{ Throwable -> 0x0167 }
            boolean r9 = m29947a(r8, r12, r9)     // Catch:{ Throwable -> 0x0167 }
            if (r9 == 0) goto L_0x0142
            r3 = r12
            goto L_0x014b
        L_0x0142:
            int r2 = r2 + 1
            r10 = r9
            r9 = 1
            goto L_0x010f
        L_0x0147:
            int r2 = r2 + 1
            goto L_0x010f
        L_0x014a:
            r9 = r10
        L_0x014b:
            int r4 = r0.size()     // Catch:{ Throwable -> 0x0164 }
            if (r2 != r4) goto L_0x015f
            int r0 = r0.size()     // Catch:{ Throwable -> 0x0164 }
            r2 = 1
            if (r0 <= r2) goto L_0x015f
            long r10 = r11.mo23972d()     // Catch:{ Throwable -> 0x0164 }
            r8.f27411h = r10     // Catch:{ Throwable -> 0x0164 }
            goto L_0x0161
        L_0x015f:
            r8.f27411h = r5     // Catch:{ Throwable -> 0x0164 }
        L_0x0161:
            r0 = r3
            r2 = r9
            goto L_0x017e
        L_0x0164:
            r0 = move-exception
            r10 = r9
            goto L_0x0172
        L_0x0167:
            r0 = move-exception
            goto L_0x0172
        L_0x0169:
            r0 = move-exception
            r10 = r2
            goto L_0x0172
        L_0x016c:
            r8.f27411h = r5     // Catch:{ Throwable -> 0x0169 }
            r0 = r3
            goto L_0x017e
        L_0x0170:
            r0 = move-exception
            r10 = 0
        L_0x0172:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "send log exception: "
            r2.<init>(r4)
            r2.append(r0)
            r0 = r3
            r2 = r10
        L_0x017e:
            r11 = r2
            goto L_0x00a6
        L_0x0181:
            r19 = r10
            int r0 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0199
            int r0 = r7.f27415d
            if (r0 <= 0) goto L_0x0199
            long r2 = r7.f27416e
            long r12 = r12 - r2
            int r0 = r7.f27415d
            long r2 = (long) r0
            long r14 = r14 * r2
            int r0 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r0 >= 0) goto L_0x0199
            r2 = 1
            return r2
        L_0x0199:
            r2 = 1
            java.lang.String r3 = r8.f27408e
            java.util.List r0 = r19.mo23966b()
            if (r0 != 0) goto L_0x01a3
            return r2
        L_0x01a3:
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Throwable -> 0x01e7 }
            if (r2 != 0) goto L_0x01b0
            byte[] r2 = r7.f27413b     // Catch:{ Throwable -> 0x01e7 }
            boolean r2 = m29947a(r8, r3, r2)     // Catch:{ Throwable -> 0x01e7 }
            goto L_0x01b1
        L_0x01b0:
            r2 = 0
        L_0x01b1:
            if (r2 != 0) goto L_0x01f3
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Throwable -> 0x01e5 }
        L_0x01b7:
            boolean r4 = r0.hasNext()     // Catch:{ Throwable -> 0x01e5 }
            if (r4 == 0) goto L_0x01f3
            java.lang.Object r4 = r0.next()     // Catch:{ Throwable -> 0x01e5 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x01e5 }
            boolean r9 = r27.m29951e()     // Catch:{ Throwable -> 0x01e5 }
            if (r9 == 0) goto L_0x01cb
            r9 = 1
            return r9
        L_0x01cb:
            boolean r9 = android.text.TextUtils.isEmpty(r4)     // Catch:{ Throwable -> 0x01e5 }
            if (r9 != 0) goto L_0x01b7
            boolean r9 = r4.equals(r3)     // Catch:{ Throwable -> 0x01e5 }
            if (r9 != 0) goto L_0x01b7
            byte[] r9 = r7.f27413b     // Catch:{ Throwable -> 0x01e5 }
            boolean r9 = m29947a(r8, r4, r9)     // Catch:{ Throwable -> 0x01e5 }
            if (r9 == 0) goto L_0x01e3
            r0 = r4
            r11 = r9
            goto L_0x00a6
        L_0x01e3:
            r2 = r9
            goto L_0x01b7
        L_0x01e5:
            r0 = move-exception
            goto L_0x01e9
        L_0x01e7:
            r0 = move-exception
            r2 = 0
        L_0x01e9:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r9 = "send log exception: "
            r4.<init>(r9)
            r4.append(r0)
        L_0x01f3:
            r11 = r2
            r0 = r3
            goto L_0x00a6
        L_0x01f7:
            r8 = r0
            r19 = r8
            r11 = 0
            r18 = 1
        L_0x01fd:
            boolean r2 = r27.m29951e()
            if (r2 == 0) goto L_0x0205
            r2 = 1
            return r2
        L_0x0205:
            if (r18 == 0) goto L_0x021a
            com.bytedance.frameworks.baselib.a.a r0 = r1.f27429d
            long r2 = r7.f27412a
            r23 = 1
            r24 = 0
            r26 = 0
            r20 = r0
            r21 = r2
            r20.mo24724a(r21, r23, r24, r26)
        L_0x0218:
            r2 = 1
            goto L_0x0252
        L_0x021a:
            if (r11 == 0) goto L_0x021e
            r8.f27408e = r0
        L_0x021e:
            com.bytedance.frameworks.baselib.a.a r8 = r1.f27429d
            long r9 = r7.f27412a
            r12 = 604800000(0x240c8400, double:2.988109026E-315)
            int r14 = r19.mo23967c()
            boolean r0 = r8.mo24724a(r9, r11, r12, r14)
            if (r0 == 0) goto L_0x024c
            long r2 = r19.mo23968d()
            int r0 = r7.f27415d
            r4 = 1
            int r0 = r0 + r4
            long r7 = (long) r0
            long r2 = r2 * r7
            int r0 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0240
            r1.f27432g = r2
        L_0x0240:
            long r2 = r1.f27432g
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            long r2 = java.lang.Math.min(r4, r2)
            r1.f27432g = r2
            goto L_0x0218
        L_0x024c:
            r4 = 120000(0x1d4c0, double:5.9288E-319)
            r1.f27432g = r4
            goto L_0x0218
        L_0x0252:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.p511a.C10080f.m29950d():boolean");
    }

    /* renamed from: a */
    private static boolean m29947a(C10071b bVar, String str, byte[] bArr) throws Throwable {
        if (bArr == null || bArr.length <= 0 || bVar == null || TextUtils.isEmpty(str)) {
            return false;
        }
        return bVar.mo23973a(str, bArr);
    }

    C10080f(Context context, C10079e eVar, LinkedList<C10075c> linkedList, AtomicBoolean atomicBoolean) {
        super("LogSender");
        this.f27433h = eVar;
        this.f27426a = context;
        this.f27434i = linkedList;
        this.f27428c = atomicBoolean;
        this.f27429d = C10069a.m29915a(this.f27426a);
    }
}
