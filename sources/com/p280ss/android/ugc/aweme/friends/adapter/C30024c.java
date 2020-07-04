package com.p280ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.c */
final /* synthetic */ class C30024c implements OnClickListener {

    /* renamed from: a */
    private final FriendsViewHolder f78993a;

    C30024c(FriendsViewHolder friendsViewHolder) {
        this.f78993a = friendsViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f78993a.mo76223c(view);
    }
}
