package com.p280ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.db */
final /* synthetic */ class C39333db implements OnClickListener {

    /* renamed from: a */
    private final C39320cz f102179a;

    /* renamed from: b */
    private final C39319cy f102180b;

    C39333db(C39320cz czVar, C39319cy cyVar) {
        this.f102179a = czVar;
        this.f102180b = cyVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f102179a.mo97885a(this.f102180b, view);
    }
}
