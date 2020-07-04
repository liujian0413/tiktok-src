package com.facebook.drawee.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import com.facebook.common.internal.C13303f;
import com.facebook.common.internal.C13307g;
import com.facebook.common.p686c.C13286a;
import com.facebook.drawee.components.DraweeEventTracker;
import com.facebook.drawee.components.DraweeEventTracker.Event;
import com.facebook.drawee.drawable.C13436s;
import com.facebook.drawee.drawable.C13437t;
import com.facebook.drawee.p698c.C13386a;
import com.facebook.drawee.p698c.C13387b;

/* renamed from: com.facebook.drawee.view.b */
public final class C13445b<DH extends C13387b> implements C13437t {

    /* renamed from: a */
    public boolean f35651a;

    /* renamed from: b */
    public C13386a f35652b;

    /* renamed from: c */
    public final DraweeEventTracker f35653c = DraweeEventTracker.m39231a();

    /* renamed from: d */
    private boolean f35654d;

    /* renamed from: e */
    private boolean f35655e = true;

    /* renamed from: f */
    private DH f35656f;

    /* renamed from: e */
    public final boolean mo32937e() {
        if (this.f35656f != null) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private void m39498j() {
        if (!this.f35651a || !this.f35655e) {
            m39497i();
        } else {
            m39496h();
        }
    }

    /* renamed from: b */
    public final void mo32934b() {
        this.f35653c.mo32731a(Event.ON_HOLDER_ATTACH);
        this.f35651a = true;
        m39498j();
    }

    /* renamed from: c */
    public final void mo32935c() {
        this.f35653c.mo32731a(Event.ON_HOLDER_DETACH);
        this.f35651a = false;
        m39498j();
    }

    /* renamed from: d */
    public final DH mo32936d() {
        return (C13387b) C13307g.m38940a(this.f35656f);
    }

    /* renamed from: f */
    public final Drawable mo32938f() {
        if (this.f35656f == null) {
            return null;
        }
        return this.f35656f.mo32722a();
    }

    /* renamed from: g */
    private boolean m39495g() {
        if (this.f35652b == null || this.f35652b.mo32718f() != this.f35656f) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    private void m39497i() {
        if (this.f35654d) {
            this.f35653c.mo32731a(Event.ON_DETACH_CONTROLLER);
            this.f35654d = false;
            if (m39495g()) {
                this.f35652b.mo32720h();
            }
        }
    }

    /* renamed from: h */
    private void m39496h() {
        if (!this.f35654d) {
            this.f35653c.mo32731a(Event.ON_ATTACH_CONTROLLER);
            this.f35654d = true;
            if (!(this.f35652b == null || this.f35652b.mo32718f() == null)) {
                this.f35652b.mo32719g();
            }
        }
    }

    /* renamed from: a */
    public final void mo32877a() {
        if (!this.f35654d) {
            C13286a.m38851b(DraweeEventTracker.class, "%x: Draw requested for a non-attached controller %x. %s", Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(this.f35652b)), toString());
            this.f35651a = true;
            this.f35655e = true;
            m39498j();
        }
    }

    public final String toString() {
        return C13303f.m38930a((Object) this).mo32570a("controllerAttached", this.f35654d).mo32570a("holderAttached", this.f35651a).mo32570a("drawableVisible", this.f35655e).mo32569a("events", (Object) this.f35653c.toString()).toString();
    }

    /* renamed from: a */
    private void m39494a(C13437t tVar) {
        Drawable f = mo32938f();
        if (f instanceof C13436s) {
            ((C13436s) f).mo32876a(tVar);
        }
    }

    public C13445b(DH dh) {
        if (dh != null) {
            mo32932a(dh);
        }
    }

    /* renamed from: a */
    public final void mo32878a(boolean z) {
        Event event;
        if (this.f35655e != z) {
            DraweeEventTracker draweeEventTracker = this.f35653c;
            if (z) {
                event = Event.ON_DRAWABLE_SHOW;
            } else {
                event = Event.ON_DRAWABLE_HIDE;
            }
            draweeEventTracker.mo32731a(event);
            this.f35655e = z;
            m39498j();
        }
    }

    /* renamed from: a */
    public final void mo32931a(C13386a aVar) {
        boolean z = this.f35654d;
        if (z) {
            m39497i();
        }
        if (m39495g()) {
            this.f35653c.mo32731a(Event.ON_CLEAR_OLD_CONTROLLER);
            this.f35652b.mo32697a((C13387b) null);
        }
        this.f35652b = aVar;
        if (this.f35652b != null) {
            this.f35653c.mo32731a(Event.ON_SET_CONTROLLER);
            this.f35652b.mo32697a((C13387b) this.f35656f);
        } else {
            this.f35653c.mo32731a(Event.ON_CLEAR_CONTROLLER);
        }
        if (z) {
            m39496h();
        }
    }

    /* renamed from: a */
    public final void mo32932a(DH dh) {
        boolean z;
        this.f35653c.mo32731a(Event.ON_SET_HIERARCHY);
        boolean g = m39495g();
        m39494a((C13437t) null);
        this.f35656f = (C13387b) C13307g.m38940a(dh);
        Drawable a = this.f35656f.mo32722a();
        if (a == null || a.isVisible()) {
            z = true;
        } else {
            z = false;
        }
        mo32878a(z);
        m39494a((C13437t) this);
        if (g) {
            this.f35652b.mo32697a((C13387b) dh);
        }
    }

    /* renamed from: a */
    public final boolean mo32933a(MotionEvent motionEvent) {
        if (!m39495g()) {
            return false;
        }
        return this.f35652b.mo32717a(motionEvent);
    }

    /* renamed from: a */
    public static <DH extends C13387b> C13445b<DH> m39493a(DH dh, Context context) {
        return new C13445b<>(dh);
    }
}
