package com.p280ss.android.ugc.aweme.profile.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.adapter.ProfileCoverAdapter.C35706a;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.k */
final /* synthetic */ class C35720k implements OnClickListener {

    /* renamed from: a */
    private final C35706a f93672a;

    /* renamed from: b */
    private final UrlModel f93673b;

    C35720k(C35706a aVar, UrlModel urlModel) {
        this.f93672a = aVar;
        this.f93673b = urlModel;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f93672a.mo90554a(this.f93673b);
    }
}
