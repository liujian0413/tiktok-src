package com.bytedance.frameworks.apm.trace;

import com.bytedance.apm.C6174c;
import com.bytedance.frameworks.apm.trace.C10066g.C10067a;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.bytedance.frameworks.apm.trace.a */
public final class C10057a implements Runnable {

    /* renamed from: a */
    private final long[] f27362a;

    /* renamed from: b */
    private final C10058b f27363b;

    /* renamed from: c */
    private final LinkedList<C10065f> f27364c = new LinkedList<>();

    /* renamed from: d */
    private C10067a f27365d;

    /* renamed from: e */
    private int f27366e;

    /* renamed from: a */
    private static long m29867a(long j) {
        return j & 8796093022207L;
    }

    /* renamed from: b */
    private static int m29876b(long j) {
        return (int) ((j >> 43) & 1048575);
    }

    /* renamed from: c */
    private static boolean m29877c(long j) {
        return ((j >> 63) & 1) == 1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00a8, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m29874a(long[] r23) {
        /*
            r22 = this;
            r6 = r22
            r0 = r23
            java.util.LinkedList r1 = new java.util.LinkedList
            r1.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            int r3 = r0.length
            r7 = 0
            r4 = 0
        L_0x0011:
            r8 = 1
            if (r4 >= r3) goto L_0x00ee
            r9 = r0[r4]
            boolean r5 = m29877c(r9)
            if (r5 == 0) goto L_0x0025
            java.lang.Long r5 = java.lang.Long.valueOf(r9)
            r1.push(r5)
            goto L_0x00ea
        L_0x0025:
            int r5 = m29876b(r9)
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x00db
            java.lang.Object r11 = r1.pop()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
        L_0x0039:
            int r13 = m29876b(r11)
            r16 = 0
            if (r13 == r5) goto L_0x00a9
            java.lang.String r13 = "AnalyseTask"
            java.lang.String r14 = "[analyse] method[%s] not match in! continue to find!"
            java.lang.Object[] r15 = new java.lang.Object[r8]
            java.lang.Integer r20 = java.lang.Integer.valueOf(r5)
            r15[r7] = r20
            com.bytedance.frameworks.apm.trace.C10060d.m29879b(r13, r14, r15)
            com.bytedance.frameworks.apm.trace.b r13 = r6.f27363b
            long r13 = r13.f27369c
            long r20 = m29867a(r11)
            long r13 = r13 - r20
            int r15 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r15 < 0) goto L_0x0099
            r18 = 6000(0x1770, double:2.9644E-320)
            int r15 = (r13 > r18 ? 1 : (r13 == r18 ? 0 : -1))
            if (r15 < 0) goto L_0x0065
            goto L_0x0099
        L_0x0065:
            int r11 = m29876b(r11)
            com.bytedance.frameworks.apm.trace.f r12 = new com.bytedance.frameworks.apm.trace.f
            int r13 = (int) r13
            int r14 = r1.size()
            r12.<init>(r11, r13, r14)
            m29873a(r2, r12)
            boolean r11 = r1.isEmpty()
            if (r11 != 0) goto L_0x0087
            java.lang.Object r11 = r1.pop()
            java.lang.Long r11 = (java.lang.Long) r11
            long r11 = r11.longValue()
            goto L_0x0039
        L_0x0087:
            java.lang.String r11 = "AnalyseTask"
            java.lang.String r12 = "[analyse] method[%s] not match in finally! "
            java.lang.Object[] r13 = new java.lang.Object[r8]
            java.lang.Integer r14 = java.lang.Integer.valueOf(r5)
            r13[r7] = r14
            com.bytedance.frameworks.apm.trace.C10060d.m29878a(r11, r12, r13)
            r11 = r16
            goto L_0x00a9
        L_0x0099:
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "[analyse] trace during invalid:%d"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Long r3 = java.lang.Long.valueOf(r13)
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.C10060d.m29878a(r0, r1, r2)
            return
        L_0x00a9:
            long r9 = m29867a(r9)
            long r11 = m29867a(r11)
            long r9 = r9 - r11
            int r11 = (r9 > r16 ? 1 : (r9 == r16 ? 0 : -1))
            if (r11 < 0) goto L_0x00cb
            r11 = 6000(0x1770, double:2.9644E-320)
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x00bd
            goto L_0x00cb
        L_0x00bd:
            com.bytedance.frameworks.apm.trace.f r8 = new com.bytedance.frameworks.apm.trace.f
            int r9 = (int) r9
            int r10 = r1.size()
            r8.<init>(r5, r9, r10)
            m29873a(r2, r8)
            goto L_0x00ea
        L_0x00cb:
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "[analyse] trace during invalid:%d"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            java.lang.Long r3 = java.lang.Long.valueOf(r9)
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.C10060d.m29878a(r0, r1, r2)
            return
        L_0x00db:
            java.lang.String r9 = "AnalyseTask"
            java.lang.String r10 = "[analyse] method[%s] not found in! "
            java.lang.Object[] r8 = new java.lang.Object[r8]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r8[r7] = r5
            com.bytedance.frameworks.apm.trace.C10060d.m29879b(r9, r10, r8)
        L_0x00ea:
            int r4 = r4 + 1
            goto L_0x0011
        L_0x00ee:
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x013d
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r3 = "[analyse] has never out method. rawData size:%s result size:%s"
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            int r5 = r1.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r7] = r5
            int r5 = r2.size()
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r4[r8] = r5
            com.bytedance.frameworks.apm.trace.C10060d.m29879b(r0, r3, r4)
            java.lang.Object r0 = r1.pop()
            java.lang.Long r0 = (java.lang.Long) r0
            long r3 = r0.longValue()
            int r0 = m29876b(r3)
            long r3 = m29867a(r3)
            com.bytedance.frameworks.apm.trace.f r5 = new com.bytedance.frameworks.apm.trace.f
            com.bytedance.frameworks.apm.trace.b r9 = r6.f27363b
            long r9 = r9.f27369c
            long r9 = r9 - r3
            int r3 = (int) r9
            r4 = 5000(0x1388, float:7.006E-42)
            int r3 = java.lang.Math.min(r3, r4)
            int r4 = r1.size()
            r5.<init>(r0, r3, r4)
            m29873a(r2, r5)
            goto L_0x00ee
        L_0x013d:
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "resultStack:%s"
            java.lang.Object[] r3 = new java.lang.Object[r8]
            r3[r7] = r2
            com.bytedance.frameworks.apm.trace.C10060d.m29880c(r0, r1, r3)
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            com.bytedance.frameworks.apm.trace.h r10 = m29868a(r2)
            r11 = 1
        L_0x0152:
            com.bytedance.frameworks.apm.trace.b r2 = r6.f27363b
            r3 = 0
            r0 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = (float) r11
            float r5 = r1 * r0
            r0 = r22
            r1 = r10
            boolean r0 = r0.m29875a(r1, r2, r3, r5)
            if (r0 == 0) goto L_0x0179
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "type:%s [stack result is empty after trim, just ignore]"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.bytedance.frameworks.apm.trace.b r3 = r6.f27363b
            com.bytedance.frameworks.apm.trace.Type r3 = r3.f27367a
            java.lang.String r3 = r3.name()
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.C10060d.m29878a(r0, r1, r2)
            return
        L_0x0179:
            int r0 = r6.m29866a(r10)
            r1 = 20
            if (r0 <= r1) goto L_0x0187
            int r11 = r11 + 1
            r0 = 3
            if (r11 > r0) goto L_0x0187
            goto L_0x0152
        L_0x0187:
            com.bytedance.frameworks.apm.trace.b r0 = r6.f27363b
            r6.m29870a(r10, r0)
            r6.m29872a(r10, r9)
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L_0x01a9
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "type:%s [stack result is empty after trim, just ignore]"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.bytedance.frameworks.apm.trace.b r3 = r6.f27363b
            com.bytedance.frameworks.apm.trace.Type r3 = r3.f27367a
            java.lang.String r3 = r3.name()
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.C10060d.m29878a(r0, r1, r2)
            return
        L_0x01a9:
            java.util.ListIterator r0 = r9.listIterator()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "\n"
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
        L_0x01b9:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x01dc
            java.lang.Object r3 = r0.next()
            com.bytedance.frameworks.apm.trace.f r3 = (com.bytedance.frameworks.apm.trace.C10065f) r3
            java.lang.String r4 = r3.mo24710a()
            r1.append(r4)
            r4 = 10
            r1.append(r4)
            java.lang.String r3 = r3.toString()
            r2.append(r3)
            r2.append(r4)
            goto L_0x01b9
        L_0x01dc:
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r3 = "[analyse result] %s"
            java.lang.Object[] r4 = new java.lang.Object[r8]
            java.lang.String r1 = r1.toString()
            r4[r7] = r1
            com.bytedance.frameworks.apm.trace.C10060d.m29880c(r0, r3, r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r6.m29871a(r10, r0)
            java.lang.String r0 = r0.toString()
            com.bytedance.frameworks.apm.trace.b r1 = r6.f27363b
            com.bytedance.frameworks.apm.trace.Type r1 = r1.f27367a
            com.bytedance.frameworks.apm.trace.Type r3 = com.bytedance.frameworks.apm.trace.Type.FULL
            if (r1 != r3) goto L_0x0202
            java.lang.String r0 = "TypeFull"
            goto L_0x021c
        L_0x0202:
            int r1 = r0.length()
            if (r1 != 0) goto L_0x021c
            java.lang.String r0 = "AnalyseTask"
            java.lang.String r1 = "get key null, type:%s"
            java.lang.Object[] r2 = new java.lang.Object[r8]
            com.bytedance.frameworks.apm.trace.b r3 = r6.f27363b
            com.bytedance.frameworks.apm.trace.Type r3 = r3.f27367a
            java.lang.String r3 = r3.name()
            r2[r7] = r3
            com.bytedance.frameworks.apm.trace.C10060d.m29878a(r0, r1, r2)
            return
        L_0x021c:
            java.lang.String r1 = "AnalyseTask"
            java.lang.String r3 = "[analyse key] %s"
            java.lang.Object[] r4 = new java.lang.Object[r8]
            r4[r7] = r0
            com.bytedance.frameworks.apm.trace.C10060d.m29880c(r1, r3, r4)
            com.bytedance.frameworks.apm.trace.g r1 = new com.bytedance.frameworks.apm.trace.g
            r1.<init>()
            com.bytedance.frameworks.apm.trace.b r3 = r6.f27363b
            com.bytedance.frameworks.apm.trace.Type r3 = r3.f27367a
            r1.f27391a = r3
            r1.f27392b = r0
            java.lang.String r0 = r2.toString()
            r1.f27393c = r0
            com.bytedance.frameworks.apm.trace.b r0 = r6.f27363b
            long r2 = r0.f27368b
            r1.f27396f = r2
            com.bytedance.frameworks.apm.trace.b r0 = r6.f27363b
            long r2 = r0.f27369c
            r1.f27395e = r2
            com.bytedance.frameworks.apm.trace.b r0 = r6.f27363b
            java.lang.String r0 = r0.f27370d
            r1.f27394d = r0
            int r0 = r6.f27366e
            r1.f27398h = r0
            r6.m29869a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.apm.trace.C10057a.m29874a(long[]):void");
    }

    /* renamed from: a */
    private boolean m29875a(C10068h hVar, C10058b bVar, long j, float f) {
        long j2 = hVar.f27399a == null ? bVar.f27368b : (long) hVar.f27399a.f27388b;
        if (j2 <= bVar.f27368b / 20) {
            return true;
        }
        if (j2 <= ((long) (((float) j) * f))) {
            hVar.f27401c.clear();
        }
        Iterator it = hVar.f27401c.iterator();
        while (it.hasNext()) {
            if (m29875a((C10068h) it.next(), bVar, j2, f)) {
                it.remove();
            }
        }
        return false;
    }

    public final void run() {
        m29874a(this.f27362a);
    }

    /* renamed from: a */
    private int m29866a(C10068h hVar) {
        int size = hVar.f27401c.size();
        Iterator it = hVar.f27401c.iterator();
        while (it.hasNext()) {
            size += m29866a((C10068h) it.next());
        }
        return size;
    }

    /* renamed from: a */
    private void m29869a(C10066g gVar) {
        if (this.f27365d != null) {
            if (C6174c.m19149g()) {
                C10060d.m29880c("AnalyseTask", gVar.toString(), new Object[0]);
            }
            this.f27365d.mo23975a(gVar);
        }
    }

    /* renamed from: a */
    private static C10068h m29868a(LinkedList<C10065f> linkedList) {
        C10068h hVar = null;
        C10068h hVar2 = new C10068h(null, null);
        ListIterator listIterator = linkedList.listIterator(0);
        while (true) {
            if (!listIterator.hasNext()) {
                break;
            }
            C10068h hVar3 = new C10068h((C10065f) listIterator.next(), hVar);
            if (hVar == null && hVar3.mo24716a() != 0) {
                C10060d.m29878a("AnalyseTask", "[stackToTree] begin error! why the frist node'depth is not 0!", new Object[0]);
                break;
            }
            int a = hVar3.mo24716a();
            if (a == 0) {
                hVar2.mo24717a(hVar3);
            } else if (hVar != null && hVar.mo24716a() >= a) {
                while (hVar.mo24716a() > a) {
                    hVar = hVar.f27400b;
                }
                if (hVar.f27400b != null) {
                    hVar3.f27400b = hVar.f27400b;
                    hVar.f27400b.mo24717a(hVar3);
                }
            } else if (hVar != null && hVar.mo24716a() < a) {
                hVar.mo24717a(hVar3);
            }
            hVar = hVar3;
        }
        return hVar2;
    }

    C10057a(long[] jArr, C10058b bVar) {
        this.f27362a = jArr;
        this.f27363b = bVar;
        this.f27365d = bVar.f27371e;
    }

    /* renamed from: a */
    private void m29870a(C10068h hVar, C10058b bVar) {
        long j;
        while (bVar.f27367a != Type.FULL) {
            long j2 = bVar.f27368b;
            Iterator it = hVar.f27401c.iterator();
            while (it.hasNext()) {
                C10068h hVar2 = (C10068h) it.next();
                if (hVar2 == null || hVar2.f27399a == null) {
                    C10060d.m29878a("AnalyseTask", "Null Tree Node, Must check.", new Object[0]);
                } else {
                    if (hVar2.f27399a.f27389c == 0 || hVar2.f27400b == null || hVar2.f27400b.f27399a == null) {
                        j = (long) (((float) j2) * 0.3f);
                    } else {
                        j = (long) (((float) hVar2.f27400b.f27399a.f27388b) * 0.6f);
                    }
                    if (((long) hVar2.f27399a.f27388b) < j) {
                        continue;
                    } else if (hVar2.f27399a.f27389c > 0) {
                        this.f27364c.pop();
                        this.f27364c.push(hVar2.f27399a);
                        hVar = hVar2;
                    } else {
                        this.f27364c.push(hVar2.f27399a);
                        m29870a(hVar2, bVar);
                    }
                }
            }
            return;
        }
    }

    /* renamed from: a */
    private void m29871a(C10068h hVar, StringBuilder sb) {
        if (this.f27364c.isEmpty()) {
            Iterator it = hVar.f27401c.iterator();
            int i = 0;
            while (it.hasNext() && i <= 10) {
                C10068h hVar2 = (C10068h) it.next();
                this.f27366e += hVar2.f27399a.f27388b;
                this.f27364c.add(hVar2.f27399a);
                i++;
            }
            if (i == 0 && hVar.f27399a != null) {
                this.f27366e += hVar.f27399a.f27388b;
                this.f27364c.add(hVar.f27399a);
            }
        }
        Iterator it2 = this.f27364c.iterator();
        while (it2.hasNext()) {
            C10065f fVar = (C10065f) it2.next();
            sb.append(fVar.f27387a);
            sb.append(10);
            if (fVar.f27388b > this.f27366e) {
                this.f27366e = fVar.f27388b;
            }
        }
        this.f27364c.clear();
    }

    /* renamed from: a */
    private void m29872a(C10068h hVar, LinkedList<C10065f> linkedList) {
        if (hVar != null && !hVar.mo24718b()) {
            LinkedList<C10068h> linkedList2 = hVar.f27401c;
            while (!linkedList2.isEmpty()) {
                C10068h hVar2 = (C10068h) linkedList2.pop();
                linkedList.addLast(hVar2.f27399a);
                m29872a(hVar2, linkedList);
            }
        }
    }

    /* renamed from: a */
    private static void m29873a(LinkedList<C10065f> linkedList, C10065f fVar) {
        C10065f fVar2;
        if (!linkedList.isEmpty()) {
            fVar2 = (C10065f) linkedList.peek();
        } else {
            fVar2 = null;
        }
        if (fVar2 == null || !fVar2.equals(fVar)) {
            linkedList.push(fVar);
        } else {
            fVar2.mo24711a((long) fVar.f27388b);
        }
    }
}
