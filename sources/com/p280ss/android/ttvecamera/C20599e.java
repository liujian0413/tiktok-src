package com.p280ss.android.ttvecamera;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Size;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ttvecamera.C20604f.C20605a;
import com.p280ss.android.ttvecamera.C20604f.C20606b;
import com.p280ss.android.ttvecamera.C20632i.C20638f;
import com.p280ss.android.ttvecamera.C20632i.C20640h;
import com.p280ss.android.ttvecamera.C20632i.C20641i;
import com.p280ss.android.ttvecamera.p914a.C20551a;
import com.p280ss.android.ttvecamera.p916c.C20581b;
import com.p280ss.android.ttvecamera.p917d.C20590c;
import com.p280ss.android.ttvecamera.p918e.C20601a;
import com.p280ss.android.ttvecamera.p920g.C20625a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.e */
public abstract class C20599e extends C20604f {

    /* renamed from: a */
    protected C20590c f55638a;

    /* renamed from: b */
    protected volatile int f55639b;

    /* renamed from: c */
    protected CameraCharacteristics f55640c;

    /* renamed from: d */
    protected CaptureRequest f55641d;

    /* renamed from: e */
    protected boolean f55642e = true;

    /* renamed from: f */
    public C20581b f55643f;

    /* renamed from: com.ss.android.ttvecamera.e$a */
    public static class C20600a<T> {

        /* renamed from: a */
        WeakReference<C20599e> f55644a;

        public C20600a(C20599e eVar) {
            this.f55644a = new WeakReference<>(eVar);
        }

        /* renamed from: b */
        public final boolean mo55734b(T t) {
            C20652m.m68435b("TECamera2", "StateCallback::onDisconnected...");
            C20599e eVar = (C20599e) this.f55644a.get();
            if (eVar == null) {
                return false;
            }
            eVar.mo55620q();
            return true;
        }

        /* renamed from: a */
        public final boolean mo55732a(T t) {
            C20652m.m68434a("TECamera2", "StateCallback::onOpened...");
            C20599e eVar = (C20599e) this.f55644a.get();
            if (eVar == null) {
                return false;
            }
            eVar.f55639b = 2;
            if (eVar.f55650j != null) {
                eVar.f55650j.mo55579a(2, 0, (C20604f) null);
            } else {
                C20652m.m68437d("TECamera2", "mCameraEvents is null!");
            }
            eVar.f55642e = false;
            return true;
        }

        /* renamed from: a */
        public final boolean mo55733a(T t, int i) {
            C20652m.m68434a("TECamera2", "StateCallback::onError...");
            C20599e eVar = (C20599e) this.f55644a.get();
            if (eVar == null) {
                return false;
            }
            eVar.mo55620q();
            if (eVar.f55650j != null) {
                eVar.f55650j.mo55579a(eVar.f55648h.f55724c, i, (C20604f) null);
            }
            eVar.f55639b = 4;
            return true;
        }
    }

    /* renamed from: b */
    public final void mo55681b(int i) {
    }

    /* renamed from: b */
    public final void mo55682b(C20641i iVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo55614d(int i);

    /* renamed from: f */
    public final int mo55687f() {
        return 2;
    }

    /* renamed from: j */
    public final boolean mo55691j() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public abstract int mo55616m() throws Exception;

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public abstract int mo55617n();

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public abstract int mo55618o();

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public abstract boolean mo55619p();

    /* renamed from: a */
    public final void mo55672a(int i, int i2, C20638f fVar) {
        if (this.f55639b == 1) {
            C20652m.m68435b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f55639b == 2) {
            C20652m.m68435b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!mo55619p() || this.f55643f == null) {
            String str = "takePicture : camera is null.";
            C20652m.m68437d("TECamera2", str);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str);
        } else {
            this.f55643f.mo55628a(i, i2, fVar);
        }
    }

    /* renamed from: a */
    public final void mo55673a(int i, C20638f fVar) {
        if (this.f55639b == 1) {
            C20652m.m68435b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f55639b == 2) {
            C20652m.m68435b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!mo55619p() || this.f55643f == null) {
            String str = "takePicture : camera is null.";
            C20652m.m68437d("TECamera2", str);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str);
        }
    }

    /* renamed from: a */
    public final void mo55674a(C20638f fVar) {
        if (this.f55639b == 1) {
            C20652m.m68435b("TECamera2", "Camera is opening, ignore takePicture operation.");
        } else if (this.f55639b == 2) {
            C20652m.m68435b("TECamera2", "Camera is opened, ignore takePicture operation.");
        } else if (!mo55619p() || this.f55643f == null) {
            String str = "takePicture : camera is null.";
            C20652m.m68437d("TECamera2", str);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str);
        } else {
            this.f55643f.mo55629a(fVar);
        }
    }

    /* renamed from: a */
    public final void mo55671a(int i, int i2, float f, int i3, int i4) {
        C20652m.m68435b("TECamera2", "setFocusAreas...");
        if (this.f55639b == 1) {
            C20652m.m68435b("TECamera2", "Camera is opening, ignore setFocusAreas operation.");
        } else if (!mo55619p() || this.f55643f == null) {
            String str = "focusAtPoint : camera is null.";
            C20652m.m68437d("TECamera2", str);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str);
        } else {
            this.f55643f.mo55700a(i, i2, f, i3, i4);
        }
    }

    /* renamed from: a */
    public final void mo55677a(C20650k kVar) {
        C20652m.m68435b("TECamera2", "setFocusAreas...");
        if (this.f55639b == 1) {
            C20652m.m68435b("TECamera2", "Camera is opening, ignore setFocusAreas operation.");
        } else if (!mo55619p() || this.f55643f == null) {
            String str = "focusAtPoint : camera is null.";
            C20652m.m68437d("TECamera2", str);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str);
        } else {
            int a = this.f55643f.mo55701a(kVar);
            if (a != 0) {
                this.f55650j.mo55580a(this.f55648h.f55724c, a, "focusAtPoint : something wrong.");
            }
        }
    }

    /* renamed from: a */
    public final void mo55679a(boolean z, String str) {
        StringBuilder sb = new StringBuilder("setWhileBalance: ");
        sb.append(str);
        C20652m.m68435b("TECamera2", sb.toString());
        if (this.f55639b == 1) {
            C20652m.m68437d("TECamera2", "Camera is opening, ignore setWhileBalance operation.");
        } else if (!mo55619p() || this.f55643f == null) {
            String str2 = "setWhileBalance : camera is null.";
            C20652m.m68437d("TECamera2", str2);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str2);
        } else {
            this.f55643f.mo55706a(z, str);
        }
    }

    /* renamed from: a */
    public final void mo55678a(boolean z) {
        StringBuilder sb = new StringBuilder("toggleTorch: ");
        sb.append(z);
        C20652m.m68435b("TECamera2", sb.toString());
        if (this.f55639b == 1) {
            C20652m.m68435b("TECamera2", "Camera is opening, ignore toggleTorch operation.");
        } else if (!mo55619p() || this.f55643f == null) {
            String str = "Toggle torch failed, you must open camera first.";
            C20652m.m68437d("TECamera2", str);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str);
        } else {
            this.f55643f.mo55703a(z);
        }
    }

    /* renamed from: a */
    public final void mo55676a(C20641i iVar) {
        String str = "";
        if (!mo55619p() || this.f55643f == null || this.f55643f.f55605k == null) {
            String str2 = "queryZoomAbility: camera is null.";
            C20652m.m68437d("TECamera2", str2);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str2);
        } else if (this.f55638a == null) {
            C20652m.m68437d("TECamera2", "DeviceProxy is null!");
            this.f55650j.mo55580a(this.f55648h.f55724c, -420, str);
        } else {
            float b = C20590c.m68178b(this.f55643f.f55605k, this.f55648h.f55724c);
            this.f55658r = b;
            StringBuilder sb = new StringBuilder("zoom: ");
            sb.append(b);
            C20652m.m68435b("TECamera2", sb.toString());
            if (iVar != null) {
                ArrayList arrayList = new ArrayList(1);
                arrayList.add(Integer.valueOf((int) (100.0f * b)));
                iVar.mo55818a(this.f55648h.f55724c, b > 0.0f, false, b, arrayList);
            }
        }
    }

    /* renamed from: a */
    public final void mo55675a(C20640h hVar) {
        String str = "";
        if (!mo55619p() || this.f55643f == null || this.f55643f.f55605k == null) {
            String str2 = "queryShaderZoomStep: camera is null.";
            C20652m.m68437d("TECamera2", str2);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str2);
        } else if (this.f55638a == null) {
            C20652m.m68437d("TECamera2", "DeviceProxy is null!");
            this.f55650j.mo55580a(this.f55648h.f55724c, -420, str);
        } else {
            C20590c.m68174a(this.f55643f.f55605k);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public void mo55620q() {
        this.f55639b = 0;
        this.f55640c = null;
        this.f55641d = null;
    }

    /* renamed from: e */
    public final void mo55686e() {
        C20652m.m68435b("TECamera2", "close...");
        if (this.f55639b == 1) {
            C20652m.m68434a("TECamera2", "Camera is opening or pending, ignore close operation.");
            return;
        }
        mo55620q();
        this.f55650j.mo55581a(this);
    }

    /* renamed from: b */
    public final void mo55680b() {
        C20652m.m68435b("TECamera2", "stopCapture...");
        if (!mo55619p()) {
            C20652m.m68437d("TECamera2", "Device is not ready.");
            return;
        }
        if (this.f55639b != 3) {
            StringBuilder sb = new StringBuilder("Invalid state: ");
            sb.append(this.f55639b);
            C20652m.m68435b("TECamera2", sb.toString());
        }
        mo55618o();
    }

    /* renamed from: i */
    public final void mo55690i() {
        if (this.f55639b == 1) {
            C20652m.m68435b("TECamera2", "Camera is opening, ignore cancelAutoFocus operation.");
        } else if (!mo55619p() || this.f55643f == null) {
            String str = "cancelFocus : camera is null.";
            C20652m.m68437d("TECamera2", str);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str);
        } else {
            this.f55643f.mo55712m();
        }
    }

    /* renamed from: h */
    public final float[] mo55689h() {
        C20652m.m68435b("TECamera2", "getVFOV...");
        if (this.f55639b == 1) {
            C20652m.m68435b("TECamera2", "Camera is opening, ignore getVFOV operation.");
            return new float[]{-2.0f, -2.0f};
        } else if (mo55619p() && this.f55643f != null) {
            return this.f55643f.mo55713n();
        } else {
            String str = "getFOV : camera is null.";
            C20652m.m68437d("TECamera2", str);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str);
            return new float[]{-2.0f, -2.0f};
        }
    }

    /* renamed from: k */
    public final boolean mo55692k() {
        String str = "";
        if (!mo55619p() || this.f55643f == null || this.f55643f.f55605k == null) {
            String str2 = "Query torch info failed, you must open camera first.";
            C20652m.m68437d("TECamera2", str2);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str2);
            return false;
        } else if (this.f55638a != null) {
            return ((Bundle) this.f55661u.get(this.f55648h.f55743v)).getBoolean("camera_torch_supported", false);
        } else {
            C20652m.m68437d("TECamera2", "DeviceProxy is null!");
            this.f55650j.mo55580a(this.f55648h.f55724c, -417, str);
            return false;
        }
    }

    /* renamed from: g */
    public final int mo55688g() {
        int i;
        int a = C20642j.m68408a(this.f55652l);
        this.f55655o = this.f55656p;
        if (this.f55640c != null) {
            i = ((Integer) this.f55640c.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } else {
            i = this.f55648h.f55727f;
            C20652m.m68434a("TECamera2", "mCameraCharacteristics is null,use settings rotation");
        }
        StringBuilder sb = new StringBuilder("getFrameOrientation senserOrientation: ");
        sb.append(i);
        C20652m.m68434a("TECamera2", sb.toString());
        if (this.f55655o == 1) {
            this.f55657q = (i + a) % 360;
            this.f55657q = ((360 - this.f55657q) + NormalGiftView.ALPHA_180) % 360;
        } else {
            this.f55657q = ((i - a) + 360) % 360;
        }
        StringBuilder sb2 = new StringBuilder("getFrameOrientation mCameraRotation: ");
        sb2.append(this.f55657q);
        C20652m.m68434a("TECamera2", sb2.toString());
        StringBuilder sb3 = new StringBuilder("getFrameOrientation mCameraSettings.mFacing: ");
        sb3.append(this.f55648h.f55726e);
        C20652m.m68434a("TECamera2", sb3.toString());
        return this.f55657q;
    }

    /* renamed from: a */
    public final void mo55667a() {
        C20652m.m68434a("TECamera2", "Camera startCapture...");
        if (!mo55619p() || this.f55654n == null) {
            C20652m.m68437d("TECamera2", "Device is not ready.");
        } else if (this.f55639b == 2 || this.f55639b == 3) {
            try {
                this.f55648h.f55727f = mo55688g();
                StringBuilder sb = new StringBuilder("Camera rotation = ");
                sb.append(this.f55648h.f55727f);
                C20652m.m68434a("TECamera2", sb.toString());
            } catch (Exception unused) {
                mo55620q();
                if (this.f55650j != null) {
                    this.f55650j.mo55579a(2, -425, (C20604f) null);
                }
            }
            mo55617n();
        } else {
            StringBuilder sb2 = new StringBuilder("Invalid state: ");
            sb2.append(this.f55639b);
            C20652m.m68435b("TECamera2", sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo55670a(int i) {
        if (this.f55639b != 3) {
            StringBuilder sb = new StringBuilder("Invalid state: ");
            sb.append(this.f55639b);
            C20652m.m68435b("TECamera2", sb.toString());
            return;
        }
        mo55614d(i);
    }

    /* renamed from: e */
    public final boolean mo55731e(int i) {
        if (this.f55639b == i) {
            StringBuilder sb = new StringBuilder("No need update state: ");
            sb.append(i);
            C20652m.m68436c("TECamera2", sb.toString());
            return true;
        }
        this.f55639b = i;
        return true;
    }

    /* renamed from: a */
    public final int mo55665a(C20632i iVar) {
        this.f55648h = iVar;
        if (this.f55639b == 4) {
            mo55620q();
        }
        try {
            this.f55639b = 1;
            int m = mo55616m();
            this.f55656p = iVar.f55726e;
            StringBuilder sb = new StringBuilder("open: camera face = ");
            sb.append(this.f55656p);
            C20652m.m68434a("TECamera2", sb.toString());
            if (m == 0) {
                return 0;
            }
            this.f55639b = 0;
            mo55620q();
            if (this.f55650j != null) {
                this.f55650j.mo55579a(2, m, (C20604f) null);
            }
            return -1;
        } catch (Throwable unused) {
            this.f55639b = 4;
            mo55620q();
            if (this.f55650j != null) {
                this.f55650j.mo55579a(2, -401, (C20604f) null);
            }
            return -1;
        }
    }

    /* renamed from: c */
    public final void mo55684c(int i) {
        StringBuilder sb = new StringBuilder("switchFlashMode: ");
        sb.append(i);
        C20652m.m68435b("TECamera2", sb.toString());
        if (this.f55639b == 1) {
            C20652m.m68437d("TECamera2", "Camera is opening, ignore toggleTorch operation.");
        } else if (!mo55619p() || this.f55643f == null) {
            String str = "switch flash mode  failed, you must open camera first.";
            C20652m.m68437d("TECamera2", str);
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, str);
        } else {
            this.f55643f.mo55631b(i);
        }
    }

    /* renamed from: a */
    public final void mo55668a(float f) {
        if (this.f55639b != 3) {
            StringBuilder sb = new StringBuilder("Invalid state, state = ");
            sb.append(this.f55639b);
            this.f55650j.mo55580a(this.f55648h.f55724c, -420, sb.toString());
        } else if (!mo55619p() || this.f55643f == null) {
            this.f55650j.mo55580a(this.f55648h.f55724c, -401, "zoomV2 : Camera is null.");
        } else {
            this.f55643f.mo55708c(f);
        }
    }

    /* renamed from: a */
    public final TEFrameSizei mo55666a(float f, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2;
        if (this.f55639b == 0 || this.f55639b == 1) {
            C20652m.m68437d("TECamera2", "Camera is not opened, ignore getBestPreviewSize operation.");
            return null;
        }
        Size[] outputSizes = ((StreamConfigurationMap) this.f55643f.f55605k.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(SurfaceTexture.class);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        if (tEFrameSizei != null) {
            tEFrameSizei2 = C20642j.m68410a((List<TEFrameSizei>) arrayList, tEFrameSizei);
        } else {
            tEFrameSizei2 = C20642j.m68409a((List<TEFrameSizei>) arrayList, f);
        }
        return tEFrameSizei2;
    }

    /* renamed from: a */
    public final void mo55669a(float f, C20641i iVar) {
        if (this.f55639b != 3) {
            StringBuilder sb = new StringBuilder("Invalid state, state = ");
            sb.append(this.f55639b);
            this.f55650j.mo55582b(this.f55648h.f55724c, -420, sb.toString());
        } else if (!mo55619p() || this.f55643f == null) {
            this.f55650j.mo55582b(this.f55648h.f55724c, -401, "startZoom : Camera is null.");
        } else {
            this.f55643f.mo55699a(f, iVar);
        }
    }

    protected C20599e(int i, Context context, C20605a aVar, Handler handler, C20606b bVar) {
        super(context, aVar, handler, bVar);
        this.f55648h = new C20632i(context, i);
        this.f55638a = C20590c.m68175a(context, i);
    }

    /* renamed from: a */
    public static C20599e m68205a(int i, Context context, C20605a aVar, Handler handler, C20606b bVar) {
        if (i == 3) {
            return C20562b.m68070a(i, context, aVar, handler, bVar);
        }
        if (i == 5) {
            C20601a aVar2 = new C20601a(i, context, aVar, handler, bVar);
            return aVar2;
        } else if (i == 7) {
            C20625a aVar3 = new C20625a(i, context, aVar, handler, bVar);
            return aVar3;
        } else {
            C20551a aVar4 = new C20551a(i, context, aVar, handler, bVar);
            return aVar4;
        }
    }
}
