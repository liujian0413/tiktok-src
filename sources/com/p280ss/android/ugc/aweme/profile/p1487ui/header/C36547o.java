package com.p280ss.android.ugc.aweme.profile.p1487ui.header;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p280ss.android.ugc.aweme.profile.model.AdCoverTitle;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.header.o */
final /* synthetic */ class C36547o implements OnClickListener {

    /* renamed from: a */
    private final C36481a f95939a;

    /* renamed from: b */
    private final AdCoverTitle f95940b;

    C36547o(C36481a aVar, AdCoverTitle adCoverTitle) {
        this.f95939a = aVar;
        this.f95940b = adCoverTitle;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f95939a.mo92632a(this.f95940b, view);
    }
}
