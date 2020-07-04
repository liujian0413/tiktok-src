package com.p280ss.android.ugc.asve.p756d.p757a;

import android.content.Context;
import android.graphics.PointF;
import android.view.MotionEvent;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.asve.d.a.b */
public final class C15444b extends C15442a {

    /* renamed from: j */
    public static final C15445a f39741j = new C15445a(null);

    /* renamed from: o */
    private static final PointF f39742o = new PointF();

    /* renamed from: i */
    public PointF f39743i = new PointF();

    /* renamed from: k */
    private PointF f39744k;

    /* renamed from: l */
    private PointF f39745l;

    /* renamed from: m */
    private final PointF f39746m = new PointF();

    /* renamed from: n */
    private final C15446b f39747n;

    /* renamed from: com.ss.android.ugc.asve.d.a.b$a */
    public static final class C15445a {
        private C15445a() {
        }

        public /* synthetic */ C15445a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.asve.d.a.b$b */
    public interface C15446b {
        /* renamed from: a */
        boolean mo38996a(C15444b bVar);

        /* renamed from: a */
        boolean mo38997a(C15444b bVar, float f, float f2);

        /* renamed from: b */
        void mo38998b(C15444b bVar);
    }

    /* renamed from: c */
    private static float m45227c(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return -1.0f;
        }
        return motionEvent.getX();
    }

    /* renamed from: d */
    private static float m45228d(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return -1.0f;
        }
        return motionEvent.getY();
    }

    /* renamed from: e */
    private static PointF m45229e(MotionEvent motionEvent) {
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
    public final void mo38995b(MotionEvent motionEvent) {
        boolean z;
        PointF pointF;
        C7573i.m23587b(motionEvent, "curr");
        super.mo38995b(motionEvent);
        MotionEvent motionEvent2 = this.f39734a;
        this.f39744k = m45229e(motionEvent);
        if (motionEvent2 == null) {
            C7573i.m23580a();
        }
        this.f39745l = m45229e(motionEvent2);
        if (motionEvent2.getPointerCount() != motionEvent.getPointerCount()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            pointF = f39742o;
        } else {
            PointF pointF2 = this.f39744k;
            if (pointF2 == null) {
                C7573i.m23580a();
            }
            float f = pointF2.x;
            PointF pointF3 = this.f39745l;
            if (pointF3 == null) {
                C7573i.m23580a();
            }
            float f2 = f - pointF3.x;
            PointF pointF4 = this.f39744k;
            if (pointF4 == null) {
                C7573i.m23580a();
            }
            float f3 = pointF4.y;
            PointF pointF5 = this.f39745l;
            if (pointF5 == null) {
                C7573i.m23580a();
            }
            pointF = new PointF(f2, f3 - pointF5.y);
        }
        this.f39743i = pointF;
        this.f39746m.x += this.f39743i.x;
        this.f39746m.y += this.f39743i.y;
    }

    public C15444b(Context context, C15446b bVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(bVar, "mListener");
        super(context);
        this.f39747n = bVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo38992a(int i, MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        if (i != 0) {
            if (i == 2) {
                this.f39738e = this.f39747n.mo38997a(this, m45227c(this.f39734a), m45228d(this.f39734a));
            }
            return;
        }
        mo38991a();
        this.f39746m.x = 0.0f;
        this.f39746m.y = 0.0f;
        this.f39734a = MotionEvent.obtain(motionEvent);
        this.f39739f = 0;
        mo38995b(motionEvent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo38994b(int i, MotionEvent motionEvent) {
        C7573i.m23587b(motionEvent, "event");
        switch (i) {
            case 1:
            case 3:
                this.f39747n.mo38998b(this);
                mo38991a();
                return;
            case 2:
                if (this.f39734a != null) {
                    mo38995b(motionEvent);
                    if (this.f39736c / this.f39737d > 0.67f && this.f39747n.mo38996a(this)) {
                        MotionEvent motionEvent2 = this.f39734a;
                        if (motionEvent2 == null) {
                            C7573i.m23580a();
                        }
                        motionEvent2.recycle();
                        this.f39734a = MotionEvent.obtain(motionEvent);
                        break;
                    }
                } else {
                    return;
                }
        }
    }
}
