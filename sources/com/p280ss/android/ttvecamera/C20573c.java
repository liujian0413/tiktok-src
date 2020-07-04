package com.p280ss.android.ttvecamera;

import android.content.Context;
import android.hardware.Camera;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.ErrorCallback;
import android.hardware.Camera.OnZoomChangeListener;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.Size;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.Log;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.ttvecamera.C20604f.C20605a;
import com.p280ss.android.ttvecamera.C20604f.C20606b;
import com.p280ss.android.ttvecamera.C20632i.C20637e;
import com.p280ss.android.ttvecamera.C20632i.C20638f;
import com.p280ss.android.ttvecamera.C20632i.C20640h;
import com.p280ss.android.ttvecamera.C20632i.C20641i;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.p915b.C20565b;
import com.p280ss.android.ttvecamera.p919f.C20608a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.c */
public final class C20573c extends C20604f {

    /* renamed from: a */
    Camera f55576a;

    /* renamed from: b */
    public Parameters f55577b;

    /* renamed from: c */
    private C20565b f55578c;

    /* renamed from: d */
    private String f55579d = "";

    /* renamed from: e */
    private int f55580e;

    /* renamed from: f */
    private List<TEFrameSizei> f55581f = new ArrayList();

    /* renamed from: v */
    private List<TEFrameSizei> f55582v = new ArrayList();

    /* renamed from: w */
    private List<Integer> f55583w = null;

    /* renamed from: x */
    private float f55584x = 100.0f;

    /* renamed from: y */
    private AtomicBoolean f55585y = new AtomicBoolean(false);

    /* renamed from: f */
    public final int mo55687f() {
        return 1;
    }

    /* renamed from: a */
    public final void mo55672a(int i, int i2, final C20638f fVar) {
        if (this.f55576a == null) {
            String str = "takePicture : camera is null";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
            return;
        }
        try {
            this.f55577b = this.f55576a.getParameters();
            if (!(this.f55577b.getPictureSize().width == i && this.f55577b.getPictureSize().height == i2)) {
                TEFrameSizei a = C20642j.m68412a(m68101a(this.f55577b.getSupportedPictureSizes()), this.f55648h.f55731j, new TEFrameSizei(i, i2));
                this.f55577b.setPictureSize(a.f55535a, a.f55536b);
                this.f55577b.setPictureFormat(256);
                this.f55577b.setJpegQuality(100);
                this.f55576a.setParameters(this.f55577b);
            }
            this.f55649i = false;
            this.f55576a.takePicture(null, null, new PictureCallback() {
                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    if (fVar != null) {
                        fVar.mo55814a(new TECameraFrame(bArr, ETEPixelFormat.PIXEL_FORMAT_JPEG, C20573c.this.f55577b.getPictureSize().width, C20573c.this.f55577b.getPictureSize().height), C20573c.this);
                    }
                }
            });
        } catch (Exception e) {
            if (fVar != null) {
                fVar.mo55815a(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo55673a(int i, final C20638f fVar) {
        if (this.f55576a == null) {
            String str = "takePicture: camera is null.";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
            return;
        }
        try {
            this.f55577b = this.f55576a.getParameters();
            TEFrameSizei a = C20642j.m68411a(m68101a(this.f55577b.getSupportedPictureSizes()), this.f55648h.f55731j, i);
            this.f55577b.setPictureSize(a.f55535a, a.f55536b);
            this.f55577b.setPictureFormat(256);
            this.f55577b.setJpegQuality(100);
            this.f55576a.setParameters(this.f55577b);
            this.f55649i = false;
            this.f55576a.takePicture(null, null, new PictureCallback() {
                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    if (fVar != null) {
                        fVar.mo55814a(new TECameraFrame(bArr, ETEPixelFormat.PIXEL_FORMAT_JPEG, C20573c.this.f55577b.getPictureSize().width, C20573c.this.f55577b.getPictureSize().height), C20573c.this);
                    }
                }
            });
        } catch (Exception e) {
            if (fVar != null) {
                fVar.mo55815a(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo55674a(final C20638f fVar) {
        C20652m.m68434a("TECamera1", "takePicture...");
        if (this.f55576a == null) {
            String str = "takePicture: camera is null.";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
            return;
        }
        try {
            this.f55649i = false;
            StringBuilder sb = new StringBuilder("takePicture size: ");
            sb.append(this.f55648h.f55732k.toString());
            C20652m.m68434a("TECamera1", sb.toString());
            this.f55576a.takePicture(null, null, new PictureCallback() {
                public final void onPictureTaken(byte[] bArr, Camera camera) {
                    C20573c.this.f55576a.stopPreview();
                    if (fVar != null) {
                        fVar.mo55814a(new TECameraFrame(bArr, ETEPixelFormat.PIXEL_FORMAT_JPEG, C20573c.this.f55577b.getPictureSize().width, C20573c.this.f55577b.getPictureSize().height), C20573c.this);
                    }
                }
            });
        } catch (Exception e) {
            if (fVar != null) {
                fVar.mo55815a(e);
            }
        }
    }

    /* renamed from: a */
    public final void mo55677a(C20650k kVar) {
        if (this.f55576a == null) {
            String str = "focusAtPoint: camera is null.";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
            return;
        }
        try {
            this.f55577b = this.f55576a.getParameters();
            if (!this.f55578c.mo55655a(this.f55577b, this.f55579d)) {
                String str2 = "Error: not support focus.";
                C20652m.m68437d("TECamera1", str2);
                this.f55650j.mo55582b(1, -412, str2);
                if (C20565b.m68081b(this.f55648h.f55726e, this.f55577b) && kVar.f55772g) {
                    if (kVar.f55774i != null) {
                        this.f55577b.setMeteringAreas(kVar.f55774i.mo55612a(kVar.f55766a, kVar.f55767b, kVar.f55768c, kVar.f55769d, this.f55648h.f55727f, this.f55648h.f55726e == 1));
                    } else {
                        this.f55577b.setMeteringAreas(this.f55578c.mo55656b(kVar.f55766a, kVar.f55767b, kVar.f55770e, kVar.f55768c, kVar.f55769d, this.f55648h.f55727f));
                    }
                    this.f55576a.setParameters(this.f55577b);
                }
                return;
            }
            if (kVar.f55772g && C20565b.m68081b(this.f55648h.f55726e, this.f55577b)) {
                if (kVar.f55774i != null) {
                    this.f55577b.setMeteringAreas(kVar.f55774i.mo55612a(kVar.f55766a, kVar.f55767b, kVar.f55768c, kVar.f55769d, this.f55648h.f55727f, this.f55648h.f55726e == 1));
                } else {
                    this.f55577b.setMeteringAreas(this.f55578c.mo55656b(kVar.f55766a, kVar.f55767b, kVar.f55770e, kVar.f55768c, kVar.f55769d, this.f55648h.f55727f));
                }
            }
            if (kVar.f55771f) {
                if (kVar.f55773h != null) {
                    this.f55577b.setFocusAreas(kVar.f55773h.mo55611a(kVar.f55766a, kVar.f55767b, kVar.f55768c, kVar.f55769d, this.f55648h.f55727f, this.f55648h.f55726e == 1));
                } else {
                    this.f55577b.setFocusAreas(this.f55578c.mo55654a(kVar.f55766a, kVar.f55767b, kVar.f55770e, kVar.f55768c, kVar.f55769d, this.f55648h.f55727f));
                }
            }
            this.f55577b.setFocusMode("auto");
            this.f55576a.setParameters(this.f55577b);
            this.f55576a.autoFocus(new AutoFocusCallback() {
                public final void onAutoFocus(boolean z, Camera camera) {
                    if (z) {
                        C20652m.m68434a("TECamera1", "Camera Focus Succeed!");
                    } else {
                        C20652m.m68434a("TECamera1", "Camera Focus Failed!");
                    }
                    try {
                        camera.cancelAutoFocus();
                        Parameters parameters = camera.getParameters();
                        parameters.setFocusMode("continuous-video");
                        camera.setParameters(parameters);
                    } catch (Exception e) {
                        StringBuilder sb = new StringBuilder("Error: focusAtPoint failed: ");
                        sb.append(e.toString());
                        String sb2 = sb.toString();
                        C20652m.m68437d("TECamera1", sb2);
                        C20573c.this.f55650j.mo55580a(1, -411, sb2);
                    }
                }
            });
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Error: focusAtPoint failed: ");
            sb.append(e.toString());
            String sb2 = sb.toString();
            C20652m.m68437d("TECamera1", sb2);
            this.f55650j.mo55580a(1, -411, sb2);
        }
    }

    /* renamed from: a */
    public final void mo55679a(boolean z, String str) {
        if (this.f55576a == null || !this.f55649i) {
            String str2 = "setWhileBalance : Camera is null!";
            C20652m.m68437d("TECamera1", str2);
            this.f55650j.mo55580a(1, -401, str2);
            return;
        }
        try {
            this.f55577b = this.f55576a.getParameters();
            List supportedWhiteBalance = this.f55577b.getSupportedWhiteBalance();
            if (supportedWhiteBalance == null || !supportedWhiteBalance.contains(str)) {
                StringBuilder sb = new StringBuilder("SupportWBList has no value: ");
                sb.append(str);
                String sb2 = sb.toString();
                C20652m.m68437d("TECamera1", sb2);
                this.f55650j.mo55580a(1, -424, sb2);
                return;
            }
            this.f55577b.setWhiteBalance(str);
            this.f55576a.setParameters(this.f55577b);
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("Set WhileBalance failed: ");
            sb3.append(e.toString());
            String sb4 = sb3.toString();
            C20652m.m68437d("TECamera1", sb4);
            this.f55650j.mo55580a(1, -424, sb4);
        }
    }

    /* renamed from: a */
    public final void mo55678a(boolean z) {
        if (this.f55576a == null || !this.f55649i) {
            String str = "toggleTorch : Camera is not ready!";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
        } else if (this.f55648h.f55726e == 1) {
            String str2 = "Front camera does not support torch!";
            C20652m.m68436c("TECamera1", str2);
            this.f55650j.mo55582b(1, -416, str2);
        } else {
            try {
                this.f55577b = this.f55576a.getParameters();
                this.f55577b.setFlashMode(z ? "torch" : "off");
                this.f55576a.setParameters(this.f55577b);
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Toggle torch failed: ");
                sb.append(e.toString());
                String sb2 = sb.toString();
                C20652m.m68437d("TECamera1", sb2);
                this.f55650j.mo55580a(1, -417, sb2);
            }
        }
    }

    /* renamed from: a */
    public final void mo55676a(C20641i iVar) {
        if (iVar == null) {
            C20652m.m68437d("TECamera1", "ZoomCallback is null, do nothing!");
        } else if (this.f55576a == null) {
            String str = "queryZoomAbility : Camera is null!";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
        } else {
            try {
                Parameters parameters = this.f55576a.getParameters();
                this.f55658r = (float) parameters.getMaxZoom();
                iVar.mo55818a(1, parameters.isZoomSupported(), parameters.isSmoothZoomSupported(), (float) parameters.getMaxZoom(), parameters.getZoomRatios());
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Query zoom ability failed : ");
                sb.append(e.toString());
                String sb2 = sb.toString();
                C20652m.m68437d("TECamera1", sb2);
                this.f55650j.mo55580a(1, -420, sb2);
            }
        }
    }

    /* renamed from: a */
    public final void mo55675a(C20640h hVar) {
        if (hVar == null) {
            C20652m.m68437d("TECamera1", "ShaderZoomCallback is null, do nothing!");
        } else if (this.f55576a == null) {
            String str = "queryShaderZoomStep : Camera is null!";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
        } else {
            try {
                Parameters parameters = this.f55576a.getParameters();
                if (parameters != null && parameters.isZoomSupported()) {
                    int maxZoom = parameters.getMaxZoom();
                    if (maxZoom > 99) {
                        maxZoom = 99;
                    }
                    List zoomRatios = parameters.getZoomRatios();
                    if (maxZoom > 0) {
                        Math.pow((double) ((((float) (((Integer) zoomRatios.get(1)).intValue() - ((Integer) zoomRatios.get(0)).intValue())) / 100.0f) + 1.0f), 0.5d);
                    }
                }
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("Query shader zoom step failed : ");
                sb.append(e.toString());
                String sb2 = sb.toString();
                C20652m.m68437d("TECamera1", sb2);
                this.f55650j.mo55580a(1, -420, sb2);
            }
        }
    }

    /* renamed from: a */
    public final void mo55613a(Bundle bundle) {
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

    /* renamed from: o */
    private List<TEFrameSizei> m68105o() {
        if (this.f55577b == null) {
            this.f55581f.clear();
            return this.f55581f;
        }
        this.f55581f = m68101a(this.f55577b.getSupportedPreviewSizes());
        return this.f55581f;
    }

    /* renamed from: p */
    private List<TEFrameSizei> m68106p() {
        if (this.f55577b == null) {
            this.f55582v.clear();
            return this.f55582v;
        }
        this.f55582v = m68101a(this.f55577b.getSupportedPictureSizes());
        return this.f55582v;
    }

    /* renamed from: c */
    public final void mo55683c() {
        C20652m.m68435b("TECamera1", "Camera start face detect");
        if (this.f55649i && this.f55576a != null) {
            try {
                this.f55576a.startFaceDetection();
            } catch (Exception unused) {
                C20652m.m68437d("TECamera1", "camera start face detect failed");
            }
        }
    }

    /* renamed from: d */
    public final void mo55685d() {
        C20652m.m68435b("TECamera1", "Camera stop face detect");
        if (this.f55649i && this.f55576a != null) {
            try {
                this.f55576a.stopFaceDetection();
            } catch (Exception unused) {
                C20652m.m68437d("TECamera1", "camera stop face detect failed");
            }
        }
    }

    /* renamed from: i */
    public final void mo55690i() {
        C20652m.m68435b("TECamera1", "cancelFocus...");
        if (this.f55576a != null) {
            try {
                this.f55576a.cancelAutoFocus();
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: k */
    public final boolean mo55692k() {
        return ((Bundle) this.f55661u.get(this.f55648h.f55743v)).getBoolean("camera_torch_supported", false);
    }

    /* renamed from: b */
    public final void mo55680b() {
        C20652m.m68435b("TECamera1", "Camera stopPreview...");
        if (this.f55649i && this.f55576a != null) {
            this.f55649i = false;
            this.f55576a.stopPreview();
            C20652m.m68434a("TECamera1", "Camera preview stopped!");
            this.f55650j.mo55582b(4, 0, "TECamera1 preview stoped");
        }
    }

    /* renamed from: j */
    public final boolean mo55691j() {
        try {
            if (this.f55576a == null || this.f55576a.getParameters() == null || this.f55576a.getParameters().getSupportedWhiteBalance() == null || !this.f55576a.getParameters().isAutoWhiteBalanceLockSupported()) {
                return false;
            }
            return true;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Unsupported whileBalance!: ");
            sb.append(e.toString());
            C20652m.m68437d("TECamera1", sb.toString());
            return false;
        }
    }

    /* renamed from: e */
    public final void mo55686e() {
        C20652m.m68435b("TECamera1", "Camera close...");
        if (this.f55576a != null) {
            if (this.f55649i) {
                try {
                    this.f55577b = this.f55576a.getParameters();
                    this.f55577b.setFlashMode("off");
                    this.f55576a.setParameters(this.f55577b);
                    this.f55576a.stopPreview();
                    this.f55576a.setPreviewCallbackWithBuffer(null);
                } catch (Exception e) {
                    StringBuilder sb = new StringBuilder("Close camera failed: ");
                    sb.append(e.getMessage());
                    C20652m.m68437d("TECamera1", sb.toString());
                }
                this.f55649i = false;
            }
            try {
                this.f55576a.release();
            } catch (Exception e2) {
                StringBuilder sb2 = new StringBuilder("Camera release failed: ");
                sb2.append(e2.getMessage());
                C20652m.m68437d("TECamera1", sb2.toString());
            }
            this.f55585y.set(false);
            this.f55576a = null;
            C20652m.m68434a("TECamera1", "Camera closed!");
            this.f55650j.mo55581a(this);
        }
    }

    /* renamed from: h */
    public final float[] mo55689h() {
        float[] fArr = new float[2];
        if (this.f55576a == null) {
            String str = "getFOV: camera device is null.";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
            return new float[]{-2.0f, -2.0f};
        }
        try {
            this.f55577b = this.f55576a.getParameters();
            fArr[0] = this.f55577b.getVerticalViewAngle();
            fArr[1] = this.f55577b.getHorizontalViewAngle();
            StringBuilder sb = new StringBuilder("Camera1:verticalFOV = ");
            sb.append(fArr[0]);
            sb.append(",horizontalFOV = ");
            sb.append(fArr[1]);
            C20652m.m68435b("TECamera1", sb.toString());
            return fArr;
        } catch (Exception unused) {
            return new float[]{-2.0f, -2.0f};
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final Bundle mo55615l() {
        boolean z;
        C20632i iVar = this.f55648h;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f55648h.f55726e);
        iVar.f55743v = sb.toString();
        Bundle l = super.mo55615l();
        l.putParcelableArrayList("support_preview_sizes", (ArrayList) m68105o());
        l.putParcelableArrayList("support_picture_sizes", (ArrayList) m68106p());
        l.putParcelable("camera_preview_size", this.f55648h.f55731j);
        try {
            if (this.f55576a == null || this.f55576a.getParameters() == null || this.f55576a.getParameters().getSupportedFlashModes() == null) {
                z = false;
            } else {
                z = true;
            }
            l.putBoolean("camera_torch_supported", z);
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("Get camera torch information failed: ");
            sb2.append(e.toString());
            C20652m.m68437d("TECamera1", sb2.toString());
            l.putBoolean("camera_torch_supported", false);
        }
        return l;
    }

    /* renamed from: g */
    public final int mo55688g() {
        int a = C20642j.m68408a(this.f55652l);
        CameraInfo cameraInfo = new CameraInfo();
        this.f55655o = this.f55656p;
        try {
            Camera.getCameraInfo(this.f55648h.f55728g, cameraInfo);
            if (this.f55655o == 1) {
                this.f55657q = (cameraInfo.orientation + a) % 360;
                this.f55657q = ((360 - this.f55657q) + NormalGiftView.ALPHA_180) % 360;
            } else {
                this.f55657q = ((cameraInfo.orientation - a) + 360) % 360;
            }
            StringBuilder sb = new StringBuilder("getFrameOrientation mCameraRotation: ");
            sb.append(this.f55657q);
            C20652m.m68434a("TECamera1", sb.toString());
            StringBuilder sb2 = new StringBuilder("getFrameOrientation mFacing: ");
            sb2.append(this.f55655o);
            C20652m.m68434a("TECamera1", sb2.toString());
            StringBuilder sb3 = new StringBuilder("getFrameOrientation mCameraSettings.mDefaultCameraID: ");
            sb3.append(this.f55648h.f55728g);
            C20652m.m68434a("TECamera1", sb3.toString());
            return this.f55657q;
        } catch (Exception e) {
            C20605a aVar = this.f55650j;
            StringBuilder sb4 = new StringBuilder("getFrameOrientation :");
            sb4.append(e.getMessage());
            aVar.mo55580a(1, -425, sb4.toString());
            return 0;
        }
    }

    /* renamed from: m */
    private int m68103m() {
        int i;
        try {
            if (VERSION.SDK_INT > 8) {
                this.f55580e = Camera.getNumberOfCameras();
                C20630h.m68390a("te_record_camera_size", (long) this.f55580e);
                StringBuilder sb = new StringBuilder("innerOpen mNumberOfCameras: ");
                sb.append(this.f55580e);
                C20652m.m68434a("TECamera1", sb.toString());
                CameraInfo cameraInfo = new CameraInfo();
                int i2 = 0;
                while (true) {
                    if (i2 >= this.f55580e) {
                        break;
                    }
                    Camera.getCameraInfo(i2, cameraInfo);
                    if (cameraInfo.facing == this.f55648h.f55726e) {
                        this.f55648h.f55728g = i2;
                        break;
                    }
                    i2++;
                }
            }
            StringBuilder sb2 = new StringBuilder("innerOpen: ");
            sb2.append(this.f55648h.f55728g);
            C20652m.m68434a("TECamera1", sb2.toString());
            if (this.f55648h.f55728g < 0) {
                this.f55576a = Camera.open();
                this.f55648h.f55726e = 0;
                this.f55656p = this.f55648h.f55726e;
                CameraInfo cameraInfo2 = new CameraInfo();
                int i3 = 0;
                while (true) {
                    if (i3 >= this.f55580e) {
                        break;
                    }
                    Camera.getCameraInfo(i3, cameraInfo2);
                    if (cameraInfo2.facing == this.f55656p) {
                        this.f55648h.f55728g = i3;
                        break;
                    }
                    i3++;
                }
            } else {
                this.f55576a = Camera.open(this.f55648h.f55728g);
            }
            StringBuilder sb3 = new StringBuilder("innerOpen mNewFacing: ");
            sb3.append(this.f55656p);
            C20652m.m68434a("TECamera1", sb3.toString());
            StringBuilder sb4 = new StringBuilder("innerOpen mCameraSettings.mDefaultCameraID: ");
            sb4.append(this.f55648h.f55728g);
            C20652m.m68434a("TECamera1", sb4.toString());
            if (this.f55576a == null) {
                StringBuilder sb5 = new StringBuilder("Open Camera Failed width ID:");
                sb5.append(this.f55648h.f55728g);
                C20652m.m68437d("TECamera1", sb5.toString());
                this.f55650j.mo55579a(1, -401, (C20604f) null);
                return -401;
            }
            try {
                i = m68104n();
                try {
                    mo55615l();
                } catch (Exception e) {
                    e = e;
                }
            } catch (Exception e2) {
                e = e2;
                i = 0;
                StringBuilder sb6 = new StringBuilder("Open init Camera Failed!: ");
                sb6.append(Log.getStackTraceString(e));
                C20652m.m68437d("TECamera1", sb6.toString());
                this.f55650j.mo55579a(1, i, (C20604f) this);
                return i;
            }
            this.f55650j.mo55579a(1, i, (C20604f) this);
            return i;
        } catch (RuntimeException e3) {
            StringBuilder sb7 = new StringBuilder("Open Camera Failed!: ");
            sb7.append(Log.getStackTraceString(e3));
            C20652m.m68437d("TECamera1", sb7.toString());
            this.f55576a = null;
            this.f55650j.mo55579a(1, -401, (C20604f) null);
            return -401;
        }
    }

    /* renamed from: a */
    public final void mo55667a() {
        C20652m.m68434a("TECamera1", "Camera startPreview...");
        if (this.f55649i) {
            C20652m.m68436c("TECamera1", "Camera is previewing...");
            return;
        }
        if (this.f55576a != null) {
            try {
                if (this.f55654n != null) {
                    this.f55577b = this.f55576a.getParameters();
                    int a = this.f55654n.mo55756a(m68101a(this.f55577b.getSupportedPreviewSizes()), this.f55648h.f55731j);
                    if (a != 0) {
                        StringBuilder sb = new StringBuilder("Init provider failed, ret = ");
                        sb.append(a);
                        C20652m.m68437d("TECamera1", sb.toString());
                        return;
                    }
                    if (this.f55654n.mo55759b() == 1) {
                        if (this.f55654n.mo55762e() != null) {
                            this.f55576a.setPreviewTexture(this.f55654n.mo55762e());
                        } else {
                            C20652m.m68437d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else if (this.f55654n.mo55759b() == 4) {
                        C20608a aVar = (C20608a) this.f55654n.f55676b;
                        if (aVar == null) {
                            throw new AndroidRuntimeException("Provider is null");
                        } else if (this.f55654n.mo55762e() != null) {
                            if (this.f55585y.compareAndSet(false, true)) {
                                for (byte[] addCallbackBuffer : aVar.mo55746a(3)) {
                                    this.f55576a.addCallbackBuffer(addCallbackBuffer);
                                }
                            }
                            this.f55576a.setPreviewCallbackWithBuffer(aVar.f55663a);
                            this.f55576a.setPreviewTexture(this.f55654n.mo55762e());
                        } else {
                            C20652m.m68437d("TECamera1", "SurfaceTexture is null");
                            throw new AndroidRuntimeException("SurfaceTexture is null");
                        }
                    } else {
                        StringBuilder sb2 = new StringBuilder("Unsupported camera provider type : ");
                        sb2.append(this.f55654n.mo55759b());
                        C20652m.m68437d("TECamera1", sb2.toString());
                        return;
                    }
                    TEFrameSizei f = this.f55654n.mo55763f();
                    if (f != null) {
                        this.f55650j.mo55582b(5, 0, f.toString());
                    }
                    this.f55576a.setErrorCallback(new ErrorCallback() {
                        public final void onError(int i, Camera camera) {
                            String str;
                            if (i == 100) {
                                str = "Camera server died!";
                            } else if (VERSION.SDK_INT >= 23 && i == 2) {
                                StringBuilder sb = new StringBuilder("Camera disconnected: ");
                                sb.append(i);
                                str = sb.toString();
                            } else if (i == 1) {
                                StringBuilder sb2 = new StringBuilder("Camera unknown error: ");
                                sb2.append(i);
                                str = sb2.toString();
                            } else {
                                StringBuilder sb3 = new StringBuilder("Ignore camera error here: ");
                                sb3.append(i);
                                C20652m.m68436c("TECamera1", sb3.toString());
                                return;
                            }
                            C20652m.m68437d("TECamera1", str);
                            C20573c.this.mo55686e();
                            if (i == 2) {
                                C20573c.this.f55650j.mo55581a(C20573c.this);
                            } else {
                                C20573c.this.f55650j.mo55580a(1, -425, str);
                            }
                        }
                    });
                    this.f55648h.f55727f = mo55688g();
                    StringBuilder sb3 = new StringBuilder("Camera rotation = ");
                    sb3.append(this.f55648h.f55727f);
                    C20652m.m68435b("TECamera1", sb3.toString());
                    this.f55576a.startPreview();
                    if (this.f55648h.f55740s.getBoolean("useCameraFaceDetect")) {
                        try {
                            this.f55576a.startFaceDetection();
                        } catch (Exception unused) {
                            C20652m.m68437d("TECamera1", "camera start face detect failed");
                        }
                    }
                    this.f55649i = true;
                    this.f55650j.mo55582b(0, 0, "TECamera1 preview");
                    return;
                }
                throw new AndroidRuntimeException("ProviderManager is null");
            } catch (Exception e) {
                StringBuilder sb4 = new StringBuilder("startPreview: Error ");
                sb4.append(e.getMessage());
                C20652m.m68437d("TECamera1", sb4.toString());
                this.f55649i = false;
                try {
                    this.f55576a.release();
                } catch (Exception unused2) {
                }
                this.f55576a = null;
                this.f55650j.mo55580a(1, -425, e.getMessage());
            }
        }
    }

    /* renamed from: n */
    private int m68104n() {
        String str;
        TEFrameSizei tEFrameSizei;
        if (this.f55576a == null) {
            String str2 = "initCamera: Camera is not opened!";
            C20652m.m68437d("TECamera1", str2);
            this.f55650j.mo55580a(1, -401, str2);
            return -401;
        }
        this.f55577b = this.f55576a.getParameters();
        List supportedPreviewFpsRange = this.f55577b.getSupportedPreviewFpsRange();
        int a = C20651l.m68429a(supportedPreviewFpsRange);
        int[] a2 = C20642j.m68418a(this.f55648h.f55725d.mo55828a(a), supportedPreviewFpsRange);
        this.f55648h.f55725d.f55775a = a2[0];
        this.f55648h.f55725d.f55776b = a2[1];
        this.f55648h.f55725d.f55777c = a;
        StringBuilder sb = new StringBuilder("Selected FPS Range: ");
        sb.append(this.f55648h.f55725d);
        C20652m.m68435b("TECamera1", sb.toString());
        this.f55648h.f55731j = C20642j.m68410a(m68105o(), this.f55648h.f55731j);
        StringBuilder sb2 = new StringBuilder("Preview Size:");
        sb2.append(this.f55648h.f55731j);
        C20652m.m68434a("TECamera1", sb2.toString());
        this.f55577b.setPictureFormat(256);
        this.f55577b.setJpegQuality(100);
        if (this.f55648h.f55736o) {
            this.f55648h.f55732k = C20642j.m68411a(m68101a(this.f55577b.getSupportedPictureSizes()), this.f55648h.f55731j, this.f55648h.f55734m);
        } else {
            if (this.f55659s != null) {
                tEFrameSizei = this.f55659s.mo55583a(m68101a(this.f55577b.getSupportedPictureSizes()), m68101a(this.f55577b.getSupportedPreviewSizes()));
            } else {
                tEFrameSizei = null;
            }
            if (tEFrameSizei != null) {
                this.f55648h.f55732k = tEFrameSizei;
            } else {
                this.f55648h.f55732k = C20642j.m68412a(m68106p(), this.f55648h.f55731j, this.f55648h.f55732k);
            }
        }
        if (this.f55648h.f55732k != null) {
            this.f55577b.setPictureSize(this.f55648h.f55732k.f55535a, this.f55648h.f55732k.f55536b);
            StringBuilder sb3 = new StringBuilder("Picture Size:");
            sb3.append(this.f55648h.f55732k);
            C20652m.m68434a("TECamera1", sb3.toString());
        } else {
            C20652m.m68437d("TECamera1", "No closest supported picture size");
        }
        this.f55577b.setPreviewSize(this.f55648h.f55731j.f55535a, this.f55648h.f55731j.f55536b);
        if (this.f55648h.f55725d.f55775a < this.f55648h.f55725d.f55776b) {
            this.f55577b.setPreviewFpsRange(this.f55648h.f55725d.f55775a, this.f55648h.f55725d.f55776b);
        } else {
            this.f55577b.setPreviewFrameRate(this.f55648h.f55725d.f55776b);
        }
        this.f55577b.setPreviewFormat(this.f55648h.f55729h);
        this.f55576a.setParameters(this.f55577b);
        if (this.f55648h.f55720A && VERSION.SDK_INT >= 15) {
            if (this.f55577b.isVideoStabilizationSupported()) {
                this.f55577b.setVideoStabilization(true);
                C20630h.m68390a("te_record_camera_stabilization", 1);
            } else {
                C20630h.m68390a("te_record_camera_stabilization", 0);
            }
        }
        this.f55579d = this.f55578c.mo55653a(this.f55648h.f55726e, this.f55577b);
        if (this.f55579d != "") {
            this.f55577b.setFocusMode(this.f55579d);
        } else {
            StringBuilder sb4 = new StringBuilder("No Supported Focus Mode for Facing");
            sb4.append(this.f55648h.f55726e);
            C20652m.m68436c("TECamera1", sb4.toString());
        }
        this.f55648h.f55745x.f55748a = this.f55577b.getMaxExposureCompensation();
        this.f55648h.f55745x.f55750c = this.f55577b.getMinExposureCompensation();
        this.f55648h.f55745x.f55751d = this.f55577b.getExposureCompensationStep();
        this.f55648h.f55745x.f55749b = this.f55577b.getExposureCompensation();
        if (this.f55648h.f55730i) {
            String str3 = this.f55577b.get("zsl-values");
            if ("off".equals(this.f55577b.get("zsl")) && str3 != null && str3.contains("on")) {
                this.f55577b.set("zsl", "on");
            }
            this.f55647g = "on".equals(this.f55577b.get("zsl"));
            if (!this.f55647g && this.f55648h.f55730i && TextUtils.isEmpty(str3) && C20587d.m68166a() && C20587d.m68167b()) {
                String str4 = this.f55577b.get("zsd-mode-values");
                if ("off".equals(this.f55577b.get("zsd-mode")) && str4 != null && str4.contains("on")) {
                    this.f55577b.set("zsd-mode", "on");
                }
                this.f55647g = "on".equals(this.f55577b.get("zsd-mode"));
            }
        }
        String str5 = "TECamera1";
        String str6 = "%s zsl";
        Object[] objArr = new Object[1];
        if (this.f55647g) {
            str = "Enable";
        } else {
            str = "Disable";
        }
        objArr[0] = str;
        C20652m.m68434a(str5, C1642a.m8034a(str6, objArr));
        this.f55583w = null;
        if (this.f55577b.isZoomSupported()) {
            this.f55583w = this.f55577b.getZoomRatios();
            Collections.sort(this.f55583w);
            this.f55584x = 100.0f;
        } else {
            C20652m.m68437d("TECamera1", "camera don't support zoom");
        }
        if (this.f55648h.f55740s.containsKey("enableShutterSound") && VERSION.SDK_INT >= 17) {
            try {
                this.f55576a.enableShutterSound(this.f55648h.f55740s.getBoolean("enableShutterSound"));
            } catch (Exception e) {
                StringBuilder sb5 = new StringBuilder("unsupport enableShutterSound, ");
                sb5.append(e.getMessage());
                C20652m.m68437d("TECamera1", sb5.toString());
            }
        }
        this.f55576a.setParameters(this.f55577b);
        try {
            this.f55576a.setDisplayOrientation(0);
        } catch (Throwable unused) {
        }
        return 0;
    }

    /* renamed from: a */
    public final int mo55665a(C20632i iVar) {
        this.f55648h = iVar;
        this.f55656p = iVar.f55726e;
        return m68103m();
    }

    /* renamed from: a */
    public final void mo55670a(int i) {
        String str = "Does not support switch mode for camera1";
        C20652m.m68436c("TECamera1", str);
        this.f55650j.mo55582b(this.f55648h.f55724c, -200, str);
    }

    /* renamed from: a */
    private static List<TEFrameSizei> m68101a(List<Size> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (Size size : list) {
            arrayList.add(new TEFrameSizei(size.width, size.height));
        }
        return arrayList;
    }

    /* renamed from: d */
    private int m68102d(int i) {
        int size = this.f55583w.size() - 1;
        int i2 = 0;
        while (size - i2 > 1) {
            int i3 = (i2 + size) / 2;
            if (i > ((Integer) this.f55583w.get(i3)).intValue()) {
                i2 = i3;
            } else {
                size = i3;
            }
        }
        if (Math.abs(i - ((Integer) this.f55583w.get(i2)).intValue()) > Math.abs(i - ((Integer) this.f55583w.get(size)).intValue())) {
            return size;
        }
        return i2;
    }

    /* renamed from: b */
    public final void mo55682b(C20641i iVar) {
        if (this.f55576a == null) {
            String str = "stopZoom : Camera is null!";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
            return;
        }
        try {
            if (this.f55576a.getParameters().isSmoothZoomSupported() && iVar != null && iVar.mo55819a()) {
                this.f55576a.stopSmoothZoom();
            }
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Stop zoom failed : ");
            sb.append(e.toString());
            String sb2 = sb.toString();
            C20652m.m68437d("TECamera1", sb2);
            this.f55650j.mo55580a(1, -420, sb2);
        }
    }

    /* renamed from: a */
    public final void mo55668a(float f) {
        if (this.f55583w != null && this.f55576a != null) {
            this.f55584x *= f;
            try {
                if (this.f55584x < ((float) ((Integer) this.f55583w.get(0)).intValue())) {
                    this.f55584x = (float) ((Integer) this.f55583w.get(0)).intValue();
                }
                if (this.f55584x > ((float) ((Integer) this.f55583w.get(this.f55583w.size() - 1)).intValue())) {
                    this.f55584x = (float) ((Integer) this.f55583w.get(this.f55583w.size() - 1)).intValue();
                }
                Parameters parameters = this.f55576a.getParameters();
                if (parameters != null) {
                    int d = m68102d((int) this.f55584x);
                    if (parameters.getZoom() != d) {
                        parameters.setZoom(d);
                        this.f55576a.setParameters(parameters);
                    }
                    return;
                }
                C20652m.m68437d("TECamera1", "setZoom failed for getParameters null");
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("setZoom failed, ");
                sb.append(e.getMessage());
                C20652m.m68437d("TECamera1", sb.toString());
            }
        }
    }

    /* renamed from: b */
    public final void mo55681b(int i) {
        String str;
        int i2 = -413;
        if (this.f55576a == null || this.f55577b == null || !this.f55649i || !this.f55648h.f55745x.mo55812a()) {
            if (this.f55576a == null || this.f55577b == null || !this.f55649i) {
                str = "setExposureCompensation ： Camera is null.";
                this.f55650j.mo55580a(1, -401, str);
            } else {
                i2 = -414;
                str = "Unsupported exposure compensation!";
            }
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, i2, str);
        } else if (i > this.f55648h.f55745x.f55748a || i < this.f55648h.f55745x.f55750c) {
            StringBuilder sb = new StringBuilder("Invalid exposure: ");
            sb.append(i);
            this.f55650j.mo55580a(1, -415, sb.toString());
        } else {
            try {
                this.f55577b.setExposureCompensation(i);
                this.f55576a.setParameters(this.f55577b);
                this.f55648h.f55745x.f55749b = this.f55577b.getExposureCompensation();
                StringBuilder sb2 = new StringBuilder("EC = ");
                sb2.append(this.f55648h.f55745x.f55749b);
                sb2.append(", EV = ");
                sb2.append(((float) this.f55648h.f55745x.f55749b) * this.f55648h.f55745x.f55751d);
                C20652m.m68434a("TECamera1", sb2.toString());
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder("Error: setExposureCompensation failed: ");
                sb3.append(e.toString());
                String sb4 = sb3.toString();
                C20652m.m68437d("TECamera1", sb4);
                this.f55650j.mo55580a(1, -413, sb4);
            }
        }
    }

    /* renamed from: c */
    public final void mo55684c(int i) {
        if (this.f55576a == null || !this.f55649i) {
            String str = "switchFlashMode : Camera is null!";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
        }
        try {
            this.f55577b = this.f55576a.getParameters();
            List supportedFlashModes = this.f55577b.getSupportedFlashModes();
            if (supportedFlashModes != null) {
                String str2 = null;
                switch (i) {
                    case 0:
                        str2 = "off";
                        break;
                    case 1:
                        str2 = "on";
                        break;
                    case 2:
                        str2 = "torch";
                        break;
                    case 3:
                        str2 = "auto";
                        break;
                    case 4:
                        str2 = "red-eye";
                        break;
                }
                if (str2 != null && supportedFlashModes.contains(str2)) {
                    this.f55577b.setFlashMode(str2);
                    this.f55576a.setParameters(this.f55577b);
                    return;
                }
            }
            StringBuilder sb = new StringBuilder("Camera does not support flash mode: !");
            sb.append(i);
            String sb2 = sb.toString();
            C20652m.m68437d("TECamera1", sb2);
            this.f55650j.mo55580a(1, -419, sb2);
        } catch (Exception e) {
            StringBuilder sb3 = new StringBuilder("Switch flash mode failed: ");
            sb3.append(e.toString());
            String sb4 = sb3.toString();
            C20652m.m68437d("TECamera1", sb4);
            this.f55650j.mo55580a(1, -418, sb4);
        }
    }

    /* renamed from: a */
    public final TEFrameSizei mo55666a(float f, TEFrameSizei tEFrameSizei) {
        TEFrameSizei tEFrameSizei2;
        if (this.f55576a == null) {
            C20652m.m68437d("TECamera1", "getBestPreviewSize: Camera is not opened!");
            return null;
        }
        if (this.f55577b == null) {
            this.f55577b = this.f55576a.getParameters();
        }
        if (tEFrameSizei != null) {
            tEFrameSizei2 = C20642j.m68410a(m68105o(), tEFrameSizei);
        } else {
            tEFrameSizei2 = C20642j.m68409a(m68105o(), f);
        }
        return tEFrameSizei2;
    }

    /* renamed from: a */
    public final void mo55669a(float f, final C20641i iVar) {
        if (this.f55576a == null) {
            String str = "startZoom : Camera is null!";
            C20652m.m68437d("TECamera1", str);
            this.f55650j.mo55580a(1, -401, str);
            return;
        }
        try {
            this.f55577b = this.f55576a.getParameters();
            if (this.f55577b.isZoomSupported() || this.f55577b.isSmoothZoomSupported()) {
                int min = (int) Math.min((float) this.f55577b.getMaxZoom(), f);
                if (!this.f55577b.isSmoothZoomSupported() || iVar == null || !iVar.mo55819a()) {
                    this.f55577b.setZoom(min);
                    this.f55576a.setParameters(this.f55577b);
                    if (iVar != null) {
                        iVar.mo55817a(1, (float) min, true);
                    }
                    return;
                }
                this.f55576a.startSmoothZoom(min);
                this.f55576a.setZoomChangeListener(new OnZoomChangeListener() {
                    public final void onZoomChange(int i, boolean z, Camera camera) {
                        if (iVar != null) {
                            iVar.mo55817a(1, (float) i, z);
                        }
                    }
                });
                return;
            }
            String str2 = "Camera is not support zoom!";
            C20652m.m68437d("TECamera1", str2);
            this.f55650j.mo55580a(1, -421, str2);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("Start zoom failed : ");
            sb.append(e.toString());
            String sb2 = sb.toString();
            C20652m.m68437d("TECamera1", sb2);
            this.f55650j.mo55580a(1, -420, sb2);
        }
    }

    /* renamed from: a */
    public static C20573c m68100a(Context context, C20605a aVar, Handler handler, C20606b bVar) {
        return new C20573c(context, aVar, handler, bVar);
    }

    private C20573c(Context context, C20605a aVar, Handler handler, C20606b bVar) {
        super(context, aVar, handler, bVar);
        this.f55648h = new C20632i(context, 1);
        this.f55578c = new C20565b(1);
    }

    /* renamed from: a */
    public final void mo55671a(int i, int i2, float f, int i3, int i4) {
        C20650k kVar = new C20650k(i, i2, i3, i4, f);
        mo55677a(kVar);
    }
}
