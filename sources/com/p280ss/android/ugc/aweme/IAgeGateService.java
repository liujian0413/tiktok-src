package com.p280ss.android.ugc.aweme;

import android.app.Activity;

/* renamed from: com.ss.android.ugc.aweme.IAgeGateService */
public interface IAgeGateService {
    boolean disableFtcAgeGate();

    IAgeGateService keepCallback();

    boolean showFTCAgeGateForCurrentUser(Activity activity, C21787z zVar);

    void syncAgeGateInfo();
}
