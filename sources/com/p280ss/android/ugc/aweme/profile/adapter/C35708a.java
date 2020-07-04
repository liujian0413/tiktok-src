package com.p280ss.android.ugc.aweme.profile.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.a */
final /* synthetic */ class C35708a implements OnClickListener {

    /* renamed from: a */
    private final DraftBoxViewHolder f93656a;

    C35708a(DraftBoxViewHolder draftBoxViewHolder) {
        this.f93656a = draftBoxViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f93656a.mo90530a(view);
    }
}
