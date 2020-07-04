package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.ApiDataStatus;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.h */
final /* synthetic */ class C7813h implements C7326g {

    /* renamed from: a */
    private final BaseFeedDataViewModel f21108a;

    C7813h(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f21108a = baseFeedDataViewModel;
    }

    public final void accept(Object obj) {
        this.f21108a.mo20489c((ApiDataStatus) obj);
    }
}
