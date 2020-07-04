package com.p280ss.android.ugc.aweme.video.p1699c;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.feed.api.C28220h;
import com.p280ss.android.ugc.aweme.feed.model.VideoUrlModel;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44950d;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44951e;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g;
import com.p280ss.android.ugc.playerkit.videoview.p1755d.C44953g.C44955a;
import com.p280ss.ttvideoengine.C46059d;
import com.p280ss.ttvideoengine.Resolution;

/* renamed from: com.ss.android.ugc.aweme.video.c.a */
public final class C43201a implements C44953g {
    /* renamed from: a */
    private static String m136987a(VideoUrlModel videoUrlModel) {
        if (C28220h.m92763a().mo71959j()) {
            String b = C28220h.m92763a().mo71954b(videoUrlModel.getSourceId());
            if (C28220h.m92763a().mo71952a(b)) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: a */
    public final C44951e mo104868a(C44955a aVar) {
        C44950d a = aVar.mo107470a();
        VideoUrlModel videoUrlModel = a.f115620a;
        String a2 = m136987a(videoUrlModel);
        if (TextUtils.isEmpty(a2)) {
            a2 = C46059d.m144301a().mo112157a(videoUrlModel.getBitRatedRatioUri(), videoUrlModel.getBitRatedRatioUri(), a.f115622c, (Resolution) null, (String) null);
        }
        return new C44951e(a2);
    }
}
