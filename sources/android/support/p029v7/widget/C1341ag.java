package android.support.p029v7.widget;

import java.util.List;

/* renamed from: android.support.v7.widget.ag */
final class C1341ag {

    /* renamed from: a */
    final C1342a f5247a;

    /* renamed from: android.support.v7.widget.ag$a */
    interface C1342a {
        /* renamed from: a */
        C1389b mo6261a(int i, int i2, int i3, Object obj);

        /* renamed from: a */
        void mo6262a(C1389b bVar);
    }

    C1341ag(C1342a aVar) {
        this.f5247a = aVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6260a(List<C1389b> list) {
        while (true) {
            int b = m6618b(list);
            if (b != -1) {
                m6616a(list, b, b + 1);
            } else {
                return;
            }
        }
    }

    /* renamed from: b */
    private static int m6618b(List<C1389b> list) {
        boolean z = false;
        for (int size = list.size() - 1; size >= 0; size--) {
            if (((C1389b) list.get(size)).f5417a != 8) {
                z = true;
            } else if (z) {
                return size;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private void m6616a(List<C1389b> list, int i, int i2) {
        C1389b bVar = (C1389b) list.get(i);
        C1389b bVar2 = (C1389b) list.get(i2);
        int i3 = bVar2.f5417a;
        if (i3 != 4) {
            switch (i3) {
                case 1:
                    m6619b(list, i, bVar, i2, bVar2);
                    return;
                case 2:
                    m6617a(list, i, bVar, i2, bVar2);
                    return;
            }
        } else {
            m6620c(list, i, bVar, i2, bVar2);
        }
    }

    /* renamed from: b */
    private static void m6619b(List<C1389b> list, int i, C1389b bVar, int i2, C1389b bVar2) {
        int i3;
        if (bVar.f5420d < bVar2.f5418b) {
            i3 = -1;
        } else {
            i3 = 0;
        }
        if (bVar.f5418b < bVar2.f5418b) {
            i3++;
        }
        if (bVar2.f5418b <= bVar.f5418b) {
            bVar.f5418b += bVar2.f5420d;
        }
        if (bVar2.f5418b <= bVar.f5420d) {
            bVar.f5420d += bVar2.f5420d;
        }
        bVar2.f5418b += i3;
        list.set(i, bVar2);
        list.set(i2, bVar);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6620c(java.util.List<android.support.p029v7.widget.C1387c.C1389b> r8, int r9, android.support.p029v7.widget.C1387c.C1389b r10, int r11, android.support.p029v7.widget.C1387c.C1389b r12) {
        /*
            r7 = this;
            int r0 = r10.f5420d
            int r1 = r12.f5418b
            r2 = 4
            r3 = 0
            r4 = 1
            if (r0 >= r1) goto L_0x000f
            int r0 = r12.f5418b
            int r0 = r0 - r4
            r12.f5418b = r0
            goto L_0x0028
        L_0x000f:
            int r0 = r10.f5420d
            int r1 = r12.f5418b
            int r5 = r12.f5420d
            int r1 = r1 + r5
            if (r0 >= r1) goto L_0x0028
            int r0 = r12.f5420d
            int r0 = r0 - r4
            r12.f5420d = r0
            android.support.v7.widget.ag$a r0 = r7.f5247a
            int r1 = r10.f5418b
            java.lang.Object r5 = r12.f5419c
            android.support.v7.widget.c$b r0 = r0.mo6261a(r2, r1, r4, r5)
            goto L_0x0029
        L_0x0028:
            r0 = r3
        L_0x0029:
            int r1 = r10.f5418b
            int r5 = r12.f5418b
            if (r1 > r5) goto L_0x0035
            int r1 = r12.f5418b
            int r1 = r1 + r4
            r12.f5418b = r1
            goto L_0x0056
        L_0x0035:
            int r1 = r10.f5418b
            int r5 = r12.f5418b
            int r6 = r12.f5420d
            int r5 = r5 + r6
            if (r1 >= r5) goto L_0x0056
            int r1 = r12.f5418b
            int r3 = r12.f5420d
            int r1 = r1 + r3
            int r3 = r10.f5418b
            int r1 = r1 - r3
            android.support.v7.widget.ag$a r3 = r7.f5247a
            int r5 = r10.f5418b
            int r5 = r5 + r4
            java.lang.Object r4 = r12.f5419c
            android.support.v7.widget.c$b r3 = r3.mo6261a(r2, r5, r1, r4)
            int r2 = r12.f5420d
            int r2 = r2 - r1
            r12.f5420d = r2
        L_0x0056:
            r8.set(r11, r10)
            int r10 = r12.f5420d
            if (r10 <= 0) goto L_0x0061
            r8.set(r9, r12)
            goto L_0x0069
        L_0x0061:
            r8.remove(r9)
            android.support.v7.widget.ag$a r10 = r7.f5247a
            r10.mo6262a(r12)
        L_0x0069:
            if (r0 == 0) goto L_0x006e
            r8.add(r9, r0)
        L_0x006e:
            if (r3 == 0) goto L_0x0073
            r8.add(r9, r3)
        L_0x0073:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.C1341ag.m6620c(java.util.List, int, android.support.v7.widget.c$b, int, android.support.v7.widget.c$b):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0097  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m6617a(java.util.List<android.support.p029v7.widget.C1387c.C1389b> r9, int r10, android.support.p029v7.widget.C1387c.C1389b r11, int r12, android.support.p029v7.widget.C1387c.C1389b r13) {
        /*
            r8 = this;
            int r0 = r11.f5418b
            int r1 = r11.f5420d
            r2 = 0
            r3 = 1
            if (r0 >= r1) goto L_0x001c
            int r0 = r13.f5418b
            int r1 = r11.f5418b
            if (r0 != r1) goto L_0x001a
            int r0 = r13.f5420d
            int r1 = r11.f5420d
            int r4 = r11.f5418b
            int r1 = r1 - r4
            if (r0 != r1) goto L_0x001a
            r0 = 0
        L_0x0018:
            r2 = 1
            goto L_0x002f
        L_0x001a:
            r0 = 0
            goto L_0x002f
        L_0x001c:
            int r0 = r13.f5418b
            int r1 = r11.f5420d
            int r1 = r1 + r3
            if (r0 != r1) goto L_0x002e
            int r0 = r13.f5420d
            int r1 = r11.f5418b
            int r4 = r11.f5420d
            int r1 = r1 - r4
            if (r0 != r1) goto L_0x002e
            r0 = 1
            goto L_0x0018
        L_0x002e:
            r0 = 1
        L_0x002f:
            int r1 = r11.f5420d
            int r4 = r13.f5418b
            r5 = 2
            if (r1 >= r4) goto L_0x003c
            int r1 = r13.f5418b
            int r1 = r1 - r3
            r13.f5418b = r1
            goto L_0x005b
        L_0x003c:
            int r1 = r11.f5420d
            int r4 = r13.f5418b
            int r6 = r13.f5420d
            int r4 = r4 + r6
            if (r1 >= r4) goto L_0x005b
            int r10 = r13.f5420d
            int r10 = r10 - r3
            r13.f5420d = r10
            r11.f5417a = r5
            r11.f5420d = r3
            int r10 = r13.f5420d
            if (r10 != 0) goto L_0x005a
            r9.remove(r12)
            android.support.v7.widget.ag$a r9 = r8.f5247a
            r9.mo6262a(r13)
        L_0x005a:
            return
        L_0x005b:
            int r1 = r11.f5418b
            int r4 = r13.f5418b
            r6 = 0
            if (r1 > r4) goto L_0x0068
            int r1 = r13.f5418b
            int r1 = r1 + r3
            r13.f5418b = r1
            goto L_0x0089
        L_0x0068:
            int r1 = r11.f5418b
            int r4 = r13.f5418b
            int r7 = r13.f5420d
            int r4 = r4 + r7
            if (r1 >= r4) goto L_0x0089
            int r1 = r13.f5418b
            int r4 = r13.f5420d
            int r1 = r1 + r4
            int r4 = r11.f5418b
            int r1 = r1 - r4
            android.support.v7.widget.ag$a r4 = r8.f5247a
            int r7 = r11.f5418b
            int r7 = r7 + r3
            android.support.v7.widget.c$b r6 = r4.mo6261a(r5, r7, r1, r6)
            int r1 = r11.f5418b
            int r3 = r13.f5418b
            int r1 = r1 - r3
            r13.f5420d = r1
        L_0x0089:
            if (r2 == 0) goto L_0x0097
            r9.set(r10, r13)
            r9.remove(r12)
            android.support.v7.widget.ag$a r9 = r8.f5247a
            r9.mo6262a(r11)
            return
        L_0x0097:
            if (r0 == 0) goto L_0x00d0
            if (r6 == 0) goto L_0x00b5
            int r0 = r11.f5418b
            int r1 = r6.f5418b
            if (r0 <= r1) goto L_0x00a8
            int r0 = r11.f5418b
            int r1 = r6.f5420d
            int r0 = r0 - r1
            r11.f5418b = r0
        L_0x00a8:
            int r0 = r11.f5420d
            int r1 = r6.f5418b
            if (r0 <= r1) goto L_0x00b5
            int r0 = r11.f5420d
            int r1 = r6.f5420d
            int r0 = r0 - r1
            r11.f5420d = r0
        L_0x00b5:
            int r0 = r11.f5418b
            int r1 = r13.f5418b
            if (r0 <= r1) goto L_0x00c2
            int r0 = r11.f5418b
            int r1 = r13.f5420d
            int r0 = r0 - r1
            r11.f5418b = r0
        L_0x00c2:
            int r0 = r11.f5420d
            int r1 = r13.f5418b
            if (r0 <= r1) goto L_0x0106
            int r0 = r11.f5420d
            int r1 = r13.f5420d
            int r0 = r0 - r1
            r11.f5420d = r0
            goto L_0x0106
        L_0x00d0:
            if (r6 == 0) goto L_0x00ec
            int r0 = r11.f5418b
            int r1 = r6.f5418b
            if (r0 < r1) goto L_0x00df
            int r0 = r11.f5418b
            int r1 = r6.f5420d
            int r0 = r0 - r1
            r11.f5418b = r0
        L_0x00df:
            int r0 = r11.f5420d
            int r1 = r6.f5418b
            if (r0 < r1) goto L_0x00ec
            int r0 = r11.f5420d
            int r1 = r6.f5420d
            int r0 = r0 - r1
            r11.f5420d = r0
        L_0x00ec:
            int r0 = r11.f5418b
            int r1 = r13.f5418b
            if (r0 < r1) goto L_0x00f9
            int r0 = r11.f5418b
            int r1 = r13.f5420d
            int r0 = r0 - r1
            r11.f5418b = r0
        L_0x00f9:
            int r0 = r11.f5420d
            int r1 = r13.f5418b
            if (r0 < r1) goto L_0x0106
            int r0 = r11.f5420d
            int r1 = r13.f5420d
            int r0 = r0 - r1
            r11.f5420d = r0
        L_0x0106:
            r9.set(r10, r13)
            int r13 = r11.f5418b
            int r0 = r11.f5420d
            if (r13 == r0) goto L_0x0113
            r9.set(r12, r11)
            goto L_0x0116
        L_0x0113:
            r9.remove(r12)
        L_0x0116:
            if (r6 == 0) goto L_0x011b
            r9.add(r10, r6)
        L_0x011b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.C1341ag.m6617a(java.util.List, int, android.support.v7.widget.c$b, int, android.support.v7.widget.c$b):void");
    }
}
