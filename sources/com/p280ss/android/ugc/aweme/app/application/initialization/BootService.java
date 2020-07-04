package com.p280ss.android.ugc.aweme.app.application.initialization;

/* renamed from: com.ss.android.ugc.aweme.app.application.initialization.BootService */
public interface BootService {

    /* renamed from: com.ss.android.ugc.aweme.app.application.initialization.BootService$Stage */
    public enum Stage {
        ATTACH_BASE_CONTEXT,
        APPLICATION_ONCREATE_BEAGIN,
        APPLICATION_ONCREATE_END,
        MAINACTIVITY_ONCREATE_BEGIN,
        MAINACTIVITY_ONCREATE_END,
        BOOT_FINISH
    }
}
