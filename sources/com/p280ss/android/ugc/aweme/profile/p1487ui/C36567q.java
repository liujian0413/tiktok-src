package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.q */
final /* synthetic */ class C36567q implements OnClickListener {

    /* renamed from: a */
    private final BindAccountView f95961a;

    /* renamed from: b */
    private final User f95962b;

    C36567q(BindAccountView bindAccountView, User user) {
        this.f95961a = bindAccountView;
        this.f95962b = user;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95961a.mo91961a(this.f95962b, view);
    }
}
