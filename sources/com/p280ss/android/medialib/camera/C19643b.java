package com.p280ss.android.medialib.camera;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.hardware.Camera.Area;
import android.hardware.Camera.AutoFocusCallback;
import android.hardware.Camera.CameraInfo;
import android.hardware.Camera.ErrorCallback;
import android.hardware.Camera.OnZoomChangeListener;
import android.hardware.Camera.Parameters;
import android.hardware.Camera.PictureCallback;
import android.hardware.Camera.PreviewCallback;
import android.hardware.Camera.Size;
import android.os.Build;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.util.Log;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19630b;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19631c;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19632d;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19633e;
import com.p280ss.android.medialib.util.C19790a;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.vesdk.C45372t;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.camera.b */
public final class C19643b implements ErrorCallback, IESCameraInterface {

    /* renamed from: a */
    public Camera f53165a;

    /* renamed from: b */
    public int f53166b;

    /* renamed from: c */
    public int f53167c;

    /* renamed from: d */
    public int f53168d;

    /* renamed from: e */
    public C19633e f53169e;

    /* renamed from: f */
    C19663e f53170f;

    /* renamed from: g */
    public SurfaceTexture f53171g;

    /* renamed from: h */
    public boolean f53172h;

    /* renamed from: i */
    public C19631c f53173i;

    /* renamed from: j */
    public boolean f53174j = true;

    /* renamed from: k */
    private int f53175k = -1;

    /* renamed from: l */
    private C19632d f53176l;

    /* renamed from: m */
    private boolean f53177m;

    /* renamed from: n */
    private boolean f53178n;

    /* renamed from: o */
    private int f53179o;

    /* renamed from: p */
    private C19662d f53180p;

    /* renamed from: q */
    private C19629a f53181q;

    /* renamed from: r */
    private int f53182r;

    /* renamed from: s */
    private int f53183s;

    /* renamed from: t */
    private PreviewCallback f53184t = new PreviewCallback() {
        public final void onPreviewFrame(byte[] bArr, Camera camera) {
            if (C19643b.this.f53173i != null) {
                C19643b.this.f53173i.mo52248a(1, new ImageFrame(bArr, -3, C19643b.this.f53167c, C19643b.this.f53168d));
            }
            if (C19643b.this.f53165a != null) {
                C19643b.this.f53165a.addCallbackBuffer(bArr);
            }
        }
    };

    /* renamed from: a */
    private static int m64686a(int i, int i2, int i3) {
        if (i > 1000) {
            return 1000;
        }
        if (i < -1000) {
            return -1000;
        }
        return i;
    }

    /* renamed from: e */
    private static int m64694e(int i) {
        if (i == 100) {
            return 100;
        }
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            default:
                return -1;
        }
    }

    /* renamed from: b */
    public final void mo52231b(boolean z) {
    }

    /* renamed from: g */
    public final int mo52237g() {
        return this.f53182r;
    }

    /* renamed from: m */
    public final int mo52243m() {
        return this.f53175k;
    }

    /* renamed from: n */
    public final boolean mo52244n() {
        return this.f53172h;
    }

    /* renamed from: o */
    public final int mo52245o() {
        return 17;
    }

    /* renamed from: a */
    public final void mo52221a(C19663e eVar) {
        this.f53170f = eVar;
    }

    /* renamed from: a */
    public final boolean mo52223a() {
        try {
            if (this.f53165a == null || this.f53165a.getParameters() == null || this.f53165a.getParameters().getSupportedFlashModes() == null) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo52222a(boolean z) {
        if (this.f53165a != null) {
            try {
                Parameters parameters = this.f53165a.getParameters();
                if (parameters != null) {
                    parameters.setFlashMode(z ? "torch" : "off");
                    m64690a(this.f53165a, parameters);
                }
            } catch (RuntimeException unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo52224a(int i) {
        if (this.f53165a == null) {
            return false;
        }
        try {
            Parameters parameters = this.f53165a.getParameters();
            if (parameters != null) {
                List supportedFlashModes = parameters.getSupportedFlashModes();
                if (supportedFlashModes != null) {
                    String str = null;
                    switch (i) {
                        case 0:
                            str = "off";
                            break;
                        case 1:
                            str = "on";
                            break;
                        case 2:
                            str = "torch";
                            break;
                        case 3:
                            str = "auto";
                            break;
                        case 4:
                            str = "red-eye";
                            break;
                    }
                    if (str != null && supportedFlashModes.contains(str)) {
                        parameters.setFlashMode(str);
                        m64690a(this.f53165a, parameters);
                        this.f53179o = i;
                        return true;
                    }
                }
                return true;
            }
        } catch (RuntimeException unused) {
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo52226a(int i, C19662d dVar) {
        StringBuilder sb = new StringBuilder("open pos:");
        sb.append(i);
        sb.append(" >>");
        C45372t.m143403a("Camera1", sb.toString());
        C20479f.m67954a("iesve_record_camera_type", 1);
        try {
            this.f53165a = m64693d(i == 0 ? 0 : 1);
            if (this.f53165a != null) {
                this.f53165a.setErrorCallback(this);
                if (dVar != null) {
                    dVar.mo52271a(1);
                }
                C45372t.m143403a("Camera1", "open success: ");
                this.f53174j = false;
                return true;
            }
            if (dVar != null) {
                StringBuilder sb2 = new StringBuilder("No find camera @");
                sb2.append(i);
                dVar.mo52272a(1, -1, sb2.toString());
            }
            C45372t.m143403a("Camera1", "open failed: 2");
            return false;
        } catch (Throwable th) {
            if (dVar != null) {
                dVar.mo52272a(1, -3, th.getLocalizedMessage());
            }
            StringBuilder sb3 = new StringBuilder("open failed: ");
            sb3.append(Log.getStackTraceString(th));
            C45372t.m143403a("Camera1", sb3.toString());
            return false;
        }
    }

    /* renamed from: a */
    public final void mo52216a(SurfaceTexture surfaceTexture) {
        C45372t.m143403a("Camera1", "camera  startPreview >>");
        if (this.f53165a == null || surfaceTexture == null) {
            C45372t.m143409d("Camera1", "Camera || SurfaceTexture is null.");
            return;
        }
        C45372t.m143405b("Camera1", "startPreview...");
        try {
            if (this.f53177m) {
                this.f53165a.stopPreview();
            }
            this.f53171g = surfaceTexture;
            this.f53165a.setPreviewTexture(surfaceTexture);
            C45372t.m143403a("Camera1", "camera  startPreviewing...");
            this.f53165a.startPreview();
            int[] iArr = new int[2];
            this.f53165a.getParameters().getPreviewFpsRange(iArr);
            StringBuilder sb = new StringBuilder("Fps Range: [");
            sb.append(iArr[0]);
            sb.append(", ");
            sb.append(iArr[1]);
            sb.append("]");
            C45372t.m143403a("Camera1", sb.toString());
            this.f53177m = true;
            if (this.f53181q != null) {
                this.f53181q.mo52246a();
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("startPreview: Error ");
            sb2.append(e.getMessage());
            C45372t.m143409d("Camera1", sb2.toString());
            mo52228b();
        }
    }

    /* renamed from: a */
    public final boolean mo52225a(int i, int i2, float f, float[] fArr, int i3) {
        if (this.f53165a == null) {
            return false;
        }
        int i4 = i2;
        float f2 = f;
        float[] fArr2 = fArr;
        int i5 = i3;
        Rect a = m64688a(i, i4, f2, fArr2, i5, 0);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new Area(a, 1000));
        Rect a2 = m64688a(i, i4, f2, fArr2, i5, 1);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new Area(a2, 1000));
        try {
            Parameters parameters = this.f53165a.getParameters();
            if (parameters.getMaxNumMeteringAreas() <= 0) {
                C45372t.m143409d("Camera1", "metering areas not supported");
            } else if (!TextUtils.equals(Build.BRAND, "Multilaser") && !TextUtils.equals(Build.BRAND, "MS40")) {
                parameters.setMeteringAreas(arrayList2);
            }
            if (parameters.getMaxNumFocusAreas() <= 0) {
                m64690a(this.f53165a, parameters);
                C45372t.m143409d("Camera1", "focus areas not supported");
                return false;
            } else if (TextUtils.equals(Build.BRAND, "Multilaser") || TextUtils.equals(Build.BRAND, "MS40")) {
                return false;
            } else {
                parameters.setFocusAreas(arrayList);
                String flashMode = parameters.getFlashMode();
                if (!"off".equals(flashMode) && !"torch".equals(flashMode)) {
                    int i6 = this.f53179o;
                    parameters.setFlashMode("off");
                    this.f53179o = i6;
                }
                parameters.setFocusMode("auto");
                m64690a(this.f53165a, parameters);
                this.f53165a.autoFocus(new AutoFocusCallback() {
                    public final void onAutoFocus(boolean z, Camera camera) {
                        StringBuilder sb = new StringBuilder("focus: ");
                        sb.append(z);
                        C45372t.m143405b("Camera1", sb.toString());
                        if (!z) {
                            try {
                                camera.cancelAutoFocus();
                            } catch (Exception unused) {
                                return;
                            }
                        }
                        Parameters parameters = camera.getParameters();
                        parameters.setFocusMode("continuous-video");
                        C19643b.m64690a(camera, parameters);
                    }
                });
                return true;
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final void mo52220a(C19633e eVar) {
        this.f53169e = eVar;
    }

    /* renamed from: a */
    public final void mo52219a(C19632d dVar) {
        this.f53176l = dVar;
    }

    /* renamed from: j */
    public final boolean mo52240j() {
        if (this.f53165a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: p */
    private void m64695p() {
        mo52228b();
        mo52226a(mo52243m(), (C19662d) new C19662d() {
            /* renamed from: a */
            public final void mo52272a(int i, int i2, String str) {
            }

            /* renamed from: a */
            public final void mo52271a(int i) {
                C19643b.this.mo52238h();
                if (C19643b.this.f53170f.f53266o == 1) {
                    C19643b.this.mo52216a(C19643b.this.f53171g);
                } else {
                    C19643b.this.mo52236f();
                }
            }
        });
    }

    /* renamed from: c */
    public final void mo52233c() {
        C45372t.m143403a("Camera1", "camera  release >>");
        mo52228b();
        C45372t.m143403a("Camera1", "camera  release <<");
    }

    /* renamed from: d */
    public final void mo52234d() {
        if (this.f53178n) {
            m64695p();
        } else if (this.f53170f.f53266o == 1) {
            mo52216a(this.f53171g);
        } else {
            mo52236f();
        }
    }

    /* renamed from: k */
    public final int[] mo52241k() {
        try {
            Size previewSize = this.f53165a.getParameters().getPreviewSize();
            return new int[]{previewSize.width, previewSize.height};
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public final void mo52228b() {
        C45372t.m143403a("Camera1", "camera close >>");
        if (this.f53165a != null) {
            try {
                this.f53165a.setErrorCallback(null);
                this.f53165a.setPreviewCallback(null);
                this.f53165a.setPreviewCallbackWithBuffer(null);
                this.f53165a.stopPreview();
                this.f53174j = true;
                this.f53165a.release();
                C45372t.m143403a("Camera1", "camera released");
            } catch (Exception unused) {
            }
        }
        this.f53177m = false;
        this.f53165a = null;
        this.f53180p = null;
        this.f53179o = 0;
        C45372t.m143403a("Camera1", "camera close <<");
    }

    /* renamed from: e */
    public final void mo52235e() {
        C45372t.m143405b("Camera1", "stopPreview >>");
        if (this.f53165a != null) {
            try {
                this.f53165a.setPreviewCallback(null);
                this.f53165a.stopPreview();
            } catch (Exception e) {
                StringBuilder sb = new StringBuilder("stopPreview: Error ");
                sb.append(Log.getStackTraceString(e));
                C45372t.m143409d("Camera1", sb.toString());
            }
        }
        this.f53177m = false;
        C45372t.m143405b("Camera1", "stopPreview <<");
    }

    /* renamed from: i */
    public final float mo52239i() {
        if (this.f53165a != null) {
            try {
                Parameters parameters = this.f53165a.getParameters();
                if (parameters != null && parameters.isZoomSupported()) {
                    if (this.f53169e != null) {
                        int maxZoom = parameters.getMaxZoom();
                        StringBuilder sb = new StringBuilder("Camera Max Zoom is: ");
                        sb.append(maxZoom);
                        C45372t.m143403a("Camera1", sb.toString());
                        this.f53183s = (maxZoom + 1) / 100;
                        if (maxZoom > 99) {
                            maxZoom = 99;
                        }
                        if (this.f53183s <= 0) {
                            this.f53183s = 1;
                        }
                        this.f53169e.mo52250a(1, true, parameters.isSmoothZoomSupported(), (float) maxZoom, parameters.getZoomRatios());
                    }
                    return (float) parameters.getMaxZoom();
                }
            } catch (Throwable unused) {
            }
        }
        if (this.f53169e != null) {
            this.f53169e.mo52250a(1, false, false, -1.0f, null);
        }
        return -1.0f;
    }

    /* renamed from: l */
    public final List<int[]> mo52242l() {
        if (this.f53165a == null) {
            return new ArrayList();
        }
        try {
            List<Size> supportedPreviewSizes = this.f53165a.getParameters().getSupportedPreviewSizes();
            ArrayList arrayList = new ArrayList();
            for (Size size : supportedPreviewSizes) {
                arrayList.add(new int[]{size.width, size.height});
            }
            return arrayList;
        } catch (Throwable unused) {
            return new ArrayList();
        }
    }

    /* renamed from: f */
    public final void mo52236f() {
        if (this.f53165a == null) {
            C45372t.m143409d("Camera1", "Camera || SurfaceTexture is null.");
            return;
        }
        C45372t.m143405b("Camera1", "startPreview...");
        try {
            if (this.f53177m) {
                this.f53165a.stopPreview();
            }
            for (byte[] addCallbackBuffer : (byte[][]) Array.newInstance(byte.class, new int[]{3, ((this.f53167c * this.f53168d) * 3) / 2})) {
                this.f53165a.addCallbackBuffer(addCallbackBuffer);
            }
            this.f53165a.setPreviewCallbackWithBuffer(this.f53184t);
            this.f53165a.setPreviewTexture(this.f53171g);
            if (Build.MODEL.toLowerCase().contains("x9s plus")) {
                this.f53165a.getParameters().setPreviewFpsRange(7000, 25000);
            }
            this.f53165a.startPreview();
            int[] iArr = new int[2];
            this.f53165a.getParameters().getPreviewFpsRange(iArr);
            StringBuilder sb = new StringBuilder("Fps Range: [");
            sb.append(iArr[0]);
            sb.append(", ");
            sb.append(iArr[1]);
            sb.append("]");
            C45372t.m143403a("Camera1", sb.toString());
            this.f53177m = true;
            if (this.f53181q != null) {
                this.f53181q.mo52246a();
            }
        } catch (Exception e) {
            StringBuilder sb2 = new StringBuilder("startPreview: Error ");
            sb2.append(Log.getStackTraceString(e));
            C45372t.m143409d("Camera1", sb2.toString());
            mo52228b();
        }
    }

    /* renamed from: h */
    public final int[] mo52238h() {
        Point point;
        if (this.f53165a != null) {
            try {
                Parameters parameters = this.f53165a.getParameters();
                List<Size> supportedPreviewSizes = parameters.getSupportedPreviewSizes();
                ArrayList arrayList = new ArrayList();
                for (Size size : supportedPreviewSizes) {
                    arrayList.add(new Point(size.width, size.height));
                }
                List<Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
                ArrayList arrayList2 = new ArrayList();
                for (Size size2 : supportedPictureSizes) {
                    arrayList2.add(new Point(size2.width, size2.height));
                }
                if (this.f53170f.f53259h) {
                    point = C19664f.m64787a(arrayList, this.f53170f.f53257f, this.f53170f.f53258g, arrayList2, this.f53170f.f53260i, this.f53170f.f53261j);
                } else {
                    point = C19664f.m64786a((List<Point>) arrayList, this.f53170f.f53257f, this.f53170f.f53258g);
                }
                if (point != null) {
                    this.f53167c = point.x;
                    this.f53168d = point.y;
                }
                StringBuilder sb = new StringBuilder("PreviewSize: ");
                sb.append(this.f53167c);
                sb.append(", ");
                sb.append(this.f53168d);
                C45372t.m143403a("Camera1", sb.toString());
                parameters.setPreviewSize(this.f53167c, this.f53168d);
                if (this.f53170f.f53259h) {
                    m64689a(parameters, this.f53170f.f53260i, this.f53170f.f53261j);
                } else if (VERSION.SDK_INT >= 21 && (this.f53170f.f53268q & 1) != 0) {
                    Point a = m64687a((List<Point>) arrayList2);
                    if (a != null) {
                        parameters.setPictureSize(a.x, a.y);
                        StringBuilder sb2 = new StringBuilder("PictureSize: ");
                        sb2.append(a.x);
                        sb2.append(", ");
                        sb2.append(a.y);
                        C45372t.m143403a("Camera1", sb2.toString());
                    }
                }
                List<Integer> supportedPreviewFrameRates = parameters.getSupportedPreviewFrameRates();
                if (supportedPreviewFrameRates != null) {
                    int i = 0;
                    for (Integer intValue : supportedPreviewFrameRates) {
                        int intValue2 = intValue.intValue();
                        if (intValue2 == 30) {
                            i = intValue2;
                        }
                    }
                    if (i == 0 && supportedPreviewFrameRates.size() > 0) {
                        i = ((Integer) supportedPreviewFrameRates.get(0)).intValue();
                    }
                    if (i != 0) {
                        parameters.setPreviewFrameRate(i);
                    }
                }
                List supportedFocusModes = parameters.getSupportedFocusModes();
                if (supportedFocusModes.contains("continuous-video")) {
                    parameters.setFocusMode("continuous-video");
                } else if (supportedFocusModes.contains("continuous-picture")) {
                    parameters.setFocusMode("continuous-picture");
                } else if (supportedFocusModes.contains("auto")) {
                    parameters.setFocusMode("auto");
                }
                parameters.setPreviewFormat(17);
                if (this.f53170f.f53263l && (this.f53170f.f53268q & 4) != 0) {
                    m64691a(parameters);
                }
                m64690a(this.f53165a, parameters);
            } catch (Throwable unused) {
                C45372t.m143409d("Camera1", "Set camera params failed");
            }
        }
        return new int[]{this.f53167c, this.f53168d};
    }

    /* renamed from: a */
    public final void mo52217a(C19629a aVar) {
        this.f53181q = aVar;
    }

    /* renamed from: b */
    public final void mo52230b(SurfaceTexture surfaceTexture) {
        this.f53171g = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo52218a(C19631c cVar) {
        this.f53173i = cVar;
    }

    /* renamed from: c */
    private static int m64692c(int i) {
        return m64686a(i, -1000, 1000);
    }

    /* renamed from: a */
    private boolean m64691a(Parameters parameters) {
        if (this.f53170f.f53259h) {
            parameters.set("MTK_CAMERA_MODE", "CAMERA_MODE_MTK_PRV");
        } else {
            parameters.set("MTK_CAMERA_MODE", "CAMERA_MODE_MTK_PVO");
        }
        return false;
    }

    /* renamed from: a */
    private Point m64687a(List<Point> list) {
        Point point = null;
        for (Point point2 : list) {
            if (Math.max(point2.x, point2.y) <= 1920 && point2.x * this.f53168d == point2.y * this.f53167c) {
                if (point == null || point2.x > point.x) {
                    point = point2;
                }
            }
        }
        if (point == null || point.x < this.f53167c || point.y < this.f53168d) {
            return null;
        }
        return point;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0066 A[SYNTHETIC, Splitter:B:23:0x0066] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.hardware.Camera m64693d(int r7) {
        /*
            r6 = this;
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r0.<init>()
            int r1 = android.hardware.Camera.getNumberOfCameras()
            java.lang.String r2 = "Camera1"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "getCamera cameraCount: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r2, r3)
            r2 = 0
        L_0x001d:
            r3 = 0
            if (r2 >= r1) goto L_0x0075
            r4 = 1
            android.hardware.Camera.getCameraInfo(r2, r0)     // Catch:{ RuntimeException -> 0x004b }
            int r5 = r0.facing     // Catch:{ RuntimeException -> 0x004b }
            if (r5 == r7) goto L_0x002e
            if (r1 != r4) goto L_0x002b
            goto L_0x002e
        L_0x002b:
            int r2 = r2 + 1
            goto L_0x001d
        L_0x002e:
            android.hardware.Camera r7 = android.hardware.Camera.open(r2)     // Catch:{ RuntimeException -> 0x004b }
            if (r7 == 0) goto L_0x0044
            com.ss.android.medialib.camera.e r1 = r6.f53170f     // Catch:{ RuntimeException -> 0x0042 }
            boolean r1 = r1.f53259h     // Catch:{ RuntimeException -> 0x0042 }
            if (r1 != 0) goto L_0x0044
            android.hardware.Camera$Parameters r1 = r7.getParameters()     // Catch:{ RuntimeException -> 0x0042 }
            m64690a(r7, r1)     // Catch:{ RuntimeException -> 0x0042 }
            goto L_0x0044
        L_0x0042:
            r0 = move-exception
            goto L_0x004d
        L_0x0044:
            r6.f53166b = r2     // Catch:{ RuntimeException -> 0x0042 }
            int r0 = r0.facing     // Catch:{ RuntimeException -> 0x0042 }
            r6.f53175k = r0     // Catch:{ RuntimeException -> 0x0042 }
            goto L_0x0076
        L_0x004b:
            r0 = move-exception
            r7 = r3
        L_0x004d:
            java.lang.String r1 = "Camera1"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Camera failed to open: "
            r2.<init>(r3)
            java.lang.String r3 = r0.getLocalizedMessage()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.p280ss.android.vesdk.C45372t.m143409d(r1, r2)
            if (r7 == 0) goto L_0x006b
            r6.f53174j = r4     // Catch:{ Exception -> 0x006b }
            r7.release()     // Catch:{ Exception -> 0x006b }
        L_0x006b:
            java.lang.RuntimeException r7 = new java.lang.RuntimeException
            java.lang.String r0 = r0.getLocalizedMessage()
            r7.<init>(r0)
            throw r7
        L_0x0075:
            r7 = r3
        L_0x0076:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.camera.C19643b.m64693d(int):android.hardware.Camera");
    }

    /* renamed from: b */
    public final int mo52227b(int i) {
        CameraInfo cameraInfo = new CameraInfo();
        Camera.getCameraInfo(this.f53166b, cameraInfo);
        try {
            if (cameraInfo.facing == 0) {
                this.f53182r = ((cameraInfo.orientation - i) + 360) % 360;
            } else {
                this.f53182r = (cameraInfo.orientation + i) % 360;
                this.f53182r = ((360 - this.f53182r) + NormalGiftView.ALPHA_180) % 360;
            }
            StringBuilder sb = new StringBuilder("sCamIdx: ");
            sb.append(this.f53166b);
            C45372t.m143403a("Camera1", sb.toString());
            StringBuilder sb2 = new StringBuilder("mRotation: ");
            sb2.append(this.f53182r);
            C45372t.m143403a("Camera1", sb2.toString());
            this.f53165a.setDisplayOrientation(this.f53182r);
            return this.f53182r;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: b */
    public final void mo52229b(float f) {
        if (this.f53165a != null) {
            try {
                Parameters parameters = this.f53165a.getParameters();
                if (parameters.isZoomSupported()) {
                    int maxZoom = parameters.getMaxZoom();
                    if (f != 99.0f) {
                        float f2 = (float) maxZoom;
                        if (f != f2) {
                            maxZoom = (int) Math.min(f2, f * ((float) this.f53183s));
                        }
                    }
                    StringBuilder sb = new StringBuilder("startZoom realZoom is: ");
                    sb.append(maxZoom);
                    C45372t.m143403a("Camera1", sb.toString());
                    if (!parameters.isSmoothZoomSupported() || this.f53169e == null || !this.f53169e.mo52251a()) {
                        parameters.setZoom(maxZoom);
                        m64690a(this.f53165a, parameters);
                        if (this.f53169e != null) {
                            this.f53169e.mo52249a(1, (float) maxZoom, true);
                        }
                        return;
                    }
                    this.f53165a.startSmoothZoom(maxZoom);
                    this.f53165a.setZoomChangeListener(new OnZoomChangeListener() {
                        public final void onZoomChange(int i, boolean z, Camera camera) {
                            if (C19643b.this.f53169e != null) {
                                C19643b.this.f53169e.mo52249a(1, (float) i, z);
                            }
                        }
                    });
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x005c, code lost:
        r3 = r4;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52214a(float r8) {
        /*
            r7 = this;
            android.hardware.Camera r0 = r7.f53165a
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            android.hardware.Camera r0 = r7.f53165a     // Catch:{ Throwable -> 0x006a }
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch:{ Throwable -> 0x006a }
            java.util.List r1 = r0.getZoomRatios()     // Catch:{ Throwable -> 0x006a }
            int r2 = r1.size()     // Catch:{ Throwable -> 0x006a }
            r3 = 1120403456(0x42c80000, float:100.0)
            float r8 = r8 * r3
            r3 = 0
            java.lang.Object r4 = r1.get(r3)     // Catch:{ Throwable -> 0x006a }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ Throwable -> 0x006a }
            int r4 = r4.intValue()     // Catch:{ Throwable -> 0x006a }
            float r4 = (float) r4     // Catch:{ Throwable -> 0x006a }
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 > 0) goto L_0x0028
            goto L_0x0061
        L_0x0028:
            r4 = 0
        L_0x0029:
            int r5 = r2 + -1
            if (r4 >= r5) goto L_0x0061
            java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x006a }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x006a }
            r6 = 300(0x12c, float:4.2E-43)
            if (r5 < r6) goto L_0x003c
            goto L_0x005c
        L_0x003c:
            java.lang.Object r5 = r1.get(r4)     // Catch:{ Throwable -> 0x006a }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x006a }
            float r5 = (float) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L_0x005e
            int r5 = r4 + 1
            java.lang.Object r5 = r1.get(r5)     // Catch:{ Throwable -> 0x006a }
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = r5.intValue()     // Catch:{ Throwable -> 0x006a }
            float r5 = (float) r5     // Catch:{ Throwable -> 0x006a }
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 > 0) goto L_0x005e
        L_0x005c:
            r3 = r4
            goto L_0x0061
        L_0x005e:
            int r4 = r4 + 1
            goto L_0x0029
        L_0x0061:
            r0.setZoom(r3)     // Catch:{ Throwable -> 0x006a }
            android.hardware.Camera r8 = r7.f53165a     // Catch:{ Throwable -> 0x006a }
            m64690a(r8, r0)     // Catch:{ Throwable -> 0x006a }
            return
        L_0x006a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.camera.C19643b.mo52214a(float):void");
    }

    /* renamed from: a */
    public static void m64690a(Camera camera, Parameters parameters) {
        if (!(camera == null || parameters == null)) {
            try {
                camera.setParameters(parameters);
            } catch (Throwable th) {
                if (!Build.MODEL.toLowerCase().contains("x9s plus")) {
                    throw th;
                }
            }
        }
    }

    public final void onError(int i, Camera camera) {
        StringBuilder sb = new StringBuilder("onError: ");
        sb.append(i);
        C45372t.m143409d("Camera1", sb.toString());
        if (this.f53180p != null) {
            this.f53180p.mo52272a(1, m64694e(i), "camera1::error");
        }
    }

    /* renamed from: b */
    public final boolean mo52232b(int i, C19662d dVar) {
        CameraInfo cameraInfo = new CameraInfo();
        int numberOfCameras = Camera.getNumberOfCameras();
        StringBuilder sb = new StringBuilder("changeCamera cameraPosition: ");
        sb.append(i);
        C45372t.m143403a("Camera1", sb.toString());
        StringBuilder sb2 = new StringBuilder("changeCamera cameraCount: ");
        sb2.append(numberOfCameras);
        C45372t.m143403a("Camera1", sb2.toString());
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (i == 1) {
                if (cameraInfo.facing == 1 || numberOfCameras == 1) {
                    mo52228b();
                    mo52226a(i2, (C19662d) null);
                    this.f53166b = i2;
                    this.f53175k = cameraInfo.facing;
                    dVar.mo52271a(1);
                    C19667g.f53273l = true;
                    return true;
                }
            } else if (cameraInfo.facing == 0) {
                mo52228b();
                mo52226a(i2, (C19662d) null);
                this.f53166b = i2;
                this.f53175k = cameraInfo.facing;
                dVar.mo52271a(1);
                C19667g.f53273l = true;
                return true;
            }
        }
        StringBuilder sb3 = new StringBuilder("Change camera failed @");
        sb3.append(i);
        sb3.append(" camera count = ");
        sb3.append(numberOfCameras);
        dVar.mo52272a(1, -1, sb3.toString());
        this.f53174j = true;
        return true;
    }

    /* renamed from: a */
    private void m64689a(Parameters parameters, int i, int i2) {
        if (parameters != null) {
            List<Size> supportedPictureSizes = parameters.getSupportedPictureSizes();
            ArrayList arrayList = new ArrayList();
            for (Size size : supportedPictureSizes) {
                arrayList.add(new Point(size.width, size.height));
            }
            Point a = C19664f.m64788a((List<Point>) arrayList, new Point(this.f53167c, this.f53168d), (float) i, (float) i2);
            parameters.setPictureSize(a.x, a.y);
            parameters.setJpegQuality(100);
            if (this.f53170f.f53259h) {
                String str = parameters.get("zsl-values");
                if ("off".equals(parameters.get("zsl")) && str != null && str.contains("on")) {
                    parameters.set("zsl", "on");
                }
                this.f53178n = "on".equals(parameters.get("zsl"));
                if (!this.f53178n && TextUtils.isEmpty(str) && this.f53170f.f53262k) {
                    String str2 = parameters.get("zsd-mode-values");
                    if ("off".equals(parameters.get("zsd-mode")) && str2 != null && str2.contains("on")) {
                        parameters.set("zsd-mode", "on");
                    }
                    this.f53178n = "on".equals(parameters.get("zsd-mode"));
                }
            }
            this.f53170f.f53265n = a;
        }
    }

    /* renamed from: a */
    public final void mo52215a(int i, int i2, final C19630b bVar) {
        if (this.f53165a != null) {
            this.f53172h = true;
            try {
                Parameters parameters = this.f53165a.getParameters();
                if (!(this.f53170f.f53259h && this.f53170f.f53260i == i && this.f53170f.f53261j == i2)) {
                    m64689a(parameters, i, i2);
                    m64690a(this.f53165a, parameters);
                }
                mo52224a(this.f53179o);
                this.f53165a.takePicture(null, null, new PictureCallback() {
                    public final void onPictureTaken(byte[] bArr, Camera camera) {
                        C19643b.this.f53172h = false;
                        if (!C19643b.this.f53174j) {
                            C19643b.this.f53165a.setPreviewCallbackWithBuffer(null);
                        }
                        if (bVar != null) {
                            bVar.mo52247a(new ImageFrame(bArr, 1, C19643b.this.f53170f.f53265n.x, C19643b.this.f53170f.f53265n.y));
                        }
                    }
                });
            } catch (Exception unused) {
                if (bVar != null) {
                    bVar.mo52247a(null);
                }
                this.f53172h = false;
            } finally {
                this.f53177m = false;
            }
        }
    }

    /* renamed from: a */
    private Rect m64688a(int i, int i2, float f, float[] fArr, int i3, int i4) {
        float f2 = fArr[0];
        float f3 = fArr[1];
        int intValue = Float.valueOf((f * 60.0f) + 0.5f).intValue();
        if (i4 != 0) {
            intValue *= 2;
        }
        int i5 = ((int) ((f2 * 2000.0f) / ((float) i))) - 1000;
        int i6 = ((int) ((f3 * 2000.0f) / ((float) i2))) - 1000;
        if (mo52243m() == 1) {
            i5 = -i5;
        }
        int i7 = intValue / 2;
        int a = m64686a(i5 - i7, -1000, 1000);
        int a2 = m64686a(i6 - i7, -1000, 1000);
        RectF rectF = new RectF((float) a, (float) a2, (float) m64692c(a + intValue), (float) m64692c(a2 + intValue));
        Rect rect = new Rect(Math.round(rectF.left), Math.round(rectF.top), Math.round(rectF.right), Math.round(rectF.bottom));
        C19790a.m65373a(i3, new Rect(-1000, -1000, 1000, 1000), rect);
        Rect rect2 = new Rect(rect.left - 1000, rect.top - 1000, rect.right - 1000, rect.bottom - 1000);
        rect2.left = m64692c(rect2.left);
        rect2.right = m64692c(rect2.right);
        rect2.top = m64692c(rect2.top);
        rect2.bottom = m64692c(rect2.bottom);
        return rect2;
    }
}
