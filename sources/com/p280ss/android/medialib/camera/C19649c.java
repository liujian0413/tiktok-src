package com.p280ss.android.medialib.camera;

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
import android.util.Log;
import android.util.Range;
import android.util.Size;
import android.view.Surface;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19629a;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19630b;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19631c;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19632d;
import com.p280ss.android.medialib.camera.IESCameraInterface.C19633e;
import com.p280ss.android.medialib.common.C19706c;
import com.p280ss.android.ttve.monitor.C20479f;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import com.p280ss.android.vesdk.C45372t;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.medialib.camera.c */
public final class C19649c implements IESCameraInterface {

    /* renamed from: A */
    private int f53191A;

    /* renamed from: B */
    private int f53192B;

    /* renamed from: C */
    private Size[] f53193C;

    /* renamed from: D */
    private int f53194D = -1;

    /* renamed from: E */
    private int f53195E = -1;

    /* renamed from: F */
    private Surface f53196F;

    /* renamed from: G */
    private List<Surface> f53197G = new ArrayList();

    /* renamed from: H */
    private C19633e f53198H;

    /* renamed from: I */
    private C19632d f53199I;

    /* renamed from: J */
    private int f53200J = 1;

    /* renamed from: K */
    private boolean f53201K;

    /* renamed from: L */
    private ImageReader f53202L;

    /* renamed from: M */
    private SurfaceTexture f53203M;

    /* renamed from: N */
    private ImageReader f53204N;

    /* renamed from: O */
    private C19663e f53205O;

    /* renamed from: P */
    private Rect f53206P;

    /* renamed from: Q */
    private Size f53207Q;

    /* renamed from: R */
    private C19629a f53208R;

    /* renamed from: S */
    private StateCallback f53209S = new StateCallback() {
        public final void onDisconnected(CameraDevice cameraDevice) {
            StringBuilder sb = new StringBuilder("StateCallback::onDisconnected: thread_name = ");
            sb.append(Thread.currentThread().getName());
            C45372t.m143407c("Camera2", sb.toString());
            C19649c.this.mo52228b();
        }

        public final void onOpened(CameraDevice cameraDevice) {
            StringBuilder sb = new StringBuilder("StateCallback::onOpened: thread_name = ");
            sb.append(Thread.currentThread().getName());
            C45372t.m143407c("Camera2", sb.toString());
            C19649c.this.f53219g = 2;
            C19649c.this.f53213a = cameraDevice;
            if (C19649c.this.f53216d != null) {
                C19649c.this.f53216d.mo52271a(2);
            } else {
                C45372t.m143409d("Camera2", "mCameraOpenListener is null!");
            }
            C19649c.this.f53223k = false;
        }

        public final void onError(CameraDevice cameraDevice, int i) {
            StringBuilder sb = new StringBuilder("StateCallback::onError: thread_name = ");
            sb.append(Thread.currentThread().getName());
            sb.append("error: ");
            sb.append(i);
            C45372t.m143407c("Camera2", sb.toString());
            C19649c.this.f53219g = 4;
            if (C19649c.this.f53216d != null) {
                C19649c.this.f53216d.mo52272a(2, C19649c.m64735c(i), "StateCallback::onError");
                C19649c.this.f53216d = null;
            }
            C19649c.this.mo52277p();
        }
    };

    /* renamed from: T */
    private CameraCharacteristics f53210T;

    /* renamed from: U */
    private CaptureCallback f53211U = new CaptureCallback() {
        /* renamed from: a */
        private void m64780a(CaptureResult captureResult, boolean z) {
            switch (C19649c.this.f53229q) {
                case 0:
                    return;
                case 1:
                    Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (num == null || num.intValue() == 0) {
                        C19649c.this.mo52280s();
                        return;
                    } else if (4 == num.intValue() || 5 == num.intValue()) {
                        Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num2 == null || num2.intValue() == 2) {
                            C19649c.this.f53229q = 4;
                            C19649c.this.mo52280s();
                            break;
                        } else {
                            C19649c.this.mo52281t();
                            return;
                        }
                    } else if (z) {
                        C45372t.m143405b("Camera2", "No Focus");
                        C19649c.this.mo52280s();
                        return;
                    }
                    break;
                case 2:
                    Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num3 == null || num3.intValue() == 5) {
                        C19649c.this.mo52280s();
                        C19649c.this.f53229q = 4;
                        return;
                    } else if (num3.intValue() == 4) {
                        C19649c.this.f53229q = 3;
                        return;
                    }
                    break;
                case 3:
                    Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                    if (num4 == null || num4.intValue() != 5) {
                        C19649c.this.f53229q = 4;
                        C19649c.this.mo52280s();
                        break;
                    }
            }
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            m64780a(totalCaptureResult, true);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            m64780a(captureResult, false);
        }
    };

    /* renamed from: V */
    private Runnable f53212V = new Runnable() {
        public final void run() {
            if (C19649c.this.f53228p != 0) {
                C19649c.this.f53228p = 0;
                C19649c.this.f53227o = 0;
                if (C19649c.this.f53214b != null) {
                    C19649c.this.mo52279r();
                }
            }
        }
    };

    /* renamed from: a */
    public CameraDevice f53213a;

    /* renamed from: b */
    public CameraCaptureSession f53214b;

    /* renamed from: c */
    public Builder f53215c;

    /* renamed from: d */
    public C19662d f53216d;

    /* renamed from: e */
    public int f53217e;

    /* renamed from: f */
    public volatile boolean f53218f;

    /* renamed from: g */
    public volatile int f53219g;

    /* renamed from: h */
    public Handler f53220h;

    /* renamed from: i */
    int[] f53221i = new int[2];

    /* renamed from: j */
    int f53222j = 1;

    /* renamed from: k */
    public boolean f53223k = true;

    /* renamed from: l */
    public C19630b f53224l;

    /* renamed from: m */
    public int f53225m;

    /* renamed from: n */
    public C19631c f53226n;

    /* renamed from: o */
    public int f53227o;

    /* renamed from: p */
    public int f53228p;

    /* renamed from: q */
    public int f53229q;

    /* renamed from: r */
    public CaptureCallback f53230r = new CaptureCallback() {
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
            C45372t.m143409d("Camera2", sb.toString());
        }
    };

    /* renamed from: s */
    public CaptureRequest f53231s;

    /* renamed from: t */
    CameraCaptureSession.StateCallback f53232t;

    /* renamed from: w */
    private CameraManager f53233w;

    /* renamed from: x */
    private Handler f53234x = new Handler(Looper.getMainLooper());

    /* renamed from: y */
    private int f53235y;

    /* renamed from: z */
    private int f53236z;

    /* renamed from: c */
    public static int m64735c(int i) {
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

    /* renamed from: b */
    public final void mo52231b(boolean z) {
    }

    /* renamed from: e */
    public final void mo52235e() {
        m64738x();
    }

    /* renamed from: g */
    public final int mo52237g() {
        return this.f53236z;
    }

    /* renamed from: m */
    public final int mo52243m() {
        return this.f53194D;
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
            C45372t.m143409d("Camera2", "Invalid CameraParams");
            return;
        }
        this.f53220h = new Handler();
        StringBuilder sb = new StringBuilder("init: thread_name = ");
        sb.append(Thread.currentThread().getName());
        C45372t.m143407c("Camera2", sb.toString());
        this.f53200J = eVar.f53267p;
        if (this.f53233w == null) {
            this.f53233w = (CameraManager) eVar.f53253b.getSystemService("camera");
        }
        this.f53205O = eVar;
    }

    /* renamed from: a */
    public final boolean mo52226a(final int i, C19662d dVar) {
        Size[] sizeArr;
        Point point;
        StringBuilder sb = new StringBuilder("open: thread_name = ");
        sb.append(Thread.currentThread().getName());
        C45372t.m143407c("Camera2", sb.toString());
        if (this.f53219g == 4) {
            mo52277p();
        }
        this.f53216d = dVar;
        try {
            this.f53219g = 1;
            String[] cameraIdList = this.f53233w.getCameraIdList();
            StringBuilder sb2 = new StringBuilder("open cameraList.size: ");
            sb2.append(cameraIdList.length);
            C45372t.m143403a("Camera2", sb2.toString());
            if (i >= 0) {
                if (i <= 2) {
                    if (i >= cameraIdList.length) {
                        i = 1;
                    }
                    this.f53195E = i;
                    String str = "";
                    if (cameraIdList.length == 1) {
                        this.f53195E = 0;
                    }
                    int length = cameraIdList.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        String str2 = cameraIdList[i2];
                        if ((((Integer) this.f53233w.getCameraCharacteristics(str2).get(CameraCharacteristics.LENS_FACING)).intValue() == 1 ? 0 : 1) == this.f53195E) {
                            str = str2;
                            break;
                        }
                        i2++;
                    }
                    this.f53210T = this.f53233w.getCameraCharacteristics(str);
                    StringBuilder sb3 = new StringBuilder("open newCameraPosition: ");
                    sb3.append(this.f53195E);
                    C45372t.m143403a("Camera2", sb3.toString());
                    StringBuilder sb4 = new StringBuilder("open currentCameraId: ");
                    sb4.append(str);
                    C45372t.m143403a("Camera2", sb4.toString());
                    if (this.f53210T == null) {
                        C45372t.m143409d("Camera2", "mCameraCharacteristics is null");
                        return false;
                    } else if (!this.f53223k || m64734a(this.f53210T, this.f53200J)) {
                        this.f53235y = ((Integer) this.f53210T.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
                        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f53210T.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                        this.f53193C = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                        ArrayList arrayList = new ArrayList();
                        for (Size size : this.f53193C) {
                            arrayList.add(new Point(size.getWidth(), size.getHeight()));
                        }
                        if (this.f53205O.f53259h) {
                            Size[] outputSizes = streamConfigurationMap.getOutputSizes(256);
                            ArrayList arrayList2 = new ArrayList();
                            for (Size size2 : outputSizes) {
                                arrayList2.add(new Point(size2.getWidth(), size2.getHeight()));
                            }
                            point = C19664f.m64787a(arrayList, this.f53205O.f53257f, this.f53205O.f53258g, arrayList2, this.f53205O.f53260i, this.f53205O.f53261j);
                        } else {
                            point = C19664f.m64786a((List<Point>) arrayList, this.f53205O.f53257f, this.f53205O.f53258g);
                        }
                        if (point != null) {
                            this.f53191A = point.x;
                            this.f53192B = point.y;
                        }
                        m64737w();
                        this.f53233w.openCamera(str, this.f53209S, this.f53220h);
                        C20479f.m67954a("iesve_record_camera_type", 2);
                        return true;
                    } else {
                        if (this.f53216d != null) {
                            C19662d dVar2 = this.f53216d;
                            StringBuilder sb5 = new StringBuilder("Camera hardware level not supported, deviceLevel = ");
                            sb5.append(this.f53217e);
                            sb5.append(", require = ");
                            sb5.append(this.f53200J);
                            dVar2.mo52272a(2, -4, sb5.toString());
                        }
                        this.f53219g = 0;
                        return false;
                    }
                }
            }
            this.f53234x.post(new Runnable() {
                public final void run() {
                    if (C19649c.this.f53216d != null) {
                        C19662d dVar = C19649c.this.f53216d;
                        StringBuilder sb = new StringBuilder("Invalid position = ");
                        sb.append(i);
                        dVar.mo52272a(2, -2, sb.toString());
                    }
                }
            });
            this.f53219g = 0;
            return false;
        } catch (Throwable th) {
            StringBuilder sb6 = new StringBuilder("open failed: ");
            sb6.append(Log.getStackTraceString(th));
            C45372t.m143409d("Camera2", sb6.toString());
            this.f53219g = 4;
            this.f53234x.post(new Runnable() {
                public final void run() {
                    if (C19649c.this.f53216d != null) {
                        C19649c.this.f53216d.mo52272a(2, -1, th.getLocalizedMessage());
                        C19649c.this.f53216d = null;
                    }
                }
            });
            mo52277p();
            return false;
        }
    }

    /* renamed from: a */
    public final void mo52222a(boolean z) {
        if (this.f53215c != null && this.f53214b != null) {
            try {
                this.f53215c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(z ? 2 : 0));
                this.f53214b.setRepeatingRequest(this.f53215c.build(), null, null);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final boolean mo52224a(int i) {
        if (this.f53215c == null || this.f53214b == null) {
            return false;
        }
        switch (i) {
            case 0:
                this.f53215c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53215c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 1:
                this.f53215c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(3));
                break;
            case 2:
                this.f53215c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f53215c.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                break;
            case 3:
                this.f53215c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                break;
            case 4:
                try {
                    this.f53215c.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(4));
                    break;
                } catch (Exception unused) {
                    return false;
                }
            default:
                return false;
        }
        this.f53225m = i;
        this.f53214b.setRepeatingRequest(this.f53215c.build(), null, this.f53220h);
        return true;
    }

    /* renamed from: a */
    public final synchronized void mo52216a(SurfaceTexture surfaceTexture) {
        String str = "Camera2";
        StringBuilder sb = new StringBuilder("startPreview... thread id = ");
        sb.append(Thread.currentThread().getId());
        C45372t.m143405b(str, sb.toString());
        if (this.f53213a != null) {
            if (surfaceTexture != null) {
                if (this.f53219g == 2 || this.f53219g == 3) {
                    try {
                        m64738x();
                        this.f53203M = surfaceTexture;
                        this.f53215c = this.f53213a.createCaptureRequest(3);
                        Surface surface = null;
                        surfaceTexture.setDefaultBufferSize(this.f53191A, this.f53192B);
                        if (this.f53205O.f53266o == 2) {
                            m64730A();
                            if (this.f53204N != null) {
                                surface = this.f53204N.getSurface();
                            }
                        } else {
                            surface = new Surface(surfaceTexture);
                        }
                        if (!(surface == this.f53196F || this.f53196F == null)) {
                            this.f53215c.removeTarget(this.f53196F);
                            this.f53196F.release();
                        }
                        this.f53196F = surface;
                        this.f53197G.add(this.f53196F);
                        this.f53215c.addTarget(this.f53196F);
                        if (this.f53205O.f53259h && (this.f53207Q == null || (this.f53207Q.getWidth() == this.f53205O.f53260i && this.f53207Q.getHeight() == this.f53205O.f53261j))) {
                            m64733a(this.f53205O.f53260i, this.f53205O.f53261j);
                            this.f53197G.add(this.f53202L.getSurface());
                        } else if (this.f53207Q != null && this.f53201K) {
                            m64733a(this.f53207Q.getWidth(), this.f53207Q.getHeight());
                            this.f53197G.add(this.f53202L.getSurface());
                        }
                        C45372t.m143403a("Camera2", "createCaptureSession");
                        this.f53213a.createCaptureSession(this.f53197G, new CameraCaptureSession.StateCallback() {
                            public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                                StringBuilder sb = new StringBuilder("onConfigureFailed: thread_name = ");
                                sb.append(Thread.currentThread().getName());
                                C45372t.m143409d("Camera2", sb.toString());
                                C19649c.this.f53219g = 4;
                                C19649c.this.mo52277p();
                                if (C19649c.this.f53232t != null) {
                                    C19649c.this.f53232t.onConfigureFailed(cameraCaptureSession);
                                }
                            }

                            public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                                StringBuilder sb = new StringBuilder("onConfigured: thread_name = ");
                                sb.append(Thread.currentThread().getName());
                                C45372t.m143405b("Camera2", sb.toString());
                                C19649c.this.f53214b = cameraCaptureSession;
                                C19649c.this.mo52278q();
                                if (C19649c.this.f53232t != null) {
                                    C19649c.this.f53232t.onConfigured(cameraCaptureSession);
                                }
                            }
                        }, this.f53220h);
                        return;
                    } catch (CameraAccessException e) {
                        String str2 = "Camera2";
                        StringBuilder sb2 = new StringBuilder("Start Preview CameraAccessException:");
                        sb2.append(Log.getStackTraceString(e));
                        C45372t.m143409d(str2, sb2.toString());
                        return;
                    } catch (IllegalArgumentException e2) {
                        String str3 = "Camera2";
                        StringBuilder sb3 = new StringBuilder("Start Preview IllegalArgumentException:");
                        sb3.append(Log.getStackTraceString(e2));
                        C45372t.m143409d(str3, sb3.toString());
                        return;
                    }
                } else {
                    StringBuilder sb4 = new StringBuilder("Invalid state: ");
                    sb4.append(this.f53219g);
                    C45372t.m143409d("Camera2", sb4.toString());
                    return;
                }
            }
        }
        String str4 = "Camera2";
        StringBuilder sb5 = new StringBuilder("Invalid param,mCameraDevice:");
        boolean z = false;
        sb5.append(this.f53213a == null);
        sb5.append(",surfaceTexture:");
        if (surfaceTexture == null) {
            z = true;
        }
        sb5.append(z);
        C45372t.m143409d(str4, sb5.toString());
    }

    /* renamed from: a */
    public final boolean mo52223a() {
        boolean z = false;
        if (this.f53233w == null) {
            return false;
        }
        try {
            z = ((Boolean) this.f53233w.getCameraCharacteristics("0").get(CameraCharacteristics.FLASH_INFO_AVAILABLE)).booleanValue();
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder("isTorchSupported: ");
            sb.append(e.getMessage());
            C19706c.m64972d("Camera2", sb.toString());
        } catch (AssertionError e2) {
            StringBuilder sb2 = new StringBuilder("isTorchSupported: ");
            sb2.append(e2.getMessage());
            C19706c.m64972d("Camera2", sb2.toString());
        }
        return z;
    }

    /* renamed from: a */
    public final boolean mo52225a(int i, int i2, float f, float[] fArr, int i3) {
        StringBuilder sb = new StringBuilder("setFocusAreas: thread_name = ");
        sb.append(Thread.currentThread().getName());
        C45372t.m143405b("Camera2", sb.toString());
        if (this.f53219g != 3) {
            StringBuilder sb2 = new StringBuilder("Ignore setFocusAreas operation, invalid state = ");
            sb2.append(this.f53219g);
            C45372t.m143407c("Camera2", sb2.toString());
            return false;
        } else if (this.f53215c == null || this.f53213a == null || this.f53214b == null || this.f53210T == null) {
            C45372t.m143409d("Camera2", "Set focus failed, you must open camera first.");
            return false;
        } else if (this.f53218f) {
            C45372t.m143407c("Camera2", "Manual focus already engaged");
            return true;
        } else if (this.f53229q != 0) {
            C45372t.m143407c("Camera2", "capturing now");
            return false;
        } else {
            this.f53220h.removeCallbacks(this.f53212V);
            Rect a = m64732a(i, i2, fArr, i3, 0);
            Rect a2 = m64732a(i, i2, fArr, i3, 1);
            C196619 r11 = new CaptureCallback() {
                public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                    super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    StringBuilder sb = new StringBuilder("Manual AF failure: ");
                    sb.append(captureFailure);
                    C45372t.m143409d("Camera2", sb.toString());
                    C19649c.this.f53218f = false;
                }

                public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                    StringBuilder sb = new StringBuilder("Focus::onCaptureCompleted: thread_name = ");
                    sb.append(Thread.currentThread().getName());
                    C45372t.m143405b("Camera2", sb.toString());
                    if (captureRequest == null || captureRequest.getTag() != "FOCUS_TAG") {
                        C45372t.m143407c("Camera2", "Not focus request!");
                        return;
                    }
                    Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                    if (!(num == null || C19649c.this.f53215c == null)) {
                        C19649c.this.f53227o++;
                        if (C19649c.this.f53228p != 3 && C19649c.this.f53228p != 4 && C19649c.this.f53228p != 5) {
                            C19649c.this.f53228p = num.intValue();
                        } else if (num.intValue() == 4 || num.intValue() == 5) {
                            C19649c.this.f53218f = false;
                            try {
                                C19649c.this.f53215c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                                C19649c.this.f53215c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(3));
                                C19649c.this.f53231s = C19649c.this.f53215c.build();
                                if (C19649c.this.f53214b != null) {
                                    C19649c.this.f53214b.setRepeatingRequest(C19649c.this.f53231s, C19649c.this.f53230r, C19649c.this.f53220h);
                                }
                                StringBuilder sb2 = new StringBuilder("Focus done, try count = ");
                                sb2.append(C19649c.this.f53227o);
                                C45372t.m143403a("Camera2", sb2.toString());
                                C19649c.this.f53227o = 0;
                                C19649c.this.f53228p = 0;
                            } catch (CameraAccessException unused) {
                            }
                        }
                    }
                }
            };
            try {
                if (m64740z()) {
                    if (VERSION.SDK_INT >= 23) {
                        this.f53215c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    }
                    this.f53215c.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a2, 999)});
                }
                if (!m64739y()) {
                    if (m64740z()) {
                        this.f53214b.stopRepeating();
                        this.f53231s = this.f53215c.build();
                        this.f53214b.setRepeatingRequest(this.f53231s, r11, this.f53220h);
                    } else {
                        C45372t.m143407c("Camera2", "do not support MeteringAreaAE!");
                    }
                    C45372t.m143407c("Camera2", "do not support MeteringAreaAF!");
                    return false;
                }
                this.f53214b.stopRepeating();
                this.f53215c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
                this.f53215c.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(a, 999)});
                this.f53215c.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
                this.f53215c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
                this.f53215c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
                this.f53215c.setTag("FOCUS_TAG");
                this.f53231s = this.f53215c.build();
                this.f53218f = true;
                this.f53214b.setRepeatingRequest(this.f53231s, r11, this.f53220h);
                this.f53220h.postDelayed(this.f53212V, DouPlusShareGuideExperiment.MIN_VALID_DURATION);
                return true;
            } catch (Exception e) {
                StringBuilder sb3 = new StringBuilder("setRepeatingRequest failed, ");
                sb3.append(e.getMessage());
                C45372t.m143409d("Camera2", sb3.toString());
                this.f53219g = 4;
                mo52277p();
                return false;
            }
        }
    }

    /* renamed from: f */
    public final void mo52236f() {
        mo52216a(this.f53203M);
    }

    /* renamed from: j */
    public final boolean mo52240j() {
        if (this.f53213a != null) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final void mo52233c() {
        this.f53219g = 0;
        mo52277p();
        this.f53224l = null;
    }

    /* renamed from: h */
    public final int[] mo52238h() {
        return new int[]{this.f53191A, this.f53192B};
    }

    /* renamed from: k */
    public final int[] mo52241k() {
        return new int[]{this.f53191A, this.f53192B};
    }

    /* renamed from: A */
    private void m64730A() {
        this.f53204N = ImageReader.newInstance(this.f53191A, this.f53192B, 35, 1);
        this.f53204N.setOnImageAvailableListener(new OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                try {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        ImageFrame imageFrame = new ImageFrame(new C19699j(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (C19649c.this.f53226n != null) {
                            C19649c.this.f53226n.mo52248a(2, imageFrame);
                        }
                        acquireNextImage.close();
                    }
                } catch (Exception unused) {
                }
            }
        }, this.f53220h);
    }

    /* renamed from: d */
    public final void mo52234d() {
        if (this.f53205O.f53266o == 1) {
            mo52216a(this.f53203M);
        } else {
            mo52236f();
        }
    }

    /* renamed from: t */
    public final void mo52281t() {
        try {
            this.f53215c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
            this.f53229q = 2;
            this.f53214b.capture(this.f53215c.build(), this.f53211U, this.f53220h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: u */
    public final void mo52282u() {
        try {
            this.f53215c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            this.f53229q = 1;
            this.f53214b.capture(this.f53215c.build(), this.f53211U, this.f53220h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: x */
    private void m64738x() {
        this.f53220h.removeCallbacks(this.f53212V);
        this.f53197G.clear();
        if (this.f53214b != null) {
            this.f53214b.close();
            this.f53214b = null;
        }
        if (this.f53202L != null) {
            this.f53202L.close();
            this.f53202L = null;
        }
        if (this.f53204N != null) {
            this.f53204N.close();
            this.f53204N = null;
        }
    }

    /* renamed from: y */
    private boolean m64739y() {
        if (this.f53210T == null) {
            try {
                if (((Integer) this.f53233w.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53210T.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: z */
    private boolean m64740z() {
        if (this.f53210T == null) {
            try {
                if (((Integer) this.f53233w.getCameraCharacteristics("0").get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
                    return false;
                }
            } catch (CameraAccessException unused) {
                return false;
            }
        } else if (((Integer) this.f53210T.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AE)).intValue() <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final void mo52228b() {
        StringBuilder sb = new StringBuilder("close: thread_name = ");
        sb.append(Thread.currentThread().getName());
        C45372t.m143405b("Camera2", sb.toString());
        if (this.f53219g == 1) {
            C45372t.m143407c("Camera2", "Camera is opening or pending, ignore close operation.");
            return;
        }
        this.f53219g = 0;
        mo52277p();
        this.f53224l = null;
    }

    /* renamed from: l */
    public final List<int[]> mo52242l() {
        Size[] sizeArr;
        ArrayList arrayList = new ArrayList();
        if (this.f53193C == null) {
            return arrayList;
        }
        for (Size size : this.f53193C) {
            if (size != null) {
                arrayList.add(new int[]{size.getWidth(), size.getHeight()});
            }
        }
        return arrayList;
    }

    /* renamed from: s */
    public final void mo52280s() {
        try {
            Builder createCaptureRequest = this.f53213a.createCaptureRequest(2);
            createCaptureRequest.addTarget(this.f53202L.getSurface());
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
            this.f53214b.stopRepeating();
            if (this.f53206P != null) {
                createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.f53206P);
            }
            this.f53214b.capture(createCaptureRequest.build(), new CaptureCallback() {
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    C19649c.this.mo52283v();
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    if (C19649c.this.f53224l != null) {
                        C19649c.this.f53224l.mo52247a(null);
                    }
                    C19649c.this.mo52283v();
                }
            }, this.f53220h);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: v */
    public final void mo52283v() {
        try {
            if (!(this.f53215c == null || this.f53214b == null)) {
                if (this.f53229q != 0) {
                    this.f53215c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                    this.f53215c.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    this.f53214b.capture(this.f53215c.build(), this.f53211U, this.f53220h);
                    this.f53229q = 0;
                }
            }
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: i */
    public final float mo52239i() {
        float f;
        boolean z;
        if (this.f53210T == null) {
            f = -1.0f;
        } else {
            f = ((Float) this.f53210T.get(CameraCharacteristics.SCALER_AVAILABLE_MAX_DIGITAL_ZOOM)).floatValue();
        }
        float f2 = f / 2.0f;
        if (this.f53198H != null) {
            ArrayList arrayList = new ArrayList(1);
            arrayList.add(Integer.valueOf((int) (100.0f * f2)));
            C19633e eVar = this.f53198H;
            if (f2 > 0.0f) {
                z = true;
            } else {
                z = false;
            }
            eVar.mo52250a(2, z, false, 99.0f, arrayList);
        }
        return 99.0f;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:1|2|3|4|5|6|(1:8)|9|(1:11)|12|13|14) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0036 */
    /* renamed from: p */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo52277p() {
        /*
            r3 = this;
            monitor-enter(r3)
            java.lang.String r0 = "Camera2"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x004d }
            java.lang.String r2 = "reset: thread_name = "
            r1.<init>(r2)     // Catch:{ all -> 0x004d }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004d }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x004d }
            r1.append(r2)     // Catch:{ all -> 0x004d }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x004d }
            com.p280ss.android.vesdk.C45372t.m143407c(r0, r1)     // Catch:{ all -> 0x004d }
            r0 = 0
            r3.m64738x()     // Catch:{ Throwable -> 0x0036 }
            android.view.Surface r1 = r3.f53196F     // Catch:{ Throwable -> 0x0036 }
            if (r1 == 0) goto L_0x002b
            android.view.Surface r1 = r3.f53196F     // Catch:{ Throwable -> 0x0036 }
            r1.release()     // Catch:{ Throwable -> 0x0036 }
            r3.f53196F = r0     // Catch:{ Throwable -> 0x0036 }
        L_0x002b:
            android.hardware.camera2.CameraDevice r1 = r3.f53213a     // Catch:{ Throwable -> 0x0036 }
            if (r1 == 0) goto L_0x0036
            android.hardware.camera2.CameraDevice r1 = r3.f53213a     // Catch:{ Throwable -> 0x0036 }
            r1.close()     // Catch:{ Throwable -> 0x0036 }
            r3.f53213a = r0     // Catch:{ Throwable -> 0x0036 }
        L_0x0036:
            r3.f53216d = r0     // Catch:{ all -> 0x004d }
            r1 = 0
            r3.f53219g = r1     // Catch:{ all -> 0x004d }
            r3.f53213a = r0     // Catch:{ all -> 0x004d }
            r3.f53215c = r0     // Catch:{ all -> 0x004d }
            r3.f53214b = r0     // Catch:{ all -> 0x004d }
            r3.f53210T = r0     // Catch:{ all -> 0x004d }
            r3.f53231s = r0     // Catch:{ all -> 0x004d }
            r3.f53225m = r1     // Catch:{ all -> 0x004d }
            r3.f53218f = r1     // Catch:{ all -> 0x004d }
            r3.f53206P = r0     // Catch:{ all -> 0x004d }
            monitor-exit(r3)
            return
        L_0x004d:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.camera.C19649c.mo52277p():void");
    }

    /* renamed from: r */
    public final void mo52279r() {
        if (this.f53219g != 3) {
            StringBuilder sb = new StringBuilder("Ignore cancelAutoFocus operation, invalid state = ");
            sb.append(this.f53219g);
            C45372t.m143409d("Camera2", sb.toString());
        } else if (m64739y() && this.f53215c != null && this.f53213a != null) {
            this.f53215c.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
            this.f53215c.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(3));
            this.f53231s = this.f53215c.build();
            try {
                this.f53214b.setRepeatingRequest(this.f53231s, null, this.f53220h);
            } catch (CameraAccessException e) {
                StringBuilder sb2 = new StringBuilder("setRepeatingRequest failed, errMsg: ");
                sb2.append(e.getMessage());
                C45372t.m143409d("Camera2", sb2.toString());
            }
        }
    }

    /* renamed from: w */
    private void m64737w() {
        if (this.f53210T != null) {
            Range[] rangeArr = (Range[]) this.f53210T.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr != null) {
                this.f53222j = m64731a((Range<Integer>[]) rangeArr);
                ArrayList arrayList = new ArrayList(rangeArr.length);
                for (Range range : rangeArr) {
                    int[] iArr = {((Integer) range.getLower()).intValue() * this.f53222j, ((Integer) range.getUpper()).intValue() * this.f53222j};
                    arrayList.add(iArr);
                    StringBuilder sb = new StringBuilder("Fps Range: [");
                    sb.append(iArr[0]);
                    sb.append(", ");
                    sb.append(iArr[1]);
                    sb.append("]");
                    C45372t.m143405b("Camera2", sb.toString());
                }
                this.f53221i = C19664f.m64789a(new int[]{this.f53205O.f53255d * this.f53222j, this.f53205O.f53256e * this.f53222j}, arrayList);
                StringBuilder sb2 = new StringBuilder("Set Fps Range: [");
                sb2.append(this.f53221i[0]);
                sb2.append(", ");
                sb2.append(this.f53221i[1]);
                sb2.append("]");
                C45372t.m143403a("Camera2", sb2.toString());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d9, code lost:
        return;
     */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo52278q() {
        /*
            r6 = this;
            monitor-enter(r6)
            java.lang.String r0 = "Camera2"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            java.lang.String r2 = "updatePreview: thread_name = "
            r1.<init>(r2)     // Catch:{ all -> 0x00da }
            java.lang.Thread r2 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x00da }
            java.lang.String r2 = r2.getName()     // Catch:{ all -> 0x00da }
            r1.append(r2)     // Catch:{ all -> 0x00da }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x00da }
            com.p280ss.android.vesdk.C45372t.m143403a(r0, r1)     // Catch:{ all -> 0x00da }
            android.hardware.camera2.CameraDevice r0 = r6.f53213a     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d8
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53215c     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d8
            android.hardware.camera2.CameraCaptureSession r0 = r6.f53214b     // Catch:{ all -> 0x00da }
            if (r0 == 0) goto L_0x00d8
            java.util.List<android.view.Surface> r0 = r6.f53197G     // Catch:{ all -> 0x00da }
            int r0 = r0.size()     // Catch:{ all -> 0x00da }
            if (r0 > 0) goto L_0x0032
            goto L_0x00d8
        L_0x0032:
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53215c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_MODE     // Catch:{ Exception -> 0x00b8 }
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b8 }
            r0.set(r1, r3)     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53215c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_ANTIBANDING_MODE     // Catch:{ Exception -> 0x00b8 }
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b8 }
            r0.set(r1, r3)     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53215c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE     // Catch:{ Exception -> 0x00b8 }
            android.util.Range r3 = new android.util.Range     // Catch:{ Exception -> 0x00b8 }
            int[] r4 = r6.f53221i     // Catch:{ Exception -> 0x00b8 }
            r5 = 0
            r4 = r4[r5]     // Catch:{ Exception -> 0x00b8 }
            int r5 = r6.f53222j     // Catch:{ Exception -> 0x00b8 }
            int r4 = r4 / r5
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch:{ Exception -> 0x00b8 }
            int[] r5 = r6.f53221i     // Catch:{ Exception -> 0x00b8 }
            r2 = r5[r2]     // Catch:{ Exception -> 0x00b8 }
            int r5 = r6.f53222j     // Catch:{ Exception -> 0x00b8 }
            int r2 = r2 / r5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch:{ Exception -> 0x00b8 }
            r3.<init>(r4, r2)     // Catch:{ Exception -> 0x00b8 }
            r0.set(r1, r3)     // Catch:{ Exception -> 0x00b8 }
            com.ss.android.medialib.camera.e r0 = r6.f53205O     // Catch:{ Exception -> 0x00b8 }
            boolean r0 = r0.f53264m     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x0083
            com.ss.android.medialib.camera.e r0 = r6.f53205O     // Catch:{ Exception -> 0x00b8 }
            boolean r0 = r0.f53264m     // Catch:{ Exception -> 0x00b8 }
            boolean r0 = r6.m64736c(r0)     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x0083
            java.lang.String r0 = "Camera2"
            java.lang.String r1 = "Enable video stabilization."
            com.p280ss.android.vesdk.C45372t.m143403a(r0, r1)     // Catch:{ Exception -> 0x00b8 }
        L_0x0083:
            android.graphics.Rect r0 = r6.f53206P     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x0090
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53215c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION     // Catch:{ Exception -> 0x00b8 }
            android.graphics.Rect r2 = r6.f53206P     // Catch:{ Exception -> 0x00b8 }
            r0.set(r1, r2)     // Catch:{ Exception -> 0x00b8 }
        L_0x0090:
            android.hardware.camera2.CaptureRequest$Builder r0 = r6.f53215c     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest r0 = r0.build()     // Catch:{ Exception -> 0x00b8 }
            r6.f53231s = r0     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CameraCaptureSession r0 = r6.f53214b     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CaptureRequest r1 = r6.f53231s     // Catch:{ Exception -> 0x00b8 }
            android.hardware.camera2.CameraCaptureSession$CaptureCallback r2 = r6.f53230r     // Catch:{ Exception -> 0x00b8 }
            android.os.Handler r3 = r6.f53220h     // Catch:{ Exception -> 0x00b8 }
            r0.setRepeatingRequest(r1, r2, r3)     // Catch:{ Exception -> 0x00b8 }
            r0 = 3
            r6.f53219g = r0     // Catch:{ Exception -> 0x00b8 }
            com.ss.android.medialib.camera.IESCameraInterface$a r0 = r6.f53208R     // Catch:{ Exception -> 0x00b8 }
            if (r0 == 0) goto L_0x00af
            com.ss.android.medialib.camera.IESCameraInterface$a r0 = r6.f53208R     // Catch:{ Exception -> 0x00b8 }
            r0.mo52246a()     // Catch:{ Exception -> 0x00b8 }
        L_0x00af:
            java.lang.String r0 = "Camera2"
            java.lang.String r1 = "send capture request..."
            com.p280ss.android.vesdk.C45372t.m143405b(r0, r1)     // Catch:{ Exception -> 0x00b8 }
            monitor-exit(r6)
            return
        L_0x00b8:
            r0 = move-exception
            java.lang.String r1 = "Camera2"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x00da }
            java.lang.String r3 = "updatePreview error: "
            r2.<init>(r3)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x00da }
            r2.append(r0)     // Catch:{ all -> 0x00da }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x00da }
            com.p280ss.android.vesdk.C45372t.m143409d(r1, r0)     // Catch:{ all -> 0x00da }
            r0 = 4
            r6.f53219g = r0     // Catch:{ all -> 0x00da }
            r6.mo52277p()     // Catch:{ all -> 0x00da }
            monitor-exit(r6)
            return
        L_0x00d8:
            monitor-exit(r6)
            return
        L_0x00da:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.camera.C19649c.mo52278q():void");
    }

    /* renamed from: a */
    public final void mo52217a(C19629a aVar) {
        this.f53208R = aVar;
    }

    /* renamed from: b */
    public final void mo52230b(SurfaceTexture surfaceTexture) {
        this.f53203M = surfaceTexture;
    }

    /* renamed from: a */
    public final void mo52218a(C19631c cVar) {
        this.f53226n = cVar;
    }

    /* renamed from: a */
    public final void mo52219a(C19632d dVar) {
        this.f53199I = dVar;
    }

    /* renamed from: a */
    private static int m64731a(Range<Integer>[] rangeArr) {
        if (rangeArr.length > 0 && ((Integer) rangeArr[0].getUpper()).intValue() < 1000) {
            return 1000;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo52220a(C19633e eVar) {
        this.f53198H = eVar;
    }

    /* renamed from: b */
    public final int mo52227b(int i) {
        int i2;
        this.f53194D = this.f53195E;
        if (this.f53194D == 1) {
            i2 = ((360 - ((this.f53235y + i) % 360)) + NormalGiftView.ALPHA_180) % 360;
        } else {
            i2 = ((this.f53235y - i) + 360) % 360;
        }
        this.f53236z = i2;
        StringBuilder sb = new StringBuilder("currentCameraPosition: ");
        sb.append(this.f53194D);
        C45372t.m143403a("Camera2", sb.toString());
        StringBuilder sb2 = new StringBuilder("mCameraRotation: ");
        sb2.append(this.f53236z);
        C45372t.m143403a("Camera2", sb2.toString());
        return i2;
    }

    /* renamed from: c */
    private boolean m64736c(boolean z) {
        if (this.f53210T == null) {
            return false;
        }
        if (!z) {
            this.f53215c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
            this.f53215c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
            return true;
        }
        int[] iArr = (int[]) this.f53210T.get(CameraCharacteristics.LENS_INFO_AVAILABLE_OPTICAL_STABILIZATION);
        if (iArr != null) {
            for (int i : iArr) {
                if (i == 1) {
                    this.f53215c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(1));
                    this.f53215c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(0));
                    C45372t.m143403a("Camera2", "Enable OIS");
                    return true;
                }
            }
        }
        for (int i2 : (int[]) this.f53210T.get(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES)) {
            if (i2 == 1) {
                this.f53215c.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
                this.f53215c.set(CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE, Integer.valueOf(0));
                C45372t.m143403a("Camera2", "Enable EIS");
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo52229b(float f) {
        if (this.f53210T != null && this.f53215c != null && this.f53214b != null) {
            Rect rect = (Rect) this.f53210T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            C45372t.m143405b("Camera2", sb.toString());
            Rect rect2 = new Rect(i, i2, rect.width() - i, rect.height() - i2);
            this.f53206P = rect2;
            try {
                this.f53215c.set(CaptureRequest.SCALER_CROP_REGION, rect2);
                this.f53214b.setRepeatingRequest(this.f53215c.build(), null, null);
                if (this.f53198H != null) {
                    this.f53198H.mo52249a(2, f, true);
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    public final void mo52214a(float f) {
        float min = Math.min(Math.max(1.0f, f), 100.0f);
        if (this.f53210T != null && this.f53215c != null && this.f53214b != null) {
            Rect rect = (Rect) this.f53210T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
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
            C45372t.m143405b("Camera2", sb.toString());
            Rect rect2 = new Rect(i, i2, rect.width() - i, rect.height() - i2);
            this.f53206P = rect2;
            try {
                this.f53215c.set(CaptureRequest.SCALER_CROP_REGION, rect2);
                this.f53214b.setRepeatingRequest(this.f53215c.build(), null, null);
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private void m64733a(int i, int i2) {
        Size[] outputSizes = ((StreamConfigurationMap) this.f53210T.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(256);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new Point(size.getWidth(), size.getHeight()));
        }
        Point a = C19664f.m64788a((List<Point>) arrayList, new Point(this.f53191A, this.f53192B), (float) i, (float) i2);
        this.f53205O.f53265n = a;
        if (a != null) {
            this.f53202L = ImageReader.newInstance(a.x, a.y, 35, 1);
            this.f53202L.setOnImageAvailableListener(new OnImageAvailableListener() {
                public final void onImageAvailable(ImageReader imageReader) {
                    Image acquireNextImage = imageReader.acquireNextImage();
                    if (acquireNextImage != null) {
                        ImageFrame imageFrame = new ImageFrame(new C19699j(acquireNextImage.getPlanes()), -2, acquireNextImage.getWidth(), acquireNextImage.getHeight());
                        if (C19649c.this.f53224l != null) {
                            C19649c.this.f53224l.mo52247a(imageFrame);
                        }
                        acquireNextImage.close();
                    }
                }
            }, this.f53220h);
        }
    }

    /* renamed from: a */
    private boolean m64734a(CameraCharacteristics cameraCharacteristics, int i) {
        if (this.f53217e != 0 && i >= this.f53217e) {
            return true;
        }
        int intValue = ((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue();
        if (intValue < 0 || intValue > 3) {
            StringBuilder sb = new StringBuilder("Invalid hardware level = ");
            sb.append(intValue);
            C45372t.m143409d("Camera2", sb.toString());
            return false;
        } else if (VERSION.SDK_INT < 22 && intValue == 2) {
            return false;
        } else {
            this.f53217e = f53149v[intValue];
            C20479f.m67954a("iesve_record_camera_hw_level", (long) this.f53217e);
            if (this.f53217e >= i) {
                StringBuilder sb2 = new StringBuilder("Camera hardware level supported, deviceLevel = ");
                sb2.append(this.f53217e);
                sb2.append(", require = ");
                sb2.append(this.f53200J);
                C45372t.m143403a("Camera2", sb2.toString());
                return true;
            }
            StringBuilder sb3 = new StringBuilder("Camera hardware level not supported, deviceLevel = ");
            sb3.append(this.f53217e);
            sb3.append(", require = ");
            sb3.append(this.f53200J);
            C45372t.m143409d("Camera2", sb3.toString());
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo52232b(int i, C19662d dVar) {
        StringBuilder sb = new StringBuilder("changeCamera: thread_name = ");
        sb.append(Thread.currentThread().getName());
        C45372t.m143405b("Camera2", sb.toString());
        StringBuilder sb2 = new StringBuilder("changeCamera cameraPosition: ");
        sb2.append(i);
        C45372t.m143403a("Camera2", sb2.toString());
        if (this.f53219g == 1 || this.f53219g == 2) {
            C45372t.m143407c("Camera2", "Camera is opening or pending, ignore changeCamera operation.");
            return false;
        }
        mo52228b();
        mo52226a(i, dVar);
        C19667g.f53273l = true;
        return true;
    }

    /* renamed from: a */
    public final void mo52215a(int i, int i2, final C19630b bVar) {
        this.f53224l = bVar;
        this.f53207Q = new Size(i, i2);
        if (this.f53213a == null || this.f53214b == null || this.f53210T == null) {
            if (bVar != null) {
                bVar.mo52247a(null);
            }
            return;
        }
        try {
            this.f53201K = true;
            if (this.f53205O.f53259h && this.f53205O.f53260i == i && this.f53205O.f53261j == i2) {
                if (this.f53225m == 0 || this.f53225m == 2) {
                    mo52280s();
                } else {
                    mo52282u();
                }
                return;
            }
            this.f53232t = new CameraCaptureSession.StateCallback() {
                public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                    C19649c.this.f53232t = null;
                    if (bVar != null) {
                        bVar.mo52247a(null);
                    }
                }

                public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                    C19649c.this.f53232t = null;
                    try {
                        if (C19649c.this.f53225m == 0 || C19649c.this.f53225m == 2) {
                            C19649c.this.mo52280s();
                        } else {
                            C19649c.this.mo52282u();
                        }
                    } catch (Throwable unused) {
                        if (bVar != null) {
                            bVar.mo52247a(null);
                        }
                    }
                }
            };
            mo52216a(this.f53203M);
            this.f53201K = false;
        } catch (Throwable unused) {
            if (bVar != null) {
                bVar.mo52247a(null);
            }
        } finally {
            this.f53201K = false;
        }
    }

    /* renamed from: a */
    private Rect m64732a(int i, int i2, float[] fArr, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        int i5 = i;
        int i6 = i2;
        int i7 = i3;
        Rect rect = (Rect) this.f53210T.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        StringBuilder sb = new StringBuilder("SENSOR_INFO_ACTIVE_ARRAY_SIZE: [left, top, right, bottom] = [");
        sb.append(rect.left);
        sb.append(", ");
        sb.append(rect.top);
        sb.append(", ");
        sb.append(rect.right);
        sb.append(", ");
        sb.append(rect.bottom);
        sb.append("]");
        C45372t.m143405b("Camera2", sb.toString());
        Size size = (Size) this.f53210T.get(CameraCharacteristics.SENSOR_INFO_PIXEL_ARRAY_SIZE);
        StringBuilder sb2 = new StringBuilder("mCameraCharacteristics:[width, height]: [");
        sb2.append(size.getWidth());
        sb2.append(", ");
        sb2.append(size.getHeight());
        sb2.append("]");
        C45372t.m143403a("onAreaTouchEvent", sb2.toString());
        float f6 = fArr[0];
        float f7 = fArr[1];
        int i8 = this.f53191A;
        int i9 = this.f53192B;
        if (90 == this.f53235y || 270 == this.f53235y) {
            i8 = this.f53192B;
            i9 = this.f53191A;
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
            f10 = ((float) this.f53192B) - f10;
        } else if (270 == i7) {
            f11 = ((float) this.f53191A) - f11;
        } else {
            float f12 = f10;
            f10 = f11;
            f11 = f12;
        }
        Rect rect2 = (Rect) this.f53231s.get(CaptureRequest.SCALER_CROP_REGION);
        if (rect2 == null) {
            C45372t.m143407c("Camera2", "can't get crop region");
            rect2 = rect;
        }
        int width = rect2.width();
        int height = rect2.height();
        if (this.f53192B * width > this.f53191A * height) {
            float f13 = (((float) height) * 1.0f) / ((float) this.f53192B);
            f8 = (((float) width) - (((float) this.f53191A) * f13)) / 2.0f;
            f5 = f13;
            f4 = 0.0f;
        } else {
            f5 = (((float) width) * 1.0f) / ((float) this.f53191A);
            f4 = (((float) height) - (((float) this.f53192B) * f5)) / 2.0f;
        }
        float f14 = (f11 * f5) + f8 + ((float) rect2.left);
        float f15 = (f10 * f5) + f4 + ((float) rect2.top);
        if (mo52243m() == 1) {
            f15 = ((float) rect2.height()) - f15;
        }
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
        StringBuilder sb3 = new StringBuilder("Rect: [left, top, right, bottom] = [");
        sb3.append(rect3.left);
        sb3.append(", ");
        sb3.append(rect3.top);
        sb3.append(", ");
        sb3.append(rect3.right);
        sb3.append(", ");
        sb3.append(rect3.bottom);
        sb3.append("]");
        C45372t.m143405b("Camera2", sb3.toString());
        return rect3;
    }
}
