package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.j */
final /* synthetic */ class C24079j implements OnClickListener {

    /* renamed from: a */
    private final CommentViewHolderNewStyle f63687a;

    C24079j(CommentViewHolderNewStyle commentViewHolderNewStyle) {
        this.f63687a = commentViewHolderNewStyle;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f63687a.mo62383a(view);
    }
}
