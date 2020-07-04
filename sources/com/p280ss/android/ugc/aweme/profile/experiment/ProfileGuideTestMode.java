package com.p280ss.android.ugc.aweme.profile.experiment;

import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.abmock.p260a.C6381a;
import com.bytedance.ies.abmock.p260a.C6382b;

@C6381a(mo15284a = "ProfileGuideTestMode")
/* renamed from: com.ss.android.ugc.aweme.profile.experiment.ProfileGuideTestMode */
public final class ProfileGuideTestMode {
    @C6382b(mo15285a = true)
    private static final boolean DISABLED = false;
    @C6382b
    private static final boolean ENABLED = true;
    public static final ProfileGuideTestMode INSTANCE = new ProfileGuideTestMode();

    private ProfileGuideTestMode() {
    }

    public static final boolean isTestMode() {
        return C6384b.m19835a().mo15292a(ProfileGuideTestMode.class, true, "ProfileGuideTestMode", C6384b.m19835a().mo15295d().ProfileGuideTestMode, false);
    }
}
