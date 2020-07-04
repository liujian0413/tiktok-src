package com.p280ss.ugc.live.barrage.p1825b;

import com.p280ss.ugc.live.barrage.BarrageCopyOnWriteArrayList;
import com.p280ss.ugc.live.barrage.p1824a.C46187a;
import com.p280ss.ugc.live.barrage.view.BarrageLayout;
import java.util.Iterator;
import java.util.Random;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.ugc.live.barrage.b.d */
public final class C46206d extends C46198a {

    /* renamed from: a */
    private final BarrageLayout f118796a;

    /* renamed from: j */
    private final int f118797j;

    /* renamed from: k */
    private final int f118798k;

    /* renamed from: l */
    private final int f118799l = 7000;

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

    /* renamed from: a */
    public final void mo11799a(BarrageCopyOnWriteArrayList barrageCopyOnWriteArrayList, float f) {
        C7573i.m23587b(barrageCopyOnWriteArrayList, "runningBarrageList");
        float[] fArr = new float[this.f118798k];
        int width = this.f118796a.getWidth();
        int height = this.f118796a.getHeight();
        float f2 = (float) width;
        float f3 = (f / ((float) this.f118799l)) * f2;
        Iterator it = barrageCopyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            C46187a aVar = (C46187a) it.next();
            if (aVar.f118761k.right < 0.0f) {
                aVar.mo114141d();
                barrageCopyOnWriteArrayList.remove((Object) aVar);
            }
            int height2 = (int) ((aVar.f118761k.bottom - aVar.f118761k.height()) / ((float) this.f118797j));
            if (aVar.f118761k.right > fArr[height2]) {
                fArr[height2] = aVar.f118761k.right;
            }
            aVar.f118761k.offset(-f3, 0.0f);
        }
        int nextInt = new Random().nextInt(this.f118798k);
        int i = this.f118798k;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2 + nextInt;
            if (i3 >= this.f118798k) {
                i3 -= this.f118798k;
            }
            if (this.f118797j * i3 <= height && fArr[i3] < f2) {
                C46187a e = mo114151e();
                if (e != null) {
                    float width2 = e.f118761k.width();
                    float height3 = e.f118761k.height();
                    e.f118761k.left = f2;
                    e.f118761k.right = width2 + f2;
                    e.f118761k.top = (float) (this.f118797j * i3);
                    e.f118761k.bottom = ((float) (i3 * this.f118797j)) + height3;
                    barrageCopyOnWriteArrayList.add(e);
                } else {
                    return;
                }
            }
        }
    }

    public C46206d(BarrageLayout barrageLayout, int i, int i2, int i3) {
        C7573i.m23587b(barrageLayout, "barrageLayout");
        super(barrageLayout);
        this.f118796a = barrageLayout;
        this.f118797j = i;
        this.f118798k = i2;
    }
}
