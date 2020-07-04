package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.live.core.rxutils.C3303k;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import p346io.reactivex.p354j.C7486b;

public class TimeOutRefreshViewModel extends RxViewModel {

    /* renamed from: a */
    public C7486b<Object> f21098a = C7486b.m23223a();

    /* renamed from: b */
    private boolean f21099b;

    /* renamed from: c */
    private long f21100c = Long.MAX_VALUE;

    /* renamed from: a */
    public final void mo20507a() {
        this.f21099b = true;
    }

    /* renamed from: d */
    private static long m23997d() {
        return (long) ((Integer) LiveFeedSettings.MAIN_REFRESH_TIME_OUT.mo10240a()).intValue();
    }

    /* renamed from: b */
    public final void mo20508b() {
        if (this.f21100c == Long.MAX_VALUE) {
            this.f21100c = System.currentTimeMillis();
        }
    }

    /* renamed from: c */
    public final void mo20509c() {
        if (!this.f21099b && this.f21100c != Long.MAX_VALUE && System.currentTimeMillis() - this.f21100c > m23997d()) {
            this.f21098a.onNext(C3303k.f10035a);
        }
        this.f21100c = Long.MAX_VALUE;
        this.f21099b = false;
    }
}
