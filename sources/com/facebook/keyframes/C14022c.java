package com.facebook.keyframes;

import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.facebook.keyframes.model.C14052j;
import java.lang.ref.WeakReference;

/* renamed from: com.facebook.keyframes.c */
public abstract class C14022c {

    /* renamed from: a */
    private final WeakReference<C14025b> f37031a;

    /* renamed from: b */
    private final int f37032b;

    /* renamed from: c */
    private final int f37033c;

    /* renamed from: d */
    private long f37034d;

    /* renamed from: e */
    private boolean f37035e;

    /* renamed from: f */
    private int f37036f;

    /* renamed from: g */
    private long f37037g;

    /* renamed from: h */
    private long f37038h;

    /* renamed from: com.facebook.keyframes.c$a */
    static class C14024a extends C14022c implements FrameCallback {

        /* renamed from: a */
        private final Choreographer f37039a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33673a() {
            this.f37039a.postFrameCallback(this);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo33676b() {
            this.f37039a.removeFrameCallback(this);
        }

        public final void doFrame(long j) {
            mo33675a(j / 1000000);
        }

        private C14024a(C14025b bVar, int i, int i2) {
            super(bVar, i, i2);
            this.f37039a = Choreographer.getInstance();
        }
    }

    /* renamed from: com.facebook.keyframes.c$b */
    public interface C14025b {
        /* renamed from: a */
        void mo33651a(float f);

        /* renamed from: d */
        void mo33655d();
    }

    /* renamed from: com.facebook.keyframes.c$c */
    static class C14026c extends C14022c implements Runnable {

        /* renamed from: a */
        private final Handler f37040a;

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo33673a() {
            this.f37040a.postDelayed(this, 25);
        }

        /* access modifiers changed from: protected */
        /* renamed from: b */
        public final void mo33676b() {
            this.f37040a.removeCallbacks(this);
        }

        public final void run() {
            mo33675a(SystemClock.uptimeMillis());
        }

        private C14026c(C14025b bVar, int i, int i2) {
            super(bVar, i, i2);
            this.f37040a = new Handler(Looper.getMainLooper());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo33673a();

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract void mo33676b();

    /* renamed from: e */
    public final void mo33679e() {
        this.f37035e = true;
    }

    /* renamed from: f */
    private static boolean m41392f() {
        if (VERSION.SDK_INT >= 16) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo33677c() {
        this.f37035e = false;
        mo33676b();
        mo33673a();
    }

    /* renamed from: d */
    public final void mo33678d() {
        mo33676b();
        this.f37034d = 0;
        this.f37036f = -1;
        ((C14025b) this.f37031a.get()).mo33655d();
    }

    /* renamed from: a */
    public final void mo33674a(int i) {
        this.f37037g = (long) (1000 / i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo33675a(long j) {
        boolean z;
        if (this.f37031a.get() == null) {
            mo33676b();
            this.f37034d = 0;
            this.f37038h = 0;
            this.f37036f = -1;
            return;
        }
        if (this.f37034d == 0) {
            this.f37034d = j;
        }
        boolean z2 = false;
        if (((int) (j - this.f37034d)) / this.f37033c > this.f37036f) {
            z = true;
        } else {
            z = false;
        }
        if (!this.f37035e || !z) {
            long j2 = (j - this.f37034d) % ((long) this.f37033c);
            if (j - this.f37038h >= this.f37037g) {
                this.f37038h = j;
                z2 = true;
            }
            if (z2) {
                ((C14025b) this.f37031a.get()).mo33651a((((float) j2) / ((float) this.f37033c)) * ((float) this.f37032b));
            }
            this.f37036f = ((int) (j - this.f37034d)) / this.f37033c;
            mo33673a();
            return;
        }
        ((C14025b) this.f37031a.get()).mo33651a((float) this.f37032b);
        mo33678d();
    }

    /* renamed from: a */
    public static C14022c m41391a(C14025b bVar, C14052j jVar) {
        if (m41392f()) {
            return new C14024a(bVar, jVar.f37116a, jVar.f37117b);
        }
        return new C14026c(bVar, jVar.f37116a, jVar.f37117b);
    }

    private C14022c(C14025b bVar, int i, int i2) {
        this.f37037g = -1;
        this.f37031a = new WeakReference<>(bVar);
        this.f37032b = i2;
        this.f37033c = Math.round((((float) i2) / ((float) i)) * 1000.0f);
    }
}
