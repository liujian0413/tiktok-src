package com.bytedance.android.live.uikit.p176d;

import android.content.Context;
import android.widget.Toast;
import com.C1642a;
import com.bytedance.android.live.uikit.p175c.C3515c;
import com.bytedance.common.utility.C6312h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9729e;

/* renamed from: com.bytedance.android.live.uikit.d.a */
public final class C3517a {
    /* renamed from: a */
    public static final String m12958a(long j) {
        return m12959a(j, "万");
    }

    /* renamed from: a */
    public static void m12960a(Context context, int i) {
        if (context != null) {
            m12962a(context, context.getString(i));
        }
    }

    /* renamed from: a */
    public static void m12962a(Context context, String str) {
        if (context != null && !C6319n.m19593a(str)) {
            if (context instanceof C9729e) {
                ((C9729e) context).showCustomToast(str);
                return;
            }
            try {
                Toast makeText = Toast.makeText(context, str, 0);
                if (makeText != null) {
                    C3518b.m12964a(makeText);
                }
            } catch (Exception e) {
                C6312h.m19577a((Throwable) e);
            }
        }
    }

    /* renamed from: a */
    public static final String m12959a(long j, String str) {
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

    /* renamed from: a */
    public static void m12961a(Context context, int i, long j) {
        if (context != null) {
            m12963a(context, context.getString(i), j);
        }
    }

    /* renamed from: a */
    public static void m12963a(Context context, String str, long j) {
        if (context != null && !C6319n.m19593a(str) && !(context instanceof C3515c)) {
            try {
                Toast makeText = Toast.makeText(context, str, 0);
                if (makeText != null) {
                    C3518b.m12964a(makeText);
                }
            } catch (Exception e) {
                C6312h.m19577a((Throwable) e);
            }
        }
    }
}
