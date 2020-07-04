package com.p280ss.android.ttvecamera.p915b;

import android.graphics.Rect;
import android.hardware.camera2.CameraCaptureSession.CaptureCallback;
import android.hardware.camera2.CaptureRequest.Builder;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.ss.android.ttvecamera.b.a */
public interface C20563a {

    /* renamed from: com.ss.android.ttvecamera.b.a$a */
    public interface C20564a {
        /* renamed from: h */
        int mo55637h();

        /* renamed from: i */
        int mo55638i();
    }

    /* renamed from: a */
    int mo55648a();

    /* renamed from: a */
    int mo55649a(Builder builder, Rect rect);

    /* renamed from: a */
    CaptureCallback mo55650a(Builder builder);

    /* renamed from: a */
    CaptureCallback mo55651a(Builder builder, AtomicBoolean atomicBoolean);

    /* renamed from: b */
    int mo55652b(Builder builder, Rect rect);
}
