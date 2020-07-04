package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.l */
final /* synthetic */ class C23797l implements OnClickListener {

    /* renamed from: a */
    private final User f62822a;

    /* renamed from: b */
    private final Challenge f62823b;

    C23797l(User user, Challenge challenge) {
        this.f62822a = user;
        this.f62823b = challenge;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C23793i.m77998a(this.f62822a, this.f62823b, view);
    }
}
