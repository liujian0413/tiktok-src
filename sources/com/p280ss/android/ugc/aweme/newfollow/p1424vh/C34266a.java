package com.p280ss.android.ugc.aweme.newfollow.p1424vh;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.comment.p1096c.C24090a;

/* renamed from: com.ss.android.ugc.aweme.newfollow.vh.a */
final /* synthetic */ class C34266a implements OnClickListener {

    /* renamed from: a */
    private final CommentFollowFeedMomentViewHolder f89379a;

    /* renamed from: b */
    private final C24090a f89380b;

    C34266a(CommentFollowFeedMomentViewHolder commentFollowFeedMomentViewHolder, C24090a aVar) {
        this.f89379a = commentFollowFeedMomentViewHolder;
        this.f89380b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f89379a.mo86953a(this.f89380b, view);
    }
}
