package com.p280ss.android.ttvecamera.p916c;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.Camera.Area;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Bundle;
import android.os.Handler;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20548a.C20549a;
import com.p280ss.android.ttvecamera.C20548a.C20550b;
import com.p280ss.android.ttvecamera.C20599e;
import com.p280ss.android.ttvecamera.C20604f.C20605a;
import com.p280ss.android.ttvecamera.C20604f.C20606b;
import com.p280ss.android.ttvecamera.C20604f.C20607c;
import com.p280ss.android.ttvecamera.C20632i;
import com.p280ss.android.ttvecamera.C20632i.C20638f;
import com.p280ss.android.ttvecamera.C20632i.C20641i;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.C20650k;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.TEFocusParameters;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p915b.C20563a;
import com.p280ss.android.ttvecamera.p915b.C20563a.C20564a;
import com.p280ss.android.ttvecamera.p917d.C20590c;
import com.p280ss.android.ttvecamera.p919f.C20613c;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.c.b */
public abstract class C20581b implements C20564a, C20580a {

    /* renamed from: a */
    private Rect f55596a;

    /* renamed from: b */
    private float f55597b = 1.0f;

    /* renamed from: c */
    private Map<String, Integer> f55598c = new HashMap<String, Integer>() {
        {
            put("auto", Integer.valueOf(1));
            put("incandescent", Integer.valueOf(2));
            put("fluorescent", Integer.valueOf(3));
            put("warm-fluorescent", Integer.valueOf(4));
            put("daylight", Integer.valueOf(5));
            put("cloudy-daylight", Integer.valueOf(6));
            put("twilight", Integer.valueOf(7));
            put("shade", Integer.valueOf(8));
        }
    };

    /* renamed from: d */
    private Runnable f55599d = new Runnable() {
        public final void run() {
            C20581b.this.f55615u.mo55648a();
        }
    };

    /* renamed from: f */
    protected C20605a f55600f;

    /* renamed from: g */
    public C20599e f55601g;

    /* renamed from: h */
    public C20632i f55602h;

    /* renamed from: i */
    public C20590c f55603i;

    /* renamed from: j */
    protected Handler f55604j;

    /* renamed from: k */
    public CameraCharacteristics f55605k;

    /* renamed from: l */
    StreamConfigurationMap f55606l;

    /* renamed from: m */
    public CaptureRequest f55607m;

    /* renamed from: n */
    public Builder f55608n;

    /* renamed from: o */
    protected AtomicBoolean f55609o = new AtomicBoolean(false);

    /* renamed from: p */
    public boolean f55610p = true;

    /* renamed from: q */
    protected float f55611q = 0.0f;

    /* renamed from: r */
    protected Rect f55612r = null;

    /* renamed from: s */
    protected C20606b f55613s;

    /* renamed from: t */
    public C20607c f55614t;

    /* renamed from: u */
    protected C20563a f55615u;

    /* renamed from: v */
    public CameraCaptureSession f55616v;

    /* renamed from: w */
    public StateCallback f55617w = new StateCallback() {
        public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
            C20652m.m68435b("TECameraModeBase", "onConfigureFailed...");
            C20581b.this.f55601g.mo55731e(4);
        }

        public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
            C20652m.m68434a("TECameraModeBase", "onConfigured...");
            C20581b.this.f55616v = cameraCaptureSession;
            try {
                int l = C20581b.this.mo55711l();
                if (l != 0) {
                    C20581b.this.f55600f.mo55580a(C20581b.this.f55602h.f55724c, l, "updateCapture : something wrong.");
                }
            } catch (Exception unused) {
            }
        }
    };

    /* renamed from: x */
    protected CaptureCallback f55618x = new CaptureCallback() {
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (C20581b.this.f55610p) {
                C20581b.this.f55610p = C20642j.m68416a((Object) totalCaptureResult);
            }
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            StringBuilder sb = new StringBuilder("failure: ");
            sb.append(captureFailure);
            C20652m.m68437d("TECameraModeBase", sb.toString());
        }

        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    };

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo55624a();

    /* renamed from: a */
    public void mo55628a(int i, int i2, C20638f fVar) {
    }

    /* renamed from: a */
    public void mo55629a(C20638f fVar) {
    }

    /* renamed from: f */
    public abstract int mo55635f() throws Exception;

    /* renamed from: j */
    public final void mo55709j() {
        this.f55612r = null;
    }

    /* renamed from: a */
    public Rect mo55704a(float f) {
        if (this.f55605k == null || this.f55608n == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -420, "Camera info is null, may be you need reopen camera.");
            return null;
        }
        float floatValue = ((Float) this.f55605k.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        Rect rect = (Rect) this.f55605k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = rect.width() - ((int) (((float) rect.width()) / floatValue));
        int height = rect.height() - ((int) (((float) rect.height()) / floatValue));
        int i = (int) ((((float) width) / floatValue) * f);
        int i2 = (int) ((((float) height) / floatValue) * f);
        int i3 = i - (i & 3);
        int i4 = i2 - (i2 & 3);
        return new Rect(i3, i4, rect.width() - i3, rect.height() - i4);
    }

    /* renamed from: a */
    public final void mo55706a(boolean z, String str) {
        int i;
        if (this.f55608n == null || this.f55616v == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -424, "Capture Session is null");
        }
        if (this.f55598c.get(str) == null) {
            i = 1;
        } else {
            i = ((Integer) this.f55598c.get(str)).intValue();
        }
        this.f55608n.set(CaptureRequest.CONTROL_AWB_LOCK, Boolean.valueOf(z));
        this.f55608n.set(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(i));
        try {
            this.f55616v.setRepeatingRequest(this.f55608n.build(), this.f55618x, null);
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("setWhiteBalance exception: ");
            sb.append(e.getMessage());
            C20652m.m68437d("TECameraModeBase", sb.toString());
            StringBuilder sb2 = new StringBuilder("setWhiteBalance exception: ");
            sb2.append(e.getMessage());
            this.f55600f.mo55580a(this.f55602h.f55724c, -424, sb2.toString());
        }
    }

    /* renamed from: g */
    public void mo55636g() {
        if (this.f55616v != null && mo55624a() != null) {
            this.f55616v.close();
            this.f55616v = null;
        }
    }

    /* renamed from: m */
    public final int mo55712m() {
        if (this.f55608n != null) {
            return this.f55615u.mo55648a();
        }
        this.f55600f.mo55580a(this.f55602h.f55724c, -100, "rollbackNormalSessionRequest : param is null.");
        return -100;
    }

    /* renamed from: b */
    private void mo55630b() {
        this.f55602h.f55725d = C20590c.m68176a(this.f55605k, this.f55602h.f55725d.f55775a, this.f55602h.f55725d.f55776b);
        StringBuilder sb = new StringBuilder("Set Fps Range: ");
        sb.append(this.f55602h.f55725d.toString());
        C20652m.m68435b("TECameraModeBase", sb.toString());
    }

    /* renamed from: k */
    public final int mo55710k() {
        C20613c cVar = this.f55601g.f55654n;
        if (mo55624a() == null || cVar == null) {
            C20652m.m68435b("TECameraModeBase", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f55605k.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (cVar.f55676b.f55672f) {
            cVar.mo55755a(streamConfigurationMap, (TEFrameSizei) null);
            this.f55602h.f55731j = cVar.mo55763f();
            if (this.f55602h.f55731j != null) {
                this.f55600f.mo55582b(5, 0, this.f55602h.f55731j.toString());
            }
        } else {
            cVar.mo55755a(streamConfigurationMap, this.f55602h.f55731j);
            this.f55602h.f55732k = cVar.mo55764g();
        }
        if (cVar.mo55759b() == 1) {
            if (cVar.mo55762e() == null) {
                C20652m.m68437d("TECameraModeBase", "SurfaceTexture is null.");
                return -100;
            }
            cVar.mo55762e().setDefaultBufferSize(this.f55602h.f55731j.f55535a, this.f55602h.f55731j.f55536b);
        } else if (!(cVar.mo55759b() == 2 || cVar.mo55759b() == 8)) {
            StringBuilder sb = new StringBuilder("Unsupported camera provider type : ");
            sb.append(cVar.mo55759b());
            C20652m.m68437d("TECameraModeBase", sb.toString());
            return -200;
        }
        return 0;
    }

    /* renamed from: l */
    public int mo55711l() throws CameraAccessException {
        if (this.f55601g.f55654n == null || this.f55608n == null) {
            return -100;
        }
        this.f55600f.mo55582b(0, 0, "TECamera2 preview");
        if (this.f55603i.mo55730c(this.f55605k)) {
            StringBuilder sb = new StringBuilder("Stabilization Supported, toggle = ");
            sb.append(this.f55602h.f55720A);
            C20652m.m68434a("TECameraModeBase", sb.toString());
            this.f55603i.mo55727a(this.f55605k, this.f55608n, this.f55602h.f55720A);
        }
        this.f55608n.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        this.f55608n.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f55602h.f55725d.f55775a / this.f55602h.f55725d.f55777c), Integer.valueOf(this.f55602h.f55725d.f55776b / this.f55602h.f55725d.f55777c)));
        this.f55607m = this.f55608n.build();
        this.f55616v.setRepeatingRequest(this.f55607m, this.f55618x, this.f55604j);
        this.f55602h.f55727f = ((Integer) this.f55605k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f55601g.mo55731e(3);
        mo55714o();
        C20652m.m68434a("TECameraModeBase", "send capture request...");
        return 0;
    }

    /* renamed from: o */
    public final void mo55714o() {
        Bundle bundle;
        if (this.f55601g.f55661u.containsKey(this.f55602h.f55743v)) {
            bundle = (Bundle) this.f55601g.f55661u.get(this.f55602h.f55743v);
        } else {
            bundle = new Bundle();
            this.f55601g.f55661u.put(this.f55602h.f55743v, bundle);
        }
        bundle.putParcelable("camera_preview_size", this.f55602h.f55731j);
        if (this.f55603i != null) {
            bundle.putBoolean("camera_torch_supported", C20590c.m68179b(this.f55605k));
        } else {
            bundle.putBoolean("camera_torch_supported", false);
        }
        if (this.f55605k != null && this.f55607m != null) {
            TEFocusParameters tEFocusParameters = new TEFocusParameters();
            tEFocusParameters.f55531a = (Rect) this.f55605k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            tEFocusParameters.f55532b = (Rect) this.f55607m.get(CaptureRequest.SCALER_CROP_REGION);
            tEFocusParameters.f55534d = ((Integer) this.f55605k.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue();
            tEFocusParameters.f55533c = ((Integer) this.f55605k.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
            bundle.putParcelable("camera_focus_parameters", tEFocusParameters);
        }
    }

    /* renamed from: n */
    public final float[] mo55713n() {
        if (this.f55603i == null || this.f55607m == null || this.f55616v == null || this.f55608n == null) {
            C20652m.m68436c("TECameraModeBase", "Env is null");
            return new float[]{-2.0f, -2.0f};
        }
        float[] fArr = new float[2];
        double[] dArr = new double[2];
        SizeF sizeF = (SizeF) this.f55605k.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
        Rect rect = (Rect) this.f55605k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        Size size = (Size) this.f55605k.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        Float f = (Float) this.f55608n.get(CaptureRequest.LENS_FOCAL_LENGTH);
        int abs = StrictMath.abs(rect.right - rect.left);
        int abs2 = StrictMath.abs(rect.top - rect.bottom);
        int i = this.f55602h.f55731j.f55535a;
        int i2 = this.f55602h.f55731j.f55536b;
        if (abs * i2 >= i / abs2) {
            dArr[0] = StrictMath.atan((double) (((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) / (f.floatValue() * 2.0f))) * 2.0d;
            dArr[1] = StrictMath.atan((double) (((((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) * ((float) (i / i2))) / ((float) (abs / abs2))) / (f.floatValue() * 2.0f))) * 2.0d;
        } else {
            dArr[1] = StrictMath.atan((double) (((sizeF.getHeight() * ((float) abs2)) / ((float) size.getHeight())) / (f.floatValue() * 2.0f))) * 2.0d;
            dArr[0] = StrictMath.atan((double) (((((sizeF.getWidth() * ((float) abs)) / ((float) size.getWidth())) * ((float) (i2 / i))) / ((float) (abs2 / abs))) / (f.floatValue() * 2.0f))) * 2.0d;
        }
        fArr[0] = (float) ((dArr[1] * 180.0d) / 3.141592653589793d);
        fArr[1] = (float) ((dArr[0] * 180.0d) / 3.141592653589793d);
        StringBuilder sb = new StringBuilder("Camera2:verticalFOV = ");
        sb.append(fArr[0]);
        sb.append(",horizontalFOV = ");
        sb.append(fArr[1]);
        C20652m.m68435b("TECameraModeBase", sb.toString());
        return fArr;
    }

    /* renamed from: a */
    public final void mo55705a(C20606b bVar) {
        this.f55613s = bVar;
    }

    /* renamed from: b */
    public final Rect mo55707b(float f) {
        if (this.f55596a == null) {
            C20652m.m68437d("TECameraModeBase", "ActiveArraySize == null");
            this.f55600f.mo55580a(this.f55602h.f55724c, -420, "ActiveArraySize == null.");
            return null;
        } else if (this.f55597b <= 0.0f || this.f55597b > this.f55611q) {
            C20652m.m68437d("TECameraModeBase", "factor invalid");
            this.f55600f.mo55580a(this.f55602h.f55724c, -420, "factor invalid.");
            return null;
        } else {
            float f2 = 1.0f / this.f55597b;
            int width = (this.f55596a.width() - Math.round(((float) this.f55596a.width()) * f2)) / 2;
            int height = (this.f55596a.height() - Math.round(((float) this.f55596a.height()) * f2)) / 2;
            Rect rect = new Rect(C20642j.m68407a(width, this.f55596a.left, this.f55596a.right), C20642j.m68407a(height, this.f55596a.top, this.f55596a.bottom), C20642j.m68407a(this.f55596a.width() - width, this.f55596a.left, this.f55596a.right), C20642j.m68407a(this.f55596a.height() - height, this.f55596a.top, this.f55596a.bottom));
            if (rect.equals((Rect) this.f55607m.get(CaptureRequest.SCALER_CROP_REGION))) {
                C20652m.m68434a("TECameraModeBase", "same SCALER_CROP_REGION, no need to set");
            }
            return rect;
        }
    }

    /* renamed from: c */
    public void mo55708c(float f) {
        if (this.f55616v == null || this.f55607m == null || this.f55608n == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -420, "Camera info is null, may be you need reopen camera.");
        } else if ((this.f55597b < this.f55611q || f <= 1.0f) && (this.f55612r == null || !this.f55612r.equals(this.f55596a) || f > 1.0f)) {
            this.f55597b *= f;
            try {
                Rect b = mo55707b(this.f55597b);
                if (b != null) {
                    this.f55616v.stopRepeating();
                    this.f55608n.set(CaptureRequest.SCALER_CROP_REGION, b);
                    this.f55607m = this.f55608n.build();
                    this.f55616v.setRepeatingRequest(this.f55607m, this.f55618x, this.f55604j);
                    this.f55612r = b;
                    mo55714o();
                }
            } catch (Exception e) {
                this.f55600f.mo55580a(this.f55602h.f55724c, -420, e.toString());
            }
        } else {
            C20652m.m68437d("TECameraModeBase", "zoomV2 factor invalid");
        }
    }

    /* renamed from: a */
    public final int mo55701a(C20650k kVar) {
        Rect rect;
        Rect rect2;
        boolean z;
        boolean z2;
        C20650k kVar2 = kVar;
        if (this.f55603i == null || this.f55607m == null || this.f55616v == null || this.f55608n == null) {
            C20652m.m68436c("TECameraModeBase", "Env is null");
            return -100;
        } else if (this.f55609o.get()) {
            C20652m.m68436c("TECameraModeBase", "Manual focus already engaged");
            return 0;
        } else {
            boolean f = C20590c.m68182f(this.f55605k);
            boolean e = C20590c.m68181e(this.f55605k);
            if (e || f) {
                this.f55604j.removeCallbacks(this.f55599d);
                if (kVar2.f55773h != null) {
                    C20549a aVar = kVar2.f55773h;
                    int i = kVar2.f55766a;
                    int i2 = kVar2.f55767b;
                    int i3 = kVar2.f55768c;
                    int i4 = kVar2.f55769d;
                    int i5 = this.f55602h.f55727f;
                    if (this.f55602h.f55726e == 1) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    rect = ((Area) aVar.mo55611a(i, i2, i3, i4, i5, z2).get(0)).rect;
                } else {
                    rect = m68140a(kVar2.f55766a, kVar2.f55767b, (float) kVar2.f55768c, (float) kVar2.f55769d, this.f55602h.f55727f, 0);
                }
                Rect rect3 = rect;
                if (kVar2.f55774i != null) {
                    C20550b bVar = kVar2.f55774i;
                    int i6 = kVar2.f55766a;
                    int i7 = kVar2.f55767b;
                    int i8 = kVar2.f55768c;
                    int i9 = kVar2.f55769d;
                    int i10 = this.f55602h.f55727f;
                    if (this.f55602h.f55726e == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    rect2 = ((Area) bVar.mo55612a(i6, i7, i8, i9, i10, z).get(0)).rect;
                } else {
                    rect2 = m68140a(kVar2.f55766a, kVar2.f55767b, (float) kVar2.f55768c, (float) kVar2.f55769d, this.f55602h.f55727f, 1);
                }
                if (!C20642j.m68415a(rect3) || !C20642j.m68415a(rect2)) {
                    C20652m.m68437d("TECameraModeBase", "focusRect or meteringRect is not valid!");
                    return -100;
                }
                try {
                    this.f55616v.stopRepeating();
                    if (kVar2.f55772g && f) {
                        this.f55615u.mo55652b(this.f55608n, rect2);
                    }
                    if (e) {
                        if (kVar2.f55771f) {
                            this.f55609o.set(true);
                            this.f55615u.mo55649a(this.f55608n, rect3);
                            this.f55607m = this.f55608n.build();
                            this.f55616v.setRepeatingRequest(this.f55607m, this.f55615u.mo55651a(this.f55608n, this.f55609o), this.f55604j);
                            this.f55604j.postDelayed(this.f55599d, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                            return 0;
                        }
                    }
                    if (f && kVar2.f55772g) {
                        this.f55607m = this.f55608n.build();
                        this.f55616v.setRepeatingRequest(this.f55607m, this.f55615u.mo55650a(this.f55608n), this.f55604j);
                        this.f55609o.set(false);
                    }
                    return -412;
                } catch (CameraAccessException unused) {
                    this.f55609o.set(false);
                }
            } else {
                C20652m.m68436c("TECameraModeBase", "do not support MeteringAreaAF!");
                return -412;
            }
        }
    }

    /* renamed from: a */
    public final int mo55703a(boolean z) {
        int i;
        if (this.f55608n == null || this.f55616v == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -100, "toggleTorch : Capture Session is null");
            return -100;
        }
        try {
            Builder builder = this.f55608n;
            Key key = CaptureRequest.FLASH_MODE;
            if (z) {
                i = 2;
            } else {
                i = 0;
            }
            builder.set(key, Integer.valueOf(i));
            this.f55616v.setRepeatingRequest(this.f55608n.build(), this.f55618x, null);
            return 0;
        } catch (Exception e) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -417, e.toString());
            return -417;
        }
    }

    /* renamed from: a */
    public int mo55699a(float f, C20641i iVar) {
        Rect a = mo55704a(f);
        if (a == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -420, "zoom rect is null.");
            return -420;
        }
        this.f55608n.set(CaptureRequest.SCALER_CROP_REGION, a);
        try {
            this.f55607m = this.f55608n.build();
            this.f55616v.setRepeatingRequest(this.f55607m, this.f55618x, null);
            if (iVar != null) {
                iVar.mo55817a(this.f55602h.f55724c, f, true);
            }
            mo55714o();
            return 0;
        } catch (CameraAccessException e) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -420, e.toString());
            return -420;
        }
    }

    /* renamed from: a */
    public final int mo55702a(String str, int i) throws CameraAccessException {
        if (this.f55605k == null || !this.f55603i.mo55729a(this.f55605k, i)) {
            return -401;
        }
        this.f55602h.f55727f = ((Integer) this.f55605k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f55606l = (StreamConfigurationMap) this.f55605k.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        if (this.f55606l == null) {
            return -401;
        }
        Float f = (Float) this.f55605k.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM);
        if (f != null) {
            this.f55611q = f.floatValue();
        }
        this.f55597b = 1.0f;
        this.f55596a = (Rect) this.f55605k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        mo55630b();
        return 0;
    }

    public C20581b(C20599e eVar, Context context, Handler handler) {
        this.f55601g = eVar;
        this.f55602h = this.f55601g.f55648h;
        this.f55603i = C20590c.m68175a(context, this.f55602h.f55724c);
        this.f55600f = this.f55601g.f55650j;
        this.f55604j = handler;
    }

    /* renamed from: a */
    public final int mo55700a(int i, int i2, float f, int i3, int i4) {
        C20650k kVar = new C20650k(i, i2, i3, i4, f);
        return mo55701a(kVar);
    }

    /* renamed from: a */
    private Rect m68140a(int i, int i2, float f, float f2, int i3, int i4) {
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Rect rect = (Rect) this.f55605k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(", ");
        sb.append(rect.right);
        sb.append(", ");
        sb.append(rect.bottom);
        sb.append("]");
        C20652m.m68435b("TECameraModeBase", sb.toString());
        Size size = (Size) this.f55605k.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        C20652m.m68434a("onAreaTouchEvent", sb2.toString());
        int i8 = this.f55602h.f55731j.f55535a;
        int i9 = this.f55602h.f55731j.f55536b;
        if (90 == this.f55602h.f55727f || 270 == this.f55602h.f55727f) {
            i8 = this.f55602h.f55731j.f55536b;
            i9 = this.f55602h.f55731j.f55535a;
        }
        float f8 = 0.0f;
        if (i9 * i5 >= i8 * i6) {
            float f9 = (((float) i5) * 1.0f) / ((float) i8);
            f4 = f9;
            f3 = ((((float) i9) * f9) - ((float) i6)) / 2.0f;
            f5 = 0.0f;
        } else {
            float f10 = (((float) i6) * 1.0f) / ((float) i9);
            float f11 = ((((float) i8) * f10) - ((float) i5)) / 2.0f;
            f4 = f10;
            f3 = 0.0f;
            f5 = f11;
        }
        float f12 = (f + f5) / f4;
        float f13 = (f2 + f3) / f4;
        if (90 == i7) {
            f12 = ((float) this.f55602h.f55731j.f55536b) - f12;
        } else if (270 == i7) {
            f13 = ((float) this.f55602h.f55731j.f55535a) - f13;
        } else {
            float f14 = f13;
            f13 = f12;
            f12 = f14;
        }
        Rect rect2 = (Rect) this.f55607m.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            C20652m.m68436c("TECameraModeBase", "can't get crop region");
            rect2 = rect;
        }
        int width = rect2.width();
        int height = rect2.height();
        if (this.f55602h.f55731j.f55536b * width > this.f55602h.f55731j.f55535a * height) {
            float f15 = (((float) height) * 1.0f) / ((float) this.f55602h.f55731j.f55536b);
            f8 = (((float) width) - (((float) this.f55602h.f55731j.f55535a) * f15)) / 2.0f;
            f7 = f15;
            f6 = 0.0f;
        } else {
            f7 = (((float) width) * 1.0f) / ((float) this.f55602h.f55731j.f55535a);
            f6 = (((float) height) - (((float) this.f55602h.f55731j.f55536b) * f7)) / 2.0f;
        }
        float f16 = (f13 * f7) + f8 + ((float) rect2.left);
        float f17 = (f12 * f7) + f6 + ((float) rect2.top);
        if (this.f55602h.f55726e == 1) {
            f17 = ((float) rect2.height()) - f17;
        }
        Rect rect3 = new Rect();
        if (i4 == 0) {
            double d = (double) f16;
            double width2 = (double) rect2.width();
            Double.isNaN(width2);
            double d2 = width2 * 0.05d;
            Double.isNaN(d);
            rect3.left = C20642j.m68407a((int) (d - d2), 0, rect2.width());
            double width3 = (double) rect2.width();
            Double.isNaN(width3);
            double d3 = width3 * 0.05d;
            Double.isNaN(d);
            rect3.right = C20642j.m68407a((int) (d + d3), 0, rect2.width());
            double d4 = (double) f17;
            double height2 = (double) rect2.height();
            Double.isNaN(height2);
            double d5 = height2 * 0.05d;
            Double.isNaN(d4);
            rect3.top = C20642j.m68407a((int) (d4 - d5), 0, rect2.height());
            double height3 = (double) rect2.height();
            Double.isNaN(height3);
            double d6 = height3 * 0.05d;
            Double.isNaN(d4);
            rect3.bottom = C20642j.m68407a((int) (d4 + d6), 0, rect2.height());
        } else {
            double d7 = (double) f16;
            double width4 = (double) rect2.width();
            Double.isNaN(width4);
            double d8 = width4 * 0.1d;
            Double.isNaN(d7);
            rect3.left = C20642j.m68407a((int) (d7 - d8), 0, rect2.width());
            double width5 = (double) rect2.width();
            Double.isNaN(width5);
            double d9 = width5 * 0.1d;
            Double.isNaN(d7);
            rect3.right = C20642j.m68407a((int) (d7 + d9), 0, rect2.width());
            double d10 = (double) f17;
            double height4 = (double) rect2.height();
            Double.isNaN(height4);
            double d11 = height4 * 0.1d;
            Double.isNaN(d10);
            rect3.top = C20642j.m68407a((int) (d10 - d11), 0, rect2.height());
            double height5 = (double) rect2.height();
            Double.isNaN(height5);
            double d12 = height5 * 0.1d;
            Double.isNaN(d10);
            rect3.bottom = C20642j.m68407a((int) (d10 + d12), 0, rect2.height());
        }
        if (rect3.left < 0 || rect3.left > rect2.right) {
            rect3.left = rect2.left;
        }
        if (rect3.top < 0 || rect3.top > rect2.bottom) {
            rect3.top = rect2.top;
        }
        if (rect3.right < 0 || rect3.right > rect2.right) {
            rect3.right = rect2.right;
        }
        if (rect3.bottom < 0 || rect3.bottom > rect2.bottom) {
            rect3.bottom = rect2.bottom;
        }
        StringBuilder sb3 = new StringBuilder("Focus Rect: [left, top, right, bottom] = [");
        sb3.append(rect3.left);
        sb3.append(", ");
        sb3.append(rect3.top);
        sb3.append(", ");
        sb3.append(rect3.right);
        sb3.append(", ");
        sb3.append(rect3.bottom);
        sb3.append("]");
        C20652m.m68434a("TECameraModeBase", sb3.toString());
        return rect3;
    }
}
