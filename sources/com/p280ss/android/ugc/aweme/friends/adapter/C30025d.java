package com.p280ss.android.ugc.aweme.friends.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.d */
final /* synthetic */ class C30025d implements OnClickListener {

    /* renamed from: a */
    private final FriendsViewHolder f78994a;

    C30025d(FriendsViewHolder friendsViewHolder) {
        this.f78994a = friendsViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f78994a.mo76222b(view);
    }
}
