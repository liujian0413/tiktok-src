package com.p280ss.android.ugc.aweme.utils.permission;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;

/* renamed from: com.ss.android.ugc.aweme.utils.permission.f */
public class C43162f {

    /* renamed from: a */
    public static final String f111787a = "f";

    /* renamed from: b */
    private static final C43165c f111788b;

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.f$a */
    static class C43163a implements C43165c {
        C43163a() {
        }

        /* renamed from: a */
        public int mo104779a(Context context) {
            return 0;
        }

        /* renamed from: c */
        public int mo104781c(Context context) {
            return 0;
        }

        /* renamed from: d */
        public int mo104782d(Context context) {
            return 0;
        }

        /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0011 */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private static void m136890a(android.hardware.Camera r1) {
            /*
                r0 = 0
                r1.setPreviewTexture(r0)     // Catch:{ IOException | RuntimeException -> 0x0011, all -> 0x000c }
                r1.stopPreview()     // Catch:{ IOException | RuntimeException -> 0x0011, all -> 0x000c }
                r1.release()     // Catch:{ Exception -> 0x000b }
                return
            L_0x000b:
                return
            L_0x000c:
                r0 = move-exception
                r1.release()     // Catch:{ Exception -> 0x0010 }
            L_0x0010:
                throw r0
            L_0x0011:
                r1.release()     // Catch:{ Exception -> 0x0015 }
                return
            L_0x0015:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.permission.C43162f.C43163a.m136890a(android.hardware.Camera):void");
        }

        /* JADX WARNING: Removed duplicated region for block: B:22:0x005f  */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public int mo104780b(android.content.Context r8) {
            /*
                r7 = this;
                int r8 = android.hardware.Camera.getNumberOfCameras()
                r0 = 0
                if (r8 <= 0) goto L_0x0063
                r8 = 0
                android.hardware.Camera$CameraInfo r1 = new android.hardware.Camera$CameraInfo     // Catch:{ RuntimeException -> 0x002e }
                r1.<init>()     // Catch:{ RuntimeException -> 0x002e }
                android.hardware.Camera.getCameraInfo(r0, r1)     // Catch:{ RuntimeException -> 0x002e }
                android.hardware.Camera r1 = android.hardware.Camera.open(r0)     // Catch:{ RuntimeException -> 0x002e }
                if (r1 == 0) goto L_0x0026
                android.hardware.Camera$Parameters r8 = r1.getParameters()     // Catch:{ RuntimeException -> 0x0022, all -> 0x001e }
                r1.setParameters(r8)     // Catch:{ RuntimeException -> 0x0022, all -> 0x001e }
                goto L_0x0026
            L_0x001e:
                r8 = move-exception
                r0 = r8
                r8 = r1
                goto L_0x005d
            L_0x0022:
                r8 = move-exception
                r0 = r8
                r8 = r1
                goto L_0x002f
            L_0x0026:
                if (r1 == 0) goto L_0x0064
                m136890a(r1)
                goto L_0x0064
            L_0x002c:
                r0 = move-exception
                goto L_0x005d
            L_0x002e:
                r0 = move-exception
            L_0x002f:
                java.lang.String r1 = "aweme_open_camera_error_rate"
                r2 = -1001(0xfffffffffffffc17, float:NaN)
                com.ss.android.ugc.aweme.app.g.c r3 = new com.ss.android.ugc.aweme.app.g.c     // Catch:{ all -> 0x002c }
                r3.<init>()     // Catch:{ all -> 0x002c }
                java.lang.String r4 = "errorDesc"
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x002c }
                java.lang.String r6 = "Camera permission denied. "
                r5.<init>(r6)     // Catch:{ all -> 0x002c }
                java.lang.String r0 = android.util.Log.getStackTraceString(r0)     // Catch:{ all -> 0x002c }
                r5.append(r0)     // Catch:{ all -> 0x002c }
                java.lang.String r0 = r5.toString()     // Catch:{ all -> 0x002c }
                com.ss.android.ugc.aweme.app.g.c r0 = r3.mo16887a(r4, r0)     // Catch:{ all -> 0x002c }
                org.json.JSONObject r0 = r0.mo16888b()     // Catch:{ all -> 0x002c }
                com.p280ss.android.ugc.aweme.base.C6893q.m21444a(r1, r2, r0)     // Catch:{ all -> 0x002c }
                if (r8 == 0) goto L_0x0063
                m136890a(r8)
                goto L_0x0063
            L_0x005d:
                if (r8 == 0) goto L_0x0062
                m136890a(r8)
            L_0x0062:
                throw r0
            L_0x0063:
                r0 = -1
            L_0x0064:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.utils.permission.C43162f.C43163a.mo104780b(android.content.Context):int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.f$b */
    public static class C43164b extends C43163a {
        /* renamed from: a */
        public final int mo104779a(Context context) {
            return C0683b.m2909b(context, "android.permission.RECORD_AUDIO");
        }

        /* renamed from: b */
        public final int mo104780b(Context context) {
            return C0683b.m2909b(context, "android.permission.CAMERA");
        }

        /* renamed from: c */
        public final int mo104781c(Context context) {
            return C0683b.m2909b(context, "android.permission.WRITE_EXTERNAL_STORAGE");
        }

        /* renamed from: d */
        public final int mo104782d(Context context) {
            return C0683b.m2909b(context, "android.permission.READ_PHONE_STATE");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.utils.permission.f$c */
    public interface C43165c {
        /* renamed from: a */
        int mo104779a(Context context);

        /* renamed from: b */
        int mo104780b(Context context);

        /* renamed from: c */
        int mo104781c(Context context);

        /* renamed from: d */
        int mo104782d(Context context);
    }

    /* renamed from: a */
    public static boolean m136886a() {
        if (VERSION.SDK_INT >= 23) {
            return true;
        }
        return false;
    }

    static {
        if (m136886a()) {
            f111788b = new C43164b();
        } else {
            f111788b = new C43163a();
        }
    }

    /* renamed from: a */
    public static int m136885a(Context context) {
        return f111788b.mo104780b(context);
    }

    /* renamed from: b */
    public static int m136887b(Context context) {
        return f111788b.mo104779a(context);
    }

    /* renamed from: c */
    public static int m136888c(Context context) {
        return f111788b.mo104781c(context);
    }

    /* renamed from: d */
    public static int m136889d(Context context) {
        return f111788b.mo104782d(context);
    }
}
