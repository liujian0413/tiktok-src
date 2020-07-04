package com.p280ss.android.ugc.aweme.friends.p1285ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.j */
final /* synthetic */ class C30163j implements OnClickListener {

    /* renamed from: a */
    private final IAddFriendsActivity f79388a;

    C30163j(IAddFriendsActivity iAddFriendsActivity) {
        this.f79388a = iAddFriendsActivity;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f79388a.mo76504a(view);
    }
}
