package com.miui.camera;

import android.hardware.camera2.CaptureRequest.Key;
import android.hardware.camera2.CaptureResult;
import java.lang.reflect.Constructor;

/* renamed from: com.miui.camera.c */
public final class C18611c {

    /* renamed from: a */
    private static Constructor<Key> f50295a;

    /* renamed from: b */
    private static Constructor<CaptureResult.Key> f50296b;

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> android.hardware.camera2.CaptureRequest.Key<T> m61044a(java.lang.String r6, java.lang.Class<T> r7) {
        /*
            java.lang.reflect.Constructor<android.hardware.camera2.CaptureRequest$Key> r0 = f50295a     // Catch:{  }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L_0x001e
            java.lang.Class<android.hardware.camera2.CaptureRequest$Key> r0 = android.hardware.camera2.CaptureRequest.Key.class
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch:{  }
            java.lang.Class r5 = r7.getClass()     // Catch:{  }
            r4[r3] = r5     // Catch:{  }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r4)     // Catch:{  }
            f50295a = r0     // Catch:{  }
            r0.setAccessible(r3)     // Catch:{  }
        L_0x001e:
            java.lang.reflect.Constructor<android.hardware.camera2.CaptureRequest$Key> r0 = f50295a     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x002d }
            r2[r1] = r6     // Catch:{ NoSuchMethodException -> 0x002d }
            r2[r3] = r7     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object r6 = r0.newInstance(r2)     // Catch:{ NoSuchMethodException -> 0x002d }
            android.hardware.camera2.CaptureRequest$Key r6 = (android.hardware.camera2.CaptureRequest.Key) r6     // Catch:{ NoSuchMethodException -> 0x002d }
            return r6
        L_0x002d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.camera.C18611c.m61044a(java.lang.String, java.lang.Class):android.hardware.camera2.CaptureRequest$Key");
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static <T> android.hardware.camera2.CaptureResult.Key<T> m61045b(java.lang.String r6, java.lang.Class<T> r7) {
        /*
            java.lang.reflect.Constructor<android.hardware.camera2.CaptureResult$Key> r0 = f50296b     // Catch:{  }
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 != 0) goto L_0x001e
            java.lang.Class<android.hardware.camera2.CaptureResult$Key> r0 = android.hardware.camera2.CaptureResult.Key.class
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch:{  }
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r1] = r5     // Catch:{  }
            java.lang.Class r5 = r7.getClass()     // Catch:{  }
            r4[r3] = r5     // Catch:{  }
            java.lang.reflect.Constructor r0 = r0.getConstructor(r4)     // Catch:{  }
            f50296b = r0     // Catch:{  }
            r0.setAccessible(r3)     // Catch:{  }
        L_0x001e:
            java.lang.reflect.Constructor<android.hardware.camera2.CaptureResult$Key> r0 = f50296b     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ NoSuchMethodException -> 0x002d }
            r2[r1] = r6     // Catch:{ NoSuchMethodException -> 0x002d }
            r2[r3] = r7     // Catch:{ NoSuchMethodException -> 0x002d }
            java.lang.Object r6 = r0.newInstance(r2)     // Catch:{ NoSuchMethodException -> 0x002d }
            android.hardware.camera2.CaptureResult$Key r6 = (android.hardware.camera2.CaptureResult.Key) r6     // Catch:{ NoSuchMethodException -> 0x002d }
            return r6
        L_0x002d:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miui.camera.C18611c.m61045b(java.lang.String, java.lang.Class):android.hardware.camera2.CaptureResult$Key");
    }
}
