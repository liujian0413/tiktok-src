package com.p280ss.android.ugc.aweme.lancet.p327a;

import androidx.work.C1451a.C1452a;
import androidx.work.C1462h;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;

/* renamed from: com.ss.android.ugc.aweme.lancet.a.c */
public class C32274c {

    /* renamed from: a */
    private static boolean f84339a;

    /* renamed from: a */
    public static void m104796a() {
        synchronized (C32274c.class) {
            if (!f84339a) {
                try {
                    C1462h.m7332a(AwemeApplication.m21341a(), new C1452a().mo6680a());
                    f84339a = true;
                } catch (Exception e) {
                    C2077a.m9160a((Throwable) e);
                }
            }
        }
    }
}
