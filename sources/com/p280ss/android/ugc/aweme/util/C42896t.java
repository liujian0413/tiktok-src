package com.p280ss.android.ugc.aweme.util;

import android.text.TextUtils;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.language.C32326h;
import com.p280ss.android.ugc.aweme.util.p1691a.C42868b;
import java.util.Calendar;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.util.t */
public final class C42896t {
    /* renamed from: a */
    public static void m136198a() {
        C1592h.m7855a(C42897u.f111404a, (Executor) C1592h.f5957a);
    }

    /* renamed from: b */
    static final /* synthetic */ Object m136199b() throws Exception {
        m136201d();
        m136200c();
        return null;
    }

    /* renamed from: e */
    private static String m136202e() {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(System.currentTimeMillis());
        instance.set(11, 0);
        instance.set(12, 0);
        instance.set(13, 0);
        instance.set(14, 0);
        StringBuilder sb = new StringBuilder();
        sb.append(instance.getTimeInMillis());
        return sb.toString();
    }

    /* renamed from: c */
    private static void m136200c() {
        if (C32326h.m104887i()) {
            String e = m136202e();
            String a = C42868b.m136106a();
            int c = C42868b.m136113c();
            if (!TextUtils.equals(e, a)) {
                C42868b.m136111b(0);
                C42868b.m136108a(e);
                c = 0;
            }
            int i = c + 1;
            C42868b.m136111b(i);
            if (i >= 30 && !C42868b.m136116d()) {
                C42866a.m136083c("af_vvfinish_aday30");
                C42868b.m136109a(true);
            }
            if (i >= 50 && !C42868b.m136117e()) {
                C42866a.m136083c("af_vvfinish_aday50");
                C42868b.m136112b(true);
            }
        }
    }

    /* renamed from: d */
    private static void m136201d() {
        if (!C42868b.m136119g()) {
            int b = C42868b.m136110b() + 1;
            if (b == 1) {
                C42866a.m136076a("F1", null, null);
                C42866a.m136080b("F1", null, null);
            } else if (b == 10) {
                C42866a.m136076a("F10", null, null);
                C42866a.m136080b("F10", null, null);
            }
            C42868b.m136107a(b);
            if (b >= 30 && !C42868b.m136118f()) {
                if (C32326h.m104887i()) {
                    C42866a.m136083c("af_vvfinish_allday30");
                }
                C42868b.m136114c(true);
                C42866a.m136076a("F30", null, null);
                C42866a.m136080b("F30", null, null);
            }
            if (b >= 50 && !C42868b.m136119g()) {
                if (C32326h.m104887i()) {
                    C42866a.m136083c("af_vvfinish_allday50");
                }
                C42868b.m136115d(true);
                C42866a.m136076a("F50", null, null);
                C42866a.m136080b("F50", null, null);
            }
        }
    }
}
