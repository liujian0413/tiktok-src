package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.m */
final /* synthetic */ class C21876m implements OnClickListener {

    /* renamed from: a */
    private final MusCountryListActivity f58577a;

    /* renamed from: b */
    private final MusCountryAdapter f58578b;

    C21876m(MusCountryListActivity musCountryListActivity, MusCountryAdapter musCountryAdapter) {
        this.f58577a = musCountryListActivity;
        this.f58578b = musCountryAdapter;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f58577a.mo58228a(this.f58578b, view);
    }
}
