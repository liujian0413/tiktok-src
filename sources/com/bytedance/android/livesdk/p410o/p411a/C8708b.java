package com.bytedance.android.livesdk.p410o.p411a;

import android.content.Context;
import android.hardware.Camera;
import com.bytedance.android.livesdk.p410o.p412b.C8718a;
import com.bytedance.android.livesdk.p410o.p413c.C8727e;
import java.lang.reflect.Field;

/* renamed from: com.bytedance.android.livesdk.o.a.b */
public final class C8708b implements C8710d {

    /* renamed from: a */
    private static C8718a f23718a;

    /* renamed from: b */
    private static C8718a m26027b() {
        return f23718a;
    }

    /* renamed from: c */
    private static Camera m26028c() {
        try {
            return m26024a(1);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m26025a() {
        Camera c = m26028c();
        if (c == null) {
            return false;
        }
        Field field = null;
        try {
            field = c.getClass().getDeclaredField("mHasPermission");
        } catch (NoSuchFieldException unused) {
        }
        if (field == null) {
            c.release();
            return true;
        }
        try {
            field.setAccessible(true);
            return field.getBoolean(c);
        } catch (IllegalAccessException unused2) {
            return true;
        } finally {
            c.release();
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0030 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x002d A[SYNTHETIC, Splitter:B:17:0x002d] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.hardware.Camera m26024a(int r4) {
        /*
            int r4 = android.hardware.Camera.getNumberOfCameras()
            r0 = 0
        L_0x0005:
            r1 = 0
            if (r0 >= r4) goto L_0x0035
            android.hardware.Camera$CameraInfo r2 = new android.hardware.Camera$CameraInfo
            r2.<init>()
            android.hardware.Camera.getCameraInfo(r0, r2)
            int r2 = r2.facing
            r3 = 1
            if (r2 == r3) goto L_0x001b
            if (r4 != r3) goto L_0x0018
            goto L_0x001b
        L_0x0018:
            int r0 = r0 + 1
            goto L_0x0005
        L_0x001b:
            android.hardware.Camera r4 = android.hardware.Camera.open(r0)     // Catch:{ RuntimeException -> 0x002a }
            if (r4 == 0) goto L_0x0028
            android.hardware.Camera$Parameters r0 = r4.getParameters()     // Catch:{ RuntimeException -> 0x002b }
            r4.setParameters(r0)     // Catch:{ RuntimeException -> 0x002b }
        L_0x0028:
            r1 = r4
            goto L_0x0035
        L_0x002a:
            r4 = r1
        L_0x002b:
            if (r4 == 0) goto L_0x0030
            r4.release()     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            android.hardware.Camera r4 = android.hardware.Camera.open()     // Catch:{ Exception -> 0x0035 }
            goto L_0x0028
        L_0x0035:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.p410o.p411a.C8708b.m26024a(int):android.hardware.Camera");
    }

    /* renamed from: a */
    private static boolean m26026a(Context context) {
        if (f23718a == null) {
            return m26025a();
        }
        if (!C8727e.m26082c().mo21731b() || !m26027b().mo21727a()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo21711a(Context context, String str) {
        return m26026a(context);
    }
}
