package com.p280ss.android.ugc.aweme.festival.p311a;

import android.graphics.drawable.AnimationDrawable;
import android.os.Handler;
import android.os.Looper;

/* renamed from: com.ss.android.ugc.aweme.festival.a.f */
public final class C29127f extends AnimationDrawable {

    /* renamed from: a */
    public C29128a f76876a;

    /* renamed from: b */
    private Handler f76877b = new Handler(Looper.getMainLooper());

    /* renamed from: com.ss.android.ugc.aweme.festival.a.f$a */
    public interface C29128a {
        /* renamed from: a */
        void mo74588a();

        /* renamed from: b */
        void mo74589b();
    }

    /* renamed from: b */
    private void m95544b() {
        if (this.f76876a != null) {
            this.f76876a.mo74589b();
        }
    }

    /* renamed from: stop */
    public final void mo74585a() {
        super.stop();
        m95544b();
        m95545c();
    }

    public C29127f() {
        setOneShot(false);
    }

    /* renamed from: c */
    private void m95545c() {
        if (this.f76877b != null) {
            this.f76877b.removeCallbacksAndMessages(null);
        }
        if (this.f76876a != null) {
            this.f76876a = null;
        }
    }

    public final void start() {
        super.start();
        if (this.f76876a != null) {
            this.f76876a.mo74588a();
        }
        if (getNumberOfFrames() > 0 && getDuration(0) > 0 && this.f76877b != null) {
            this.f76877b.postDelayed(new C29129g(this), (long) (getNumberOfFrames() * getDuration(0) * 4));
        }
    }
}
