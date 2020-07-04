package com.p280ss.android.ugc.aweme.video.preload;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.video.preload.experiment.EnablePreloadBackgroundExperiment;

/* renamed from: com.ss.android.ugc.aweme.video.preload.c */
final class C43272c {
    /* renamed from: a */
    static boolean m137279a() {
        if (!C6399b.m19944t() || !C6903bc.m21492k().mo59825a() || C6384b.m19835a().mo15287a(EnablePreloadBackgroundExperiment.class, true, "enable_preload_background", C6384b.m19835a().mo15295d().enable_preload_background, 1) == 1) {
            return true;
        }
        return false;
    }
}
