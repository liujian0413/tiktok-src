package com.p280ss.ugc.live.barrage.p1825b;

import com.p280ss.ugc.live.barrage.p1824a.C46187a;
import com.p280ss.ugc.live.barrage.view.BarrageLayout;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.ugc.live.barrage.b.b */
public final class C46204b extends C46198a {

    /* renamed from: a */
    private final BarrageLayout f118788a;

    /* renamed from: j */
    private final int f118789j;

    /* renamed from: k */
    private final int f118790k = 2;

    /* renamed from: l */
    private final int f118791l = 7000;

    /* renamed from: a */
    public final void mo11797a() {
        mo114150d();
        super.mo11797a();
    }

    /* renamed from: a */
    public final void mo11800a(C46187a aVar) {
        C7573i.m23587b(aVar, "barrage");
        mo114149c();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList, code=com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList<com.ss.ugc.live.barrage.a.a>, for r10v0, types: [com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList<com.ss.ugc.live.barrage.a.a>, java.lang.Object, com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11799a(com.p280ss.ugc.live.barrage.BarrageCopyOnWriteArrayList<com.p280ss.ugc.live.barrage.p1824a.C46187a> r10, float r11) {
        /*
            r9 = this;
            java.lang.String r0 = "runningBarrageList"
            kotlin.jvm.internal.C7573i.m23587b(r10, r0)
            com.ss.ugc.live.barrage.view.BarrageLayout r0 = r9.f118788a
            int r0 = r0.getWidth()
            com.ss.ugc.live.barrage.view.BarrageLayout r1 = r9.f118788a
            int r1 = r1.getHeight()
            com.ss.ugc.live.barrage.view.BarrageLayout r2 = r9.f118788a
            r2.postInvalidate()
            int r2 = r9.f118790k
            float[] r2 = new float[r2]
            int r3 = r9.f118791l
            float r3 = (float) r3
            float r11 = r11 / r3
            float r0 = (float) r0
            float r11 = r11 * r0
            r3 = r10
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.Iterator r3 = r3.iterator()
        L_0x0028:
            boolean r4 = r3.hasNext()
            r5 = 0
            if (r4 == 0) goto L_0x0066
            java.lang.Object r4 = r3.next()
            com.ss.ugc.live.barrage.a.a r4 = (com.p280ss.ugc.live.barrage.p1824a.C46187a) r4
            android.graphics.RectF r6 = r4.f118761k
            float r6 = r6.left
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x0040
            r10.remove(r4)
        L_0x0040:
            android.graphics.RectF r6 = r4.f118761k
            float r6 = r6.bottom
            android.graphics.RectF r7 = r4.f118761k
            float r7 = r7.height()
            float r6 = r6 - r7
            int r7 = r9.f118789j
            float r7 = (float) r7
            float r6 = r6 / r7
            int r6 = (int) r6
            android.graphics.RectF r7 = r4.f118761k
            float r7 = r7.left
            r8 = r2[r6]
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x0060
            android.graphics.RectF r7 = r4.f118761k
            float r7 = r7.left
            r2[r6] = r7
        L_0x0060:
            android.graphics.RectF r4 = r4.f118761k
            r4.offset(r11, r5)
            goto L_0x0028
        L_0x0066:
            r11 = 0
            int r0 = r9.f118790k
        L_0x0069:
            if (r11 >= r0) goto L_0x00ac
            int r3 = r9.f118789j
            int r3 = r3 * r11
            if (r3 > r1) goto L_0x00a9
            r3 = r2[r11]
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 < 0) goto L_0x00a9
            com.ss.ugc.live.barrage.a.a r3 = r9.mo114151e()
            if (r3 != 0) goto L_0x007e
            return
        L_0x007e:
            android.graphics.RectF r4 = r3.f118761k
            float r4 = r4.width()
            android.graphics.RectF r6 = r3.f118761k
            float r6 = r6.height()
            android.graphics.RectF r7 = r3.f118761k
            float r4 = -r4
            r7.left = r4
            android.graphics.RectF r4 = r3.f118761k
            r4.right = r5
            android.graphics.RectF r4 = r3.f118761k
            int r7 = r9.f118789j
            int r7 = r7 * r11
            float r7 = (float) r7
            r4.top = r7
            android.graphics.RectF r4 = r3.f118761k
            int r7 = r9.f118789j
            int r7 = r7 * r11
            float r7 = (float) r7
            float r7 = r7 + r6
            r4.bottom = r7
            r10.add(r3)
        L_0x00a9:
            int r11 = r11 + 1
            goto L_0x0069
        L_0x00ac:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ugc.live.barrage.p1825b.C46204b.mo11799a(com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList, float):void");
    }

    public C46204b(BarrageLayout barrageLayout, int i, int i2, int i3) {
        C7573i.m23587b(barrageLayout, "barrageLayout");
        super(barrageLayout);
        this.f118788a = barrageLayout;
        this.f118789j = i;
    }
}
