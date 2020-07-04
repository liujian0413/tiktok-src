package com.p280ss.android.ugc.aweme.global.config.settings;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.l */
final /* synthetic */ class C30204l implements Callable {

    /* renamed from: a */
    private final String f79476a;

    /* renamed from: b */
    private final Throwable f79477b;

    /* renamed from: c */
    private final String f79478c;

    C30204l(String str, Throwable th, String str2) {
        this.f79476a = str;
        this.f79477b = th;
        this.f79478c = str2;
    }

    public final Object call() {
        return SettingsUtil.m98820a(this.f79476a, this.f79477b, this.f79478c);
    }
}
