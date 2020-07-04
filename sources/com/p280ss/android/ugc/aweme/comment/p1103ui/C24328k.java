package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.k */
final /* synthetic */ class C24328k implements OnClickListener {

    /* renamed from: a */
    private final CommentListFragment f64235a;

    C24328k(CommentListFragment commentListFragment) {
        this.f64235a = commentListFragment;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f64235a.mo63075a(view);
    }
}
