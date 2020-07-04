package com.p280ss.android.ugc.aweme.profile.util;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa.C36698b;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ab */
final /* synthetic */ class C36699ab implements OnClickListener {

    /* renamed from: a */
    private final String f96340a;

    /* renamed from: b */
    private final User f96341b;

    /* renamed from: c */
    private final C36698b f96342c;

    C36699ab(String str, User user, C36698b bVar) {
        this.f96340a = str;
        this.f96341b = user;
        this.f96342c = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C36694aa.m118349b(this.f96340a, this.f96341b, this.f96342c, view);
    }
}
