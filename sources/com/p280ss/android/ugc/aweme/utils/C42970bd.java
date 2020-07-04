package com.p280ss.android.ugc.aweme.utils;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.experiment.ShowRedDotTypeExperiment;
import com.p280ss.android.ugc.aweme.metrics.C33279u;

/* renamed from: com.ss.android.ugc.aweme.utils.bd */
public final class C42970bd {
    /* renamed from: c */
    public static boolean m136414c() {
        if (C6384b.m19835a().mo15287a(ShowRedDotTypeExperiment.class, true, "feeds_show_red_dot_type", C6384b.m19835a().mo15295d().feeds_show_red_dot_type, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m136411a() {
        int a = C6384b.m19835a().mo15287a(ShowRedDotTypeExperiment.class, true, "feeds_show_red_dot_type", C6384b.m19835a().mo15295d().feeds_show_red_dot_type, 0);
        if (a == 2 || a == 3) {
            C6903bc.m21505x().mo57931a(1);
        }
    }

    /* renamed from: b */
    public static void m136413b() {
        if (C6384b.m19835a().mo15287a(ShowRedDotTypeExperiment.class, true, "feeds_show_red_dot_type", C6384b.m19835a().mo15295d().feeds_show_red_dot_type, 0) == 3) {
            C6903bc.m21505x().mo57931a(0);
        }
    }

    /* renamed from: a */
    public static void m136412a(int i) {
        String str;
        if (!m136414c() && C6399b.m19946v()) {
            C33279u uVar = new C33279u();
            if (i == 0) {
                str = "homepage_follow";
            } else {
                str = "homepage_hot";
            }
            uVar.mo85339a(str).mo85252e();
        }
    }
}
