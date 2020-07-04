package com.p280ss.android.ugc.aweme.poi.utils;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.feed.experiment.NearbyFullScreenShowLiveExperiment;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;

/* renamed from: com.ss.android.ugc.aweme.poi.utils.i */
public final class C35450i {
    /* renamed from: a */
    public static boolean m114505a() {
        int i;
        AbTestModel d = C7213d.m22500a().mo18803bo();
        if (d != null) {
            i = d.useLocationSDK;
        } else {
            i = 0;
        }
        if (i == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m114506b() {
        int i;
        AbTestModel d = C7213d.m22500a().mo18803bo();
        if (d != null) {
            i = d.useInjectionJsb;
        } else {
            i = 0;
        }
        if (i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m114507c() {
        if (C6384b.m19835a().mo15287a(NearbyFullScreenShowLiveExperiment.class, true, "poi_nearby_fullscreen_showlive", C6384b.m19835a().mo15295d().poi_nearby_fullscreen_showlive, 0) == 1) {
            return true;
        }
        return false;
    }
}
