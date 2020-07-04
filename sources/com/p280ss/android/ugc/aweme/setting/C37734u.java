package com.p280ss.android.ugc.aweme.setting;

import com.p280ss.android.ugc.aweme.global.config.settings.SettingsManagerProxy;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettings;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.ss.android.ugc.aweme.setting.u */
final /* synthetic */ class C37734u implements Callable {

    /* renamed from: a */
    private final AtomicReference f98322a;

    /* renamed from: b */
    private final AtomicReference f98323b;

    /* renamed from: c */
    private final AtomicReference f98324c;

    C37734u(AtomicReference atomicReference, AtomicReference atomicReference2, AtomicReference atomicReference3) {
        this.f98322a = atomicReference;
        this.f98323b = atomicReference2;
        this.f98324c = atomicReference3;
    }

    public final Object call() {
        return SettingsManagerProxy.inst().notifySettingsChange((Throwable) this.f98322a.get(), (IESSettings) this.f98323b.get(), (String) this.f98324c.get());
    }
}
