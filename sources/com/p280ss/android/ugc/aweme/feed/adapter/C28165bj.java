package com.p280ss.android.ugc.aweme.feed.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.bj */
final /* synthetic */ class C28165bj implements OnClickListener {

    /* renamed from: a */
    private final VideoViewHolder f74265a;

    /* renamed from: b */
    private final User f74266b;

    C28165bj(VideoViewHolder videoViewHolder, User user) {
        this.f74265a = videoViewHolder;
        this.f74266b = user;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f74265a.mo71665a(this.f74266b, view);
    }
}
