package com.facebook.drawee.controller;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13307g;
import com.facebook.common.p686c.C13286a;
import com.facebook.datasource.C13345b;
import com.facebook.datasource.C13346c;
import com.facebook.drawee.components.C13390a;
import com.facebook.drawee.components.C13390a.C13392a;
import com.facebook.drawee.components.C13393b;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.DraweeEventTracker.Event;
import com.facebook.drawee.p694b.C13364a;
import com.facebook.drawee.p694b.C13364a.C13365a;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.p698c.C13387b;
import com.facebook.drawee.p698c.C13388c;
import com.facebook.imagepipeline.p725l.C13783b;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.drawee.controller.a */
public abstract class C13396a<T, INFO> implements C13365a, C13386a, C13392a {

    /* renamed from: a */
    private static final Class<?> f35460a = C13396a.class;

    /* renamed from: b */
    private final DraweeEventTracker f35461b = DraweeEventTracker.m39231a();

    /* renamed from: c */
    private final C13390a f35462c;

    /* renamed from: d */
    private final Executor f35463d;

    /* renamed from: e */
    private C13393b f35464e;

    /* renamed from: f */
    public C13364a f35465f;

    /* renamed from: g */
    public C13402e f35466g;

    /* renamed from: h */
    public Drawable f35467h;

    /* renamed from: i */
    public String f35468i;

    /* renamed from: j */
    public Object f35469j;

    /* renamed from: k */
    public boolean f35470k;

    /* renamed from: l */
    public boolean f35471l;

    /* renamed from: m */
    public boolean f35472m;

    /* renamed from: n */
    private C13401d<INFO> f35473n;

    /* renamed from: o */
    private C13388c f35474o;

    /* renamed from: p */
    private boolean f35475p;

    /* renamed from: q */
    private boolean f35476q;

    /* renamed from: r */
    private String f35477r;

    /* renamed from: s */
    private C13346c<T> f35478s;

    /* renamed from: t */
    private T f35479t;

    /* renamed from: u */
    private Drawable f35480u;

    /* renamed from: v */
    private boolean f35481v = true;

    /* renamed from: com.facebook.drawee.controller.a$a */
    static class C13398a<INFO> extends C13403f<INFO> {
        private C13398a() {
        }

        /* renamed from: a */
        public static <INFO> C13398a<INFO> m39309a(C13401d<? super INFO> dVar, C13401d<? super INFO> dVar2) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("AbstractDraweeController#createInternal");
            }
            C13398a<INFO> aVar = new C13398a<>();
            aVar.mo32766a(dVar);
            aVar.mo32766a(dVar2);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            return aVar;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo32693a(Drawable drawable);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo32699a(T t);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo32700a(String str, T t) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C13346c<T> mo32702b();

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public T mo32705c() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract INFO mo32706c(T t);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract Drawable mo32707d(T t);

    /* renamed from: f */
    public final C13387b mo32718f() {
        return this.f35474o;
    }

    /* renamed from: a */
    public final boolean mo32717a(MotionEvent motionEvent) {
        if (C13286a.m38846a(2)) {
            C13286a.m38837a(f35460a, "controller %x %s: onTouchEvent %s", Integer.valueOf(System.identityHashCode(this)), this.f35468i, motionEvent);
        }
        if (this.f35465f == null) {
            return false;
        }
        if (!this.f35465f.f35321c && !m39280l()) {
            return false;
        }
        this.f35465f.mo32675a(motionEvent);
        return true;
    }

    /* renamed from: a */
    public final void mo32759a(String str, C13346c<T> cVar, T t, float f, boolean z, boolean z2, boolean z3) {
        Drawable d;
        T t2;
        Drawable drawable;
        try {
            if (C13783b.m40665b()) {
                C13783b.m40664a("AbstractDraweeController#onNewResultInternal");
            }
            if (!m39275a(str, cVar)) {
                m39277d("ignore_old_datasource @ onNewResult", t);
                mo32699a(t);
                cVar.mo32644g();
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
                return;
            }
            this.f35461b.mo32731a(z ? Event.ON_DATASOURCE_RESULT : Event.ON_DATASOURCE_RESULT_INT);
            try {
                d = mo32707d(t);
                t2 = this.f35479t;
                drawable = this.f35480u;
                this.f35479t = t;
                this.f35480u = d;
                if (z) {
                    m39277d("set_final_result @ onNewResult", t);
                    this.f35478s = null;
                    this.f35474o.mo32725a(d, 1.0f, z2);
                    m39279k().onFinalImageSet(str, mo32706c(t), mo32721j());
                } else if (z3) {
                    m39277d("set_temporary_result @ onNewResult", t);
                    this.f35474o.mo32725a(d, 1.0f, z2);
                    m39279k().onFinalImageSet(str, mo32706c(t), mo32721j());
                } else {
                    m39277d("set_intermediate_result @ onNewResult", t);
                    this.f35474o.mo32725a(d, f, z2);
                    m39279k().onIntermediateImageSet(str, mo32706c(t));
                }
                if (!(drawable == null || drawable == d)) {
                    mo32693a(drawable);
                }
                if (!(t2 == null || t2 == t)) {
                    m39277d("release_previous_result @ onNewResult", t2);
                    mo32699a(t2);
                }
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            } catch (Exception e) {
                m39277d("drawable_failed @ onNewResult", t);
                mo32699a(t);
                mo32760a(str, cVar, (Throwable) e, z);
                if (C13783b.m40665b()) {
                    C13783b.m40663a();
                }
            }
        } catch (Throwable th) {
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void mo32760a(String str, C13346c<T> cVar, Throwable th, boolean z) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("AbstractDraweeController#onFailureInternal");
        }
        if (!m39275a(str, cVar)) {
            m39274a("ignore_old_datasource @ onFailure", th);
            cVar.mo32644g();
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            return;
        }
        this.f35461b.mo32731a(z ? Event.ON_DATASOURCE_FAILURE : Event.ON_DATASOURCE_FAILURE_INT);
        if (z) {
            m39274a("final_failed @ onFailure", th);
            this.f35478s = null;
            this.f35471l = true;
            if (this.f35472m && this.f35480u != null) {
                this.f35474o.mo32725a(this.f35480u, 1.0f, true);
            } else if (m39281m()) {
                this.f35474o.mo32728b(th);
            } else {
                this.f35474o.mo32726a(th);
            }
            m39279k().onFailure(this.f35468i, th);
        } else {
            m39274a("intermediate_failed @ onFailure", th);
            m39279k().onIntermediateImageFailed(this.f35468i, th);
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    /* renamed from: l */
    private boolean m39280l() {
        return m39281m();
    }

    /* renamed from: k */
    private C13401d<INFO> m39279k() {
        if (this.f35473n == null) {
            return C13400c.getNoOpListener();
        }
        return this.f35473n;
    }

    /* renamed from: j */
    public final Animatable mo32721j() {
        if (this.f35480u instanceof Animatable) {
            return (Animatable) this.f35480u;
        }
        return null;
    }

    /* renamed from: m */
    private boolean m39281m() {
        if (!this.f35471l || this.f35464e == null || !this.f35464e.mo32739c()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final C13393b mo32764e() {
        if (this.f35464e == null) {
            this.f35464e = new C13393b();
        }
        return this.f35464e;
    }

    /* renamed from: h */
    public final void mo32720h() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("AbstractDraweeController#onDetach");
        }
        if (C13286a.m38846a(2)) {
            C13286a.m38836a(f35460a, "controller %x %s: onDetach", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.f35468i);
        }
        this.f35461b.mo32731a(Event.ON_DETACH_CONTROLLER);
        this.f35470k = false;
        this.f35462c.mo32733a(this);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    /* renamed from: i */
    public final boolean mo32677i() {
        if (C13286a.m38846a(2)) {
            C13286a.m38836a(f35460a, "controller %x %s: onClick", (Object) Integer.valueOf(System.identityHashCode(this)), (Object) this.f35468i);
        }
        if (!m39281m()) {
            return false;
        }
        this.f35464e.mo32740d();
        this.f35474o.mo32727b();
        m39282n();
        return true;
    }

    public String toString() {
        return C13303f.m38930a((Object) this).mo32570a("isAttached", this.f35470k).mo32570a("isRequestSubmitted", this.f35475p).mo32570a("hasFetchFailed", this.f35471l).mo32568a("fetchedImage", mo32701b(this.f35479t)).mo32569a("events", (Object) this.f35461b.toString()).toString();
    }

    /* renamed from: a */
    private void mo32692a() {
        boolean z = this.f35475p;
        this.f35475p = false;
        this.f35471l = false;
        if (this.f35478s != null) {
            this.f35478s.mo32644g();
            this.f35478s = null;
        }
        if (this.f35480u != null) {
            mo32693a(this.f35480u);
        }
        if (this.f35477r != null) {
            this.f35477r = null;
        }
        this.f35480u = null;
        if (this.f35479t != null) {
            m39277d("release", this.f35479t);
            mo32699a(this.f35479t);
            this.f35479t = null;
        }
        if (z) {
            m39279k().onRelease(this.f35468i);
        }
    }

    /* renamed from: d */
    public final void mo32736d() {
        this.f35461b.mo32731a(Event.ON_RELEASE_CONTROLLER);
        if (this.f35464e != null) {
            this.f35464e.mo32738b();
        }
        if (this.f35465f != null) {
            this.f35465f.mo32676b();
        }
        if (this.f35474o != null) {
            this.f35474o.mo32727b();
        }
        mo32692a();
    }

    /* renamed from: g */
    public final void mo32719g() {
        String str;
        if (C13783b.m40665b()) {
            C13783b.m40664a("AbstractDraweeController#onAttach");
        }
        if (C13286a.m38846a(2)) {
            Class<?> cls = f35460a;
            String str2 = "controller %x %s: onAttach: %s";
            Integer valueOf = Integer.valueOf(System.identityHashCode(this));
            String str3 = this.f35468i;
            if (this.f35475p) {
                str = "request already submitted";
            } else {
                str = "request needs submit";
            }
            C13286a.m38837a(cls, str2, valueOf, str3, str);
        }
        this.f35461b.mo32731a(Event.ON_ATTACH_CONTROLLER);
        C13307g.m38940a(this.f35474o);
        this.f35462c.mo32734b(this);
        this.f35470k = true;
        if (!this.f35475p) {
            m39282n();
        }
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    /* renamed from: n */
    private void m39282n() {
        if (C13783b.m40665b()) {
            C13783b.m40664a("AbstractDraweeController#submitRequest");
        }
        Object c = mo32705c();
        if (c != null) {
            if (C13783b.m40665b()) {
                C13783b.m40664a("AbstractDraweeController#submitRequest->cache");
            }
            this.f35478s = null;
            this.f35475p = true;
            this.f35471l = false;
            this.f35461b.mo32731a(Event.ON_SUBMIT_CACHE_HIT);
            m39279k().onSubmit(this.f35468i, this.f35469j);
            mo32700a(this.f35468i, (T) c);
            mo32759a(this.f35468i, this.f35478s, c, 1.0f, true, true, true);
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            if (C13783b.m40665b()) {
                C13783b.m40663a();
            }
            return;
        }
        this.f35461b.mo32731a(Event.ON_DATASOURCE_SUBMIT);
        m39279k().onSubmit(this.f35468i, this.f35469j);
        this.f35474o.mo32723a(0.0f, true);
        this.f35475p = true;
        this.f35471l = false;
        this.f35478s = mo32702b();
        if (C13286a.m38846a(2)) {
            C13286a.m38837a(f35460a, "controller %x %s: submitRequest: dataSource: %x", Integer.valueOf(System.identityHashCode(this)), this.f35468i, Integer.valueOf(System.identityHashCode(this.f35478s)));
        }
        final String str = this.f35468i;
        final boolean c2 = this.f35478s.mo32640c();
        this.f35478s.mo32633a(new C13345b<T>() {
            public final void onFailureImpl(C13346c<T> cVar) {
                C13396a.this.mo32760a(str, cVar, cVar.mo32642e(), true);
            }

            public final void onProgressUpdate(C13346c<T> cVar) {
                boolean b = cVar.mo32639b();
                C13396a.this.mo32758a(str, cVar, cVar.mo32643f(), b);
            }

            public final void onNewResultImpl(C13346c<T> cVar) {
                boolean b = cVar.mo32639b();
                float f = cVar.mo32643f();
                Object d = cVar.mo32641d();
                if (d != null) {
                    C13396a.this.mo32759a(str, cVar, d, f, b, c2, false);
                    return;
                }
                if (b) {
                    C13396a.this.mo32760a(str, cVar, (Throwable) new NullPointerException(), true);
                }
            }
        }, this.f35463d);
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo32701b(T t) {
        return System.identityHashCode(t);
    }

    /* renamed from: e */
    private static String m39278e(T t) {
        if (t != null) {
            return t.getClass().getSimpleName();
        }
        return "<null>";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo32755a(C13364a aVar) {
        this.f35465f = aVar;
        if (this.f35465f != null) {
            this.f35465f.f35319a = this;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo32761b(Drawable drawable) {
        this.f35467h = drawable;
        if (this.f35474o != null) {
            this.f35474o.mo32724a(this.f35467h);
        }
    }

    /* renamed from: b */
    public final void mo32762b(C13401d<? super INFO> dVar) {
        C13307g.m38940a(dVar);
        if (this.f35473n instanceof C13398a) {
            ((C13398a) this.f35473n).mo32767b(dVar);
            return;
        }
        if (this.f35473n == dVar) {
            this.f35473n = null;
        }
    }

    /* renamed from: a */
    public void mo32697a(C13387b bVar) {
        Event event;
        if (C13286a.m38846a(2)) {
            C13286a.m38837a(f35460a, "controller %x %s: setHierarchy: %s", Integer.valueOf(System.identityHashCode(this)), this.f35468i, bVar);
        }
        DraweeEventTracker draweeEventTracker = this.f35461b;
        if (bVar != null) {
            event = Event.ON_SET_HIERARCHY;
        } else {
            event = Event.ON_CLEAR_HIERARCHY;
        }
        draweeEventTracker.mo32731a(event);
        if (this.f35475p) {
            this.f35462c.mo32734b(this);
            mo32736d();
        }
        if (this.f35474o != null) {
            this.f35474o.mo32724a((Drawable) null);
            this.f35474o = null;
        }
        if (bVar != null) {
            C13307g.m38943a(bVar instanceof C13388c);
            this.f35474o = (C13388c) bVar;
            this.f35474o.mo32724a(this.f35467h);
        }
    }

    /* renamed from: a */
    public final void mo32756a(C13401d<? super INFO> dVar) {
        C13307g.m38940a(dVar);
        if (this.f35473n instanceof C13398a) {
            ((C13398a) this.f35473n).mo32766a(dVar);
        } else if (this.f35473n != null) {
            this.f35473n = C13398a.m39309a(this.f35473n, dVar);
        } else {
            this.f35473n = dVar;
        }
    }

    /* renamed from: a */
    public final void mo32757a(String str) {
        this.f35477r = str;
    }

    /* renamed from: a */
    private void m39274a(String str, Throwable th) {
        if (C13286a.m38846a(2)) {
            C13286a.m38838a(f35460a, "controller %x %s: %s: failure: %s", Integer.valueOf(System.identityHashCode(this)), this.f35468i, str, th);
        }
    }

    /* renamed from: a */
    private boolean m39275a(String str, C13346c<T> cVar) {
        if (cVar == null && this.f35478s == null) {
            return true;
        }
        if (!str.equals(this.f35468i) || cVar != this.f35478s || !this.f35475p) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private void m39277d(String str, T t) {
        if (C13286a.m38846a(2)) {
            C13286a.m38840a(f35460a, "controller %x %s: %s: image: %s %x", Integer.valueOf(System.identityHashCode(this)), this.f35468i, str, m39278e(t), Integer.valueOf(mo32701b(t)));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo32763b(String str, Object obj) {
        m39276c(str, obj);
        this.f35481v = false;
    }

    /* renamed from: c */
    private synchronized void m39276c(String str, Object obj) {
        if (C13783b.m40665b()) {
            C13783b.m40664a("AbstractDraweeController#init");
        }
        this.f35461b.mo32731a(Event.ON_INIT_CONTROLLER);
        if (!this.f35481v && this.f35462c != null) {
            this.f35462c.mo32734b(this);
        }
        this.f35470k = false;
        this.f35476q = false;
        mo32692a();
        this.f35472m = false;
        if (this.f35464e != null) {
            this.f35464e.mo32737a();
        }
        if (this.f35465f != null) {
            this.f35465f.mo32674a();
            this.f35465f.f35319a = this;
        }
        if (this.f35473n instanceof C13398a) {
            ((C13398a) this.f35473n).mo32765a();
        } else {
            this.f35473n = null;
        }
        this.f35466g = null;
        if (this.f35474o != null) {
            this.f35474o.mo32727b();
            this.f35474o.mo32724a((Drawable) null);
            this.f35474o = null;
        }
        this.f35467h = null;
        if (C13286a.m38846a(2)) {
            C13286a.m38837a(f35460a, "controller %x %s -> %s: initialize", Integer.valueOf(System.identityHashCode(this)), this.f35468i, str);
        }
        this.f35468i = str;
        this.f35469j = obj;
        if (C13783b.m40665b()) {
            C13783b.m40663a();
        }
    }

    public C13396a(C13390a aVar, Executor executor, String str, Object obj) {
        this.f35462c = aVar;
        this.f35463d = executor;
        m39276c(null, null);
    }

    /* renamed from: a */
    public final void mo32758a(String str, C13346c<T> cVar, float f, boolean z) {
        if (!m39275a(str, cVar)) {
            m39274a("ignore_old_datasource @ onProgress", (Throwable) null);
            cVar.mo32644g();
            return;
        }
        if (!z) {
            this.f35474o.mo32723a(f, false);
        }
    }
}
