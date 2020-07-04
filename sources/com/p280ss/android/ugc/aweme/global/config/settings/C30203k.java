package com.p280ss.android.ugc.aweme.global.config.settings;

import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.global.config.settings.k */
final /* synthetic */ class C30203k implements Callable {

    /* renamed from: a */
    private final String f79472a;

    /* renamed from: b */
    private final Throwable f79473b;

    /* renamed from: c */
    private final String f79474c;

    /* renamed from: d */
    private final IESSettings f79475d;

    C30203k(String str, Throwable th, String str2, IESSettings iESSettings) {
        this.f79472a = str;
        this.f79473b = th;
        this.f79474c = str2;
        this.f79475d = iESSettings;
    }

    public final Object call() {
        return SettingsUtil.m98821a(this.f79472a, this.f79473b, this.f79474c, this.f79475d);
    }
}
