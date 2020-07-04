package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.n */
final /* synthetic */ class C36546n implements OnClickListener {

    /* renamed from: a */
    private final C36481a f95937a;

    /* renamed from: b */
    private final User f95938b;

    C36546n(C36481a aVar, User user) {
        this.f95937a = aVar;
        this.f95938b = user;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95937a.mo92638b(this.f95938b, view);
    }
}
