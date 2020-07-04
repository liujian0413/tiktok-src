package com.p280ss.android.ugc.aweme.p994af;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.base.p1062f.C23336d;
import com.p280ss.android.ugc.aweme.main.C32961dd;
import com.p280ss.android.ugc.aweme.main.experiment.SecondTabLastStatusExperiment;

/* renamed from: com.ss.android.ugc.aweme.af.a */
public class C22471a {

    /* renamed from: b */
    private static C22471a f59918b;

    /* renamed from: a */
    public boolean f59919a = true;

    /* renamed from: a */
    public static C22471a m74350a() {
        if (f59918b == null) {
            synchronized (C22471a.class) {
                if (f59918b == null) {
                    f59918b = new C22471a();
                }
            }
        }
        return f59918b;
    }

    /* renamed from: c */
    private static boolean m74352c() {
        C32961dd ddVar = (C32961dd) C23336d.m76560a(AwemeApplication.m21341a(), C32961dd.class);
        if (ddVar != null) {
            return ddVar.mo60464c();
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo59053b() {
        int a = C6384b.m19835a().mo15287a(SecondTabLastStatusExperiment.class, true, "second_tab_last_status", C6384b.m19835a().mo15295d().second_tab_last_status, 0);
        if (a == 0) {
            return true;
        }
        if (a == 1) {
            return false;
        }
        return m74352c();
    }

    /* renamed from: a */
    public static void m74351a(boolean z) {
        C32961dd ddVar = (C32961dd) C23336d.m76560a(AwemeApplication.m21341a(), C32961dd.class);
        if (ddVar != null) {
            ddVar.mo60479k(z);
        }
    }
}
