package com.bytedance.android.livesdk.chatroom.p220ui;

import com.bytedance.android.livesdkapi.depend.p439b.C9298a;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.bw */
final /* synthetic */ class C5229bw implements C7326g {

    /* renamed from: a */
    private final LiveProfileDetailFragment f15328a;

    C5229bw(LiveProfileDetailFragment liveProfileDetailFragment) {
        this.f15328a = liveProfileDetailFragment;
    }

    public final void accept(Object obj) {
        this.f15328a.onEvent((C9298a) obj);
    }
}
