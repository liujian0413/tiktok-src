package com.p280ss.android.ttvecamera.p920g;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.Handler;
import com.p280ss.android.ttvecamera.C20604f.C20605a;
import com.p280ss.android.ttvecamera.C20604f.C20606b;
import com.p280ss.android.ttvecamera.C20604f.C20607c;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.p914a.C20551a;
import com.p280ss.android.ttvecamera.p916c.C20581b;
import com.p280ss.android.ttvecamera.p917d.C20598i;

/* renamed from: com.ss.android.ttvecamera.g.a */
public final class C20625a extends C20551a {
    /* renamed from: l */
    public final Bundle mo55615l() {
        Bundle l = super.mo55615l();
        l.putBoolean("support_wide_angle", ((C20598i) this.f55638a).mo55726b().equals(this.f55648h.f55743v));
        l.putBoolean("support_anti_shake", true);
        return l;
    }

    /* renamed from: m */
    public final int mo55616m() throws Exception {
        int i;
        if (this.f55537v == null) {
            this.f55537v = (CameraManager) this.f55652l.getSystemService("camera");
            if (this.f55537v == null) {
                return -1;
            }
        }
        if (this.f55648h.f55737p == 0) {
            this.f55643f = new C20628c(this, this.f55652l, this.f55537v, this.f55651k);
        } else {
            this.f55643f = new C20626b(this, this.f55652l, this.f55537v, this.f55651k);
            this.f55643f.mo55705a(this.f55659s);
        }
        this.f55643f.f55614t = this.f55660t;
        this.f55648h.f55743v = this.f55643f.mo55625a(this.f55648h.f55726e);
        StringBuilder sb = new StringBuilder("_open:mCameraSettings.mStrCameraID ");
        sb.append(this.f55648h.f55743v);
        C20652m.m68434a("TEVivoCameraImp", sb.toString());
        if (this.f55648h.f55743v == null) {
            return -401;
        }
        C20581b bVar = this.f55643f;
        String str = this.f55648h.f55743v;
        if (this.f55642e) {
            i = this.f55648h.f55739r;
        } else {
            i = 0;
        }
        int a = bVar.mo55702a(str, i);
        if (a != 0) {
            return a;
        }
        mo55615l();
        this.f55650j.mo55582b(1, 0, "TEVivoCamera2 features is ready");
        this.f55537v.openCamera(this.f55648h.f55743v, this.f55540y, this.f55651k);
        return 0;
    }

    /* renamed from: a */
    public final void mo55737a(C20607c cVar) {
        this.f55660t = cVar;
    }

    /* renamed from: d */
    public final void mo55614d(int i) {
        if (this.f55643f != null) {
            mo55618o();
            if (i == 0) {
                this.f55643f = new C20628c(this, this.f55652l, this.f55537v, this.f55651k);
            } else {
                this.f55643f = new C20626b(this, this.f55652l, this.f55537v, this.f55651k);
                this.f55643f.mo55705a(this.f55659s);
            }
            this.f55643f.f55614t = this.f55660t;
            try {
                this.f55648h.f55743v = this.f55643f.mo55625a(this.f55648h.f55726e);
                if (this.f55648h.f55743v == null || this.f55643f.mo55702a(this.f55648h.f55743v, this.f55648h.f55739r) != 0) {
                    return;
                }
            } catch (CameraAccessException unused) {
            }
            this.f55643f.mo55626a((Object) this.f55538w);
            mo55617n();
        }
    }

    public C20625a(int i, Context context, C20605a aVar, Handler handler, C20606b bVar) {
        super(i, context, aVar, handler, bVar);
    }
}
