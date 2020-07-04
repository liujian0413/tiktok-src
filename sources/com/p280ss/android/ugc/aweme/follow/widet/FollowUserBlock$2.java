package com.p280ss.android.ugc.aweme.follow.widet;

import android.arch.lifecycle.C0042h;
import android.arch.lifecycle.C0054q;
import android.arch.lifecycle.Lifecycle.Event;
import com.p280ss.android.ugc.aweme.profile.presenter.C36031j;

/* renamed from: com.ss.android.ugc.aweme.follow.widet.FollowUserBlock$2 */
class FollowUserBlock$2 implements C0042h {

    /* renamed from: a */
    final /* synthetic */ C36031j f77862a;

    /* renamed from: b */
    final /* synthetic */ C29548a f77863b;

    /* access modifiers changed from: protected */
    @C0054q(mo125a = Event.ON_DESTROY)
    public void onDestroy() {
        this.f77862a.mo59134U_();
    }

    FollowUserBlock$2(C29548a aVar, C36031j jVar) {
        this.f77863b = aVar;
        this.f77862a = jVar;
    }
}
