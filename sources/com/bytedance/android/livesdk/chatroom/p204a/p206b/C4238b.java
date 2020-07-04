package com.bytedance.android.livesdk.chatroom.p204a.p206b;

import android.graphics.Path;
import android.graphics.PathMeasure;
import com.p280ss.ugc.live.barrage.p1824a.C46187a;
import com.p280ss.ugc.live.barrage.p1825b.C46198a;
import com.p280ss.ugc.live.barrage.view.BarrageLayout;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.android.livesdk.chatroom.a.b.b */
public final class C4238b extends C46198a {

    /* renamed from: a */
    public static final C4239a f12383a = new C4239a(null);

    /* renamed from: j */
    private final float[] f12384j = new float[2];

    /* renamed from: k */
    private final CopyOnWriteArrayList<Float> f12385k = new CopyOnWriteArrayList<>();

    /* renamed from: l */
    private final PathMeasure f12386l = new PathMeasure();

    /* renamed from: m */
    private final BarrageLayout f12387m;

    /* renamed from: n */
    private final Path f12388n;

    /* renamed from: o */
    private final int f12389o;

    /* renamed from: com.bytedance.android.livesdk.chatroom.a.b.b$a */
    public static final class C4239a {
        private C4239a() {
        }

        public /* synthetic */ C4239a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo11797a() {
        mo114150d();
        this.f12385k.clear();
        super.mo11797a();
    }

    /* renamed from: a */
    public final void mo11800a(C46187a aVar) {
        C7573i.m23587b(aVar, "barrage");
        mo114149c();
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList, code=com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList<com.ss.ugc.live.barrage.a.a>, for r14v0, types: [com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList<com.ss.ugc.live.barrage.a.a>, java.lang.Object, com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11799a(com.p280ss.ugc.live.barrage.BarrageCopyOnWriteArrayList<com.p280ss.ugc.live.barrage.p1824a.C46187a> r14, float r15) {
        /*
            r13 = this;
            java.lang.String r0 = "runBarrageList"
            kotlin.jvm.internal.C7573i.m23587b(r14, r0)
            int r0 = r13.f12389o
            float r0 = (float) r0
            float r15 = r15 / r0
            r0 = r14
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        L_0x0010:
            boolean r1 = r0.hasNext()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L_0x0108
            java.lang.Object r1 = r0.next()
            com.ss.ugc.live.barrage.a.a r1 = (com.p280ss.ugc.live.barrage.p1824a.C46187a) r1
            int r5 = r14.indexOf(r1)
            boolean r6 = r1 instanceof com.bytedance.android.livesdk.chatroom.p204a.p205a.C4232a
            if (r6 == 0) goto L_0x0010
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r6 = r13.f12385k
            java.lang.Object r6 = r6.get(r5)
            java.lang.Float r6 = (java.lang.Float) r6
            r7 = 2
            float[] r8 = new float[r7]
            float[] r7 = new float[r7]
            android.graphics.PathMeasure r9 = r13.f12386l
            float r10 = r6.floatValue()
            android.graphics.PathMeasure r11 = r13.f12386l
            float r11 = r11.getLength()
            float r10 = r10 * r11
            r11 = 0
            r9.getPosTan(r10, r8, r11)
            android.graphics.PathMeasure r9 = r13.f12386l
            float r10 = r6.floatValue()
            float r10 = r10 + r15
            android.graphics.PathMeasure r12 = r13.f12386l
            float r12 = r12.getLength()
            float r10 = r10 * r12
            r9.getPosTan(r10, r7, r11)
            android.graphics.RectF r9 = r1.f118761k
            float r10 = r9.top
            r11 = r7[r4]
            r12 = r8[r4]
            float r11 = r11 - r12
            float r10 = r10 + r11
            r9.top = r10
            android.graphics.RectF r9 = r1.f118761k
            float r10 = r9.bottom
            r11 = r7[r4]
            r4 = r8[r4]
            float r11 = r11 - r4
            float r10 = r10 + r11
            r9.bottom = r10
            android.graphics.RectF r4 = r1.f118761k
            float r9 = r4.left
            r10 = r7[r3]
            r11 = r8[r3]
            float r10 = r10 - r11
            float r9 = r9 + r10
            r4.left = r9
            android.graphics.RectF r4 = r1.f118761k
            float r9 = r4.right
            r7 = r7[r3]
            r3 = r8[r3]
            float r7 = r7 - r3
            float r9 = r9 + r7
            r4.right = r9
            float r3 = r6.floatValue()
            float r3 = r3 + r15
            r4 = 1056964608(0x3f000000, float:0.5)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L_0x00aa
            r3 = r1
            com.bytedance.android.livesdk.chatroom.a.a.a r3 = (com.bytedance.android.livesdk.chatroom.p204a.p205a.C4232a) r3
            r4 = 1134768947(0x43a33333, float:326.4)
            java.lang.String r7 = "progress"
            kotlin.jvm.internal.C7573i.m23582a(r6, r7)
            float r7 = r6.floatValue()
            float r2 = r2 - r7
            float r2 = r2 - r15
            float r2 = r2 * r4
            int r2 = (int) r2
            r3.f12370b = r2
        L_0x00aa:
            float r2 = r6.floatValue()
            float r2 = r2 + r15
            r3 = 1045220557(0x3e4ccccd, float:0.2)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L_0x00c9
            r2 = r1
            com.bytedance.android.livesdk.chatroom.a.a.a r2 = (com.bytedance.android.livesdk.chatroom.p204a.p205a.C4232a) r2
            r3 = 1047904911(0x3e75c28f, float:0.24)
            float r4 = r6.floatValue()
            float r4 = r4 + r15
            r7 = 1077097267(0x40333333, float:2.8)
            float r4 = r4 * r7
            float r4 = r4 + r3
            r2.f12371c = r4
        L_0x00c9:
            com.bytedance.android.livesdk.chatroom.a.a.a r1 = (com.bytedance.android.livesdk.chatroom.p204a.p205a.C4232a) r1
            double r2 = r1.f12373e
            float r4 = r6.floatValue()
            double r7 = (double) r4
            r9 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            java.lang.Double.isNaN(r7)
            double r7 = r7 * r9
            r9 = 4620693217682128896(0x4020000000000000, double:8.0)
            double r7 = r7 * r9
            double r2 = r2 + r7
            double r2 = java.lang.Math.sin(r2)
            r7 = 4616189618054758400(0x4010000000000000, double:4.0)
            double r2 = r2 * r7
            float r2 = (float) r2
            r1.f12372d = r2
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r2 = r13.f12385k
            float r3 = r6.floatValue()
            float r3 = r3 + r15
            java.lang.Float r3 = java.lang.Float.valueOf(r3)
            r2.set(r5, r3)
            int r1 = r1.f12370b
            if (r1 != 0) goto L_0x0010
            r14.remove(r5)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r1 = r13.f12385k
            r1.remove(r5)
            goto L_0x0010
        L_0x0108:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r15 = r13.f12385k
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.Iterator r15 = r15.iterator()
        L_0x0110:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0135
            java.lang.Object r0 = r15.next()
            java.lang.Float r0 = (java.lang.Float) r0
            float r1 = r0.floatValue()
            int r1 = java.lang.Float.compare(r1, r2)
            if (r1 < 0) goto L_0x0110
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r1 = r13.f12385k
            int r0 = r1.indexOf(r0)
            r14.remove(r0)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r1 = r13.f12385k
            r1.remove(r0)
            goto L_0x0110
        L_0x0135:
            com.ss.ugc.live.barrage.a.a r15 = r13.mo114151e()
            if (r15 != 0) goto L_0x013c
            return
        L_0x013c:
            boolean r0 = r15 instanceof com.bytedance.android.livesdk.chatroom.p204a.p205a.C4232a
            if (r0 == 0) goto L_0x0135
            android.graphics.RectF r0 = r15.f118761k
            float r0 = r0.width()
            android.graphics.RectF r1 = r15.f118761k
            float r1 = r1.height()
            android.graphics.RectF r2 = r15.f118761k
            float[] r5 = r13.f12384j
            r5 = r5[r3]
            r2.left = r5
            android.graphics.RectF r2 = r15.f118761k
            float[] r5 = r13.f12384j
            r5 = r5[r3]
            float r5 = r5 + r0
            r2.right = r5
            android.graphics.RectF r0 = r15.f118761k
            float[] r2 = r13.f12384j
            r2 = r2[r4]
            r0.top = r2
            android.graphics.RectF r0 = r15.f118761k
            float[] r2 = r13.f12384j
            r2 = r2[r4]
            float r2 = r2 + r1
            r0.bottom = r2
            r0 = r15
            com.bytedance.android.livesdk.chatroom.a.a.a r0 = (com.bytedance.android.livesdk.chatroom.p204a.p205a.C4232a) r0
            r1 = 0
            r0.f12371c = r1
            r14.add(r15)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Float> r15 = r13.f12385k
            java.lang.Float r0 = java.lang.Float.valueOf(r1)
            r15.add(r0)
            goto L_0x0135
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p204a.p206b.C4238b.mo11799a(com.ss.ugc.live.barrage.BarrageCopyOnWriteArrayList, float):void");
    }

    public C4238b(BarrageLayout barrageLayout, Path path, int i) {
        C7573i.m23587b(barrageLayout, "barrageView");
        C7573i.m23587b(path, "path");
        super(barrageLayout);
        this.f12387m = barrageLayout;
        this.f12388n = path;
        this.f12389o = i;
        this.f12386l.setPath(this.f12388n, false);
        this.f12386l.getPosTan(0.0f, this.f12384j, null);
    }
}
