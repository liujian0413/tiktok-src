package com.p280ss.android.ttvecamera.p920g;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.media.ImageReader;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.view.Surface;
import com.p280ss.android.ttvecamera.C20599e;
import com.p280ss.android.ttvecamera.C20630h;
import com.p280ss.android.ttvecamera.C20632i.C20641i;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.TEFrameSizei;
import com.p280ss.android.ttvecamera.p914a.C20561d;
import com.p280ss.android.ttvecamera.p917d.C20590c;
import com.p280ss.android.ttvecamera.p917d.C20598i;
import com.p280ss.android.ttvecamera.p919f.C20613c;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.g.c */
public final class C20628c extends C20561d {

    /* renamed from: A */
    private Surface f55707A;

    /* renamed from: B */
    private Surface f55708B;

    /* renamed from: C */
    private CaptureCallback f55709C = new CaptureCallback() {
        public final void onCaptureSequenceAborted(CameraCaptureSession cameraCaptureSession, int i) {
            super.onCaptureSequenceAborted(cameraCaptureSession, i);
        }

        public final void onCaptureProgressed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureResult captureResult) {
            super.onCaptureProgressed(cameraCaptureSession, captureRequest, captureResult);
        }

        public final void onCaptureSequenceCompleted(CameraCaptureSession cameraCaptureSession, int i, long j) {
            super.onCaptureSequenceCompleted(cameraCaptureSession, i, j);
        }

        public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
            super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
            StringBuilder sb = new StringBuilder("failure: ");
            sb.append(captureFailure);
            C20652m.m68437d("TEVivoVideoMode", sb.toString());
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (C20628c.this.f55602h.f55726e != 1) {
                int a = C20598i.m68198a(totalCaptureResult, C20628c.this.f55602h.f55726e);
                if (!(a == C20628c.this.f55710c && C20628c.this.f55711d == C20628c.this.f55712e)) {
                    C20628c.this.f55712e = C20628c.this.f55711d;
                    C20628c.this.f55710c = a;
                    if (C20628c.this.f55614t != null) {
                        C20628c.this.f55614t.mo55584a(a, C20628c.this.f55711d);
                        StringBuilder sb = new StringBuilder("SAT onChange ");
                        sb.append(a);
                        sb.append("----");
                        sb.append(C20628c.this.f55711d);
                        C20652m.m68434a("TEVivoVideoMode", sb.toString());
                    }
                }
            }
            if (C20628c.this.f55610p) {
                C20628c.this.f55610p = C20642j.m68416a((Object) totalCaptureResult);
            }
        }

        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    };

    /* renamed from: c */
    public int f55710c = -1;

    /* renamed from: d */
    public float f55711d;

    /* renamed from: e */
    public float f55712e = -1.0f;

    /* renamed from: y */
    private MediaCodec f55713y;

    /* renamed from: z */
    private ImageReader f55714z;

    /* renamed from: g */
    public final void mo55636g() {
        if (this.f55713y != null) {
            this.f55713y.release();
            this.f55707A.release();
            this.f55713y = null;
            this.f55707A = null;
        }
        if (this.f55714z != null) {
            this.f55714z.close();
            this.f55708B.release();
            this.f55714z = null;
            this.f55708B = null;
        }
        super.mo55636g();
    }

    /* renamed from: b */
    private void m68380b() {
        try {
            this.f55713y = MediaCodec.createEncoderByType("video/avc");
            TEFrameSizei tEFrameSizei = this.f55602h.f55731j;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", tEFrameSizei.f55535a, tEFrameSizei.f55536b);
            createVideoFormat.setInteger("color-format", 2130708361);
            createVideoFormat.setInteger("bitrate", 6000000);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            this.f55713y.configure(createVideoFormat, null, null, 1);
            this.f55707A = this.f55713y.createInputSurface();
            this.f55714z = ImageReader.newInstance(tEFrameSizei.f55535a, tEFrameSizei.f55536b, 256, 1);
            this.f55708B = this.f55714z.getSurface();
        } catch (Exception unused) {
            C20652m.m68437d("TEVivoVideoMode", "create mediaCodec fail");
            this.f55707A = null;
            this.f55708B = null;
        }
    }

    /* renamed from: f */
    public final int mo55635f() throws Exception {
        C20613c cVar = this.f55601g.f55654n;
        if (this.f55544b == null || cVar == null) {
            C20652m.m68435b("TEVivoVideoMode", "CameraDevice or ProviderManager is null!");
            return -100;
        }
        int k = super.mo55710k();
        if (k != 0) {
            return k;
        }
        this.f55608n = this.f55544b.createCaptureRequest(3);
        ArrayList<Surface> arrayList = new ArrayList<>();
        if (cVar.f55676b.mo55748c() == 8) {
            arrayList.addAll(Arrays.asList(cVar.mo55761d()));
        } else {
            arrayList.add(cVar.mo55760c());
        }
        for (Surface addTarget : arrayList) {
            this.f55608n.addTarget(addTarget);
        }
        if (this.f55602h.f55726e == 0) {
            if (this.f55707A == null || this.f55708B == null) {
                m68380b();
            }
            if (this.f55707A != null) {
                arrayList.add(this.f55707A);
                if (this.f55708B != null) {
                    arrayList.add(this.f55708B);
                } else {
                    C20652m.m68437d("TEVivoVideoMode", "startPreview: mImageReaderSurface is null");
                    return -1;
                }
            } else {
                C20652m.m68437d("TEVivoVideoMode", "startPreview: mMediaCodecSurface is null");
                return -1;
            }
        }
        this.f55544b.createCaptureSession(arrayList, this.f55617w, this.f55604j);
        return 0;
    }

    /* renamed from: l */
    public final int mo55711l() throws CameraAccessException {
        if (this.f55601g.f55654n == null || this.f55608n == null) {
            return -100;
        }
        this.f55600f.mo55582b(0, 0, "TECamera2 preview");
        if (this.f55603i.mo55730c(this.f55605k)) {
            StringBuilder sb = new StringBuilder("Stabilization Supported, toggle = ");
            sb.append(this.f55602h.f55720A);
            C20652m.m68434a("TEVivoVideoMode", sb.toString());
            this.f55603i.mo55727a(this.f55605k, this.f55608n, this.f55602h.f55720A);
        }
        this.f55608n.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        if (C20590c.m68180d(this.f55605k)) {
            this.f55608n.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
        }
        this.f55608n.set(CaptureRequest.SCALER_CROP_REGION, mo55704a(1.0f));
        this.f55608n.set(C20598i.f55636d, Float.valueOf(1.0f));
        this.f55607m = this.f55608n.build();
        this.f55616v.setRepeatingRequest(this.f55607m, this.f55709C, this.f55604j);
        this.f55602h.f55727f = ((Integer) this.f55605k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f55601g.mo55731e(3);
        mo55714o();
        C20652m.m68434a("TEVivoVideoMode", "send capture request...");
        return 0;
    }

    /* renamed from: c */
    public final void mo55708c(float f) {
        if (this.f55616v == null || this.f55607m == null || this.f55608n == null) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -420, "Camera info is null, may be you need reopen camera.");
            return;
        }
        try {
            Rect b = mo55707b(f);
            if (b != null) {
                this.f55616v.stopRepeating();
                this.f55608n.set(CaptureRequest.SCALER_CROP_REGION, b);
                this.f55608n.set(C20598i.f55636d, Float.valueOf(f));
                this.f55607m = this.f55608n.build();
                this.f55616v.setRepeatingRequest(this.f55607m, this.f55709C, this.f55604j);
                this.f55612r = b;
                mo55714o();
            }
        } catch (Exception e) {
            this.f55600f.mo55580a(this.f55602h.f55724c, -420, e.toString());
        }
    }

    /* renamed from: a */
    public final Rect mo55704a(float f) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f > this.f55611q) {
            f = this.f55611q;
        }
        Rect rect = (Rect) this.f55605k.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        int width = rect.width() / 2;
        int height = rect.height() / 2;
        int width2 = (int) ((((float) rect.width()) * 0.5f) / f);
        int height2 = (int) ((((float) rect.height()) * 0.5f) / f);
        Rect rect2 = new Rect(width - width2, height - height2, width + width2, height + height2);
        StringBuilder sb = new StringBuilder("calculateZoomSize:crop  ");
        sb.append(rect2.left);
        sb.append("----");
        sb.append(rect2.top);
        sb.append("----");
        sb.append(rect2.right);
        sb.append("----");
        sb.append(rect2.bottom);
        C20652m.m68435b("TEVivoVideoMode", sb.toString());
        StringBuilder sb2 = new StringBuilder("calculateZoomSize:crop  ");
        sb2.append(rect2.width());
        sb2.append("----");
        sb2.append(rect2.height());
        C20652m.m68435b("TEVivoVideoMode", sb2.toString());
        return rect2;
    }

    /* renamed from: a */
    public final String mo55625a(int i) throws CameraAccessException {
        String str;
        String[] cameraIdList = this.f55543a.getCameraIdList();
        C20630h.m68390a("te_record_camera_size", (long) cameraIdList.length);
        this.f55602h.f55726e = i;
        int length = cameraIdList.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                str = null;
                break;
            }
            str = cameraIdList[i2];
            CameraCharacteristics cameraCharacteristics = this.f55543a.getCameraCharacteristics(str);
            int a = C20598i.m68199a(new String((byte[]) cameraCharacteristics.get(C20598i.f55635c)).trim(), ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue());
            if (a != -1 && a == i) {
                break;
            }
            i2++;
        }
        if (str == null) {
            str = "0";
            this.f55602h.f55726e = 0;
        }
        this.f55602h.f55743v = str;
        StringBuilder sb = new StringBuilder("selectCamera mCameraSettings.mFacing: ");
        sb.append(this.f55602h.f55726e);
        C20652m.m68434a("TEVivoVideoMode", sb.toString());
        StringBuilder sb2 = new StringBuilder("selectCamera cameraTag: ");
        sb2.append(str);
        C20652m.m68434a("TEVivoVideoMode", sb2.toString());
        this.f55605k = this.f55543a.getCameraCharacteristics(str);
        return str;
    }

    /* renamed from: a */
    public final int mo55699a(float f, C20641i iVar) {
        if (f < 1.0f) {
            f = 1.0f;
        }
        if (f > this.f55611q) {
            f = this.f55611q;
        }
        Rect a = mo55704a(f);
        this.f55711d = f;
        this.f55608n.set(CaptureRequest.SCALER_CROP_REGION, a);
        this.f55608n.set(C20598i.f55636d, Float.valueOf(f));
        try {
            this.f55607m = this.f55608n.build();
            this.f55616v.setRepeatingRequest(this.f55607m, this.f55709C, null);
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

    public C20628c(C20599e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
    }
}
