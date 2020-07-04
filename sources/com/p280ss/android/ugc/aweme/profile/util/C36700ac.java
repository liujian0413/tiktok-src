package com.p280ss.android.ugc.aweme.profile.util;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.util.C36694aa.C36698b;

/* renamed from: com.ss.android.ugc.aweme.profile.util.ac */
final /* synthetic */ class C36700ac implements OnClickListener {

    /* renamed from: a */
    private final String f96343a;

    /* renamed from: b */
    private final User f96344b;

    /* renamed from: c */
    private final C36698b f96345c;

    C36700ac(String str, User user, C36698b bVar) {
        this.f96343a = str;
        this.f96344b = user;
        this.f96345c = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C36694aa.m118346a(this.f96343a, this.f96344b, this.f96345c, view);
    }
}
