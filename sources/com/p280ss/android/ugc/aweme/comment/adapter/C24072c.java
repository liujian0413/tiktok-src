package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.c */
final /* synthetic */ class C24072c implements OnClickListener {

    /* renamed from: a */
    private final CommentReplyViewHolder f63680a;

    C24072c(CommentReplyViewHolder commentReplyViewHolder) {
        this.f63680a = commentReplyViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f63680a.mo62345c(view);
    }
}
