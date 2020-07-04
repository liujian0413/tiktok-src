package com.p280ss.android.ugc.aweme.share.libra;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "poi_share_as_token")
/* renamed from: com.ss.android.ugc.aweme.share.libra.PoiTokenShareExperiment */
public final class PoiTokenShareExperiment {
    @C6382b(mo15285a = true)
    private static final boolean DISABLED = false;
    @C6382b
    private static final boolean ENABLED = true;
    public static final PoiTokenShareExperiment INSTANCE = new PoiTokenShareExperiment();

    private PoiTokenShareExperiment() {
    }

    public final boolean getDISABLED() {
        return DISABLED;
    }

    public final boolean getENABLED() {
        return ENABLED;
    }

    public final boolean enable() {
        return C6384b.m19835a().mo15292a(PoiTokenShareExperiment.class, true, "poi_share_as_token", C6384b.m19835a().mo15295d().poi_share_as_token, false);
    }
}
