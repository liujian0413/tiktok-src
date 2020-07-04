package com.p280ss.android.ugc.aweme.comment.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.adapter.e */
final /* synthetic */ class C24074e implements OnClickListener {

    /* renamed from: a */
    private final CommentReplyViewHolder f63682a;

    C24074e(CommentReplyViewHolder commentReplyViewHolder) {
        this.f63682a = commentReplyViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f63682a.mo62337a(view);
    }
}
