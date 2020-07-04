package com.bytedance.android.livesdk.utils;

import android.os.Handler;
import com.bytedance.ies.util.thread.C11081a;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.utils.ad */
public final class C9034ad {
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0032 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0033  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object m26991a(java.lang.String r16, int r17) {
        /*
            r0 = r16
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r2 = r1.exists()
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0013
        L_0x0010:
            r2 = r3
        L_0x0011:
            r1 = 1
            goto L_0x0030
        L_0x0013:
            boolean r2 = r1.isFile()
            if (r2 == 0) goto L_0x001a
            goto L_0x0010
        L_0x001a:
            java.io.File[] r1 = r1.listFiles()
            if (r1 != 0) goto L_0x0022
        L_0x0020:
            r2 = r1
            goto L_0x0011
        L_0x0022:
            int r2 = r1.length
            if (r2 != r5) goto L_0x002e
            r2 = r1[r4]     // Catch:{ Exception -> 0x0020 }
            java.lang.String r2 = r2.getPath()     // Catch:{ Exception -> 0x0020 }
            com.bytedance.android.livesdk.utils.C9077o.m27098a(r2, r0)     // Catch:{ Exception -> 0x0020 }
        L_0x002e:
            r2 = r1
            r1 = 0
        L_0x0030:
            if (r1 == 0) goto L_0x0033
            return r3
        L_0x0033:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r6 = ""
            int r7 = r2.length
            r8 = r6
            r9 = 0
            r6 = r3
            r3 = 0
        L_0x003f:
            if (r3 >= r7) goto L_0x00b4
            r10 = r2[r3]
            java.lang.String r11 = r10.getName()
            boolean r12 = r10.isDirectory()
            if (r12 == 0) goto L_0x0071
            java.io.File[] r10 = r10.listFiles()
            int r11 = r10.length
            r12 = 0
        L_0x0053:
            if (r12 >= r11) goto L_0x00b1
            r13 = r10[r12]
            java.lang.String r14 = r13.getName()
            java.lang.String r15 = ".png"
            boolean r15 = r14.contains(r15)
            if (r15 == 0) goto L_0x006e
            java.lang.String r13 = r13.getAbsolutePath()
            android.graphics.Bitmap r13 = android.graphics.BitmapFactory.decodeFile(r13)
            r1.put(r14, r13)
        L_0x006e:
            int r12 = r12 + 1
            goto L_0x0053
        L_0x0071:
            java.lang.String r12 = ".json"
            boolean r11 = r11.contains(r12)
            if (r11 == 0) goto L_0x00b1
            if (r9 != 0) goto L_0x00b1
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch:{ Exception -> 0x00b1 }
            r11.<init>(r10)     // Catch:{ Exception -> 0x00b1 }
            java.io.BufferedReader r10 = new java.io.BufferedReader     // Catch:{ Exception -> 0x00b1 }
            java.io.InputStreamReader r12 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00b1 }
            r12.<init>(r11)     // Catch:{ Exception -> 0x00b1 }
            r10.<init>(r12)     // Catch:{ Exception -> 0x00b1 }
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00b1 }
            r12.<init>()     // Catch:{ Exception -> 0x00b1 }
        L_0x008f:
            java.lang.String r13 = r10.readLine()     // Catch:{ Exception -> 0x00b1 }
            if (r13 == 0) goto L_0x0099
            r12.append(r13)     // Catch:{ Exception -> 0x00b1 }
            goto L_0x008f
        L_0x0099:
            r10.close()     // Catch:{ Exception -> 0x00b1 }
            r11.close()     // Catch:{ Exception -> 0x00b1 }
            java.lang.String r10 = r12.toString()     // Catch:{ Exception -> 0x00b1 }
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch:{ Exception -> 0x00b0 }
            java.lang.String r11 = r12.toString()     // Catch:{ Exception -> 0x00b0 }
            r8.<init>(r11)     // Catch:{ Exception -> 0x00b0 }
            r6 = r8
            r8 = r10
            r9 = 1
            goto L_0x00b1
        L_0x00b0:
            r8 = r10
        L_0x00b1:
            int r3 = r3 + 1
            goto L_0x003f
        L_0x00b4:
            com.bytedance.android.livesdk.k.l r2 = new com.bytedance.android.livesdk.k.l
            r2.<init>()
            r3 = r17
            r2.f22919a = r3
            r2.f22920b = r0
            r2.f22921c = r6
            r2.f22922d = r8
            r2.f22923e = r1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.utils.C9034ad.m26991a(java.lang.String, int):java.lang.Object");
    }

    /* renamed from: a */
    public static void m26992a(Handler handler, final String str, int i, int i2) {
        C11081a.m32463a().mo27011a(handler, new Callable(7) {
            public final Object call() throws Exception {
                return C9034ad.m26991a(str, 7);
            }
        }, 100);
    }
}
