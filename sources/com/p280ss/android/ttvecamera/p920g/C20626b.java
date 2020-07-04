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
import com.p280ss.android.ttvecamera.p914a.C20554c;
import com.p280ss.android.ttvecamera.p917d.C20590c;
import com.p280ss.android.ttvecamera.p917d.C20598i;
import com.p280ss.android.ttvecamera.p919f.C20613c;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: com.ss.android.ttvecamera.g.b */
public final class C20626b extends C20554c {

    /* renamed from: A */
    private Surface f55701A;

    /* renamed from: B */
    private MediaCodec f55702B;

    /* renamed from: C */
    private CaptureCallback f55703C = new CaptureCallback() {
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
            C20652m.m68437d("TEImage2Mode", sb.toString());
        }

        public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
            super.onCaptureCompleted(cameraCaptureSession, captureRequest, totalCaptureResult);
            if (C20626b.this.f55602h.f55726e != 1) {
                int a = C20598i.m68198a(totalCaptureResult, C20626b.this.f55602h.f55726e);
                if (a != C20626b.this.f55704y) {
                    C20626b.this.f55704y = a;
                    if (C20626b.this.f55614t != null) {
                        C20626b.this.f55614t.mo55584a(a, C20626b.this.f55705z);
                    }
                }
            }
            if (C20626b.this.f55610p) {
                C20626b.this.f55610p = C20642j.m68416a((Object) totalCaptureResult);
            }
        }

        public final void onCaptureBufferLost(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, Surface surface, long j) {
            super.onCaptureBufferLost(cameraCaptureSession, captureRequest, surface, j);
        }

        public final void onCaptureStarted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, long j, long j2) {
            super.onCaptureStarted(cameraCaptureSession, captureRequest, j, j2);
        }
    };

    /* renamed from: y */
    public int f55704y = -1;

    /* renamed from: z */
    public float f55705z;

    /* renamed from: g */
    public final void mo55636g() {
        if (this.f55702B != null) {
            this.f55702B.release();
            this.f55701A.release();
            this.f55702B = null;
            this.f55701A = null;
        }
        super.mo55636g();
    }

    /* renamed from: p */
    private void m68372p() {
        try {
            this.f55702B = MediaCodec.createEncoderByType("video/avc");
            TEFrameSizei tEFrameSizei = this.f55602h.f55731j;
            MediaFormat createVideoFormat = MediaFormat.createVideoFormat("video/avc", tEFrameSizei.f55535a, tEFrameSizei.f55536b);
            createVideoFormat.setInteger("bitrate", 6000000);
            createVideoFormat.setInteger("frame-rate", 30);
            createVideoFormat.setInteger("i-frame-interval", 1);
            this.f55702B.configure(createVideoFormat, null, null, 1);
            this.f55701A = this.f55702B.createInputSurface();
        } catch (Exception unused) {
            C20652m.m68437d("TEImage2Mode", "create mediaCodec fail");
            this.f55701A = null;
        }
    }

    /* renamed from: f */
    public final int mo55635f() throws Exception {
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
        this.f55608n.addTarget(this.f55546d.getSurface());
        if (this.f55602h.f55726e == 0) {
            if (this.f55701A == null) {
                m68372p();
            }
            if (this.f55701A != null) {
                arrayList.add(this.f55701A);
            } else {
                C20652m.m68437d("TEImage2Mode", "startPreview: mMediaCodecSurface is null");
                return -1;
            }
        }
        arrayList.add(this.f55546d.getSurface());
        this.f55608n.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(4));
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
            C20652m.m68434a("TEImage2Mode", sb.toString());
            this.f55603i.mo55727a(this.f55605k, this.f55608n, this.f55602h.f55720A);
        }
        this.f55608n.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        if (C20590c.m68180d(this.f55605k)) {
            this.f55608n.set(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, Integer.valueOf(1));
        }
        this.f55608n.set(CaptureRequest.SCALER_CROP_REGION, mo55704a(1.0f));
        this.f55608n.set(C20598i.f55636d, Float.valueOf(1.0f));
        this.f55607m = this.f55608n.build();
        this.f55616v.setRepeatingRequest(this.f55607m, this.f55703C, this.f55604j);
        this.f55602h.f55727f = ((Integer) this.f55605k.get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        this.f55601g.mo55731e(3);
        mo55714o();
        C20652m.m68434a("TEImage2Mode", "send capture request...");
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
                this.f55616v.setRepeatingRequest(this.f55607m, this.f55703C, this.f55604j);
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
        C20652m.m68435b("TEImage2Mode", sb.toString());
        StringBuilder sb2 = new StringBuilder("calculateZoomSize:crop  ");
        sb2.append(rect2.width());
        sb2.append("----");
        sb2.append(rect2.height());
        C20652m.m68435b("TEImage2Mode", sb2.toString());
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
            if (C20598i.m68199a(new String((byte[]) cameraCharacteristics.get(C20598i.f55635c)).trim(), ((Integer) cameraCharacteristics.get(CameraCharacteristics.LENS_FACING)).intValue()) == i) {
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
        C20652m.m68434a("TEImage2Mode", sb.toString());
        StringBuilder sb2 = new StringBuilder("selectCamera cameraTag: ");
        sb2.append(str);
        C20652m.m68434a("TEImage2Mode", sb2.toString());
        this.f55605k = this.f55543a.getCameraCharacteristics(str);
        return str;
    }

    /* renamed from: a */
    public final int mo55699a(float f, C20641i iVar) {
        if (f > this.f55611q) {
            f = this.f55611q;
        }
        if (f < 1.0f) {
            f = 1.0f;
        }
        Rect a = mo55704a(f);
        this.f55705z = f;
        this.f55608n.set(CaptureRequest.SCALER_CROP_REGION, a);
        this.f55608n.set(C20598i.f55636d, Float.valueOf(f));
        try {
            this.f55607m = this.f55608n.build();
            this.f55616v.setRepeatingRequest(this.f55607m, this.f55703C, null);
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

    public C20626b(C20599e eVar, Context context, CameraManager cameraManager, Handler handler) {
        super(eVar, context, cameraManager, handler);
    }
}
