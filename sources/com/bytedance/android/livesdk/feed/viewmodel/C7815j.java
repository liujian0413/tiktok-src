package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.ApiDataStatus;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.feed.viewmodel.j */
final /* synthetic */ class C7815j implements C7326g {

    /* renamed from: a */
    private final BaseFeedDataViewModel f21110a;

    C7815j(BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f21110a = baseFeedDataViewModel;
    }

    public final void accept(Object obj) {
        this.f21110a.mo20485b((ApiDataStatus) obj);
    }
}
