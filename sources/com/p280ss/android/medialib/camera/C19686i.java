package com.p280ss.android.medialib.camera;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.oppo.p804a.C18616b;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19630b;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19631c;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19632d;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19633e;
import com.p280ss.android.medialib.common.C19706c;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.vesdk.C45372t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.medialib.camera.i */
public final class C19686i implements IESCameraInterface {

    /* renamed from: t */
    private static final Map<String, String> f53369t = new HashMap<String, String>() {
        {
            put("com.ss.android.ugc.trill", "VdRQAXll2qGqBr3q0pv9fxjKUNSUZE5Au4tXeYAjvegHPG8+QL6PB65CdoZjef9mmWbVU0avYTAujNyKeSbN696+CZwbhwMnT28B8LU0XECzBxuUCrSUIK2DSy8KOLKDgbcseRuqLdEO91Wo70115XKAUOMkMaZosdSVnqhHYP4=");
            put("com.ss.android.ttve.app", "acJhRrV9SGJSFhTPJu53AJUEzAIie4adIn1J3yC+QG5FXX3h/GX7gaeDXRlRMoUa80Jv43LwjuMR47MPdPzldZp6PCPxXNW81maIAc0oebAMT6NgTHf5O8wgkbAZFNilvD70Cjd8YbYfDvSJ5O63V4+VHcNJ/LV3p1id21Z9FLU=");
            put("com.zhiliaoapp.musically", "I1nLPCzgp4J6fBHsdd82IBOcMK+AY67rPqYPuw4WfLYtvifBG+ABEO+Wh3N0t5siZ6dA6ZTdSIBxEZSVZlHRyD7VRaPajn/oghXkdYuDkyzzEexN6BDEXHd+B7aC2yb080U3MSzCDya2wAg6QG2IRYl1TIMlET7EhR9lmQetYdc=");
            put("com.ss.android.ugc.aweme", "V0smG6erGIWwu3z5JaAn4ibfK6iq5uW3qRb+zT6rqgpy8HHYw5TeFOMt2k0cNWuSWv4Rxn1gW+nK5oGMpBwf8nYKppzfrtXQsYgsumcg8yNRVpKZ0WSntuSCCkAtFKcnNx/DoEAjXZuqs5Vzg9VbcOmKwsgsz58eJdXiEMUqoZw=");
        }
    };

    /* renamed from: A */
    private int f53370A;

    /* renamed from: B */
    private int f53371B;

    /* renamed from: C */
    private int f53372C;

    /* renamed from: D */
    private Size[] f53373D;

    /* renamed from: E */
    private int f53374E = -1;

    /* renamed from: F */
    private Surface f53375F;

    /* renamed from: G */
    private C19633e f53376G;

    /* renamed from: H */
    private C19632d f53377H;

    /* renamed from: I */
    private int f53378I = 1;

    /* renamed from: J */
    private boolean f53379J;

    /* renamed from: K */
    private ImageReader f53380K;

    /* renamed from: L */
    private SurfaceTexture f53381L;

    /* renamed from: M */
    private ImageReader f53382M;

    /* renamed from: N */
    private C19663e f53383N;

    /* renamed from: O */
    private Size f53384O;

    /* renamed from: P */
    private C19629a f53385P;

    /* renamed from: Q */
    private boolean f53386Q;

    /* renamed from: R */
    private int f53387R;

    /* renamed from: S */
    private StateCallback f53388S = new StateCallback() {
        public final void onDisconnected(CameraDevice cameraDevice) {
            C45372t.m143405b("IESOppoCamera", "StateCallback::onDisconnected...");
            C19686i.this.mo52228b();
        }

        public final void onOpened(CameraDevice cameraDevice) {
            C45372t.m143403a("IESOppoCamera", "StateCallback::onOpened...");
            C19686i.this.f53397g = 2;
            C19686i.this.f53391a = cameraDevice;
            if (C19686i.this.f53394d != null) {
                C19686i.this.f53394d.mo52271a(5);
            } else {
                C45372t.m143409d("IESOppoCamera", "mCameraOpenListener is null!");
            }
            C19686i.this.f53401k = false;
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            C45372t.m143405b("IESOppoCamera", "StateCallback::onError...");
            C19686i.this.f53397g = 4;
            if (C19686i.this.f53394d != null) {
                C19686i.this.f53394d.mo52272a(5, C19686i.m64905c(i), "StateCallback::onError");
                C19686i.this.f53394d = null;
            }
            C19686i.this.mo52372p();
        }
    };

    /* renamed from: T */
    private CameraCharacteristics f53389T;

    /* renamed from: U */
    private CaptureCallback f53390U = new CaptureCallback() {
        /* renamed from: a */
        private void m64950a(CaptureResult captureResult, boolean z) {
            switch (C19686i.this.f53406p) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        C19686i.this.mo52374r();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            C19686i.this.f53406p = 4;
                            C19686i.this.mo52374r();
                            break;
                        } else {
                            C19686i.this.mo52375s();
                            return;
                        }
                    } else if (z) {
                        C45372t.m143405b("IESOppoCamera", "No Focus");
                        C19686i.this.mo52374r();
                        return;
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        C19686i.this.mo52374r();
                        C19686i.this.f53406p = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        C19686i.this.f53406p = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        C19686i.this.f53406p = 4;
                        C19686i.this.mo52374r();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m64950a(totalCaptureResult, true);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m64950a(captureResult, false);
        }
    };

    /* renamed from: a */
    public CameraDevice f53391a;

    /* renamed from: b */
    public CameraCaptureSession f53392b;

    /* renamed from: c */
    public Builder f53393c;

    /* renamed from: d */
    public C19662d f53394d;

    /* renamed from: e */
    public int f53395e;

    /* renamed from: f */
    public volatile boolean f53396f;

    /* renamed from: g */
    public volatile int f53397g;

    /* renamed from: h */
    public Handler f53398h;

    /* renamed from: i */
    int[] f53399i = new int[2];

    /* renamed from: j */
    int f53400j = 1;

    /* renamed from: k */
    public boolean f53401k = true;

    /* renamed from: l */
    public C19630b f53402l;

    /* renamed from: m */
    public int f53403m;

    /* renamed from: n */
    public C19631c f53404n;

    /* renamed from: o */
    public int f53405o;

    /* renamed from: p */
    public int f53406p;

    /* renamed from: q */
    public CaptureCallback f53407q = new CaptureCallback() {
        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            StringBuilder sb = new StringBuilder("Manual AF failure: ");
            sb.append(captureFailure);
            sb.append(", thread id = ");
            sb.append(Thread.currentThread().getId());
            C45372t.m143409d("IESOppoCamera", sb.toString());
        }
    };

    /* renamed from: r */
    public CaptureRequest f53408r;

    /* renamed from: s */
    CameraCaptureSession.StateCallback f53409s;

    /* renamed from: w */
    private String f53410w;

    /* renamed from: x */
    private CameraManager f53411x;

    /* renamed from: y */
    private Handler f53412y = new Handler(Looper.getMainLooper());

    /* renamed from: z */
    private int f53413z;

    /* renamed from: c */
    public static int m64905c(int i) {
        switch (i) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            default:
                return -1;
        }
    }

    /* renamed from: e */
    public final void mo52235e() {
        m64908w();
    }

    /* renamed from: g */
    public final int mo52237g() {
        return this.f53370A;
    }

    /* renamed from: m */
    public final int mo52243m() {
        return this.f53374E;
    }

    /* renamed from: n */
    public final boolean mo52244n() {
        return false;
    }

    /* renamed from: o */
    public final int mo52245o() {
        return 35;
    }

    /* renamed from: a */
    public final void mo52221a(C19663e eVar) {
        if (eVar == null || !eVar.mo52306a()) {
            C45372t.m143409d("IESOppoCamera", "Invalid CameraParams");
            return;
        }
        this.f53398h = new Handler();
        this.f53378I = eVar.f53267p;
        if (this.f53411x == null) {
            this.f53411x = (CameraManager) eVar.f53253b.getSystemService("camera");
        }
        this.f53383N = eVar;
        this.f53410w = eVar.f53253b.getPackageName();
    }

    /* renamed from: a */
    public final boolean mo52226a(final int i, C19662d dVar) {
        Size[] sizeArr;
        Point point;
        C45372t.m143405b("IESOppoCamera", "open...");
        if (this.f53397g == 4) {
            mo52372p();
        }
        this.f53394d = dVar;
        try {
            this.f53397g = 1;
            String[] cameraIdList = this.f53411x.getCameraIdList();
            if (i >= 0) {
                if (i <= 2) {
                    if (i >= cameraIdList.length) {
                        i = 1;
                    }
                    this.f53374E = i;
                    String str = cameraIdList[i];
                    this.f53389T = this.f53411x.getCameraCharacteristics(str);
                    if (this.f53389T == null) {
                        return false;
                    }
                    if (!this.f53401k || m64904a(this.f53389T, this.f53378I)) {
                        this.f53413z = ((Integer) this.f53389T.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f53389T.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        this.f53373D = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                        ArrayList arrayList = new ArrayList();
                        for (Size size : this.f53373D) {
                            arrayList.add(new Point(size.getWidth(), size.getHeight()));
                        }
                        if (this.f53383N.f53259h) {
                            Size[] outputSizes = streamConfigurationMap.getOutputSizes(256);
                            ArrayList arrayList2 = new ArrayList();
                            for (Size size2 : outputSizes) {
                                arrayList2.add(new Point(size2.getWidth(), size2.getHeight()));
                            }
                            point = C19664f.m64787a(arrayList, this.f53383N.f53257f, this.f53383N.f53258g, arrayList2, this.f53383N.f53260i, this.f53383N.f53261j);
                        } else {
                            point = C19664f.m64786a((List<Point>) arrayList, this.f53383N.f53257f, this.f53383N.f53258g);
                        }
                        if (point != null) {
                            this.f53371B = point.x;
                            this.f53372C = point.y;
                        }
                        m64907v();
                        this.f53411x.openCamera(str, this.f53388S, this.f53398h);
                        C20479f.m67954a("iesve_record_camera_type", 2);
                        return true;
                    }
                    if (this.f53394d != null) {
                        C19662d dVar2 = this.f53394d;
                        StringBuilder sb = new StringBuilder("Camera hardware level not supported, deviceLevel = ");
                        sb.append(this.f53395e);
                        sb.append(", require = ");
                        sb.append(this.f53378I);
                        dVar2.mo52272a(5, -4, sb.toString());
                    }
                    this.f53397g = 0;
                    return false;
                }
            }
            this.f53412y.post(new Runnable() {
                public final void run() {
                    if (C19686i.this.f53394d != null) {
                        C19662d dVar = C19686i.this.f53394d;
                        StringBuilder sb = new StringBuilder("Invalid position = ");
                        sb.append(i);
                        dVar.mo52272a(5, -2, sb.toString());
                    }
                }
            });
            this.f53397g = 0;
            return false;
        } catch (Throwable th) {
            this.f53397g = 4;
            mo52372p();
            this.f53412y.post(new Runnable() {
                public final void run() {
                    if (C19686i.this.f53394d != null) {
                        C19686i.this.f53394d.mo52272a(5, -1, th.getLocalizedMessage());
                        C19686i.this.f53394d = null;
                    }
                }
            });
            return false;
        }
    }

    /* renamed from: a */
    public final void mo52222a(boolean z) {
        if (this.f53393c != null && this.f53392b != null) {
            try {
                this.f53393c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
                this.f53392b.setRepeatingRequest(this.f53393c.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo52224a(int i) {
        if (this.f53393c == null || this.f53392b == null) {
            return false;
        }
        switch (i) {
            case 0:
                this.f53393c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53393c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 1:
                this.f53393c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(3));
                break;
            case 2:
                this.f53393c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53393c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                break;
            case 3:
                this.f53393c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                break;
            case 4:
                try {
                    this.f53393c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(4));
                    break;
                } catch (Exception unused) {
                    return false;
                }
            default:
                return false;
        }
        this.f53403m = i;
        this.f53392b.setRepeatingRequest(this.f53393c.build(), this.f53390U, this.f53398h);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x010b, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo52216a(android.graphics.SurfaceTexture r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            java.lang.String r0 = "IESOppoCamera"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x010c }
            java.lang.String r2 = "startPreview... thread id = "
            r1.<init>(r2)     // Catch:{ all -> 0x010c }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x010c }
            long r2 = r2.getId()     // Catch:{ all -> 0x010c }
            r1.append(r2)     // Catch:{ all -> 0x010c }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x010c }
            com.p280ss.android.vesdk.C45372t.m143405b(r0, r1)     // Catch:{ all -> 0x010c }
            android.hardware.camera2.CameraDevice r0 = r4.f53391a     // Catch:{ all -> 0x010c }
            if (r0 == 0) goto L_0x010a
            if (r5 != 0) goto L_0x0024
            goto L_0x010a
        L_0x0024:
            int r0 = r4.f53397g     // Catch:{ all -> 0x010c }
            r1 = 3
            r2 = 2
            if (r0 == r2) goto L_0x0045
            int r0 = r4.f53397g     // Catch:{ all -> 0x010c }
            if (r0 == r1) goto L_0x0045
            java.lang.String r5 = "IESOppoCamera"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch:{ all -> 0x010c }
            java.lang.String r1 = "Invalid state: "
            r0.<init>(r1)     // Catch:{ all -> 0x010c }
            int r1 = r4.f53397g     // Catch:{ all -> 0x010c }
            r0.append(r1)     // Catch:{ all -> 0x010c }
            java.lang.String r0 = r0.toString()     // Catch:{ all -> 0x010c }
            com.p280ss.android.vesdk.C45372t.m143405b(r5, r0)     // Catch:{ all -> 0x010c }
            monitor-exit(r4)
            return
        L_0x0045:
            r4.m64908w()     // Catch:{ CameraAccessException -> 0x0108 }
            r4.f53381L = r5     // Catch:{ CameraAccessException -> 0x0108 }
            android.hardware.camera2.CameraDevice r0 = r4.f53391a     // Catch:{ CameraAccessException -> 0x0108 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r0.createCaptureRequest(r1)     // Catch:{ CameraAccessException -> 0x0108 }
            r4.f53393c = r0     // Catch:{ CameraAccessException -> 0x0108 }
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ CameraAccessException -> 0x0108 }
            r0.<init>()     // Catch:{ CameraAccessException -> 0x0108 }
            android.view.Surface r1 = r4.f53375F     // Catch:{ CameraAccessException -> 0x0108 }
            if (r1 == 0) goto L_0x006a
            android.hardware.camera2.CaptureRequest$Builder r1 = r4.f53393c     // Catch:{ CameraAccessException -> 0x0108 }
            android.view.Surface r3 = r4.f53375F     // Catch:{ CameraAccessException -> 0x0108 }
            r1.removeTarget(r3)     // Catch:{ CameraAccessException -> 0x0108 }
            android.view.Surface r1 = r4.f53375F     // Catch:{ CameraAccessException -> 0x0108 }
            r1.release()     // Catch:{ CameraAccessException -> 0x0108 }
            r1 = 0
            r4.f53375F = r1     // Catch:{ CameraAccessException -> 0x0108 }
        L_0x006a:
            int r1 = r4.f53371B     // Catch:{ CameraAccessException -> 0x0108 }
            int r3 = r4.f53372C     // Catch:{ CameraAccessException -> 0x0108 }
            r5.setDefaultBufferSize(r1, r3)     // Catch:{ CameraAccessException -> 0x0108 }
            com.ss.android.medialib.camera.e r1 = r4.f53383N     // Catch:{ CameraAccessException -> 0x0108 }
            int r1 = r1.f53266o     // Catch:{ CameraAccessException -> 0x0108 }
            if (r1 != r2) goto L_0x0087
            r4.m64911z()     // Catch:{ CameraAccessException -> 0x0108 }
            android.media.ImageReader r5 = r4.f53382M     // Catch:{ CameraAccessException -> 0x0108 }
            if (r5 == 0) goto L_0x008e
            android.media.ImageReader r5 = r4.f53382M     // Catch:{ CameraAccessException -> 0x0108 }
            android.view.Surface r5 = r5.getSurface()     // Catch:{ CameraAccessException -> 0x0108 }
            r4.f53375F = r5     // Catch:{ CameraAccessException -> 0x0108 }
            goto L_0x008e
        L_0x0087:
            android.view.Surface r1 = new android.view.Surface     // Catch:{ CameraAccessException -> 0x0108 }
            r1.<init>(r5)     // Catch:{ CameraAccessException -> 0x0108 }
            r4.f53375F = r1     // Catch:{ CameraAccessException -> 0x0108 }
        L_0x008e:
            android.view.Surface r5 = r4.f53375F     // Catch:{ CameraAccessException -> 0x0108 }
            r0.add(r5)     // Catch:{ CameraAccessException -> 0x0108 }
            android.hardware.camera2.CaptureRequest$Builder r5 = r4.f53393c     // Catch:{ CameraAccessException -> 0x0108 }
            android.view.Surface r1 = r4.f53375F     // Catch:{ CameraAccessException -> 0x0108 }
            r5.addTarget(r1)     // Catch:{ CameraAccessException -> 0x0108 }
            com.ss.android.medialib.camera.e r5 = r4.f53383N     // Catch:{ CameraAccessException -> 0x0108 }
            boolean r5 = r5.f53259h     // Catch:{ CameraAccessException -> 0x0108 }
            if (r5 == 0) goto L_0x00d1
            android.util.Size r5 = r4.f53384O     // Catch:{ CameraAccessException -> 0x0108 }
            if (r5 == 0) goto L_0x00bc
            android.util.Size r5 = r4.f53384O     // Catch:{ CameraAccessException -> 0x0108 }
            int r5 = r5.getWidth()     // Catch:{ CameraAccessException -> 0x0108 }
            com.ss.android.medialib.camera.e r1 = r4.f53383N     // Catch:{ CameraAccessException -> 0x0108 }
            int r1 = r1.f53260i     // Catch:{ CameraAccessException -> 0x0108 }
            if (r5 != r1) goto L_0x00d1
            android.util.Size r5 = r4.f53384O     // Catch:{ CameraAccessException -> 0x0108 }
            int r5 = r5.getHeight()     // Catch:{ CameraAccessException -> 0x0108 }
            com.ss.android.medialib.camera.e r1 = r4.f53383N     // Catch:{ CameraAccessException -> 0x0108 }
            int r1 = r1.f53261j     // Catch:{ CameraAccessException -> 0x0108 }
            if (r5 != r1) goto L_0x00d1
        L_0x00bc:
            com.ss.android.medialib.camera.e r5 = r4.f53383N     // Catch:{ CameraAccessException -> 0x0108 }
            int r5 = r5.f53260i     // Catch:{ CameraAccessException -> 0x0108 }
            com.ss.android.medialib.camera.e r1 = r4.f53383N     // Catch:{ CameraAccessException -> 0x0108 }
            int r1 = r1.f53261j     // Catch:{ CameraAccessException -> 0x0108 }
            r4.m64902a(r5, r1)     // Catch:{ CameraAccessException -> 0x0108 }
            android.media.ImageReader r5 = r4.f53380K     // Catch:{ CameraAccessException -> 0x0108 }
            android.view.Surface r5 = r5.getSurface()     // Catch:{ CameraAccessException -> 0x0108 }
            r0.add(r5)     // Catch:{ CameraAccessException -> 0x0108 }
            goto L_0x00f1
        L_0x00d1:
            android.util.Size r5 = r4.f53384O     // Catch:{ CameraAccessException -> 0x0108 }
            if (r5 == 0) goto L_0x00f1
            boolean r5 = r4.f53379J     // Catch:{ CameraAccessException -> 0x0108 }
            if (r5 == 0) goto L_0x00f1
            android.util.Size r5 = r4.f53384O     // Catch:{ CameraAccessException -> 0x0108 }
            int r5 = r5.getWidth()     // Catch:{ CameraAccessException -> 0x0108 }
            android.util.Size r1 = r4.f53384O     // Catch:{ CameraAccessException -> 0x0108 }
            int r1 = r1.getHeight()     // Catch:{ CameraAccessException -> 0x0108 }
            r4.m64902a(r5, r1)     // Catch:{ CameraAccessException -> 0x0108 }
            android.media.ImageReader r5 = r4.f53380K     // Catch:{ CameraAccessException -> 0x0108 }
            android.view.Surface r5 = r5.getSurface()     // Catch:{ CameraAccessException -> 0x0108 }
            r0.add(r5)     // Catch:{ CameraAccessException -> 0x0108 }
        L_0x00f1:
            int r5 = r0.size()     // Catch:{ CameraAccessException -> 0x0108 }
            r4.f53387R = r5     // Catch:{ CameraAccessException -> 0x0108 }
            r4.m64899A()     // Catch:{ CameraAccessException -> 0x0108 }
            android.hardware.camera2.CameraDevice r5 = r4.f53391a     // Catch:{ CameraAccessException -> 0x0108 }
            com.ss.android.medialib.camera.i$9 r1 = new com.ss.android.medialib.camera.i$9     // Catch:{ CameraAccessException -> 0x0108 }
            r1.<init>()     // Catch:{ CameraAccessException -> 0x0108 }
            android.os.Handler r2 = r4.f53398h     // Catch:{ CameraAccessException -> 0x0108 }
            r5.createCaptureSession(r0, r1, r2)     // Catch:{ CameraAccessException -> 0x0108 }
            monitor-exit(r4)
            return
        L_0x0108:
            monitor-exit(r4)
            return
        L_0x010a:
            monitor-exit(r4)
            return
        L_0x010c:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.camera.C19686i.mo52216a(android.graphics.SurfaceTexture):void");
    }

    /* renamed from: a */
    public final boolean mo52223a() {
        try {
            return ((Boolean) this.f53411x.getCameraCharacteristics("0").get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (CameraAccessException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo52225a(int i, int i2, float f, float[] fArr, int i3) {
        C45372t.m143405b("IESOppoCamera", "setFocusAreas...");
        if (this.f53397g != 3) {
            StringBuilder sb = new StringBuilder("Ignore setFocusAreas operation, invalid state = ");
            sb.append(this.f53397g);
            C45372t.m143405b("IESOppoCamera", sb.toString());
            return false;
        } else if (this.f53393c == null || this.f53391a == null || this.f53392b == null) {
            C45372t.m143409d("IESOppoCamera", "Set focus failed, you must open camera first.");
            return false;
        } else if (this.f53396f) {
            C45372t.m143407c("IESOppoCamera", "Manual focus already engaged");
            return true;
        } else if (this.f53406p != 0) {
            C45372t.m143407c("IESOppoCamera", "capturing now");
            return false;
        } else {
            int i4 = i;
            int i5 = i2;
            float[] fArr2 = fArr;
            int i6 = i3;
            Rect a = m64901a(i4, i5, fArr2, i6, 0);
            Rect a2 = m64901a(i4, i5, fArr2, i6, 1);
            C1968810 r10 = new CaptureCallback() {
                public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    StringBuilder sb = new StringBuilder("Manual AF failure: ");
                    sb.append(captureFailure);
                    C45372t.m143409d("IESOppoCamera", sb.toString());
                    C19686i.this.f53396f = false;
                }

                /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
                /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession r9, android.hardware.camera2.CaptureRequest r10, android.hardware.camera2.TotalCaptureResult r11) {
                    /*
                        r8 = this;
                        if (r10 == 0) goto L_0x0123
                        java.lang.Object r9 = r10.getTag()
                        java.lang.String r10 = "FOCUS_TAG"
                        if (r9 == r10) goto L_0x000c
                        goto L_0x0123
                    L_0x000c:
                        android.hardware.camera2.CaptureResult$Key r9 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                        java.lang.Object r9 = r11.get(r9)
                        java.lang.Integer r9 = (java.lang.Integer) r9
                        android.hardware.camera2.CaptureResult$Key r10 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                        java.lang.Object r10 = r11.get(r10)
                        java.lang.Integer r10 = (java.lang.Integer) r10
                        r11 = 5
                        r0 = 4
                        r1 = 2
                        r2 = 1
                        r3 = 0
                        if (r9 == 0) goto L_0x0057
                        java.lang.String r4 = "IESOppoCamera"
                        java.lang.StringBuilder r5 = new java.lang.StringBuilder
                        java.lang.String r6 = "afState = "
                        r5.<init>(r6)
                        r5.append(r9)
                        java.lang.String r5 = r5.toString()
                        com.p280ss.android.vesdk.C45372t.m143405b(r4, r5)
                        int r4 = r9.intValue()
                        if (r0 == r4) goto L_0x0055
                        int r4 = r9.intValue()
                        if (r11 == r4) goto L_0x0055
                        int r4 = r9.intValue()
                        if (r1 == r4) goto L_0x0055
                        r4 = 6
                        int r5 = r9.intValue()
                        if (r4 == r5) goto L_0x0055
                        int r9 = r9.intValue()
                        if (r9 != 0) goto L_0x005e
                    L_0x0055:
                        r9 = 1
                        goto L_0x005f
                    L_0x0057:
                        java.lang.String r9 = "IESOppoCamera"
                        java.lang.String r4 = "afState is null"
                        com.p280ss.android.vesdk.C45372t.m143407c(r9, r4)
                    L_0x005e:
                        r9 = 0
                    L_0x005f:
                        r4 = 3
                        if (r10 == 0) goto L_0x008c
                        int r5 = r10.intValue()
                        if (r4 == r5) goto L_0x0077
                        int r5 = r10.intValue()
                        if (r1 == r5) goto L_0x0077
                        int r5 = r10.intValue()
                        if (r0 != r5) goto L_0x0075
                        goto L_0x0077
                    L_0x0075:
                        r0 = 0
                        goto L_0x0078
                    L_0x0077:
                        r0 = 1
                    L_0x0078:
                        java.lang.String r5 = "IESOppoCamera"
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        java.lang.String r7 = "aeState = "
                        r6.<init>(r7)
                        r6.append(r10)
                        java.lang.String r10 = r6.toString()
                        com.p280ss.android.vesdk.C45372t.m143405b(r5, r10)
                        goto L_0x0094
                    L_0x008c:
                        java.lang.String r10 = "IESOppoCamera"
                        java.lang.String r0 = "aeState is null"
                        com.p280ss.android.vesdk.C45372t.m143407c(r10, r0)
                        r0 = 0
                    L_0x0094:
                        com.ss.android.medialib.camera.i r10 = com.p280ss.android.medialib.camera.C19686i.this
                        android.hardware.camera2.CaptureRequest$Builder r10 = r10.f53393c
                        if (r10 == 0) goto L_0x0122
                        com.ss.android.medialib.camera.i r10 = com.p280ss.android.medialib.camera.C19686i.this
                        int r5 = r10.f53405o
                        int r5 = r5 + r2
                        r10.f53405o = r5
                        com.ss.android.medialib.camera.i r10 = com.p280ss.android.medialib.camera.C19686i.this
                        int r10 = r10.f53405o
                        if (r10 >= r11) goto L_0x00c9
                        if (r9 == 0) goto L_0x00ac
                        if (r0 == 0) goto L_0x00ac
                        goto L_0x00c9
                    L_0x00ac:
                        java.lang.String r9 = "IESOppoCamera"
                        java.lang.StringBuilder r10 = new java.lang.StringBuilder
                        java.lang.String r11 = "Focus not finished, do "
                        r10.<init>(r11)
                        com.ss.android.medialib.camera.i r11 = com.p280ss.android.medialib.camera.C19686i.this
                        int r11 = r11.f53405o
                        r10.append(r11)
                        java.lang.String r11 = " capture."
                        r10.append(r11)
                        java.lang.String r10 = r10.toString()
                        com.p280ss.android.vesdk.C45372t.m143403a(r9, r10)
                        goto L_0x0122
                    L_0x00c9:
                        com.ss.android.medialib.camera.i r9 = com.p280ss.android.medialib.camera.C19686i.this
                        r9.f53396f = r3
                        com.ss.android.medialib.camera.i r9 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53393c     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r1)     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r9 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53393c     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r4)     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r9 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r10 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest$Builder r10 = r10.f53393c     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest r10 = r10.build()     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.f53408r = r10     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r9 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CameraCaptureSession r9 = r9.f53392b     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r10 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CaptureRequest r10 = r10.f53408r     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r11 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.hardware.camera2.CameraCaptureSession$CaptureCallback r11 = r11.f53407q     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r0 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        android.os.Handler r0 = r0.f53398h     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.setRepeatingRequest(r10, r11, r0)     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.String r9 = "IESOppoCamera"
                        java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.String r11 = "Focus done, try count = "
                        r10.<init>(r11)     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r11 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        int r11 = r11.f53405o     // Catch:{ CameraAccessException -> 0x0121 }
                        r10.append(r11)     // Catch:{ CameraAccessException -> 0x0121 }
                        java.lang.String r10 = r10.toString()     // Catch:{ CameraAccessException -> 0x0121 }
                        com.p280ss.android.vesdk.C45372t.m143405b(r9, r10)     // Catch:{ CameraAccessException -> 0x0121 }
                        com.ss.android.medialib.camera.i r9 = com.p280ss.android.medialib.camera.C19686i.this     // Catch:{ CameraAccessException -> 0x0121 }
                        r9.f53405o = r3     // Catch:{ CameraAccessException -> 0x0121 }
                    L_0x0121:
                        return
                    L_0x0122:
                        return
                    L_0x0123:
                        java.lang.String r9 = "IESOppoCamera"
                        java.lang.String r10 = "Not focus request!"
                        com.p280ss.android.vesdk.C45372t.m143407c(r9, r10)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.camera.C19686i.C1968810.onCaptureCompleted(android.hardware.camera2.CameraCaptureSession, android.hardware.camera2.CaptureRequest, android.hardware.camera2.TotalCaptureResult):void");
                }
            };
            try {
                this.f53392b.stopRepeating();
                if (m64910y()) {
                    if (VERSION.SDK_INT >= 23) {
                        this.f53393c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    }
                    this.f53393c.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a2, 999)});
                }
                if (!m64909x()) {
                    if (m64910y()) {
                        this.f53408r = this.f53393c.build();
                        this.f53392b.setRepeatingRequest(this.f53408r, r10, this.f53398h);
                    } else {
                        C45372t.m143407c("IESOppoCamera", "do not support MeteringAreaAE!");
                    }
                    C45372t.m143407c("IESOppoCamera", "do not support MeteringAreaAF!");
                    return false;
                }
                this.f53393c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
                this.f53393c.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a, 999)});
                this.f53393c.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.f53393c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                this.f53393c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                this.f53393c.setTag("FOCUS_TAG");
                if (VERSION.SDK_INT >= 23) {
                    this.f53393c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                }
                this.f53408r = this.f53393c.build();
                this.f53392b.setRepeatingRequest(this.f53408r, r10, this.f53398h);
                return true;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("setRepeatingRequest failed, ");
                sb2.append(e.getMessage());
                C45372t.m143409d("IESOppoCamera", sb2.toString());
                this.f53397g = 4;
                mo52372p();
                return false;
            }
        }
    }

    /* renamed from: a */
    public final void mo52215a(int i, int i2, final C19630b bVar) {
        this.f53402l = bVar;
        this.f53384O = new Size(i, i2);
        if (this.f53391a == null || this.f53392b == null || this.f53389T == null) {
            if (bVar != null) {
                bVar.mo52247a(null);
            }
            return;
        }
        try {
            this.f53379J = true;
            if (this.f53383N.f53259h && this.f53383N.f53260i == i && this.f53383N.f53261j == i2) {
                if (this.f53403m == 0 || this.f53403m == 2) {
                    mo52374r();
                } else {
                    mo52376t();
                }
                return;
            }
            this.f53409s = new CameraCaptureSession.StateCallback() {
                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    C19686i.this.f53409s = null;
                    if (bVar != null) {
                        bVar.mo52247a(null);
                    }
                }

                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    C19686i.this.f53409s = null;
                    try {
                        if (C19686i.this.f53403m == 0 || C19686i.this.f53403m == 2) {
                            C19686i.this.mo52374r();
                        } else {
                            C19686i.this.mo52376t();
                        }
                    } catch (Throwable unused) {
                        if (bVar != null) {
                            bVar.mo52247a(null);
                        }
                    }
                }
            };
            mo52216a(this.f53381L);
            this.f53379J = false;
        } catch (Throwable unused) {
            if (bVar != null) {
                bVar.mo52247a(null);
            }
        } finally {
            this.f53379J = false;
        }
    }

    /* renamed from: f */
    public final void mo52236f() {
        mo52216a(this.f53381L);
    }

    /* renamed from: j */
    public final boolean mo52240j() {
        if (this.f53391a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo52233c() {
        this.f53397g = 0;
        mo52372p();
        this.f53402l = null;
    }

    /* renamed from: h */
    public final int[] mo52238h() {
        return new int[]{this.f53371B, this.f53372C};
    }

    /* renamed from: k */
    public final int[] mo52241k() {
        return new int[]{this.f53371B, this.f53372C};
    }

    /* renamed from: z */
    private void m64911z() {
        this.f53382M = ImageReader.newInstance(this.f53371B, this.f53372C, 35, 1);
        this.f53382M.setOnImageAvailableListener(new OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                try {
                    Image acquireLatestImage = imageReader.acquireLatestImage();
                    if (acquireLatestImage != null) {
                        ImageFrame imageFrame = new ImageFrame(new C19699j(acquireLatestImage.getPlanes()), -2, acquireLatestImage.getWidth(), acquireLatestImage.getHeight());
                        if (C19686i.this.f53404n != null) {
                            C19686i.this.f53404n.mo52248a(5, imageFrame);
                        }
                        acquireLatestImage.close();
                    }
                } catch (Exception unused) {
                }
            }
        }, this.f53398h);
    }

    /* renamed from: b */
    public final void mo52228b() {
        C45372t.m143405b("IESOppoCamera", "close...");
        if (this.f53397g == 1) {
            C45372t.m143405b("IESOppoCamera", "Camera is opening or pending, ignore close operation.");
            return;
        }
        this.f53397g = 0;
        mo52372p();
        this.f53402l = null;
    }

    /* renamed from: d */
    public final void mo52234d() {
        if (this.f53383N.f53266o == 1) {
            mo52216a(this.f53381L);
        } else {
            mo52236f();
        }
    }

    /* renamed from: s */
    public final void mo52375s() {
        try {
            this.f53393c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
            this.f53406p = 2;
            this.f53392b.capture(this.f53393c.build(), this.f53390U, this.f53398h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: t */
    public final void mo52376t() {
        try {
            this.f53393c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            this.f53406p = 1;
            this.f53392b.capture(this.f53393c.build(), this.f53390U, this.f53398h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: w */
    private void m64908w() {
        if (this.f53392b != null) {
            this.f53392b.close();
            this.f53392b = null;
        }
        if (this.f53380K != null) {
            this.f53380K.close();
            this.f53380K = null;
        }
        if (this.f53382M != null) {
            this.f53382M.close();
            this.f53382M = null;
        }
    }

    /* renamed from: x */
    private boolean m64909x() {
        if (this.f53389T == null) {
            try {
                if (((Integer) this.f53411x.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53389T.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    private boolean m64910y() {
        if (this.f53389T == null) {
            try {
                if (((Integer) this.f53411x.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53389T.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    public final List<int[]> mo52242l() {
        Size[] sizeArr;
        ArrayList arrayList = new ArrayList();
        if (this.f53373D == null) {
            return arrayList;
        }
        for (Size size : this.f53373D) {
            if (size != null) {
                arrayList.add(new int[]{size.getWidth(), size.getHeight()});
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x001e */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo52372p() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.m64908w()     // Catch:{ Throwable -> 0x001e }
            android.view.Surface r1 = r2.f53375F     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x0010
            android.view.Surface r1 = r2.f53375F     // Catch:{ Throwable -> 0x001e }
            r1.release()     // Catch:{ Throwable -> 0x001e }
            r2.f53375F = r0     // Catch:{ Throwable -> 0x001e }
        L_0x0010:
            android.hardware.camera2.CameraDevice r1 = r2.f53391a     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x001e
            android.hardware.camera2.CameraDevice r1 = r2.f53391a     // Catch:{ Throwable -> 0x001e }
            r1.close()     // Catch:{ Throwable -> 0x001e }
            r2.f53391a = r0     // Catch:{ Throwable -> 0x001e }
            goto L_0x001e
        L_0x001c:
            r0 = move-exception
            goto L_0x0031
        L_0x001e:
            r2.f53394d = r0     // Catch:{ all -> 0x001c }
            r1 = 0
            r2.f53397g = r1     // Catch:{ all -> 0x001c }
            r2.f53391a = r0     // Catch:{ all -> 0x001c }
            r2.f53393c = r0     // Catch:{ all -> 0x001c }
            r2.f53392b = r0     // Catch:{ all -> 0x001c }
            r2.f53389T = r0     // Catch:{ all -> 0x001c }
            r2.f53408r = r0     // Catch:{ all -> 0x001c }
            r2.f53403m = r1     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x0031:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.camera.C19686i.mo52372p():void");
    }

    /* renamed from: r */
    public final void mo52374r() {
        try {
            Builder createCaptureRequest = this.f53391a.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.f53380K.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
            this.f53392b.stopRepeating();
            this.f53392b.capture(createCaptureRequest.build(), new CaptureCallback() {
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    C19686i.this.mo52377u();
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    if (C19686i.this.f53402l != null) {
                        C19686i.this.f53402l.mo52247a(null);
                    }
                    C19686i.this.mo52377u();
                }
            }, this.f53398h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: i */
    public final float mo52239i() {
        float f;
        boolean z;
        if (this.f53389T == null) {
            f = -1.0f;
        } else {
            f = ((Float) this.f53389T.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f2 = f / 2.0f;
        if (this.f53376G != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f2)));
            C19633e eVar = this.f53376G;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo52250a(5, z, false, 99.0f, arrayList);
        }
        return 99.0f;
    }

    /* renamed from: u */
    public final void mo52377u() {
        try {
            if (!(this.f53393c == null || this.f53392b == null)) {
                if (this.f53406p != 0) {
                    this.f53393c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                    this.f53393c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    this.f53392b.capture(this.f53393c.build(), this.f53390U, this.f53398h);
                    this.f53406p = 0;
                    this.f53392b.setRepeatingRequest(this.f53393c.build(), this.f53390U, this.f53398h);
                }
            }
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: v */
    private void m64907v() {
        if (this.f53389T != null) {
            Range[] rangeArr = (Range[]) this.f53389T.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr != null) {
                this.f53400j = m64900a((Range<Integer>[]) rangeArr);
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range range : rangeArr) {
                    int[] iArr = {((Integer) range.getLower()).intValue() * this.f53400j, ((Integer) range.getUpper()).intValue() * this.f53400j};
                    arrayList.add(iArr);
                    StringBuilder sb = new StringBuilder("Fps Range: [");
                    sb.append(iArr[0]);
                    sb.append(", ");
                    sb.append(iArr[1]);
                    sb.append("]");
                    C45372t.m143405b("IESOppoCamera", sb.toString());
                }
                this.f53399i = C19664f.m64789a(new int[]{this.f53383N.f53255d * this.f53400j, this.f53383N.f53256e * this.f53400j}, arrayList);
                StringBuilder sb2 = new StringBuilder("Set Fps Range: [");
                sb2.append(this.f53399i[0]);
                sb2.append(", ");
                sb2.append(this.f53399i[1]);
                sb2.append("]");
                C45372t.m143405b("IESOppoCamera", sb2.toString());
            }
        }
    }

    /* renamed from: q */
    public final void mo52373q() {
        C45372t.m143405b("IESOppoCamera", "updatePreview");
        if (this.f53391a != null && this.f53393c != null && this.f53392b != null) {
            try {
                this.f53393c.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.f53393c.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, Integer.valueOf(1));
                this.f53393c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f53399i[0] / this.f53400j), Integer.valueOf(this.f53399i[1] / this.f53400j)));
                if (this.f53383N.f53264m && m64906c(this.f53383N.f53264m)) {
                    C45372t.m143405b("IESOppoCamera", "Enable video stabilization.");
                }
                this.f53408r = this.f53393c.build();
                this.f53392b.setRepeatingRequest(this.f53408r, this.f53407q, this.f53398h);
                this.f53397g = 3;
                if (this.f53385P != null) {
                    this.f53385P.mo52246a();
                }
                C45372t.m143403a("IESOppoCamera", "send capture request...");
            } catch (CameraAccessException unused) {
                this.f53397g = 4;
                mo52372p();
            }
        }
    }

    /* renamed from: A */
    private void m64899A() {
        C45372t.m143405b("IESOppoCamera", "updateAntiShake");
        if (this.f53386Q) {
            Size size = new Size(this.f53371B, this.f53372C);
            int i = this.f53387R;
            String id = this.f53391a.getId();
            C18616b a = C18616b.m61064a();
            try {
                String b = a.mo48807b((String) f53369t.get(this.f53410w));
                if (b == null || b.isEmpty()) {
                    C19706c.m64971c("IESOppoCamera", "oMediaVersion is null");
                } else {
                    String b2 = a.mo48806b();
                    if (b2 == null || !b2.contains(id)) {
                        C45372t.m143407c("IESOppoCamera", "omedia camList is null");
                    } else {
                        String c = a.mo48808c(id);
                        if (c == null || c.isEmpty()) {
                            StringBuilder sb = new StringBuilder("omedia camera:");
                            sb.append(id);
                            sb.append("capability is null");
                            C45372t.m143407c("IESOppoCamera", sb.toString());
                        } else {
                            JSONObject jSONObject = new JSONObject();
                            JSONObject jSONObject2 = new JSONObject(c);
                            String str = null;
                            if (1 == jSONObject2.optInt("EIS")) {
                                str = "EIS";
                                jSONObject.put(str, 1);
                            } else if (1 == jSONObject2.optInt("OIS-Movie")) {
                                str = "OIS-Movie";
                                jSONObject.put(str, 1);
                            }
                            boolean z = false;
                            if (!(c == null || str == null || str.isEmpty())) {
                                boolean a2 = C18616b.m61067a(c, str, new Size(size.getWidth(), size.getHeight()));
                                boolean a3 = C18616b.m61066a(c, str, i);
                                StringBuilder sb2 = new StringBuilder("w:");
                                sb2.append(size.getWidth());
                                sb2.append(" h:");
                                sb2.append(size.getHeight());
                                sb2.append("sizeCheck:");
                                sb2.append(a2);
                                sb2.append(" countCheck:");
                                sb2.append(a3);
                                C45372t.m143405b("IESOppoCamera", sb2.toString());
                                z = a2 & a3;
                            }
                            if (jSONObject.length() <= 0 || !z) {
                                StringBuilder sb3 = new StringBuilder("omedia update parm str is null ");
                                sb3.append(jSONObject);
                                sb3.append(" ");
                                sb3.append(z);
                                C45372t.m143407c("IESOppoCamera", sb3.toString());
                            } else {
                                boolean a4 = a.mo48805a(jSONObject.toString());
                                StringBuilder sb4 = new StringBuilder("omedia set capability: ");
                                sb4.append(jSONObject.toString());
                                sb4.append(" setFeatureSuccess:");
                                sb4.append(a4);
                                C45372t.m143405b("IESOppoCamera", sb4.toString());
                            }
                        }
                    }
                }
            } catch (RuntimeException unused) {
                C45372t.m143409d("IESOppoCamera", "omedia got a RuntimeException");
            } catch (JSONException unused2) {
                C45372t.m143407c("IESOppoCamera", "omedia got a json Exception");
            }
        }
    }

    /* renamed from: a */
    public final void mo52217a(C19629a aVar) {
        this.f53385P = aVar;
    }

    /* renamed from: b */
    public final void mo52230b(SurfaceTexture surfaceTexture) {
        this.f53381L = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo52218a(C19631c cVar) {
        this.f53404n = cVar;
    }

    /* renamed from: b */
    public final void mo52231b(boolean z) {
        this.f53386Q = z;
    }

    /* renamed from: a */
    public final void mo52219a(C19632d dVar) {
        this.f53377H = dVar;
    }

    /* renamed from: a */
    private static int m64900a(Range<Integer>[] rangeArr) {
        if (rangeArr.length > 0 && ((Integer) rangeArr[0].getUpper()).intValue() < 1000) {
            return 1000;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo52220a(C19633e eVar) {
        this.f53376G = eVar;
    }

    /* renamed from: b */
    public final int mo52227b(int i) {
        int i2;
        if (this.f53374E == 1) {
            i2 = ((360 - ((this.f53413z + i) % 360)) + NormalGiftView.ALPHA_180) % 360;
        } else {
            i2 = ((this.f53413z - i) + 360) % 360;
        }
        if (this.f53383N.f53266o == 2) {
            i2 = (360 - i2) % 360;
        }
        this.f53370A = i2;
        StringBuilder sb = new StringBuilder("currentCameraPosition: ");
        sb.append(this.f53374E);
        C45372t.m143403a("IESOppoCamera", sb.toString());
        StringBuilder sb2 = new StringBuilder("mCameraRotation: ");
        sb2.append(this.f53370A);
        C45372t.m143403a("IESOppoCamera", sb2.toString());
        return i2;
    }

    /* renamed from: c */
    private boolean m64906c(boolean z) {
        if (!z) {
            this.f53393c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
            this.f53393c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
            return true;
        }
        int[] iArr = (int[]) this.f53389T.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    this.f53393c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(1));
                    this.f53393c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
                    C45372t.m143403a("IESOppoCamera", "Enable OIS");
                    return true;
                }
            }
        }
        for (int i2 : (int[]) this.f53389T.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
            if (i2 == 1) {
                this.f53393c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
                this.f53393c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
                C45372t.m143403a("IESOppoCamera", "Enable EIS");
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo52229b(float f) {
        if (this.f53389T != null && this.f53393c != null && this.f53392b != null) {
            Rect rect = (Rect) this.f53389T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            if (f > 99.0f) {
                f = 99.0f;
            }
            if (f < 0.0f) {
                f = 0.0f;
            }
            double pow = Math.pow(0.10000000149011612d, 0.10000000149011612d);
            double d = (double) (f / 10.0f);
            double pow2 = Math.pow(pow, d);
            double width = (double) rect.width();
            Double.isNaN(width);
            double d2 = pow2 * width;
            double pow3 = Math.pow(pow, d);
            double height = (double) rect.height();
            Double.isNaN(height);
            double d3 = pow3 * height;
            double width2 = (double) rect.width();
            Double.isNaN(width2);
            int i = (int) ((width2 - d2) / 2.0d);
            double height2 = (double) rect.height();
            Double.isNaN(height2);
            int i2 = (int) ((height2 - d3) / 2.0d);
            try {
                this.f53393c.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i, i2, rect.width() - i, rect.height() - i2));
                this.f53392b.setRepeatingRequest(this.f53393c.build(), null, null);
                if (this.f53376G != null) {
                    this.f53376G.mo52249a(5, f, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo52214a(float f) {
        float min = Math.min(Math.max(1.0f, f), 100.0f);
        if (this.f53389T != null && this.f53393c != null && this.f53392b != null) {
            Rect rect = (Rect) this.f53389T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
            double width = (double) (((float) rect.width()) / min);
            double height = (double) (((float) rect.height()) / min);
            double width2 = (double) rect.width();
            Double.isNaN(width2);
            Double.isNaN(width);
            int i = (int) ((width2 - width) / 2.0d);
            double height2 = (double) rect.height();
            Double.isNaN(height2);
            Double.isNaN(height);
            int i2 = (int) ((height2 - height) / 2.0d);
            StringBuilder sb = new StringBuilder("cropW: ");
            sb.append(i);
            sb.append(", cropH: ");
            sb.append(i2);
            sb.append(", width: ");
            sb.append(rect.width());
            sb.append(", height: ");
            sb.append(rect.height());
            C45372t.m143405b("IESOppoCamera", sb.toString());
            try {
                this.f53393c.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i, i2, rect.width() - i, rect.height() - i2));
                this.f53392b.setRepeatingRequest(this.f53393c.build(), null, null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: b */
    public final boolean mo52232b(int i, C19662d dVar) {
        C45372t.m143405b("IESOppoCamera", "changeCamera...");
        if (this.f53397g == 1 || this.f53397g == 2) {
            C45372t.m143405b("IESOppoCamera", "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        }
        mo52228b();
        mo52226a(i, dVar);
        C19667g.f53273l = true;
        return true;
    }

    /* renamed from: a */
    private void m64902a(int i, int i2) {
        Size[] outputSizes = ((StreamConfigurationMap) this.f53389T.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a = C19664f.m64788a((List<Point>) arrayList, new Point(this.f53371B, this.f53372C), (float) i, (float) i2);
        this.f53383N.f53265n = a;
        if (a != null) {
            this.f53380K = ImageReader.newInstance(a.x, a.y, 35, 1);
            this.f53380K.setOnImageAvailableListener(new OnImageAvailableListener() {
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        ImageFrame imageFrame = new ImageFrame(new C19699j(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (C19686i.this.f53402l != null) {
                            C19686i.this.f53402l.mo52247a(imageFrame);
                        }
                        acquireNextImage.close();
                    }
                }
            }, this.f53398h);
        }
    }

    /* renamed from: a */
    public static boolean m64903a(Context context, int i) {
        try {
            C18616b a = C18616b.m61064a();
            String str = ((CameraManager) context.getSystemService("camera")).getCameraIdList()[i];
            String b = a.mo48807b((String) f53369t.get(context.getPackageName()));
            if (b != null && !b.isEmpty()) {
                String b2 = a.mo48806b();
                if (b2 != null && b2.contains(str)) {
                    String c = a.mo48808c(str);
                    if (c != null && !c.isEmpty()) {
                        JSONObject jSONObject = new JSONObject(c);
                        if (1 == jSONObject.optInt("EIS") || 1 == jSONObject.optInt("OIS-Movie")) {
                            return true;
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            C45372t.m143407c("IESOppoCamera", "AntiShake verify cause this exception");
        }
        return false;
    }

    /* renamed from: a */
    private boolean m64904a(CameraCharacteristics cameraCharacteristics, int i) {
        if (this.f53395e != 0 && i >= this.f53395e) {
            return true;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue < 0 || intValue > 3) {
            StringBuilder sb = new StringBuilder("Invalid hardware level = ");
            sb.append(intValue);
            C45372t.m143409d("IESOppoCamera", sb.toString());
            return false;
        } else if (VERSION.SDK_INT < 22 && intValue == 2) {
            return false;
        } else {
            this.f53395e = f53149v[intValue];
            C20479f.m67954a("iesve_record_camera_hw_level", (long) this.f53395e);
            if (this.f53395e >= i) {
                StringBuilder sb2 = new StringBuilder("Camera hardware level supported, deviceLevel = ");
                sb2.append(this.f53395e);
                sb2.append(", require = ");
                sb2.append(this.f53378I);
                C45372t.m143403a("IESOppoCamera", sb2.toString());
                return true;
            }
            StringBuilder sb3 = new StringBuilder("Camera hardware level not supported, deviceLevel = ");
            sb3.append(this.f53395e);
            sb3.append(", require = ");
            sb3.append(this.f53378I);
            C45372t.m143409d("IESOppoCamera", sb3.toString());
            return false;
        }
    }

    /* renamed from: a */
    private Rect m64901a(int i, int i2, float[] fArr, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Rect rect = (Rect) this.f53389T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(", ");
        sb.append(rect.right);
        sb.append(", ");
        sb.append(rect.bottom);
        sb.append("]");
        C45372t.m143405b("IESOppoCamera", sb.toString());
        Size size = (Size) this.f53389T.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        C45372t.m143403a("onAreaTouchEvent", sb2.toString());
        float f6 = fArr[0];
        float f7 = fArr[1];
        int i8 = this.f53371B;
        int i9 = this.f53372C;
        if (90 == this.f53413z || 270 == this.f53413z) {
            i8 = this.f53372C;
            i9 = this.f53371B;
        }
        float f8 = 0.0f;
        if (i9 * i5 >= i8 * i6) {
            float f9 = (((float) i5) * 1.0f) / ((float) i8);
            f = ((((float) i9) * f9) - ((float) i6)) / 2.0f;
            f2 = f9;
            f3 = 0.0f;
        } else {
            f2 = (((float) i6) * 1.0f) / ((float) i9);
            f3 = ((((float) i8) * f2) - ((float) i5)) / 2.0f;
            f = 0.0f;
        }
        float f10 = (f6 + f3) / f2;
        float f11 = (f7 + f) / f2;
        if (90 == i7) {
            f10 = ((float) this.f53372C) - f10;
        } else if (270 == i7) {
            f11 = ((float) this.f53371B) - f11;
        } else {
            float f12 = f10;
            f10 = f11;
            f11 = f12;
        }
        Rect rect2 = (Rect) this.f53408r.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            C45372t.m143407c("IESOppoCamera", "can't get crop region");
            rect2 = rect;
        }
        int width = rect2.width();
        int height = rect2.height();
        if (this.f53372C * width > this.f53371B * height) {
            float f13 = (((float) height) * 1.0f) / ((float) this.f53372C);
            f8 = (((float) width) - (((float) this.f53371B) * f13)) / 2.0f;
            f5 = f13;
            f4 = 0.0f;
        } else {
            f5 = (((float) width) * 1.0f) / ((float) this.f53371B);
            f4 = (((float) height) - (((float) this.f53372C) * f5)) / 2.0f;
        }
        float f14 = (f11 * f5) + f8 + ((float) rect2.left);
        float f15 = (f10 * f5) + f4 + ((float) rect2.top);
        Rect rect3 = new Rect();
        if (i4 == 0) {
            double d = (double) f14;
            double width2 = (double) rect2.width();
            Double.isNaN(width2);
            double d2 = width2 * 0.05d;
            Double.isNaN(d);
            rect3.left = C19664f.m64785a((int) (d - d2), 0, rect2.width());
            double width3 = (double) rect2.width();
            Double.isNaN(width3);
            double d3 = width3 * 0.05d;
            Double.isNaN(d);
            rect3.right = C19664f.m64785a((int) (d + d3), 0, rect2.width());
            double d4 = (double) f15;
            double height2 = (double) rect2.height();
            Double.isNaN(height2);
            double d5 = height2 * 0.05d;
            Double.isNaN(d4);
            rect3.top = C19664f.m64785a((int) (d4 - d5), 0, rect2.height());
            double height3 = (double) rect2.height();
            Double.isNaN(height3);
            double d6 = height3 * 0.05d;
            Double.isNaN(d4);
            rect3.bottom = C19664f.m64785a((int) (d4 + d6), 0, rect2.height());
        } else {
            double d7 = (double) f14;
            double width4 = (double) rect2.width();
            Double.isNaN(width4);
            double d8 = width4 * 0.1d;
            Double.isNaN(d7);
            rect3.left = C19664f.m64785a((int) (d7 - d8), 0, rect2.width());
            double width5 = (double) rect2.width();
            Double.isNaN(width5);
            double d9 = width5 * 0.1d;
            Double.isNaN(d7);
            rect3.right = C19664f.m64785a((int) (d7 + d9), 0, rect2.width());
            double d10 = (double) f15;
            double height4 = (double) rect2.height();
            Double.isNaN(height4);
            double d11 = height4 * 0.1d;
            Double.isNaN(d10);
            rect3.top = C19664f.m64785a((int) (d10 - d11), 0, rect2.height());
            double height5 = (double) rect2.height();
            Double.isNaN(height5);
            double d12 = height5 * 0.1d;
            Double.isNaN(d10);
            rect3.bottom = C19664f.m64785a((int) (d10 + d12), 0, rect2.height());
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
        C45372t.m143405b("IESOppoCamera", sb3.toString());
        return rect3;
    }
}
