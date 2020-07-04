package com.p280ss.android.ugc.aweme.app.launch;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.common.config.AppConfig;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.app.launch.a */
public final class C23002a {
    /* renamed from: a */
    public static final void m75650a(Context context) {
        C7573i.m23587b(context, "context");
        AppConfig.getInstance(context).tryRefreshConfig(context instanceof Activity);
    }
}
