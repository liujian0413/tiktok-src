package com.p280ss.android.ugc.aweme.video.p1699c;

import android.text.TextUtils;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.video.experiment.ForceSoftwareExperiment;
import com.p280ss.android.ugc.aweme.video.local.LocalVideoPlayerManager;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44950d;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44951e;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g.C44955a;

/* renamed from: com.ss.android.ugc.aweme.video.c.c */
public final class C43203c implements C44953g {
    /* renamed from: a */
    public final C44951e mo104868a(C44955a aVar) {
        C44950d a = aVar.mo107470a();
        String a2 = LocalVideoPlayerManager.m137195a().mo104992a(a.f115620a);
        if (TextUtils.isEmpty(a2)) {
            return aVar.mo107471a(a);
        }
        StringBuilder sb = new StringBuilder("LocalVideoCache=>play video using cache,filePath:");
        sb.append(a2);
        C41530am.m132280a(sb.toString());
        C44951e eVar = new C44951e(a2);
        if (C6384b.m19835a().mo15287a(ForceSoftwareExperiment.class, true, "force_software_play", C6384b.m19835a().mo15295d().force_software_play, 1) == 1) {
            eVar.f115624b = true;
        }
        return eVar;
    }
}
