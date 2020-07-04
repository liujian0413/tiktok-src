package com.p280ss.android.ttvecamera.p917d;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest.Builder;
import com.miui.camera.C18608a;
import com.miui.camera.C18610b;

/* renamed from: com.ss.android.ttvecamera.d.g */
public final class C20595g extends C20590c {
    /* renamed from: a */
    public final boolean mo55725a() {
        return true;
    }

    /* renamed from: c */
    public final boolean mo55730c(CameraCharacteristics cameraCharacteristics) {
        return true;
    }

    /* renamed from: b */
    public final String mo55726b() {
        return m68191b(21);
    }

    public C20595g(Context context) {
        super(context);
    }

    /* renamed from: b */
    public static String m68191b(int i) {
        return C18608a.m61034a(21);
    }

    /* renamed from: a */
    public final int mo55727a(CameraCharacteristics cameraCharacteristics, Builder builder, boolean z) {
        C18610b.m61041a(builder, cameraCharacteristics, z);
        return 0;
    }
}
