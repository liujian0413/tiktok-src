package com.bytedance.android.livesdk.utils;

import android.content.Context;
import com.bytedance.android.live.core.utils.C3358ac;
import com.p280ss.android.ugc.aweme.main.guide.C33040a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.text.SimpleDateFormat;
import java.util.Date;

/* renamed from: com.bytedance.android.livesdk.utils.ao */
public class C9048ao {

    /* renamed from: a */
    private static final SimpleDateFormat f24713a = new SimpleDateFormat("yyyy-MM-dd");

    /* renamed from: b */
    private static final SimpleDateFormat f24714b = new SimpleDateFormat("HH:mm");

    /* renamed from: c */
    private static volatile long f24715c = 0;

    private C9048ao() {
    }

    /* renamed from: a */
    public static long m27015a() {
        return System.currentTimeMillis() + f24715c;
    }

    /* renamed from: c */
    public static void m27020c(long j) {
        f24715c = j;
    }

    /* renamed from: d */
    public static int m27021d(long j) {
        return ((int) j) / C33040a.f86003c;
    }

    /* renamed from: b */
    public static String m27019b(long j) {
        return f24713a.format(new Date(j));
    }

    /* renamed from: a */
    public static int m27014a(int i) {
        boolean z;
        if (i <= 0) {
            return 1;
        }
        if (i % 60 > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return (i / 60) + 1;
        }
        return i / 60;
    }

    /* renamed from: a */
    public static String m27017a(long j) {
        StringBuilder sb = new StringBuilder();
        long j2 = j / 60;
        long j3 = j - (60 * j2);
        if (j2 < 10) {
            sb.append("0");
        }
        sb.append(j2);
        sb.append(":");
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        return sb.toString();
    }

    /* renamed from: b */
    public static String m27018b(int i) {
        StringBuilder sb = new StringBuilder();
        Context e = C3358ac.m12528e();
        if (i <= 0) {
            return "";
        }
        int i2 = i / 3600;
        int i3 = i - (i2 * 3600);
        int i4 = i3 / 60;
        int i5 = i3 - (i4 * 60);
        if (i2 != 0) {
            sb.append(i2);
            sb.append(e.getResources().getQuantityString(R.plurals.u, i2));
        }
        if (i4 != 0) {
            sb.append(i4);
            sb.append(e.getResources().getQuantityString(R.plurals.v, i4));
        }
        if (i5 != 0) {
            sb.append(i5);
            sb.append(e.getResources().getQuantityString(R.plurals.x, i5));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m27016a(int i, String str) {
        StringBuilder sb = new StringBuilder();
        if (i <= 0) {
            return "";
        }
        long j = (long) (i / 3600);
        long j2 = ((long) i) - (3600 * j);
        long j3 = j2 / 60;
        long j4 = j2 - (60 * j3);
        if (j < 10) {
            sb.append("0");
        }
        sb.append(j);
        sb.append(str);
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3);
        sb.append(str);
        if (j4 < 10) {
            sb.append("0");
        }
        sb.append(j4);
        return sb.toString();
    }
}
