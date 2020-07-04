package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.Collections;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.db */
public final class C15618db extends C15788ji implements OnGlobalLayoutListener, OnScrollChangedListener, C15617da, C15636ds {

    /* renamed from: a */
    private ami f44263a;

    /* renamed from: b */
    private C15632dp f44264b;

    /* renamed from: c */
    private boolean f44265c;

    /* renamed from: d */
    private boolean f44266d;

    public C15618db(ami ami) {
        this.f44263a = ami;
        if (ami != null) {
            ami.mo39718a((C15617da) this);
        }
    }

    /* renamed from: b */
    public final String mo41481b() {
        return "";
    }

    /* renamed from: c */
    public final String mo41482c() {
        return "";
    }

    /* renamed from: d */
    public final C15612cw mo41483d() {
        return null;
    }

    /* renamed from: a */
    public final void mo41480a(C15632dp dpVar) {
        this.f44264b = dpVar;
    }

    /* renamed from: e */
    public final View mo41484e() {
        if (this.f44263a == null) {
            return null;
        }
        return this.f44263a.getView();
    }

    public final void onGlobalLayout() {
        m50411j();
    }

    public final void onScrollChanged() {
        m50411j();
    }

    /* renamed from: a */
    public final void mo41478a() {
        acl.f40003a.post(new C15619dc(this));
    }

    /* renamed from: a */
    public final void mo41479a(C15345b bVar, C15789jj jjVar) {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        if (this.f44265c) {
            acd.m45779c("Instream ad is destroyed already.");
            m50409a(jjVar, 2);
        } else if (this.f44263a.mo39464b() == null) {
            acd.m45779c("Instream internal error: can not get video controller.");
            m50409a(jjVar, 0);
        } else if (this.f44266d) {
            acd.m45779c("Instream ad should not be used again.");
            m50409a(jjVar, 1);
        } else {
            this.f44266d = true;
            m50410i();
            ((ViewGroup) C15349d.m44669a(bVar)).addView(this.f44263a.getView(), new LayoutParams(-1, -1));
            ahd.m45860a(this.f44263a.getView(), (OnGlobalLayoutListener) this);
            ahd.m45861a(this.f44263a.getView(), (OnScrollChangedListener) this);
            m50411j();
            try {
                jjVar.mo41671a();
            } catch (RemoteException e) {
                acd.m45782d("#007 Could not call remote method.", e);
            }
        }
    }

    /* renamed from: f */
    public final C15488ak mo41485f() throws RemoteException {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        if (this.f44265c) {
            acd.m45779c("Instream ad is destroyed already.");
            return null;
        } else if (this.f44263a == null) {
            return null;
        } else {
            return this.f44263a.mo39464b();
        }
    }

    /* renamed from: g */
    public final void mo41487h() {
        C15267r.m44393b("#008 Must be called on the main UI thread.");
        if (!this.f44265c) {
            m50410i();
            if (this.f44264b != null) {
                this.f44264b.mo41591l();
                this.f44264b.mo41590k();
            }
            this.f44264b = null;
            this.f44263a = null;
            this.f44265c = true;
        }
    }

    /* renamed from: i */
    private final void m50410i() {
        if (this.f44263a != null) {
            ViewParent parent = this.f44263a.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView((View) this.f44263a);
            }
        }
    }

    /* renamed from: j */
    private final void m50411j() {
        if (this.f44264b != null && this.f44263a != null) {
            this.f44264b.mo41601c(this.f44263a.getView(), Collections.emptyMap());
        }
    }

    /* renamed from: a */
    private static void m50409a(C15789jj jjVar, int i) {
        try {
            jjVar.mo41672a(i);
        } catch (RemoteException e) {
            acd.m45782d("#007 Could not call remote method.", e);
        }
    }
}
