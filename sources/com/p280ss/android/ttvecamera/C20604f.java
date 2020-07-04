package com.p280ss.android.ttvecamera;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import com.p280ss.android.ttvecamera.C20632i.C20633a;
import com.p280ss.android.ttvecamera.C20632i.C20636d;
import com.p280ss.android.ttvecamera.C20632i.C20638f;
import com.p280ss.android.ttvecamera.C20632i.C20640h;
import com.p280ss.android.ttvecamera.C20632i.C20641i;
import com.p280ss.android.ttvecamera.p919f.C20613c;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.f */
public abstract class C20604f {

    /* renamed from: a */
    private AtomicBoolean f55646a = new AtomicBoolean(false);

    /* renamed from: g */
    public boolean f55647g;

    /* renamed from: h */
    public C20632i f55648h;

    /* renamed from: i */
    protected boolean f55649i;

    /* renamed from: j */
    public C20605a f55650j;

    /* renamed from: k */
    public Handler f55651k;

    /* renamed from: l */
    public Context f55652l;

    /* renamed from: m */
    float[] f55653m = new float[16];

    /* renamed from: n */
    public C20613c f55654n;

    /* renamed from: o */
    public int f55655o;

    /* renamed from: p */
    protected int f55656p;

    /* renamed from: q */
    protected int f55657q;

    /* renamed from: r */
    protected float f55658r;

    /* renamed from: s */
    protected C20606b f55659s;

    /* renamed from: t */
    protected C20607c f55660t;

    /* renamed from: u */
    public Map<String, Bundle> f55661u = new HashMap();

    /* renamed from: com.ss.android.ttvecamera.f$a */
    public interface C20605a {
        /* renamed from: a */
        void mo55579a(int i, int i2, C20604f fVar);

        /* renamed from: a */
        void mo55580a(int i, int i2, String str);

        /* renamed from: a */
        void mo55581a(C20604f fVar);

        /* renamed from: b */
        void mo55582b(int i, int i2, String str);
    }

    /* renamed from: com.ss.android.ttvecamera.f$b */
    public interface C20606b {
        /* renamed from: a */
        TEFrameSizei mo55583a(List<TEFrameSizei> list, List<TEFrameSizei> list2);
    }

    /* renamed from: com.ss.android.ttvecamera.f$c */
    public interface C20607c {
        /* renamed from: a */
        void mo55584a(int i, float f);
    }

    /* renamed from: a */
    public abstract int mo55665a(C20632i iVar);

    /* renamed from: a */
    public abstract TEFrameSizei mo55666a(float f, TEFrameSizei tEFrameSizei);

    /* renamed from: a */
    public abstract void mo55667a();

    /* renamed from: a */
    public abstract void mo55668a(float f);

    /* renamed from: a */
    public abstract void mo55669a(float f, C20641i iVar);

    /* renamed from: a */
    public abstract void mo55670a(int i);

    /* renamed from: a */
    public abstract void mo55671a(int i, int i2, float f, int i3, int i4);

    /* renamed from: a */
    public abstract void mo55672a(int i, int i2, C20638f fVar);

    /* renamed from: a */
    public abstract void mo55673a(int i, C20638f fVar);

    /* renamed from: a */
    public void mo55613a(Bundle bundle) {
    }

    /* renamed from: a */
    public void mo55737a(C20607c cVar) {
    }

    /* renamed from: a */
    public abstract void mo55674a(C20638f fVar);

    /* renamed from: a */
    public abstract void mo55675a(C20640h hVar);

    /* renamed from: a */
    public abstract void mo55676a(C20641i iVar);

    /* renamed from: a */
    public abstract void mo55677a(C20650k kVar);

    /* renamed from: a */
    public abstract void mo55678a(boolean z);

    /* renamed from: a */
    public abstract void mo55679a(boolean z, String str);

    /* renamed from: b */
    public abstract void mo55680b();

    /* renamed from: b */
    public abstract void mo55681b(int i);

    /* renamed from: b */
    public abstract void mo55682b(C20641i iVar);

    /* renamed from: c */
    public void mo55683c() {
    }

    /* renamed from: c */
    public abstract void mo55684c(int i);

    /* renamed from: d */
    public void mo55685d() {
    }

    /* renamed from: f */
    public abstract int mo55687f();

    /* renamed from: g */
    public abstract int mo55688g();

    /* renamed from: h */
    public abstract float[] mo55689h();

    /* renamed from: i */
    public abstract void mo55690i();

    /* renamed from: j */
    public abstract boolean mo55691j();

    /* renamed from: k */
    public abstract boolean mo55692k();

    /* renamed from: a */
    public final void mo55738a(C20636d dVar) {
        if (dVar != null && dVar.f55753a == 2) {
            this.f55646a.set(true);
        }
    }

    /* renamed from: e */
    public void mo55686e() {
        C20652m.m68435b("TECameraBase", "close...");
    }

    /* renamed from: t */
    public final C20633a mo55741t() {
        return this.f55648h.f55745x;
    }

    /* renamed from: r */
    public final int mo55739r() {
        if (this.f55646a.getAndSet(false)) {
            mo55688g();
        }
        return this.f55657q;
    }

    /* renamed from: u */
    public final int mo55742u() {
        if (this.f55648h.f55745x != null) {
            return this.f55648h.f55745x.f55749b;
        }
        return 0;
    }

    /* renamed from: s */
    public final boolean mo55740s() {
        if (this.f55648h.f55745x == null || !this.f55648h.f55745x.mo55812a()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public Bundle mo55615l() {
        Bundle bundle;
        if (this.f55661u.containsKey(this.f55648h.f55743v)) {
            bundle = (Bundle) this.f55661u.get(this.f55648h.f55743v);
        } else {
            bundle = new Bundle();
            this.f55661u.put(this.f55648h.f55743v, bundle);
        }
        bundle.putInt("facing", this.f55648h.f55726e);
        return bundle;
    }

    /* renamed from: a */
    public final Bundle mo55736a(String str) {
        return (Bundle) this.f55661u.get(str);
    }

    public C20604f(Context context, C20605a aVar, Handler handler, C20606b bVar) {
        this.f55652l = context;
        this.f55650j = aVar;
        this.f55651k = handler;
        this.f55659s = bVar;
    }
}
