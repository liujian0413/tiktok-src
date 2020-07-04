package com.p280ss.android.ugc.aweme.p1684u;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.main.experiment.C33007f;
import com.p280ss.android.ugc.aweme.main.experiment.HomeShotIconExperiment;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.u.a */
public final class C42685a {
    /* renamed from: a */
    public static final int m135539a(boolean z) {
        int i;
        if (C33007f.m106656a()) {
            int a = C6384b.m19835a().mo15287a(HomeShotIconExperiment.class, true, "home_shot_icon", C6384b.m19835a().mo15295d().home_shot_icon, 0);
            if (a == HomeShotIconExperiment.GROUP_ONE) {
                if (z) {
                    return R.drawable.a9_;
                }
                return R.drawable.a97;
            } else if (a == HomeShotIconExperiment.GROUP_TWO) {
                if (z) {
                    return R.drawable.a9a;
                }
                return R.drawable.a98;
            } else if (a == HomeShotIconExperiment.GROUP_THREE) {
                return R.drawable.a99;
            } else {
                if (!z) {
                    return R.drawable.a96;
                }
                i = R.drawable.ajf;
            }
        } else {
            int a2 = C6384b.m19835a().mo15287a(HomeShotIconExperiment.class, true, "home_shot_icon", C6384b.m19835a().mo15295d().home_shot_icon, 0);
            if (a2 == HomeShotIconExperiment.GROUP_ONE) {
                if (z) {
                    return R.drawable.a94;
                }
                return R.drawable.a91;
            } else if (a2 == HomeShotIconExperiment.GROUP_TWO) {
                if (z) {
                    return R.drawable.a95;
                }
                return R.drawable.a92;
            } else if (a2 == HomeShotIconExperiment.GROUP_THREE) {
                return R.drawable.a93;
            } else {
                if (z) {
                    return R.drawable.ajg;
                }
                i = R.drawable.a90;
            }
        }
        return i;
    }
}
