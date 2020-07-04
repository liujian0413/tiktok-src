package com.p280ss.android.ugc.aweme.shortvideo.gesture.p1575a;

import android.content.Context;
import android.view.MotionEvent;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.gesture.a.a */
public abstract class C39946a {

    /* renamed from: a */
    protected final Context f103729a;

    /* renamed from: b */
    public boolean f103730b;

    /* renamed from: c */
    protected MotionEvent f103731c;

    /* renamed from: d */
    protected MotionEvent f103732d;

    /* renamed from: e */
    protected float f103733e;

    /* renamed from: f */
    protected float f103734f;

    /* renamed from: g */
    public long f103735g;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo99363a(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo99365b(int i, MotionEvent motionEvent);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo99362a() {
        if (this.f103731c != null) {
            this.f103731c.recycle();
            this.f103731c = null;
        }
        if (this.f103732d != null) {
            this.f103732d.recycle();
            this.f103732d = null;
        }
        this.f103730b = false;
    }

    public C39946a(Context context) {
        this.f103729a = context;
    }

    /* renamed from: a */
    public final boolean mo99364a(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & NormalGiftView.ALPHA_255;
        if (!this.f103730b) {
            mo99363a(action, motionEvent);
        } else {
            mo99365b(action, motionEvent);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo99366b(MotionEvent motionEvent) {
        MotionEvent motionEvent2 = this.f103731c;
        if (this.f103732d != null) {
            this.f103732d.recycle();
            this.f103732d = null;
        }
        this.f103732d = MotionEvent.obtain(motionEvent);
        this.f103735g = motionEvent.getEventTime() - motionEvent2.getEventTime();
        this.f103733e = motionEvent.getPressure(motionEvent.getActionIndex());
        this.f103734f = motionEvent2.getPressure(motionEvent2.getActionIndex());
    }
}
