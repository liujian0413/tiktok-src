package com.p280ss.android.ugc.aweme.qrcode.p1496b;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.share.C38275x.C38283a;
import com.p280ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.qrcode.b.h */
final /* synthetic */ class C37040h implements C38283a {

    /* renamed from: a */
    private final String f96999a;

    C37040h(String str) {
        this.f96999a = str;
    }

    /* renamed from: a */
    public final void mo70352a(String str, Effect effect) {
        C6907h.m21524a("shoot", (Map) C22984d.m75611a().mo59973a("creation_id", str).mo59973a("shoot_way", "scan").mo59973a("prop_id", this.f96999a).mo59970a("_staging_flag", C6399b.m19946v() ^ true ? 1 : 0).f60753a);
    }
}
