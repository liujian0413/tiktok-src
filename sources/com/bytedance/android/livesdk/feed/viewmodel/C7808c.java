package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.C0053p;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.ApiDataStatus;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.c */
final /* synthetic */ class C7808c implements C0053p {

    /* renamed from: a */
    private final BaseFeedDataViewModel f21103a;

    C7808c(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f21103a = baseFeedDataViewModel;
    }

    public final void onChanged(Object obj) {
        this.f21103a.mo20481a((ApiDataStatus) obj);
    }
}
