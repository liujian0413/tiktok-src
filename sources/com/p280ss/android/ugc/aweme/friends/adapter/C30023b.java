package com.p280ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.b */
final /* synthetic */ class C30023b implements OnClickListener {

    /* renamed from: a */
    private final FriendsViewHolder f78992a;

    C30023b(FriendsViewHolder friendsViewHolder) {
        this.f78992a = friendsViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f78992a.mo76224d(view);
    }
}
