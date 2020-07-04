package com.bytedance.android.live.core.performance;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;

public abstract class BaseSampler<T> implements C0042h, Runnable {

    /* renamed from: f */
    private static final String f9888f = BaseSampler.class.getClass().getSimpleName();

    /* renamed from: a */
    protected final int f9889a;

    /* renamed from: b */
    protected final int f9890b;

    /* renamed from: c */
    protected Handler f9891c;

    /* renamed from: d */
    protected WeakReference<Context> f9892d;

    /* renamed from: e */
    protected C3220a f9893e;

    /* renamed from: g */
    private ArrayList<T> f9894g = new ArrayList<>();

    /* renamed from: com.bytedance.android.live.core.performance.BaseSampler$a */
    public interface C3220a {
        /* renamed from: a */
        void mo10127a();

        /* renamed from: a */
        void mo10128a(ArrayList arrayList, HashMap<String, String> hashMap);
    }

    @C0054q(mo125a = Event.ON_CREATE)
    public void onCreate() {
    }

    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        mo10117a();
    }

    @C0054q(mo125a = Event.ON_PAUSE)
    public void onPause() {
    }

    @C0054q(mo125a = Event.ON_RESUME)
    public void onResume() {
    }

    @C0054q(mo125a = Event.ON_START)
    public void onStart() {
    }

    @C0054q(mo125a = Event.ON_STOP)
    public void onStop() {
    }

    /* renamed from: a */
    public final void mo10117a() {
        if (this.f9891c != null) {
            this.f9891c.removeCallbacks(this);
            this.f9891c = null;
        }
        if (this.f9893e != null) {
            this.f9893e.mo10127a();
            this.f9893e = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo10119a(T t) {
        this.f9894g.add(t);
    }

    /* renamed from: a */
    public void mo10120a(HashMap<String, String> hashMap) {
        if (this.f9891c != null) {
            this.f9891c.removeCallbacks(this);
            this.f9891c = null;
        }
        if (this.f9893e != null) {
            this.f9893e.mo10128a(this.f9894g, hashMap);
            this.f9893e = null;
        }
    }

    public BaseSampler(int i, int i2) {
        this.f9889a = i;
        this.f9890b = i2;
    }

    /* renamed from: a */
    public final void mo10118a(Handler handler, Context context, C3220a aVar) {
        this.f9891c = handler;
        this.f9892d = new WeakReference<>(context);
        this.f9893e = aVar;
        if (this.f9891c != null) {
            this.f9891c.post(this);
        }
    }
}
