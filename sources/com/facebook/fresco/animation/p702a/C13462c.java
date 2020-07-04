package com.facebook.fresco.animation.p702a;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.common.time.C13331b;
import com.facebook.fresco.animation.p702a.C13460a;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: com.facebook.fresco.animation.a.c */
public final class C13462c<T extends C13460a> extends C13461b<T> {

    /* renamed from: b */
    public boolean f35697b;

    /* renamed from: c */
    public long f35698c = 2000;

    /* renamed from: d */
    public long f35699d = 1000;

    /* renamed from: e */
    public C13464a f35700e;

    /* renamed from: f */
    private final C13331b f35701f;

    /* renamed from: g */
    private final ScheduledExecutorService f35702g;

    /* renamed from: h */
    private long f35703h;

    /* renamed from: i */
    private final Runnable f35704i = new Runnable() {
        public final void run() {
            synchronized (C13462c.this) {
                C13462c.this.f35697b = false;
                if (!C13462c.this.mo32997f()) {
                    C13462c.this.mo32998g();
                } else if (C13462c.this.f35700e != null) {
                    C13462c.this.f35700e.mo33000f();
                }
            }
        }
    };

    /* renamed from: com.facebook.fresco.animation.a.c$a */
    public interface C13464a {
        /* renamed from: f */
        void mo33000f();
    }

    /* renamed from: f */
    public final boolean mo32997f() {
        if (this.f35701f.now() - this.f35703h > this.f35698c) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public final synchronized void mo32998g() {
        if (!this.f35697b) {
            this.f35697b = true;
            this.f35702g.schedule(this.f35704i, this.f35699d, TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public static <T extends C13460a & C13464a> C13461b<T> m39575a(T t, C13331b bVar, ScheduledExecutorService scheduledExecutorService) {
        return m39576a(t, (C13464a) t, bVar, scheduledExecutorService);
    }

    /* renamed from: a */
    public final boolean mo32990a(Drawable drawable, Canvas canvas, int i) {
        this.f35703h = this.f35701f.now();
        boolean a = super.mo32990a(drawable, canvas, i);
        mo32998g();
        return a;
    }

    /* renamed from: a */
    private static <T extends C13460a> C13461b<T> m39576a(T t, C13464a aVar, C13331b bVar, ScheduledExecutorService scheduledExecutorService) {
        return new C13462c(t, aVar, bVar, scheduledExecutorService);
    }

    private C13462c(T t, C13464a aVar, C13331b bVar, ScheduledExecutorService scheduledExecutorService) {
        super(t);
        this.f35700e = aVar;
        this.f35701f = bVar;
        this.f35702g = scheduledExecutorService;
    }
}
