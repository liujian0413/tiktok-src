package com.p280ss.android.ttvecamera.p914a;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.os.Bundle;
import android.os.Handler;
import com.p280ss.android.ttvecamera.C20599e;
import com.p280ss.android.ttvecamera.C20599e.C20600a;
import com.p280ss.android.ttvecamera.C20604f.C20605a;
import com.p280ss.android.ttvecamera.C20604f.C20606b;
import com.p280ss.android.ttvecamera.C20632i.C20637e;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.p916c.C20581b;

/* renamed from: com.ss.android.ttvecamera.a.a */
public class C20551a extends C20599e {

    /* renamed from: v */
    protected CameraManager f55537v;

    /* renamed from: w */
    protected CameraDevice f55538w;

    /* renamed from: x */
    protected int f55539x = -1;

    /* renamed from: y */
    protected StateCallback f55540y = new StateCallback() {

        /* renamed from: a */
        C20600a<CameraDevice> f55541a = new C20600a<>(C20551a.this);

        public final void onDisconnected(CameraDevice cameraDevice) {
            C20652m.m68434a("TECamera2", "onDisconnected: OpenCameraCallBack");
            this.f55541a.mo55734b(cameraDevice);
        }

        public final void onOpened(CameraDevice cameraDevice) {
            C20652m.m68434a("TECamera2", "onOpened: OpenCameraCallBack");
            C20551a.this.f55538w = cameraDevice;
            C20551a.this.f55643f.mo55626a((Object) cameraDevice);
            if (!this.f55541a.mo55732a(cameraDevice)) {
                cameraDevice.close();
            }
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            StringBuilder sb = new StringBuilder("onError: ");
            sb.append(i);
            C20652m.m68434a("TECamera2", sb.toString());
            this.f55541a.mo55733a(cameraDevice, i);
        }
    };

    /* renamed from: l */
    public Bundle mo55615l() {
        return super.mo55615l();
    }

    /* renamed from: p */
    public final boolean mo55619p() {
        if (this.f55538w != null) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public final int mo55617n() {
        if (this.f55643f == null) {
            this.f55650j.mo55580a(this.f55648h.f55724c, -425, "_startCapture : mode is null");
            return -1;
        }
        try {
            this.f55643f.mo55636g();
            int f = this.f55643f.mo55635f();
            if (f != 0) {
                this.f55650j.mo55580a(this.f55648h.f55724c, f, "_startCapture : something wrong");
            }
            return f;
        } catch (Exception unused) {
            this.f55650j.mo55580a(this.f55648h.f55724c, -425, "_startCapture : mode is null");
            return -1;
        }
    }

    /* renamed from: o */
    public final int mo55618o() {
        if (this.f55643f == null) {
            this.f55650j.mo55580a(this.f55648h.f55724c, -425, "_stopCapture : mode is null");
            return -1;
        }
        try {
            this.f55643f.mo55636g();
            this.f55650j.mo55582b(4, 0, "TECamera2 preview stoped");
            return 0;
        } catch (Exception unused) {
            this.f55650j.mo55580a(this.f55648h.f55724c, -425, "_stopCapture : mode is null");
            return -1;
        }
    }

    /* renamed from: q */
    public final void mo55620q() {
        try {
            this.f55643f.mo55709j();
            this.f55643f.mo55636g();
            if (this.f55538w != null) {
                this.f55538w.close();
                this.f55538w = null;
                this.f55650j.mo55581a(this);
            }
        } catch (Throwable th) {
            C20652m.m68437d("TECamera2", th.getMessage());
        }
        super.mo55620q();
    }

    /* renamed from: m */
    public int mo55616m() throws Exception {
        int i;
        if (this.f55537v == null) {
            this.f55537v = (CameraManager) this.f55652l.getSystemService("camera");
            if (this.f55537v == null) {
                return -401;
            }
        }
        if (this.f55648h.f55737p == 0) {
            this.f55643f = new C20561d(this, this.f55652l, this.f55537v, this.f55651k);
        } else {
            this.f55643f = new C20554c(this, this.f55652l, this.f55537v, this.f55651k);
            this.f55643f.mo55705a(this.f55659s);
        }
        this.f55648h.f55743v = this.f55643f.mo55625a(this.f55648h.f55726e);
        if (this.f55648h.f55743v == null) {
            C20652m.m68437d("TECamera2", "Invalid CameraID");
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
        this.f55650j.mo55582b(1, 0, "TECamera2 features is ready");
        this.f55537v.openCamera(this.f55648h.f55743v, this.f55540y, this.f55651k);
        return 0;
    }

    /* renamed from: a */
    public void mo55613a(Bundle bundle) {
        super.mo55613a(bundle);
        if (bundle != null) {
            Bundle bundle2 = (Bundle) this.f55661u.get(this.f55648h.f55743v);
            for (String str : bundle.keySet()) {
                if (C20637e.m68399a(str, bundle.get(str)) && str == "support_light_soft") {
                    bundle2.putBoolean("support_light_soft", bundle.getBoolean("support_light_soft"));
                }
            }
        }
    }

    /* renamed from: d */
    public void mo55614d(int i) {
        if (this.f55643f != null) {
            mo55618o();
            if (i == 0) {
                this.f55643f = new C20561d(this, this.f55652l, this.f55537v, this.f55651k);
            } else {
                this.f55643f = new C20554c(this, this.f55652l, this.f55537v, this.f55651k);
                this.f55643f.mo55705a(this.f55659s);
            }
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

    public C20551a(int i, Context context, C20605a aVar, Handler handler, C20606b bVar) {
        super(i, context, aVar, handler, bVar);
    }
}
