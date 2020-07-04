package com.bytedance.android.livesdk.feed.p232g;

import android.os.Build.VERSION;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.bytedance.android.livesdk.feed.C6085q;
import com.bytedance.common.utility.C6312h;

/* renamed from: com.bytedance.android.livesdk.feed.g.a */
public final class C6020a {

    /* renamed from: a */
    static final boolean f17833a = C6312h.m19578b();

    /* renamed from: b */
    long f17834b;

    /* renamed from: c */
    long f17835c;

    /* renamed from: d */
    long f17836d;

    /* renamed from: e */
    boolean f17837e;

    /* renamed from: f */
    private int f17838f;

    /* renamed from: g */
    private FrameCallback f17839g;

    /* renamed from: com.bytedance.android.livesdk.feed.g.a$a */
    static class C6022a {

        /* renamed from: a */
        public static final C6020a f17841a = new C6020a();
    }

    /* renamed from: a */
    public static C6020a m18814a() {
        return C6022a.f17841a;
    }

    private C6020a() {
        this.f17839g = new FrameCallback() {
            public final void doFrame(long j) {
                if (C6020a.this.f17837e) {
                    if (C6020a.this.f17835c <= 0) {
                        C6020a.this.f17835c = j;
                    } else {
                        C6020a.this.f17836d++;
                    }
                    C6020a.this.f17834b = j;
                    try {
                        Choreographer.getInstance().postFrameCallback(this);
                        if (C6020a.f17833a) {
                            C6020a.this.mo14686a(true);
                        }
                    } catch (Throwable unused) {
                        C6020a.this.f17837e = false;
                    }
                }
            }
        };
    }

    /* renamed from: b */
    private void m18815b() {
        if (!this.f17837e && VERSION.SDK_INT >= 16) {
            try {
                m18816c();
                this.f17837e = true;
                Choreographer.getInstance().postFrameCallback(this.f17839g);
            } catch (Throwable unused) {
                this.f17837e = false;
            }
        }
    }

    /* renamed from: c */
    private void m18816c() {
        if (VERSION.SDK_INT >= 16) {
            try {
                Choreographer.getInstance().removeFrameCallback(this.f17839g);
                if (this.f17837e) {
                    mo14686a(false);
                }
            } catch (Throwable unused) {
            }
        }
        this.f17837e = false;
        this.f17835c = 0;
        this.f17834b = 0;
        this.f17836d = 0;
    }

    /* renamed from: a */
    public final void mo14685a(int i) {
        if (i == 0) {
            m18816c();
        } else if (this.f17837e || this.f17838f <= 10) {
            m18815b();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo14686a(boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 30;
        }
        if (this.f17836d >= ((long) i) && this.f17834b > this.f17835c) {
            float f = (((float) this.f17836d) * 1.0E9f) / ((float) (this.f17834b - this.f17835c));
            if (!z) {
                C6085q.m18971a(f);
                this.f17838f++;
            }
        }
    }
}
