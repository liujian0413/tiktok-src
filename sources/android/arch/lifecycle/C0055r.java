package android.arch.lifecycle;

import android.app.Activity;
import android.app.Application;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;

/* renamed from: android.arch.lifecycle.r */
public final class C0055r implements C0043i {

    /* renamed from: i */
    private static final C0055r f94i = new C0055r();

    /* renamed from: a */
    public C0060a f95a = new C0060a() {
        /* renamed from: a */
        public final void mo133a() {
            C0055r.this.mo126b();
        }

        /* renamed from: b */
        public final void mo134b() {
            C0055r.this.mo127c();
        }
    };

    /* renamed from: b */
    private int f96b;

    /* renamed from: c */
    private int f97c;

    /* renamed from: d */
    private boolean f98d = true;

    /* renamed from: e */
    private boolean f99e = true;

    /* renamed from: f */
    private Handler f100f;

    /* renamed from: g */
    private final C0044j f101g = new C0044j(this);

    /* renamed from: h */
    private Runnable f102h = new Runnable() {
        public final void run() {
            C0055r.this.mo130f();
            C0055r.this.mo131g();
        }
    };

    /* renamed from: a */
    public static C0043i m126a() {
        return f94i;
    }

    public final Lifecycle getLifecycle() {
        return this.f101g;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo129e() {
        this.f96b--;
        mo131g();
    }

    /* renamed from: f */
    public final void mo130f() {
        if (this.f97c == 0) {
            this.f98d = true;
            this.f101g.mo116a(Event.ON_PAUSE);
        }
    }

    private C0055r() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo128d() {
        this.f97c--;
        if (this.f97c == 0) {
            this.f100f.postDelayed(this.f102h, 700);
        }
    }

    /* renamed from: g */
    public final void mo131g() {
        if (this.f96b == 0 && this.f98d) {
            this.f101g.mo116a(Event.ON_STOP);
            this.f99e = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo126b() {
        this.f96b++;
        if (this.f96b == 1 && this.f99e) {
            this.f101g.mo116a(Event.ON_START);
            this.f99e = false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo127c() {
        this.f97c++;
        if (this.f97c == 1) {
            if (this.f98d) {
                this.f101g.mo116a(Event.ON_RESUME);
                this.f98d = false;
                return;
            }
            this.f100f.removeCallbacks(this.f102h);
        }
    }

    /* renamed from: a */
    static void m127a(Context context) {
        f94i.m128b(context);
    }

    /* renamed from: b */
    private void m128b(Context context) {
        this.f100f = new Handler();
        this.f101g.mo116a(Event.ON_CREATE);
        ((Application) context.getApplicationContext()).registerActivityLifecycleCallbacks(new C0035c() {
            public final void onActivityPaused(Activity activity) {
                C0055r.this.mo128d();
            }

            public final void onActivityStopped(Activity activity) {
                C0055r.this.mo129e();
            }

            public final void onActivityCreated(Activity activity, Bundle bundle) {
                C0059s.m140b(activity).f106a = C0055r.this.f95a;
            }
        });
    }
}
