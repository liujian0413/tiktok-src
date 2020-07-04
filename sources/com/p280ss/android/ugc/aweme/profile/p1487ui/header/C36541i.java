package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.i */
final /* synthetic */ class C36541i implements OnClickListener {

    /* renamed from: a */
    private final C36481a f95929a;

    /* renamed from: b */
    private final User f95930b;

    C36541i(C36481a aVar, User user) {
        this.f95929a = aVar;
        this.f95930b = user;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95929a.mo92636a(this.f95930b, view);
    }
}
