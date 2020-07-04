package com.p280ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.e */
final /* synthetic */ class C30026e implements OnClickListener {

    /* renamed from: a */
    private final FriendsViewHolder f78995a;

    C30026e(FriendsViewHolder friendsViewHolder) {
        this.f78995a = friendsViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f78995a.mo76219a(view);
    }
}
