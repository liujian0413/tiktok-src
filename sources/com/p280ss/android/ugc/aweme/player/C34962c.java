package com.p280ss.android.ugc.aweme.player;

import com.p280ss.android.ugc.aweme.video.C43184ac;
import com.p280ss.android.ugc.aweme.video.C43316v;
import com.p280ss.android.ugc.playerkit.videoview.C44933a;
import com.p280ss.ttvideoengine.TTVideoEngine;

/* renamed from: com.ss.android.ugc.aweme.player.c */
public final class C34962c {

    /* renamed from: a */
    public static final C34962c f91250a = new C34962c();

    private C34962c() {
    }

    /* renamed from: a */
    public static void m112651a() {
        if (!C43316v.m137250H()) {
            C43316v.m137450K().mo104949y();
        } else {
            C44933a.m141791a().mo107443c();
        }
        C43184ac.m136934a().mo104820d();
        TTVideoEngine.releaseTextureRender();
    }
}
