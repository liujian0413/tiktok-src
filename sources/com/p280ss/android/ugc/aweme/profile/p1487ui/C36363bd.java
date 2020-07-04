package com.p280ss.android.ugc.aweme.profile.p1487ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.bd */
final /* synthetic */ class C36363bd implements OnClickListener {

    /* renamed from: a */
    private final MusAbsProfileFragment f95506a;

    /* renamed from: b */
    private final User f95507b;

    C36363bd(MusAbsProfileFragment musAbsProfileFragment, User user) {
        this.f95506a = musAbsProfileFragment;
        this.f95507b = user;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95506a.mo92049a(this.f95507b, view);
    }
}
