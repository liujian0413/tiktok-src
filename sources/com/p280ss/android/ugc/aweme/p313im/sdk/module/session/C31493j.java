package com.p280ss.android.ugc.aweme.p313im.sdk.module.session;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.p313im.sdk.module.session.newstyle.p1336a.C31494a;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.module.session.j */
final /* synthetic */ class C31493j implements OnClickListener {

    /* renamed from: a */
    private final SessionListViewHolder f82470a;

    /* renamed from: b */
    private final C31494a f82471b;

    C31493j(SessionListViewHolder sessionListViewHolder, C31494a aVar) {
        this.f82470a = sessionListViewHolder;
        this.f82471b = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f82470a.mo82174a(this.f82471b, view);
    }
}
