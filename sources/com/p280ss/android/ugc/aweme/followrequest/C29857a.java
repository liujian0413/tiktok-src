package com.p280ss.android.ugc.aweme.followrequest;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.followrequest.a */
final /* synthetic */ class C29857a implements OnClickListener {

    /* renamed from: a */
    private final FollowRequestActivity f78435a;

    C29857a(FollowRequestActivity followRequestActivity) {
        this.f78435a = followRequestActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f78435a.mo75835a(view);
    }
}
