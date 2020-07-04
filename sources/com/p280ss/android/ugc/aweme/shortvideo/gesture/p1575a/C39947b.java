package com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.a.b */
public final class C39947b extends C39946a {

    /* renamed from: i */
    public static boolean f103736i = false;

    /* renamed from: j */
    private static final PointF f103737j = new PointF();

    /* renamed from: h */
    public PointF f103738h = new PointF();

    /* renamed from: k */
    private final C39948a f103739k;

    /* renamed from: l */
    private PointF f103740l;

    /* renamed from: m */
    private PointF f103741m;

    /* renamed from: n */
    private PointF f103742n = new PointF();

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.a.b$a */
    public interface C39948a {
        /* renamed from: a */
        boolean mo99367a(C39947b bVar);

        /* renamed from: a */
        boolean mo99368a(C39947b bVar, float f, float f2);

        /* renamed from: b */
        void mo99369b(C39947b bVar);
    }

    /* renamed from: c */
    private static float m127765c(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return -1.0f;
        }
        if (f103736i) {
            return motionEvent.getRawX();
        }
        return motionEvent.getX();
    }

    /* renamed from: d */
    private static float m127766d(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return -1.0f;
        }
        if (f103736i) {
            return motionEvent.getRawY();
        }
        return motionEvent.getY();
    }

    /* renamed from: e */
    private static PointF m127767e(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i = 0; i < pointerCount; i++) {
            f += motionEvent.getX(i);
            f2 += motionEvent.getY(i);
        }
        float f3 = (float) pointerCount;
        return new PointF(f / f3, f2 / f3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo99366b(MotionEvent motionEvent) {
        boolean z;
        PointF pointF;
        super.mo99366b(motionEvent);
        MotionEvent motionEvent2 = this.f103731c;
        this.f103740l = m127767e(motionEvent);
        this.f103741m = m127767e(motionEvent2);
        if (motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            pointF = f103737j;
        } else {
            pointF = new PointF(this.f103740l.x - this.f103741m.x, this.f103740l.y - this.f103741m.y);
        }
        this.f103738h = pointF;
        this.f103742n.x += this.f103738h.x;
        this.f103742n.y += this.f103738h.y;
    }

    public C39947b(Context context, C39948a aVar) {
        super(context);
        this.f103739k = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo99363a(int i, MotionEvent motionEvent) {
        if (i != 0) {
            if (i == 2) {
                this.f103730b = this.f103739k.mo99368a(this, m127765c(this.f103731c), m127766d(this.f103731c));
            }
            return;
        }
        mo99362a();
        this.f103742n.x = 0.0f;
        this.f103742n.y = 0.0f;
        this.f103731c = MotionEvent.obtain(motionEvent);
        this.f103735g = 0;
        mo99366b(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo99365b(int i, MotionEvent motionEvent) {
        switch (i) {
            case 1:
            case 3:
                this.f103739k.mo99369b(this);
                mo99362a();
                return;
            case 2:
                if (this.f103731c != null) {
                    mo99366b(motionEvent);
                    if (this.f103733e / this.f103734f > 0.67f) {
                        this.f103739k.mo99367a(this);
                        this.f103731c.recycle();
                        this.f103731c = MotionEvent.obtain(motionEvent);
                        break;
                    }
                } else {
                    return;
                }
                break;
        }
    }
}
