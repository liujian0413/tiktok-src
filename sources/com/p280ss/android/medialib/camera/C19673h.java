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
import android.media.MediaCodec;
import android.media.MediaRecorder;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.C1642a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.miui.camera.C18608a;
import com.miui.camera.C18610b;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19630b;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19631c;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19632d;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19633e;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.vesdk.C45372t;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.camera.h */
public final class C19673h implements IESCameraInterface {

    /* renamed from: A */
    private int f53309A;

    /* renamed from: B */
    private int f53310B;

    /* renamed from: C */
    private Size[] f53311C;

    /* renamed from: D */
    private int f53312D = -1;

    /* renamed from: E */
    private Surface f53313E;

    /* renamed from: F */
    private C19633e f53314F;

    /* renamed from: G */
    private C19632d f53315G;

    /* renamed from: H */
    private int f53316H = 1;

    /* renamed from: I */
    private boolean f53317I;

    /* renamed from: J */
    private ImageReader f53318J;

    /* renamed from: K */
    private SurfaceTexture f53319K;

    /* renamed from: L */
    private ImageReader f53320L;

    /* renamed from: M */
    private C19663e f53321M;

    /* renamed from: N */
    private Size f53322N;

    /* renamed from: O */
    private boolean f53323O;

    /* renamed from: P */
    private Surface f53324P;

    /* renamed from: Q */
    private MediaRecorder f53325Q;

    /* renamed from: R */
    private ImageReader f53326R;

    /* renamed from: S */
    private StateCallback f53327S = new StateCallback() {
        public final void onDisconnected(CameraDevice cameraDevice) {
            C45372t.m143409d("IESMiCamera", "StateCallback::onDisconnected...");
            C19673h.this.mo52228b();
        }

        public final void onOpened(CameraDevice cameraDevice) {
            C45372t.m143403a("IESMiCamera", "StateCallback::onOpened...");
            C19673h.this.f53336g = 2;
            C19673h.this.f53330a = cameraDevice;
            if (C19673h.this.f53333d != null) {
                C19673h.this.f53333d.mo52271a(4);
            }
            C19673h.this.f53340k = false;
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            C45372t.m143409d("IESMiCamera", "StateCallback::onError...");
            C19673h.this.f53336g = 4;
            if (C19673h.this.f53333d != null) {
                C19673h.this.f53333d.mo52272a(4, C19673h.m64854c(i), "StateCallback::onError");
                C19673h.this.f53333d = null;
            }
            C19673h.this.mo52344p();
        }
    };

    /* renamed from: T */
    private CameraCharacteristics f53328T;

    /* renamed from: U */
    private CaptureCallback f53329U = new CaptureCallback() {
        /* renamed from: a */
        private void m64898a(CaptureResult captureResult) {
            switch (C19673h.this.f53345p) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        C19673h.this.mo52346r();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            C19673h.this.f53345p = 4;
                            C19673h.this.mo52346r();
                            break;
                        } else {
                            C19673h.this.mo52347s();
                            return;
                        }
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        C19673h.this.mo52346r();
                        C19673h.this.f53345p = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        C19673h.this.f53345p = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        C19673h.this.f53345p = 4;
                        C19673h.this.mo52346r();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m64898a(totalCaptureResult);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m64898a(captureResult);
        }
    };

    /* renamed from: a */
    public CameraDevice f53330a;

    /* renamed from: b */
    public CameraCaptureSession f53331b;

    /* renamed from: c */
    public Builder f53332c;

    /* renamed from: d */
    public C19662d f53333d;

    /* renamed from: e */
    public int f53334e;

    /* renamed from: f */
    public volatile boolean f53335f;

    /* renamed from: g */
    public volatile int f53336g;

    /* renamed from: h */
    public Handler f53337h;

    /* renamed from: i */
    int[] f53338i = new int[2];

    /* renamed from: j */
    int f53339j = 1;

    /* renamed from: k */
    public boolean f53340k = true;

    /* renamed from: l */
    public C19630b f53341l;

    /* renamed from: m */
    public int f53342m;

    /* renamed from: n */
    public C19631c f53343n;

    /* renamed from: o */
    public int f53344o;

    /* renamed from: p */
    public int f53345p;

    /* renamed from: q */
    C19629a f53346q;

    /* renamed from: r */
    public CaptureCallback f53347r = new CaptureCallback() {
        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            StringBuilder sb = new StringBuilder("Manual AF failure: ");
            sb.append(captureFailure);
            C45372t.m143409d("IESMiCamera", sb.toString());
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            C45372t.m143405b("IESMiCamera", C1642a.m8034a("onCaptureProgressed: state[AE, AF, AWB] = [%d, %d, %d]", new Object[]{captureResult.get(CaptureResult.CONTROL_AE_STATE), captureResult.get(CaptureResult.CONTROL_AF_STATE), captureResult.get(CaptureResult.CONTROL_AWB_STATE)}));
        }
    };

    /* renamed from: s */
    public CaptureRequest f53348s;

    /* renamed from: t */
    CameraCaptureSession.StateCallback f53349t;

    /* renamed from: w */
    private CameraManager f53350w;

    /* renamed from: x */
    private Handler f53351x = new Handler(Looper.getMainLooper());

    /* renamed from: y */
    private int f53352y;

    /* renamed from: z */
    private int f53353z;

    /* renamed from: c */
    public static int m64854c(int i) {
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

    /* renamed from: a */
    public final void mo52218a(C19631c cVar) {
    }

    /* renamed from: e */
    public final void mo52235e() {
        m64843C();
    }

    /* renamed from: g */
    public final int mo52237g() {
        return this.f53353z;
    }

    /* renamed from: m */
    public final int mo52243m() {
        return this.f53312D;
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
            C45372t.m143409d("IESMiCamera", "Invalid CameraParams");
            return;
        }
        this.f53337h = new Handler();
        this.f53316H = eVar.f53267p;
        if (this.f53350w == null) {
            this.f53350w = (CameraManager) eVar.f53253b.getSystemService("camera");
        }
        this.f53321M = eVar;
    }

    /* renamed from: a */
    public final boolean mo52226a(final int i, C19662d dVar) {
        Size[] sizeArr;
        Point point;
        C45372t.m143405b("IESMiCamera", "open...");
        if (this.f53336g == 4) {
            mo52344p();
        }
        this.f53333d = dVar;
        try {
            this.f53336g = 1;
            this.f53312D = i;
            this.f53350w.getCameraIdList();
            if (i == 2) {
                i = 21;
            } else {
                if (i >= 0) {
                    if (i > 2) {
                    }
                }
                this.f53351x.post(new Runnable() {
                    public final void run() {
                        if (C19673h.this.f53333d != null) {
                            C19662d dVar = C19673h.this.f53333d;
                            StringBuilder sb = new StringBuilder("Invalid position = ");
                            sb.append(i);
                            dVar.mo52272a(4, -2, sb.toString());
                        }
                    }
                });
                this.f53336g = 0;
                return false;
            }
            this.f53328T = this.f53350w.getCameraCharacteristics(C18608a.m61034a(i));
            if (this.f53328T == null) {
                return false;
            }
            if (!this.f53340k || m64852a(this.f53328T, this.f53316H)) {
                this.f53352y = ((Integer) this.f53328T.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f53328T.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                this.f53311C = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                ArrayList arrayList = new ArrayList();
                for (Size size : this.f53311C) {
                    arrayList.add(new Point(size.getWidth(), size.getHeight()));
                }
                if (this.f53321M.f53259h) {
                    Size[] outputSizes = streamConfigurationMap.getOutputSizes(256);
                    ArrayList arrayList2 = new ArrayList();
                    for (Size size2 : outputSizes) {
                        arrayList2.add(new Point(size2.getWidth(), size2.getHeight()));
                    }
                    point = C19664f.m64787a(arrayList, this.f53321M.f53257f, this.f53321M.f53258g, arrayList2, this.f53321M.f53260i, this.f53321M.f53261j);
                } else {
                    point = C19664f.m64786a((List<Point>) arrayList, this.f53321M.f53257f, this.f53321M.f53258g);
                }
                if (point != null) {
                    this.f53309A = point.x;
                    this.f53310B = point.y;
                }
                m64855v();
                C18608a.m61036a(i, this.f53327S, this.f53337h, this.f53350w);
                C20479f.m67954a("iesve_record_camera_type", 2);
                m64856w();
                return true;
            }
            if (this.f53333d != null) {
                C19662d dVar2 = this.f53333d;
                StringBuilder sb = new StringBuilder("Camera hardware level not supported, deviceLevel = ");
                sb.append(this.f53334e);
                sb.append(", require = ");
                sb.append(this.f53316H);
                dVar2.mo52272a(4, -4, sb.toString());
            }
            this.f53336g = 0;
            return false;
        } catch (Throwable th) {
            this.f53336g = 4;
            mo52344p();
            this.f53351x.post(new Runnable() {
                public final void run() {
                    if (C19673h.this.f53333d != null) {
                        C19673h.this.f53333d.mo52272a(4, -1, th.getLocalizedMessage());
                        C19673h.this.f53333d = null;
                    }
                }
            });
            return false;
        }
    }

    /* renamed from: a */
    public final void mo52222a(boolean z) {
        if (this.f53332c != null && this.f53331b != null) {
            try {
                this.f53332c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
                this.f53331b.setRepeatingRequest(this.f53332c.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo52224a(int i) {
        if (this.f53332c == null || this.f53331b == null) {
            return false;
        }
        switch (i) {
            case 0:
                this.f53332c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53332c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 1:
                this.f53332c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(3));
                break;
            case 2:
                this.f53332c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53332c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                break;
            case 3:
                this.f53332c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                break;
            case 4:
                try {
                    this.f53332c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(4));
                    break;
                } catch (Exception unused) {
                    return false;
                }
            default:
                return false;
        }
        this.f53342m = i;
        this.f53331b.setRepeatingRequest(this.f53332c.build(), this.f53329U, this.f53337h);
        return true;
    }

    /* renamed from: a */
    public final void mo52216a(SurfaceTexture surfaceTexture) {
        if (surfaceTexture != null) {
            surfaceTexture.setDefaultBufferSize(this.f53309A, this.f53310B);
            m64850a(new Surface(surfaceTexture), surfaceTexture);
        }
    }

    /* renamed from: a */
    public final boolean mo52223a() {
        try {
            return ((Boolean) this.f53350w.getCameraCharacteristics("0").get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (CameraAccessException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo52225a(int i, int i2, float f, float[] fArr, int i3) {
        C45372t.m143405b("IESMiCamera", "setFocusAreas...");
        if (this.f53336g != 3) {
            StringBuilder sb = new StringBuilder("Ignore setFocusAreas operation, invalid state = ");
            sb.append(this.f53336g);
            C45372t.m143407c("IESMiCamera", sb.toString());
            return false;
        } else if (this.f53332c == null || this.f53330a == null || this.f53331b == null) {
            C45372t.m143409d("IESMiCamera", "Set focus failed, you must open camera first.");
            return false;
        } else if (this.f53335f) {
            C45372t.m143407c("IESMiCamera", "Manual focus already engaged");
            return true;
        } else if (this.f53345p != 0) {
            C45372t.m143407c("IESMiCamera", "capturing now");
            return false;
        } else {
            int i4 = i;
            int i5 = i2;
            float[] fArr2 = fArr;
            int i6 = i3;
            Rect a = m64848a(i4, i5, fArr2, i6, 0);
            Rect a2 = m64848a(i4, i5, fArr2, i6, 1);
            C1967510 r10 = new CaptureCallback() {
                public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    StringBuilder sb = new StringBuilder("Manual AF failure: ");
                    sb.append(captureFailure);
                    C45372t.m143409d("IESMiCamera", sb.toString());
                    C19673h.this.f53335f = false;
                }

                /* JADX WARNING: Removed duplicated region for block: B:20:0x0062  */
                /* JADX WARNING: Removed duplicated region for block: B:29:0x008c  */
                /* JADX WARNING: Removed duplicated region for block: B:32:0x009a  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final void onCaptureCompleted(android.hardware.camera2.CameraCaptureSession r9, android.hardware.camera2.CaptureRequest r10, android.hardware.camera2.TotalCaptureResult r11) {
                    /*
                        r8 = this;
                        if (r10 == 0) goto L_0x011f
                        java.lang.Object r9 = r10.getTag()
                        java.lang.String r10 = "FOCUS_TAG"
                        if (r9 == r10) goto L_0x000c
                        goto L_0x011f
                    L_0x000c:
                        android.hardware.camera2.CaptureResult$Key r9 = android.hardware.camera2.CaptureResult.CONTROL_AF_STATE
                        java.lang.Object r9 = r11.get(r9)
                        java.lang.Integer r9 = (java.lang.Integer) r9
                        android.hardware.camera2.CaptureResult$Key r10 = android.hardware.camera2.CaptureResult.CONTROL_AE_STATE
                        java.lang.Object r10 = r11.get(r10)
                        java.lang.Integer r10 = (java.lang.Integer) r10
                        r11 = 5
                        r0 = 4
                        r1 = 1
                        r2 = 2
                        r3 = 0
                        if (r9 == 0) goto L_0x0057
                        java.lang.String r4 = "IESMiCamera"
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
                        if (r2 == r4) goto L_0x0055
                        r4 = 6
                        int r5 = r9.intValue()
                        if (r4 == r5) goto L_0x0055
                        int r4 = r9.intValue()
                        if (r4 != 0) goto L_0x005e
                    L_0x0055:
                        r4 = 1
                        goto L_0x005f
                    L_0x0057:
                        java.lang.String r4 = "IESMiCamera"
                        java.lang.String r5 = "afState is null"
                        com.p280ss.android.vesdk.C45372t.m143407c(r4, r5)
                    L_0x005e:
                        r4 = 0
                    L_0x005f:
                        r5 = 3
                        if (r10 == 0) goto L_0x008c
                        int r6 = r9.intValue()
                        if (r5 == r6) goto L_0x0077
                        int r6 = r9.intValue()
                        if (r2 == r6) goto L_0x0077
                        int r9 = r9.intValue()
                        if (r0 != r9) goto L_0x0075
                        goto L_0x0077
                    L_0x0075:
                        r9 = 0
                        goto L_0x0078
                    L_0x0077:
                        r9 = 1
                    L_0x0078:
                        java.lang.String r0 = "IESMiCamera"
                        java.lang.StringBuilder r6 = new java.lang.StringBuilder
                        java.lang.String r7 = "aeState = "
                        r6.<init>(r7)
                        r6.append(r10)
                        java.lang.String r10 = r6.toString()
                        com.p280ss.android.vesdk.C45372t.m143405b(r0, r10)
                        goto L_0x0094
                    L_0x008c:
                        java.lang.String r9 = "IESMiCamera"
                        java.lang.String r10 = "aeState is null"
                        com.p280ss.android.vesdk.C45372t.m143407c(r9, r10)
                        r9 = 0
                    L_0x0094:
                        com.ss.android.medialib.camera.h r10 = com.p280ss.android.medialib.camera.C19673h.this
                        android.hardware.camera2.CaptureRequest$Builder r10 = r10.f53332c
                        if (r10 == 0) goto L_0x011e
                        com.ss.android.medialib.camera.h r10 = com.p280ss.android.medialib.camera.C19673h.this
                        int r0 = r10.f53344o
                        int r0 = r0 + r1
                        r10.f53344o = r0
                        com.ss.android.medialib.camera.h r10 = com.p280ss.android.medialib.camera.C19673h.this
                        int r10 = r10.f53344o
                        if (r10 >= r11) goto L_0x00c9
                        if (r4 == 0) goto L_0x00ac
                        if (r9 == 0) goto L_0x00ac
                        goto L_0x00c9
                    L_0x00ac:
                        java.lang.String r9 = "IESMiCamera"
                        java.lang.StringBuilder r10 = new java.lang.StringBuilder
                        java.lang.String r11 = "Focus not finished, do "
                        r10.<init>(r11)
                        com.ss.android.medialib.camera.h r11 = com.p280ss.android.medialib.camera.C19673h.this
                        int r11 = r11.f53344o
                        r10.append(r11)
                        java.lang.String r11 = " capture."
                        r10.append(r11)
                        java.lang.String r10 = r10.toString()
                        com.p280ss.android.vesdk.C45372t.m143403a(r9, r10)
                        goto L_0x011e
                    L_0x00c9:
                        com.ss.android.medialib.camera.h r9 = com.p280ss.android.medialib.camera.C19673h.this
                        r9.f53335f = r3
                        com.ss.android.medialib.camera.h r9 = com.p280ss.android.medialib.camera.C19673h.this
                        r9.f53344o = r3
                        com.ss.android.medialib.camera.h r9 = com.p280ss.android.medialib.camera.C19673h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53332c     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER     // Catch:{ CameraAccessException -> 0x011d }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x011d }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r9 = com.p280ss.android.medialib.camera.C19673h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53332c     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE     // Catch:{ CameraAccessException -> 0x011d }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r5)     // Catch:{ CameraAccessException -> 0x011d }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x011d }
                        int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ CameraAccessException -> 0x011d }
                        r10 = 23
                        if (r9 < r10) goto L_0x00fe
                        com.ss.android.medialib.camera.h r9 = com.p280ss.android.medialib.camera.C19673h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Builder r9 = r9.f53332c     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Key r10 = android.hardware.camera2.CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER     // Catch:{ CameraAccessException -> 0x011d }
                        java.lang.Integer r11 = java.lang.Integer.valueOf(r2)     // Catch:{ CameraAccessException -> 0x011d }
                        r9.set(r10, r11)     // Catch:{ CameraAccessException -> 0x011d }
                    L_0x00fe:
                        com.ss.android.medialib.camera.h r9 = com.p280ss.android.medialib.camera.C19673h.this     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r10 = com.p280ss.android.medialib.camera.C19673h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest$Builder r10 = r10.f53332c     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest r10 = r10.build()     // Catch:{ CameraAccessException -> 0x011d }
                        r9.f53348s = r10     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r9 = com.p280ss.android.medialib.camera.C19673h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CameraCaptureSession r9 = r9.f53331b     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r10 = com.p280ss.android.medialib.camera.C19673h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CaptureRequest r10 = r10.f53348s     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r11 = com.p280ss.android.medialib.camera.C19673h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.hardware.camera2.CameraCaptureSession$CaptureCallback r11 = r11.f53347r     // Catch:{ CameraAccessException -> 0x011d }
                        com.ss.android.medialib.camera.h r0 = com.p280ss.android.medialib.camera.C19673h.this     // Catch:{ CameraAccessException -> 0x011d }
                        android.os.Handler r0 = r0.f53337h     // Catch:{ CameraAccessException -> 0x011d }
                        r9.setRepeatingRequest(r10, r11, r0)     // Catch:{ CameraAccessException -> 0x011d }
                    L_0x011d:
                        return
                    L_0x011e:
                        return
                    L_0x011f:
                        java.lang.String r9 = "IESMiCamera"
                        java.lang.String r10 = "Not focus request!"
                        com.p280ss.android.vesdk.C45372t.m143407c(r9, r10)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.camera.C19673h.C1967510.onCaptureCompleted(android.hardware.camera2.CameraCaptureSession, android.hardware.camera2.CaptureRequest, android.hardware.camera2.TotalCaptureResult):void");
                }
            };
            try {
                this.f53331b.stopRepeating();
                if (m64845E()) {
                    if (VERSION.SDK_INT >= 23) {
                        this.f53332c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    }
                    this.f53332c.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a2, 999)});
                }
                if (!m64844D()) {
                    if (m64845E()) {
                        this.f53348s = this.f53332c.build();
                        this.f53331b.setRepeatingRequest(this.f53348s, r10, this.f53337h);
                    } else {
                        C45372t.m143407c("IESMiCamera", "do not support MeteringAreaAE!");
                    }
                    C45372t.m143407c("IESMiCamera", "do not support MeteringAreaAF!");
                    return false;
                }
                this.f53332c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
                this.f53332c.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a, 999)});
                this.f53332c.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.f53332c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                this.f53332c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                this.f53332c.setTag("FOCUS_TAG");
                if (VERSION.SDK_INT >= 23) {
                    this.f53332c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
                }
                this.f53348s = this.f53332c.build();
                this.f53331b.setRepeatingRequest(this.f53348s, r10, this.f53337h);
                return true;
            } catch (Exception e) {
                StringBuilder sb2 = new StringBuilder("setRepeatingRequest failed, ");
                sb2.append(e.getMessage());
                C45372t.m143409d("IESMiCamera", sb2.toString());
                this.f53336g = 4;
                mo52344p();
                return false;
            }
        }
    }

    /* renamed from: a */
    public final void mo52220a(C19633e eVar) {
        this.f53314F = eVar;
    }

    /* renamed from: a */
    public final void mo52219a(C19632d dVar) {
        this.f53315G = dVar;
    }

    /* renamed from: a */
    public final void mo52215a(int i, int i2, final C19630b bVar) {
        this.f53341l = bVar;
        this.f53322N = new Size(i, i2);
        if (this.f53330a == null || this.f53331b == null || this.f53328T == null) {
            if (bVar != null) {
                bVar.mo52247a(null);
            }
            return;
        }
        try {
            this.f53317I = true;
            if (this.f53321M.f53259h && this.f53321M.f53260i == i && this.f53321M.f53261j == i2) {
                if (this.f53342m == 0 || this.f53342m == 2) {
                    mo52346r();
                } else {
                    mo52348t();
                }
                return;
            }
            this.f53349t = new CameraCaptureSession.StateCallback() {
                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    C19673h.this.f53349t = null;
                    if (bVar != null) {
                        bVar.mo52247a(null);
                    }
                }

                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    C19673h.this.f53349t = null;
                    try {
                        if (C19673h.this.f53342m == 0) {
                            if (C19673h.this.f53342m == 2) {
                                C19673h.this.mo52346r();
                                return;
                            }
                        }
                        C19673h.this.mo52348t();
                    } catch (Throwable unused) {
                        if (bVar != null) {
                            bVar.mo52247a(null);
                        }
                    }
                }
            };
            mo52216a(this.f53319K);
            this.f53317I = false;
        } catch (Throwable unused) {
            if (bVar != null) {
                bVar.mo52247a(null);
            }
        } finally {
            this.f53317I = false;
        }
    }

    /* renamed from: f */
    public final void mo52236f() {
        mo52216a(this.f53319K);
    }

    /* renamed from: j */
    public final boolean mo52240j() {
        if (this.f53330a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    private void m64842B() {
        if (this.f53326R != null) {
            this.f53326R.close();
        }
    }

    /* renamed from: w */
    private void m64856w() {
        this.f53324P = MediaCodec.createPersistentInputSurface();
        C45372t.m143405b("IESMiCamera", "initRecorderSurface: zhanghp");
    }

    /* renamed from: x */
    private void m64857x() {
        if (this.f53324P != null) {
            this.f53324P.release();
            this.f53324P = null;
        }
    }

    /* renamed from: z */
    private void m64859z() {
        if (this.f53325Q != null) {
            this.f53325Q.release();
        }
    }

    /* renamed from: c */
    public final void mo52233c() {
        this.f53336g = 0;
        mo52344p();
        this.f53341l = null;
        m64857x();
    }

    /* renamed from: h */
    public final int[] mo52238h() {
        return new int[]{this.f53309A, this.f53310B};
    }

    /* renamed from: k */
    public final int[] mo52241k() {
        return new int[]{this.f53309A, this.f53310B};
    }

    /* renamed from: u */
    public final void mo52349u() {
        this.f53345p = 0;
        if (this.f53331b != null) {
            this.f53331b.close();
            this.f53331b = null;
        }
    }

    /* renamed from: F */
    private void m64846F() {
        this.f53320L = ImageReader.newInstance(this.f53309A, this.f53310B, 35, 1);
        this.f53320L.setOnImageAvailableListener(new OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                try {
                    Image acquireLatestImage = imageReader.acquireLatestImage();
                    if (acquireLatestImage != null) {
                        ImageFrame imageFrame = new ImageFrame(new C19699j(acquireLatestImage.getPlanes()), -2, acquireLatestImage.getWidth(), acquireLatestImage.getHeight());
                        if (C19673h.this.f53343n != null) {
                            C19673h.this.f53343n.mo52248a(2, imageFrame);
                        }
                        acquireLatestImage.close();
                    }
                } catch (Exception unused) {
                }
            }
        }, this.f53337h);
    }

    /* renamed from: d */
    public final void mo52234d() {
        if (this.f53321M.f53266o == 1) {
            mo52216a(this.f53319K);
        } else {
            mo52236f();
        }
    }

    /* renamed from: s */
    public final void mo52347s() {
        try {
            this.f53332c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
            this.f53345p = 2;
            this.f53331b.capture(this.f53332c.build(), this.f53329U, this.f53337h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: t */
    public final void mo52348t() {
        try {
            this.f53332c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            this.f53345p = 1;
            this.f53331b.capture(this.f53332c.build(), this.f53329U, this.f53337h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: A */
    private void m64841A() {
        if (this.f53326R != null) {
            this.f53326R.close();
        }
        C196848 r0 = new OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
            }
        };
        this.f53326R = ImageReader.newInstance(this.f53309A, this.f53310B, 256, 2);
        this.f53326R.setOnImageAvailableListener(r0, this.f53337h);
    }

    /* renamed from: C */
    private void m64843C() {
        if (this.f53331b != null) {
            if (this.f53332c != null) {
                C18608a.m61037a(this.f53331b, this.f53332c);
            }
            this.f53331b.close();
            this.f53331b = null;
        }
        m64842B();
        m64859z();
        if (this.f53318J != null) {
            this.f53318J.close();
            this.f53318J = null;
        }
        if (this.f53320L != null) {
            this.f53320L.close();
            this.f53320L = null;
        }
    }

    /* renamed from: D */
    private boolean m64844D() {
        if (this.f53328T == null) {
            try {
                if (((Integer) this.f53350w.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53328T.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: E */
    private boolean m64845E() {
        if (this.f53328T == null) {
            try {
                if (((Integer) this.f53350w.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53328T.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo52228b() {
        C45372t.m143405b("IESMiCamera", "close...");
        if (this.f53336g == 1) {
            C45372t.m143407c("IESMiCamera", "Camera is opening or pending, ignore close operation.");
            return;
        }
        this.f53336g = 0;
        mo52344p();
        this.f53341l = null;
        m64857x();
    }

    /* renamed from: l */
    public final List<int[]> mo52242l() {
        Size[] sizeArr;
        ArrayList arrayList = new ArrayList();
        if (this.f53311C == null) {
            return arrayList;
        }
        for (Size size : this.f53311C) {
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
    public final synchronized void mo52344p() {
        /*
            r2 = this;
            monitor-enter(r2)
            r0 = 0
            r2.m64843C()     // Catch:{ Throwable -> 0x001e }
            android.view.Surface r1 = r2.f53313E     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x0010
            android.view.Surface r1 = r2.f53313E     // Catch:{ Throwable -> 0x001e }
            r1.release()     // Catch:{ Throwable -> 0x001e }
            r2.f53313E = r0     // Catch:{ Throwable -> 0x001e }
        L_0x0010:
            android.hardware.camera2.CameraDevice r1 = r2.f53330a     // Catch:{ Throwable -> 0x001e }
            if (r1 == 0) goto L_0x001e
            android.hardware.camera2.CameraDevice r1 = r2.f53330a     // Catch:{ Throwable -> 0x001e }
            r1.close()     // Catch:{ Throwable -> 0x001e }
            r2.f53330a = r0     // Catch:{ Throwable -> 0x001e }
            goto L_0x001e
        L_0x001c:
            r0 = move-exception
            goto L_0x002f
        L_0x001e:
            r2.f53333d = r0     // Catch:{ all -> 0x001c }
            r1 = 0
            r2.f53336g = r1     // Catch:{ all -> 0x001c }
            r2.f53330a = r0     // Catch:{ all -> 0x001c }
            r2.f53332c = r0     // Catch:{ all -> 0x001c }
            r2.f53331b = r0     // Catch:{ all -> 0x001c }
            r2.f53328T = r0     // Catch:{ all -> 0x001c }
            r2.f53348s = r0     // Catch:{ all -> 0x001c }
            monitor-exit(r2)
            return
        L_0x002f:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.camera.C19673h.mo52344p():void");
    }

    /* renamed from: r */
    public final void mo52346r() {
        try {
            Builder createCaptureRequest = this.f53330a.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.f53318J.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
            this.f53331b.stopRepeating();
            this.f53331b.capture(createCaptureRequest.build(), new CaptureCallback() {
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    C19673h.this.mo52349u();
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    if (C19673h.this.f53341l != null) {
                        C19673h.this.f53341l.mo52247a(null);
                    }
                    C19673h.this.mo52349u();
                }
            }, this.f53337h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: y */
    private void m64858y() {
        try {
            this.f53325Q = new MediaRecorder();
            this.f53325Q.setAudioSource(1);
            this.f53325Q.setVideoSource(2);
            this.f53325Q.setOutputFormat(2);
            this.f53325Q.setOutputFile("/storage/emulated/0/xiaomi_camera.mp4");
            this.f53325Q.setVideoEncodingBitRate(10000000);
            this.f53325Q.setVideoFrameRate(30);
            this.f53325Q.setVideoSize(this.f53309A, this.f53310B);
            this.f53325Q.setVideoEncoder(2);
            this.f53325Q.setAudioEncoder(3);
            this.f53325Q.setInputSurface(this.f53324P);
            this.f53325Q.setOrientationHint(0);
            this.f53325Q.prepare();
        } catch (IOException unused) {
        }
    }

    /* renamed from: i */
    public final float mo52239i() {
        float f;
        boolean z;
        if (this.f53328T == null) {
            f = -1.0f;
        } else {
            f = ((Float) this.f53328T.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f2 = f / 2.0f;
        if (this.f53314F != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f2)));
            C19633e eVar = this.f53314F;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo52250a(2, z, false, 99.0f, arrayList);
        }
        return 99.0f;
    }

    /* renamed from: v */
    private void m64855v() {
        if (this.f53328T != null) {
            Range[] rangeArr = (Range[]) this.f53328T.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr != null) {
                this.f53339j = m64847a((Range<Integer>[]) rangeArr);
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range range : rangeArr) {
                    int[] iArr = {((Integer) range.getLower()).intValue() * this.f53339j, ((Integer) range.getUpper()).intValue() * this.f53339j};
                    arrayList.add(iArr);
                    StringBuilder sb = new StringBuilder("Fps Range: [");
                    sb.append(iArr[0]);
                    sb.append(", ");
                    sb.append(iArr[1]);
                    sb.append("]");
                    C45372t.m143405b("IESMiCamera", sb.toString());
                }
                this.f53338i = C19664f.m64789a(new int[]{this.f53321M.f53255d * this.f53339j, this.f53321M.f53256e * this.f53339j}, arrayList);
                StringBuilder sb2 = new StringBuilder("Set Fps Range: [");
                sb2.append(this.f53338i[0]);
                sb2.append(", ");
                sb2.append(this.f53338i[1]);
                sb2.append("]");
                C45372t.m143403a("IESMiCamera", sb2.toString());
            }
        }
    }

    /* renamed from: q */
    public final void mo52345q() {
        C45372t.m143405b("IESMiCamera", "updatePreview");
        if (this.f53330a != null && this.f53332c != null) {
            try {
                this.f53332c.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.f53332c.set(CaptureRequest.CONTROL_AE_ANTIBANDING_MODE, Integer.valueOf(1));
                this.f53332c.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range(Integer.valueOf(this.f53338i[0] / this.f53339j), Integer.valueOf(this.f53338i[1] / this.f53339j)));
                C18610b.m61041a(this.f53332c, this.f53328T, this.f53323O);
                StringBuilder sb = new StringBuilder("EnableAntiShake: ");
                sb.append(this.f53323O);
                C45372t.m143403a("IESMiCamera", sb.toString());
                this.f53348s = this.f53332c.build();
                this.f53331b.setRepeatingRequest(this.f53348s, this.f53347r, this.f53337h);
                this.f53336g = 3;
                if (this.f53346q != null) {
                    this.f53346q.mo52246a();
                }
                C45372t.m143403a("IESMiCamera", "send capture request...");
            } catch (CameraAccessException unused) {
                this.f53336g = 4;
                mo52344p();
            }
        }
    }

    /* renamed from: a */
    public final void mo52217a(C19629a aVar) {
        this.f53346q = aVar;
    }

    /* renamed from: b */
    public final void mo52230b(SurfaceTexture surfaceTexture) {
        this.f53319K = surfaceTexture;
    }

    /* renamed from: b */
    public final void mo52231b(boolean z) {
        this.f53323O = z;
    }

    /* renamed from: a */
    public static boolean m64851a(Context context) {
        return m64853a(C18608a.m61034a(21));
    }

    /* renamed from: a */
    private static int m64847a(Range<Integer>[] rangeArr) {
        if (rangeArr.length > 0 && ((Integer) rangeArr[0].getUpper()).intValue() < 1000) {
            return 1000;
        }
        return 1;
    }

    /* renamed from: a */
    private static boolean m64853a(String str) {
        if (!"0".equals(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int mo52227b(int i) {
        int i2;
        if (this.f53312D == 1) {
            i2 = ((360 - ((this.f53352y + i) % 360)) + NormalGiftView.ALPHA_180) % 360;
        } else {
            i2 = ((this.f53352y - i) + 360) % 360;
        }
        if (this.f53321M.f53266o == 2) {
            i2 = (360 - i2) % 360;
        }
        this.f53353z = i2;
        StringBuilder sb = new StringBuilder("currentCameraPosition: ");
        sb.append(this.f53312D);
        C45372t.m143403a("IESMiCamera", sb.toString());
        StringBuilder sb2 = new StringBuilder("mCameraRotation: ");
        sb2.append(this.f53353z);
        C45372t.m143403a("IESMiCamera", sb2.toString());
        return i2;
    }

    /* renamed from: b */
    public final void mo52229b(float f) {
        if (this.f53328T != null && this.f53332c != null && this.f53331b != null) {
            Rect rect = (Rect) this.f53328T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            StringBuilder sb = new StringBuilder("cropW: ");
            sb.append(i);
            sb.append(", cropH: ");
            sb.append(i2);
            sb.append(", width: ");
            sb.append(rect.width());
            sb.append(", height: ");
            sb.append(rect.height());
            sb.append("zoom: ");
            sb.append(f);
            C45372t.m143405b("IESMiCamera", sb.toString());
            try {
                this.f53332c.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i, i2, rect.width() - i, rect.height() - i2));
                this.f53331b.setRepeatingRequest(this.f53332c.build(), null, null);
                if (this.f53314F != null) {
                    this.f53314F.mo52249a(2, f, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo52214a(float f) {
        float min = Math.min(Math.max(1.0f, f), 100.0f);
        if (this.f53328T != null && this.f53332c != null && this.f53331b != null) {
            Rect rect = (Rect) this.f53328T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            C45372t.m143405b("IESMiCamera", sb.toString());
            try {
                this.f53332c.set(CaptureRequest.SCALER_CROP_REGION, new Rect(i, i2, rect.width() - i, rect.height() - i2));
                this.f53331b.setRepeatingRequest(this.f53332c.build(), null, null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m64849a(int i, int i2) {
        Size[] outputSizes = ((StreamConfigurationMap) this.f53328T.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a = C19664f.m64788a((List<Point>) arrayList, new Point(this.f53309A, this.f53310B), (float) i, (float) i2);
        this.f53321M.f53265n = a;
        if (a != null) {
            this.f53318J = ImageReader.newInstance(a.x, a.y, 35, 1);
            this.f53318J.setOnImageAvailableListener(new OnImageAvailableListener() {
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        ImageFrame imageFrame = new ImageFrame(new C19699j(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (C19673h.this.f53341l != null) {
                            C19673h.this.f53341l.mo52247a(imageFrame);
                        }
                        acquireNextImage.close();
                    }
                }
            }, this.f53337h);
        }
    }

    /* renamed from: a */
    private synchronized void m64850a(Surface surface, SurfaceTexture surfaceTexture) {
        C45372t.m143405b("IESMiCamera", "startPreview...");
        if (this.f53330a == null) {
            return;
        }
        if (this.f53336g == 2 || this.f53336g == 3) {
            try {
                m64843C();
                this.f53319K = surfaceTexture;
                this.f53332c = this.f53330a.createCaptureRequest(3);
                ArrayList arrayList = new ArrayList();
                if (this.f53313E != null) {
                    this.f53332c.removeTarget(this.f53313E);
                }
                if (this.f53321M.f53266o == 2) {
                    m64846F();
                    if (this.f53320L != null) {
                        surface = this.f53320L.getSurface();
                    }
                }
                this.f53313E = surface;
                arrayList.add(this.f53313E);
                this.f53332c.addTarget(this.f53313E);
                if (this.f53321M.f53259h && (this.f53322N == null || (this.f53322N.getWidth() == this.f53321M.f53260i && this.f53322N.getHeight() == this.f53321M.f53261j))) {
                    m64849a(this.f53321M.f53260i, this.f53321M.f53261j);
                    arrayList.add(this.f53318J.getSurface());
                } else if (this.f53322N != null && this.f53317I) {
                    m64849a(this.f53322N.getWidth(), this.f53322N.getHeight());
                    arrayList.add(this.f53318J.getSurface());
                }
                if (this.f53323O) {
                    m64858y();
                    arrayList.add(this.f53324P);
                    m64841A();
                    arrayList.add(this.f53326R.getSurface());
                }
                int i = 32772;
                if (!this.f53323O) {
                    i = 0;
                }
                C18608a.m61038a(arrayList, new CameraCaptureSession.StateCallback() {
                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        C45372t.m143409d("IESMiCamera", "onConfigureFailed...");
                        C19673h.this.f53336g = 4;
                        C19673h.this.mo52344p();
                        if (C19673h.this.f53349t != null) {
                            C19673h.this.f53349t.onConfigureFailed(cameraCaptureSession);
                        }
                    }

                    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        C45372t.m143405b("IESMiCamera", "onConfigured...");
                        C19673h.this.f53331b = cameraCaptureSession;
                        C19673h.this.mo52345q();
                        if (C19673h.this.f53349t != null) {
                            C19673h.this.f53349t.onConfigured(cameraCaptureSession);
                        }
                    }
                }, this.f53337h, this.f53330a, i);
            } catch (CameraAccessException unused) {
            }
        } else {
            StringBuilder sb = new StringBuilder("Invalid state: ");
            sb.append(this.f53336g);
            C45372t.m143407c("IESMiCamera", sb.toString());
        }
    }

    /* renamed from: a */
    private boolean m64852a(CameraCharacteristics cameraCharacteristics, int i) {
        if (this.f53334e != 0 && i >= this.f53334e) {
            return true;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue < 0 || intValue > 3) {
            StringBuilder sb = new StringBuilder("Invalid hardware level = ");
            sb.append(intValue);
            C45372t.m143409d("IESMiCamera", sb.toString());
            return false;
        } else if (VERSION.SDK_INT < 22 && intValue == 2) {
            return false;
        } else {
            this.f53334e = f53149v[intValue];
            C20479f.m67954a("iesve_record_camera_hw_level", (long) this.f53334e);
            if (this.f53334e >= i) {
                StringBuilder sb2 = new StringBuilder("Camera hardware level supported, deviceLevel = ");
                sb2.append(this.f53334e);
                sb2.append(", require = ");
                sb2.append(this.f53316H);
                C45372t.m143403a("IESMiCamera", sb2.toString());
                return true;
            }
            StringBuilder sb3 = new StringBuilder("Camera hardware level not supported, deviceLevel = ");
            sb3.append(this.f53334e);
            sb3.append(", require = ");
            sb3.append(this.f53316H);
            C45372t.m143409d("IESMiCamera", sb3.toString());
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo52232b(int i, C19662d dVar) {
        C45372t.m143405b("IESMiCamera", "changeCamera...");
        if (this.f53336g == 1 || this.f53336g == 2) {
            C45372t.m143407c("IESMiCamera", "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        }
        mo52228b();
        mo52226a(i, dVar);
        C19667g.f53273l = true;
        return true;
    }

    /* renamed from: a */
    private Rect m64848a(int i, int i2, float[] fArr, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Rect rect = (Rect) this.f53328T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(", ");
        sb.append(rect.right);
        sb.append(", ");
        sb.append(rect.bottom);
        sb.append("]");
        C45372t.m143405b("IESMiCamera", sb.toString());
        Size size = (Size) this.f53328T.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        C45372t.m143403a("onAreaTouchEvent", sb2.toString());
        float f6 = fArr[0];
        float f7 = fArr[1];
        int i8 = this.f53309A;
        int i9 = this.f53310B;
        if (90 == this.f53352y || 270 == this.f53352y) {
            i8 = this.f53310B;
            i9 = this.f53309A;
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
            f10 = ((float) this.f53310B) - f10;
        } else if (270 == i7) {
            f11 = ((float) this.f53309A) - f11;
        } else {
            float f12 = f10;
            f10 = f11;
            f11 = f12;
        }
        Rect rect2 = (Rect) this.f53348s.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            C45372t.m143407c("IESMiCamera", "can't get crop region");
            rect2 = rect;
        }
        int width = rect2.width();
        int height = rect2.height();
        if (this.f53310B * width > this.f53309A * height) {
            float f13 = (((float) height) * 1.0f) / ((float) this.f53310B);
            f8 = (((float) width) - (((float) this.f53309A) * f13)) / 2.0f;
            f5 = f13;
            f4 = 0.0f;
        } else {
            f5 = (((float) width) * 1.0f) / ((float) this.f53309A);
            f4 = (((float) height) - (((float) this.f53310B) * f5)) / 2.0f;
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
        C45372t.m143405b("IESMiCamera", sb3.toString());
        return rect3;
    }
}
