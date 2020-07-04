package com.p280ss.android.ttvecamera.p917d;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics.Key;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.lang.reflect.InvocationTargetException;

/* renamed from: com.ss.android.ttvecamera.d.i */
public final class C20598i extends C20590c {

    /* renamed from: c */
    public static final Key<byte[]> f55635c = m68202c("com.vivo.chi.override.CameraType", byte[].class);

    /* renamed from: d */
    public static final CaptureRequest.Key<Float> f55636d = m68200a("vivo.control.zoom_ratio", Float.class);

    /* renamed from: e */
    public static final CaptureResult.Key<String> f55637e = m68201b("vivo.feedback.MasterCameraId", String.class);

    /* renamed from: b */
    public final String mo55726b() {
        return "Wide";
    }

    /* renamed from: a */
    public final boolean mo55725a() {
        CameraManager cameraManager = (CameraManager) this.f55629b.getSystemService("camera");
        try {
            for (String cameraCharacteristics : cameraManager.getCameraIdList()) {
                if (new String((byte[]) cameraManager.getCameraCharacteristics(cameraCharacteristics).get(f55635c)).trim().equals("Wide")) {
                    return true;
                }
            }
            return false;
        } catch (CameraAccessException unused) {
            return false;
        }
    }

    public C20598i(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static CaptureRequest.Key m68200a(String str, Class cls) {
        try {
            return (CaptureRequest.Key) CaptureRequest.Key.class.getDeclaredConstructor(new Class[]{String.class, Class.class}).newInstance(new Object[]{str, cls});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static CaptureResult.Key m68201b(String str, Class cls) {
        try {
            return (CaptureResult.Key) CaptureResult.Key.class.getDeclaredConstructor(new Class[]{String.class, Class.class}).newInstance(new Object[]{str, cls});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static Key m68202c(String str, Class cls) {
        try {
            return (Key) Key.class.getDeclaredConstructor(new Class[]{String.class, Class.class}).newInstance(new Object[]{str, cls});
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static int m68198a(TotalCaptureResult totalCaptureResult, int i) {
        String str = (String) totalCaptureResult.get(f55637e);
        if (str == null) {
            str = "Master";
        }
        char c = 65535;
        int hashCode = str.hashCode();
        if (hashCode != -1997400446) {
            if (hashCode != -1720721720) {
                if (hashCode != 2602954) {
                    if (hashCode == 2695923 && str.equals("Wide")) {
                        c = 1;
                    }
                } else if (str.equals("Tele")) {
                    c = 2;
                }
            } else if (str.equals("Periscope")) {
                c = 3;
            }
        } else if (str.equals("Master")) {
            c = 0;
        }
        switch (c) {
            case 1:
                return 2;
            case 2:
            case 3:
                return 3;
            default:
                return i;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0069  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int m68199a(java.lang.String r7, int r8) {
        /*
            if (r7 != 0) goto L_0x0004
            java.lang.String r7 = "Master"
        L_0x0004:
            java.lang.String r0 = "Tele"
            boolean r0 = r7.equals(r0)
            if (r0 != 0) goto L_0x0014
            java.lang.String r0 = "Periscope"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x0016
        L_0x0014:
            java.lang.String r7 = "Tele"
        L_0x0016:
            int r0 = r7.hashCode()
            r1 = -1997400446(0xffffffff88f21682, float:-1.4570137E-33)
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = -1
            if (r0 == r1) goto L_0x0052
            r1 = 81862(0x13fc6, float:1.14713E-40)
            if (r0 == r1) goto L_0x0048
            r1 = 2602954(0x27b7ca, float:3.647515E-39)
            if (r0 == r1) goto L_0x003e
            r1 = 2695923(0x2922f3, float:3.777793E-39)
            if (r0 == r1) goto L_0x0034
            goto L_0x005c
        L_0x0034:
            java.lang.String r0 = "Wide"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x005c
            r7 = 2
            goto L_0x005d
        L_0x003e:
            java.lang.String r0 = "Tele"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x005c
            r7 = 3
            goto L_0x005d
        L_0x0048:
            java.lang.String r0 = "SAT"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x005c
            r7 = 0
            goto L_0x005d
        L_0x0052:
            java.lang.String r0 = "Master"
            boolean r7 = r7.equals(r0)
            if (r7 == 0) goto L_0x005c
            r7 = 1
            goto L_0x005d
        L_0x005c:
            r7 = -1
        L_0x005d:
            switch(r7) {
                case 0: goto L_0x0069;
                case 1: goto L_0x0064;
                case 2: goto L_0x0062;
                case 3: goto L_0x006a;
                default: goto L_0x0060;
            }
        L_0x0060:
            r2 = -1
            goto L_0x006a
        L_0x0062:
            r2 = 2
            goto L_0x006a
        L_0x0064:
            if (r8 != r5) goto L_0x0067
            goto L_0x0060
        L_0x0067:
            r2 = 1
            goto L_0x006a
        L_0x0069:
            r2 = 0
        L_0x006a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttvecamera.p917d.C20598i.m68199a(java.lang.String, int):int");
    }
}
