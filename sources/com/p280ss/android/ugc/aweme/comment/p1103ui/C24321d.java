package com.p280ss.android.ugc.aweme.comment.p1103ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.d */
final /* synthetic */ class C24321d implements OnClickListener {

    /* renamed from: a */
    private final CommentInputFragment f64224a;

    /* renamed from: b */
    private final Aweme f64225b;

    C24321d(CommentInputFragment commentInputFragment, Aweme aweme) {
        this.f64224a = commentInputFragment;
        this.f64225b = aweme;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f64224a.mo63064a(this.f64225b, view);
    }
}
