package com.p280ss.android.ttvecamera.p915b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.params.MeteringRectangle;
import com.p280ss.android.ttvecamera.p915b.C20563a.C20564a;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.b.c */
public class C20566c implements C20563a {

    /* renamed from: a */
    protected C20564a f55566a;

    /* renamed from: a */
    public CaptureCallback mo55650a(Builder builder) {
        return null;
    }

    /* renamed from: a */
    public CaptureCallback mo55651a(Builder builder, AtomicBoolean atomicBoolean) {
        return null;
    }

    /* renamed from: b */
    public int mo55652b(Builder builder, Rect rect) {
        return 0;
    }

    /* renamed from: a */
    public final int mo55648a() {
        return this.f55566a.mo55637h();
    }

    public C20566c(C20564a aVar) {
        this.f55566a = aVar;
    }

    /* renamed from: a */
    public int mo55649a(Builder builder, Rect rect) {
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(0));
        builder.set(CaptureRequest.CONTROL_AF_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_AE_REGIONS, new MeteringRectangle[]{new MeteringRectangle(rect, 999)});
        builder.set(CaptureRequest.CONTROL_MODE, Integer.valueOf(1));
        builder.set(CaptureRequest.CONTROL_AF_MODE, Integer.valueOf(1));
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, Integer.valueOf(1));
        builder.setTag("FOCUS_TAG");
        return 0;
    }
}
