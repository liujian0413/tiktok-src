package com.p280ss.android.ugc.aweme.services;

import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.services.AVSettingsServiceImpl$$Lambda$0 */
final /* synthetic */ class AVSettingsServiceImpl$$Lambda$0 implements Callable {
    private final IESSettingsProxy arg$1;

    AVSettingsServiceImpl$$Lambda$0(IESSettingsProxy iESSettingsProxy) {
        this.arg$1 = iESSettingsProxy;
    }

    public final Object call() {
        return AVSettingsServiceImpl.lambda$asynMonitorAwemeSetting$0$AVSettingsServiceImpl(this.arg$1);
    }
}
