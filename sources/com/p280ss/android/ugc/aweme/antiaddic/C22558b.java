package com.p280ss.android.ugc.aweme.antiaddic;

import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.antiaddic.b */
public final class C22558b {
    /* renamed from: a */
    public static void m74568a() {
        C6907h.m21524a("addict_alert", (Map) C22984d.m75611a().f60753a);
    }

    /* renamed from: a */
    public static void m74569a(Aweme aweme) {
        String str;
        if (C22562c.m74570a().mo59204a(System.currentTimeMillis())) {
            str = "night";
        } else {
            str = "day";
        }
        C6907h.onEvent(MobClick.obtain().setEventName("video_play").setLabelName("homepage_hot").setValue(aweme.getAid()).setJsonObject(C6869c.m21381a().mo16887a("is_addicted", "1").mo16887a("appear_time", str).mo16888b()));
    }
}
