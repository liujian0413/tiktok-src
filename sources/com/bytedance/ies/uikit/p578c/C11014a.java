package com.bytedance.ies.uikit.p578c;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.Toast;
import com.C1642a;
import com.bytedance.common.p479c.C9688c;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9729e;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.ies.uikit.c.a */
public final class C11014a {
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0030, code lost:
        if (r6 != null) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r6.recycle();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0043, code lost:
        if (r6 != null) goto L_0x0032;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x003e A[SYNTHETIC, Splitter:B:22:0x003e] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean m32282a(android.content.Context r6) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 20
            if (r0 <= r2) goto L_0x0047
            if (r6 != 0) goto L_0x000a
            goto L_0x0047
        L_0x000a:
            r0 = 0
            android.content.res.Resources r2 = r6.getResources()     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r3 = 2131100696(0x7f060418, float:1.781378E38)
            int r2 = r2.getColor(r3)     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r3 = 2
            int[] r3 = new int[r3]     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r3 = {16842904, 16842901} // fill-array     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            r4 = 2131886387(0x7f120133, float:1.9407351E38)
            android.content.res.TypedArray r6 = r6.obtainStyledAttributes(r4, r3)     // Catch:{ Throwable -> 0x0042, all -> 0x003b }
            int r0 = r6.getColor(r1, r1)     // Catch:{ Throwable -> 0x0043, all -> 0x0036 }
            if (r2 != r0) goto L_0x0030
            if (r6 == 0) goto L_0x002e
            r6.recycle()     // Catch:{ Throwable -> 0x002e }
        L_0x002e:
            r6 = 1
            return r6
        L_0x0030:
            if (r6 == 0) goto L_0x0046
        L_0x0032:
            r6.recycle()     // Catch:{ Throwable -> 0x0046 }
            goto L_0x0046
        L_0x0036:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r5
            goto L_0x003c
        L_0x003b:
            r6 = move-exception
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.recycle()     // Catch:{ Throwable -> 0x0041 }
        L_0x0041:
            throw r6
        L_0x0042:
            r6 = r0
        L_0x0043:
            if (r6 == 0) goto L_0x0046
            goto L_0x0032
        L_0x0046:
            return r1
        L_0x0047:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.ies.uikit.p578c.C11014a.m32282a(android.content.Context):boolean");
    }

    /* renamed from: a */
    public static void m32281a(View view, Drawable drawable) {
        C9688c.m28622a(view, drawable);
    }

    /* renamed from: a */
    public static void m32279a(Context context, int i) {
        if (context != null) {
            m32280a(context, context.getString(R.string.b9q));
        }
    }

    /* renamed from: a */
    private static void m32280a(Context context, String str) {
        if (context != null && !C6319n.m19593a(str)) {
            if (context instanceof C9729e) {
                ((C9729e) context).showCustomToast(str);
                return;
            }
            try {
                Toast makeText = Toast.makeText(context, str, 0);
                if (makeText != null) {
                    C11015b.m32283a(makeText);
                }
            } catch (Exception e) {
                C6312h.m19577a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static final String m32278a(long j, String str) {
        if (j <= 10000) {
            return String.valueOf(j);
        }
        double d = (double) j;
        Double.isNaN(d);
        String a = C1642a.m8034a("%.1f", new Object[]{Double.valueOf((d * 1.0d) / 10000.0d)});
        if ('0' == a.charAt(a.length() - 1)) {
            StringBuilder sb = new StringBuilder();
            sb.append(a.substring(0, a.length() - 2));
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(a);
        sb2.append(str);
        return sb2.toString();
    }
}
