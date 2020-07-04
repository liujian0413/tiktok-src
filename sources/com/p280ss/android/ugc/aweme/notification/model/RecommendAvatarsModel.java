package com.p280ss.android.ugc.aweme.notification.model;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0063u;
import bolts.C1591g;
import bolts.C1592h;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34362j;
import com.p280ss.android.ugc.aweme.notification.api.MusNotificationApiManager;

/* renamed from: com.ss.android.ugc.aweme.notification.model.RecommendAvatarsModel */
public class RecommendAvatarsModel extends C0063u {
    public final C0052o<C34362j> liveData = new C0052o<>();

    public void startFetch() {
        MusNotificationApiManager.m111253a().mo6885c((C1591g<TResult, TContinuationResult>) new RecommendAvatarsModel$$Lambda$0<TResult,TContinuationResult>(this));
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ Object lambda$startFetch$0$RecommendAvatarsModel(C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            this.liveData.postValue((C34362j) hVar.mo6890e());
        }
        return null;
    }
}
