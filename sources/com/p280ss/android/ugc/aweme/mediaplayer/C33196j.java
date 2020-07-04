package com.p280ss.android.ugc.aweme.mediaplayer;

import android.view.Surface;
import android.view.TextureView;
import com.p280ss.android.ugc.asve.p754b.C15387b;
import com.p280ss.android.ugc.asve.p754b.C15389d;
import com.p280ss.android.ugc.asve.p754b.C15390e;
import com.p280ss.android.ugc.asve.p754b.C15391f;
import com.p280ss.android.vesdk.VEEditor.SEEK_MODE;
import com.p280ss.android.vesdk.VEEditor.VEState;

/* renamed from: com.ss.android.ugc.aweme.mediaplayer.j */
public final class C33196j implements C33187a {

    /* renamed from: a */
    private C15389d f86379a;

    /* renamed from: b */
    private long f86380b;

    /* renamed from: c */
    private long f86381c;

    /* renamed from: d */
    private double f86382d = 1.0d;

    /* renamed from: a */
    public final void mo84938a() {
        this.f86379a.mo38880w();
    }

    /* renamed from: d */
    public final void mo84948d() {
        this.f86379a.mo38876t();
    }

    /* renamed from: g */
    private boolean m107082g() {
        if (this.f86379a.mo38850h() == VEState.STARTED) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo84944b() {
        this.f86379a.mo38879v();
    }

    /* renamed from: c */
    public final void mo84947c() {
        this.f86379a.mo38880w();
    }

    /* renamed from: e */
    public final long mo84949e() {
        double l = (double) this.f86379a.mo38860l();
        double d = this.f86382d;
        Double.isNaN(l);
        return (long) (l * d);
    }

    /* renamed from: f */
    public final long mo84950f() {
        double m = (double) this.f86379a.mo38862m();
        double d = this.f86382d;
        Double.isNaN(m);
        return (long) (m * d);
    }

    /* renamed from: b */
    public final int mo84943b(long j) {
        mo84940a(j, this.f86381c);
        return 0;
    }

    /* renamed from: c */
    public final int mo84946c(long j) {
        mo84940a(this.f86380b, j);
        return 0;
    }

    /* renamed from: a */
    public final void mo84939a(double d) {
        this.f86379a.mo38803a(0, 0, (float) d);
    }

    /* renamed from: a */
    public final int mo84936a(long j) {
        C15389d dVar = this.f86379a;
        double d = (double) j;
        double d2 = this.f86382d;
        Double.isNaN(d);
        dVar.mo38763a((int) (d / d2), SEEK_MODE.EDITOR_SEEK_FLAG_OnGoing);
        return 0;
    }

    /* renamed from: b */
    public final void mo84945b(double d) {
        this.f86382d = d;
        this.f86379a.mo38747a((float) d);
    }

    /* renamed from: a */
    public final int mo84937a(String str) {
        this.f86379a.mo38772a((C15390e) new C15391f(new String[]{str}));
        this.f86379a.mo38868p();
        return 0;
    }

    /* renamed from: a */
    public final void mo84941a(boolean z) {
        this.f86379a.mo38832c(z);
    }

    /* renamed from: a */
    public final boolean mo84942a(Surface surface) {
        this.f86379a.mo38879v();
        return true;
    }

    public C33196j(String str, TextureView textureView) {
        this.f86379a = C15387b.m44887a(str, textureView);
    }

    /* renamed from: a */
    public final void mo84940a(long j, long j2) {
        boolean g = m107082g();
        this.f86380b = j;
        this.f86381c = j2;
        this.f86379a.mo38812b(((int) j) / 2, ((int) j2) / 2);
        mo84936a(j);
        if (g) {
            mo84944b();
        }
    }
}
