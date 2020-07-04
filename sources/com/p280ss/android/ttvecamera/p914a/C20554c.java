package com.p280ss.android.ttvecamera.p914a;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCaptureSession.StateCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.media.ImageReader.OnImageAvailableListener;
import android.os.Build.VERSION;
import android.os.Handler;
import android.util.Size;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20599e;
import com.p280ss.android.ttvecamera.C20632i.C20638f;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.C20654n;
import com.p280ss.android.ttvecamera.TECameraFrame;
import com.p280ss.android.ttvecamera.TECameraFrame.ETEPixelFormat;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p915b.C20567d;
import com.p280ss.android.ttvecamera.p919f.C20613c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.ss.android.ttvecamera.a.c */
public class C20554c extends C20553b {

    /* renamed from: c */
    public int f55545c;

    /* renamed from: d */
    protected ImageReader f55546d;

    /* renamed from: e */
    public C20638f f55547e;

    /* renamed from: y */
    private CaptureCallback f55548y;

    /* renamed from: b */
    public final void mo55630b() {
        try {
            this.f55608n.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(1));
            this.f55545c = 2;
            this.f55616v.capture(this.f55608n.build(), this.f55548y, this.f55604j);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: c */
    public final void mo55632c() {
        try {
            this.f55608n.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
            this.f55545c = 1;
            this.f55616v.capture(this.f55608n.build(), this.f55548y, this.f55604j);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: g */
    public void mo55636g() {
        if (this.f55546d != null) {
            this.f55546d.close();
            this.f55546d = null;
        }
        if (this.f55547e != null) {
            this.f55547e = null;
        }
        super.mo55636g();
    }

    /* renamed from: d */
    public final void mo55633d() {
        try {
            if (!(this.f55608n == null || this.f55616v == null)) {
                if (this.f55545c != 0) {
                    this.f55608n.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
                    if (VERSION.SDK_INT >= 23) {
                        this.f55608n.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
                    }
                    this.f55616v.capture(this.f55608n.build(), this.f55548y, this.f55604j);
                    this.f55545c = 0;
                }
            }
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: e */
    public final void mo55634e() {
        try {
            Builder createCaptureRequest = this.f55544b.createCaptureRequest(2);
            createCaptureRequest.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
            createCaptureRequest.addTarget(this.f55546d.getSurface());
            m68052a(createCaptureRequest, this.f55602h.f55721B);
            this.f55616v.stopRepeating();
            if (!C20642j.m68414a()) {
                this.f55616v.abortCaptures();
            }
            if (this.f55612r != null) {
                createCaptureRequest.set(CaptureRequest.SCALER_CROP_REGION, this.f55612r);
            }
            this.f55616v.capture(createCaptureRequest.build(), new CaptureCallback() {
                public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
                    super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
                    C20554c.this.mo55633d();
                }

                public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                    super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                    if (C20554c.this.f55547e != null) {
                        C20554c.this.f55547e.mo55814a(null, C20554c.this.f55601g);
                    }
                    C20554c.this.mo55633d();
                }
            }, this.f55604j);
        } catch (CameraAccessException unused) {
        } catch (Exception unused2) {
        }
    }

    /* renamed from: h */
    public final int mo55637h() {
        if (this.f55608n == null || this.f55616v == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        this.f55608n.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(2));
        this.f55608n.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        this.f55607m = this.f55608n.build();
        try {
            this.f55616v.setRepeatingRequest(this.f55607m, this.f55618x, this.f55604j);
        } catch (CameraAccessException | IllegalStateException unused) {
        }
        return 0;
    }

    /* renamed from: i */
    public final int mo55638i() {
        if (this.f55608n == null || this.f55616v == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -100, "rollbackNormalSessionRequest : param is null.");
            return -100;
        }
        if (VERSION.SDK_INT >= 23) {
            this.f55608n.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
        }
        this.f55608n.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
        this.f55607m = this.f55608n.build();
        try {
            this.f55616v.setRepeatingRequest(this.f55607m, this.f55618x, this.f55604j);
        } catch (CameraAccessException unused) {
        }
        return 0;
    }

    /* renamed from: f */
    public int mo55635f() throws Exception {
        mo55636g();
        C20613c cVar = this.f55601g.f55654n;
        if (this.f55544b == null || cVar == null) {
            C20652m.m68435b("TEImage2Mode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int k = super.mo55710k();
        if (k != 0) {
            return k;
        }
        mo55627a(this.f55602h.f55732k.f55535a, this.f55602h.f55732k.f55536b);
        this.f55608n = this.f55544b.createCaptureRequest(1);
        if (this.f55612r != null) {
            this.f55608n.set(CaptureRequest.SCALER_CROP_REGION, this.f55612r);
        }
        ArrayList<Surface> arrayList = new ArrayList<>();
        if (cVar.f55676b.mo55748c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.mo55761d()));
        } else {
            arrayList.add(cVar.mo55760c());
        }
        for (Surface addTarget : arrayList) {
            this.f55608n.addTarget(addTarget);
        }
        arrayList.add(this.f55546d.getSurface());
        this.f55608n.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
        this.f55544b.createCaptureSession(arrayList, this.f55617w, this.f55604j);
        return 0;
    }

    /* renamed from: a */
    public final void mo55629a(C20638f fVar) {
        super.mo55629a(fVar);
        this.f55547e = fVar;
        C20652m.m68434a("TEImage2Mode", "takePicture...");
        try {
            if (this.f55602h.f55721B == 0 || this.f55602h.f55721B == 2) {
                mo55634e();
            } else {
                mo55632c();
            }
        } catch (Exception e) {
            this.f55604j.post(new Runnable() {
                public final void run() {
                    if (C20554c.this.f55547e != null) {
                        C20554c.this.f55547e.mo55815a(e);
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final void mo55631b(int i) {
        if (this.f55608n == null || this.f55616v == null) {
            StringBuilder sb = new StringBuilder("switchFlashMode: ");
            sb.append("Capture Session is null");
            C20652m.m68437d("TEImage2Mode", sb.toString());
            return;
        }
        switch (i) {
            case 0:
            case 1:
            case 4:
                this.f55608n.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f55608n.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                break;
            case 2:
                this.f55608n.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                this.f55608n.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                break;
            case 3:
                this.f55608n.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                break;
            default:
                StringBuilder sb2 = new StringBuilder("Image Mode not support this mode : ");
                sb2.append(i);
                C20652m.m68436c("TEImage2Mode", sb2.toString());
                return;
        }
        try {
            this.f55602h.f55721B = i;
            this.f55607m = this.f55608n.build();
            this.f55616v.setRepeatingRequest(this.f55607m, this.f55618x, this.f55604j);
        } catch (CameraAccessException unused) {
        }
    }

    /* renamed from: a */
    private static void m68052a(Builder builder, int i) {
        switch (i) {
            case 0:
                builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(0));
                return;
            case 1:
                builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                return;
            case 2:
                builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(1));
                builder.set(CaptureRequest.FLASH_MODE, Integer.valueOf(2));
                return;
            case 3:
                builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(2));
                return;
            case 4:
                builder.set(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(4));
                break;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo55627a(int i, int i2) {
        StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) this.f55605k.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
        Size[] outputSizes = streamConfigurationMap.getOutputSizes(256);
        ArrayList arrayList = new ArrayList();
        for (Size size : outputSizes) {
            arrayList.add(new TEFrameSizei(size.getWidth(), size.getHeight()));
        }
        if (this.f55602h.f55736o) {
            this.f55602h.f55732k = C20642j.m68411a((List<TEFrameSizei>) arrayList, this.f55602h.f55731j, this.f55602h.f55734m);
            StringBuilder sb = new StringBuilder("takePicture size: ");
            sb.append(this.f55602h.f55732k.toString());
            C20652m.m68434a("TEImage2Mode", sb.toString());
            this.f55546d = ImageReader.newInstance(this.f55602h.f55732k.f55535a, this.f55602h.f55732k.f55536b, 256, 1);
        } else {
            TEFrameSizei tEFrameSizei = null;
            if (this.f55613s != null) {
                Size[] outputSizes2 = streamConfigurationMap.getOutputSizes(SurfaceTexture.class);
                ArrayList arrayList2 = new ArrayList();
                for (Size size2 : outputSizes2) {
                    arrayList2.add(new TEFrameSizei(size2.getWidth(), size2.getHeight()));
                }
                tEFrameSizei = this.f55613s.mo55583a(arrayList, arrayList2);
            }
            if (tEFrameSizei != null) {
                this.f55602h.f55732k = tEFrameSizei;
                this.f55546d = ImageReader.newInstance(this.f55602h.f55732k.f55535a, this.f55602h.f55732k.f55536b, 256, 1);
            } else {
                this.f55602h.f55732k = C20642j.m68412a((List<TEFrameSizei>) arrayList, this.f55602h.f55731j, new TEFrameSizei(i, i2));
                this.f55546d = ImageReader.newInstance(this.f55602h.f55732k.f55535a, this.f55602h.f55732k.f55536b, 35, 1);
            }
        }
        this.f55546d.setOnImageAvailableListener(new OnImageAvailableListener() {
            public final void onImageAvailable(ImageReader imageReader) {
                ETEPixelFormat eTEPixelFormat;
                Image acquireNextImage = imageReader.acquireNextImage();
                if (acquireNextImage != null) {
                    int width = acquireNextImage.getWidth();
                    int height = acquireNextImage.getHeight();
                    C20654n nVar = new C20654n(acquireNextImage.getPlanes());
                    if (acquireNextImage.getFormat() == 256) {
                        eTEPixelFormat = ETEPixelFormat.PIXEL_FORMAT_JPEG;
                    } else {
                        eTEPixelFormat = ETEPixelFormat.PIXEL_FORMAT_YUV420;
                    }
                    TECameraFrame tECameraFrame = new TECameraFrame(nVar, eTEPixelFormat, width, height);
                    if (C20554c.this.f55547e != null) {
                        C20554c.this.f55547e.mo55814a(tECameraFrame, C20554c.this.f55601g);
                    }
                    acquireNextImage.close();
                }
            }
        }, this.f55604j);
    }

    /* renamed from: a */
    public final void mo55628a(int i, int i2, C20638f fVar) {
        super.mo55628a(i, i2, fVar);
        this.f55547e = fVar;
        try {
            if (i != this.f55602h.f55732k.f55535a || i2 != this.f55602h.f55732k.f55536b) {
                mo55636g();
                this.f55547e = fVar;
                mo55627a(i, i2);
                ArrayList arrayList = new ArrayList();
                arrayList.add(this.f55601g.f55654n.mo55760c());
                arrayList.add(this.f55546d.getSurface());
                this.f55608n.addTarget(this.f55601g.f55654n.mo55760c());
                this.f55544b.createCaptureSession(arrayList, new StateCallback() {
                    public final void onConfigured(CameraCaptureSession cameraCaptureSession) {
                        C20554c.this.f55617w.onConfigured(cameraCaptureSession);
                        C20554c.this.mo55632c();
                    }

                    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
                        C20554c.this.f55617w.onConfigureFailed(cameraCaptureSession);
                        if (C20554c.this.f55547e != null) {
                            C20554c.this.f55547e.mo55814a(null, C20554c.this.f55601g);
                        }
                    }
                }, this.f55604j);
            } else if (this.f55602h.f55721B == 0 || this.f55602h.f55721B == 2) {
                mo55634e();
            } else {
                mo55632c();
            }
        } catch (Exception e) {
            this.f55604j.post(new Runnable() {
                public final void run() {
                    if (C20554c.this.f55547e != null) {
                        C20554c.this.f55547e.mo55815a(e);
                    }
                }
            });
        }
    }

    public C20554c(C20599e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
        this.f55548y = new CaptureCallback() {
            /* renamed from: a */
            private void m68065a(CaptureResult captureResult, boolean z) {
                switch (C20554c.this.f55545c) {
                    case 0:
                        return;
                    case 1:
                        Integer num = (Integer) captureResult.get(CaptureResult.CONTROL_AF_STATE);
                        if (num == null || num.intValue() == 0) {
                            C20554c.this.mo55634e();
                            return;
                        } else if (4 == num.intValue() || 5 == num.intValue()) {
                            Integer num2 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                            if (num2 == null || num2.intValue() == 2) {
                                C20554c.this.f55545c = 4;
                                C20554c.this.mo55634e();
                                break;
                            } else {
                                C20554c.this.mo55630b();
                                return;
                            }
                        } else if (z) {
                            C20652m.m68435b("TEImage2Mode", "No Focus");
                            C20554c.this.mo55634e();
                            return;
                        }
                        break;
                    case 2:
                        Integer num3 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num3 == null || num3.intValue() == 5) {
                            C20554c.this.mo55634e();
                            C20554c.this.f55545c = 4;
                            return;
                        } else if (num3.intValue() == 4) {
                            C20554c.this.f55545c = 3;
                            return;
                        }
                        break;
                    case 3:
                        Integer num4 = (Integer) captureResult.get(CaptureResult.CONTROL_AE_STATE);
                        if (num4 == null || num4.intValue() != 5) {
                            C20554c.this.f55545c = 4;
                            C20554c.this.mo55634e();
                            break;
                        }
                }
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
                m68065a(totalCaptureResult, true);
            }

            public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
                super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
                m68065a(captureResult, false);
            }
        };
        this.f55615u = new C20567d(this);
    }
}
