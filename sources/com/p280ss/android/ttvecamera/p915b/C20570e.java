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
import com.p280ss.android.ttvecamera.C20642j;
import com.p280ss.android.ttvecamera.C20652m;
import com.p280ss.android.ttvecamera.p915b.C20563a.C20564a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.b.e */
public final class C20570e implements C20563a {

    /* renamed from: a */
    public C20564a f55571a;

    /* renamed from: b */
    public AtomicBoolean f55572b;

    /* renamed from: c */
    public boolean f55573c = true;

    /* renamed from: a */
    public final int mo55648a() {
        return this.f55571a.mo55637h();
    }

    public C20570e(C20564a aVar) {
        this.f55571a = aVar;
    }

    /* renamed from: a */
    public final CaptureCallback mo55650a(Builder builder) {
        return new CaptureCallback() {
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                StringBuilder sb = new StringBuilder("Manual Metering Failed: ");
                sb.append(captureFailure);
                C20652m.m68437d("Camera2VideoFocus", sb.toString());
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE);
                if (num == null) {
                    C20652m.m68436c("Camera2VideoFocus", "metering failed.");
                    return;
                }
                if (num.intValue() == 3 || num.intValue() == 2) {
                    C20570e.this.f55571a.mo55638i();
                }
                if (C20570e.this.f55573c) {
                    C20570e.this.f55573c = C20642j.m68416a((Object) totalCaptureResult);
                }
            }
        };
    }

    /* renamed from: a */
    public final CaptureCallback mo55651a(Builder builder, AtomicBoolean atomicBoolean) {
        this.f55572b = atomicBoolean;
        return new CaptureCallback() {
            public final void onCaptureFailed(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, CaptureFailure captureFailure) {
                super.onCaptureFailed(cameraCaptureSession, captureRequest, captureFailure);
                StringBuilder sb = new StringBuilder("Manual Focus Failed: ");
                sb.append(captureFailure);
                C20652m.m68437d("Camera2VideoFocus", sb.toString());
                if (C20570e.this.f55572b != null) {
                    C20570e.this.f55572b.set(false);
                }
            }

            public final void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, TotalCaptureResult totalCaptureResult) {
                if (captureRequest == null || captureRequest.getTag() != "FOCUS_TAG") {
                    C20652m.m68436c("Camera2VideoFocus", "Not focus request!");
                    return;
                }
                Integer num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num == null) {
                    C20652m.m68436c("Camera2VideoFocus", "Focus failed.");
                    return;
                }
                if (num.intValue() == 4 || num.intValue() == 5) {
                    if (C20570e.this.f55572b != null) {
                        C20570e.this.f55572b.set(false);
                    }
                    C20570e.this.f55571a.mo55637h();
                    C20652m.m68434a("Camera2VideoFocus", "Focus done");
                }
                if (C20570e.this.f55573c) {
                    C20570e.this.f55573c = C20642j.m68416a((Object) totalCaptureResult);
                }
            }
        };
    }

    /* renamed from: b */
    public final int mo55652b(Builder builder, Rect rect) {
        builder.setTag("FOCUS_TAG");
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        return 0;
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
}
