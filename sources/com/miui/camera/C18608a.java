package com.miui.camera;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraDevice.StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest.Builder;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.os.Handler;
import android.os.Looper;
import android.support.p022v4.util.C0903j;
import android.view.Surface;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.miui.camera.a */
public class C18608a {

    /* renamed from: a */
    private static final String f50289a = "a";

    /* renamed from: b */
    private static String f50290b = "0";

    /* renamed from: c */
    private static String f50291c = "1";

    /* renamed from: d */
    private static String f50292d = "21";

    /* renamed from: com.miui.camera.a$a */
    static class C18609a implements Executor {

        /* renamed from: a */
        private final Handler f50293a;

        public final void execute(Runnable runnable) {
            this.f50293a.post(runnable);
        }

        public C18609a(Handler handler) {
            this.f50293a = (Handler) C0903j.m3840a(handler);
        }
    }

    private C18608a() {
    }

    /* renamed from: a */
    private static Executor m61035a(Handler handler) {
        return new C18609a(m61039b(handler));
    }

    /* renamed from: a */
    public static String m61034a(int i) {
        if (i == 21) {
            return f50292d;
        }
        switch (i) {
            case 0:
                return f50290b;
            case 1:
                return f50291c;
            default:
                return "0";
        }
    }

    /* renamed from: b */
    private static Handler m61039b(Handler handler) {
        if (handler != null) {
            return handler;
        }
        Looper myLooper = Looper.myLooper();
        if (myLooper != null) {
            return new Handler(myLooper);
        }
        throw new IllegalArgumentException("No handler given, and current thread has no looper!");
    }

    /* renamed from: a */
    public static void m61037a(CameraCaptureSession cameraCaptureSession, Builder builder) {
        if (C18610b.m61043a(builder)) {
            C18610b.m61042a(builder, false);
            try {
                cameraCaptureSession.capture(builder.build(), null, null);
            } catch (CameraAccessException unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m61036a(int i, StateCallback stateCallback, Handler handler, CameraManager cameraManager) throws CameraAccessException {
        cameraManager.openCamera(m61034a(i), stateCallback, handler);
    }

    /* renamed from: b */
    private static void m61040b(List<OutputConfiguration> list, CameraCaptureSession.StateCallback stateCallback, Handler handler, CameraDevice cameraDevice, int i) throws CameraAccessException {
        cameraDevice.createCaptureSession(new SessionConfiguration(i, list, m61035a(handler), stateCallback));
    }

    /* renamed from: a */
    public static void m61038a(List<Surface> list, CameraCaptureSession.StateCallback stateCallback, Handler handler, CameraDevice cameraDevice, int i) throws CameraAccessException {
        ArrayList arrayList = new ArrayList(list.size());
        for (Surface outputConfiguration : list) {
            arrayList.add(new OutputConfiguration(outputConfiguration));
        }
        m61040b(arrayList, stateCallback, handler, cameraDevice, i);
    }
}
