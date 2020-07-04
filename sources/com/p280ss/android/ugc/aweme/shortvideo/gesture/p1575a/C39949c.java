package com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.a.c */
public final class C39949c extends C39952d {

    /* renamed from: h */
    public float f103743h;

    /* renamed from: i */
    public float f103744i;

    /* renamed from: o */
    private final C39950a f103745o;

    /* renamed from: p */
    private boolean f103746p;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.a.c$a */
    public interface C39950a {
        /* renamed from: a */
        boolean mo99371a(C39949c cVar);

        /* renamed from: b */
        boolean mo99372b(C39949c cVar);

        /* renamed from: c */
        void mo99373c(C39949c cVar);
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.a.c$b */
    public static class C39951b implements C39950a {
        /* renamed from: a */
        public boolean mo99371a(C39949c cVar) {
            return false;
        }

        /* renamed from: b */
        public boolean mo99372b(C39949c cVar) {
            return true;
        }

        /* renamed from: c */
        public void mo99373c(C39949c cVar) {
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo99362a() {
        super.mo99362a();
        this.f103746p = false;
    }

    /* renamed from: b */
    public final float mo99370b() {
        return (float) (Math.atan2((double) this.f103750k, (double) this.f103749j) - Math.atan2((double) this.f103752m, (double) this.f103751l));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo99366b(MotionEvent motionEvent) {
        super.mo99366b(motionEvent);
        m127774d(motionEvent);
    }

    /* renamed from: d */
    private void m127774d(MotionEvent motionEvent) {
        int i;
        int pointerCount = motionEvent.getPointerCount();
        if ((motionEvent.getAction() & NormalGiftView.ALPHA_255) == 6) {
            i = motionEvent.getActionIndex();
        } else {
            i = -1;
        }
        float f = 0.0f;
        float f2 = 0.0f;
        for (int i2 = 0; i2 < pointerCount; i2++) {
            if (i != i2) {
                f += motionEvent.getX(i2);
                f2 += motionEvent.getY(i2);
            }
        }
        float f3 = (float) pointerCount;
        this.f103743h = f / f3;
        this.f103744i = f2 / f3;
    }

    public C39949c(Context context, C39950a aVar) {
        super(context);
        this.f103745o = aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo99363a(int i, MotionEvent motionEvent) {
        if (i != 2) {
            if (i == 5) {
                mo99362a();
                this.f103731c = MotionEvent.obtain(motionEvent);
                this.f103735g = 0;
                mo99366b(motionEvent);
                this.f103746p = mo99374c(motionEvent);
                if (!this.f103746p) {
                    this.f103730b = this.f103745o.mo99372b(this);
                }
            }
        } else if (this.f103746p) {
            this.f103746p = mo99374c(motionEvent);
            if (!this.f103746p) {
                this.f103730b = this.f103745o.mo99372b(this);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo99365b(int i, MotionEvent motionEvent) {
        if (i != 6) {
            switch (i) {
                case 2:
                    mo99366b(motionEvent);
                    if (this.f103733e / this.f103734f > 0.67f && this.f103745o.mo99371a(this)) {
                        this.f103731c.recycle();
                        this.f103731c = MotionEvent.obtain(motionEvent);
                        break;
                    }
                case 3:
                    if (!this.f103746p) {
                        this.f103745o.mo99373c(this);
                    }
                    mo99362a();
                    return;
            }
            return;
        }
        mo99366b(motionEvent);
        if (!this.f103746p) {
            this.f103745o.mo99373c(this);
        }
        mo99362a();
    }
}
