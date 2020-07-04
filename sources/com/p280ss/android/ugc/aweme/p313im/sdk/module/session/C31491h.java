package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1336a.C31494a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.h */
final /* synthetic */ class C31491h implements OnClickListener {

    /* renamed from: a */
    private final SessionListViewHolder f82466a;

    /* renamed from: b */
    private final C31494a f82467b;

    C31491h(SessionListViewHolder sessionListViewHolder, C31494a aVar) {
        this.f82466a = sessionListViewHolder;
        this.f82467b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f82466a.mo82177c(this.f82467b, view);
    }
}
