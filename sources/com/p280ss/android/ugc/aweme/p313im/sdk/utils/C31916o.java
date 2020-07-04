package com.p280ss.android.ugc.aweme.p313im.sdk.utils;

import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.facebook.appevents.C13192m;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.vesdk.C45323k;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.math.BigDecimal;
import java.math.RoundingMode;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.o */
public final class C31916o {
    /* renamed from: a */
    public static String m103674a(long j) {
        if (!C30538p.m99745a()) {
            return m103677b(j);
        }
        return m103678c(j);
    }

    /* renamed from: a */
    public static void m103676a(C10806a aVar) {
        if (!C31915n.m103671a()) {
            aVar.mo25985a((int) R.drawable.b59);
        }
    }

    /* renamed from: b */
    private static String m103677b(long j) {
        if (j < 10000) {
            return String.valueOf(j);
        }
        if (j < 100000000) {
            return m103675a(j, 10000, "w");
        }
        return m103675a(j, 100000000, "亿");
    }

    /* renamed from: c */
    private static String m103678c(long j) {
        if (j < 1000) {
            return String.valueOf(j);
        }
        if (j < 1000000) {
            return m103675a(j, 1000, C45323k.f116730a);
        }
        if (j < 1000000000) {
            return m103675a(j, 1000000, C13192m.f34940a);
        }
        return m103675a(j, 1000000000, "b");
    }

    /* renamed from: a */
    private static String m103675a(long j, long j2, String str) {
        String bigDecimal = new BigDecimal(j).divide(new BigDecimal(j2), 1, RoundingMode.HALF_UP).toString();
        if ('0' == bigDecimal.charAt(bigDecimal.length() - 1)) {
            StringBuilder sb = new StringBuilder();
            sb.append(bigDecimal.substring(0, bigDecimal.length() - 2));
            sb.append(str);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(bigDecimal);
        sb2.append(str);
        return sb2.toString();
    }
}
