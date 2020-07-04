package com.p280ss.android.ttvecamera.p915b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build.VERSION;
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.p915b.C20563a.C20564a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.b.d */
public final class C20567d extends C20566c {

    /* renamed from: b */
    public AtomicBoolean f55567b;

    /* renamed from: c */
    public boolean f55568c = true;

    public C20567d(C20564a aVar) {
        super(aVar);
    }

    /* renamed from: a */
    public final CaptureCallback mo55650a(Builder builder) {
        return new CaptureCallback() {
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                StringBuilder sb = new StringBuilder("Manual Metering Failed: ");
                sb.append(captureFailure);
                C20652m.m68437d("Camera2ImageFocus", sb.toString());
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    C20652m.m68436c("Camera2ImageFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    C20567d.this.f55566a.mo55638i();
                }
                if (C20567d.this.f55568c) {
                    C20567d.this.f55568c = C20642j.m68416a((Object) totalCaptureResult);
                }
            }
        };
    }

    /* renamed from: a */
    public final CaptureCallback mo55651a(Builder builder, AtomicBoolean atomicBoolean) {
        this.f55567b = atomicBoolean;
        return new CaptureCallback() {
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                StringBuilder sb = new StringBuilder("Manual Focus Failed: ");
                sb.append(captureFailure);
                C20652m.m68437d("Camera2ImageFocus", sb.toString());
                if (C20567d.this.f55567b != null) {
                    C20567d.this.f55567b.set(false);
                }
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (captureRequest == null || captureRequest.getTag() != "FOCUS_TAG") {
                    C20652m.m68436c("Camera2ImageFocus", "Not focus request!");
                    return;
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    C20652m.m68436c("Camera2ImageFocus", "Focus failed.");
                    return;
                }
                if (num.intValue() == 4 || num.intValue() == 5) {
                    if (C20567d.this.f55567b != null) {
                        C20567d.this.f55567b.set(false);
                    }
                    C20567d.this.f55566a.mo55637h();
                    C20652m.m68434a("Camera2ImageFocus", "Focus done");
                }
                if (C20567d.this.f55568c) {
                    C20567d.this.f55568c = C20642j.m68416a((Object) totalCaptureResult);
                }
            }
        };
    }

    /* renamed from: a */
    public final int mo55649a(Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
        builder.setTag("FOCUS_TAG");
        return 0;
    }

    /* renamed from: b */
    public final int mo55652b(Builder builder, Rect rect) {
        if (VERSION.SDK_INT >= 23) {
            builder.set(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, Integer.valueOf(2));
        }
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        return 0;
    }
}
