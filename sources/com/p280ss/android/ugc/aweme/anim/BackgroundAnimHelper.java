package com.p280ss.android.ugc.aweme.anim;

import android.animation.ValueAnimator;
import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;

/* renamed from: com.ss.android.ugc.aweme.anim.BackgroundAnimHelper */
public class BackgroundAnimHelper implements C0042h {

    /* renamed from: a */
    private ValueAnimator f60060a;

    @C0054q(mo125a = Event.ON_PAUSE)
    public void stopAnim() {
        m74537a();
    }

    /* renamed from: a */
    private void m74537a() {
        this.f60060a.cancel();
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void resumeAnim() {
        if (!this.f60060a.isStarted()) {
            this.f60060a.start();
        }
    }
}
