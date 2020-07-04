package com.p280ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.da */
final /* synthetic */ class C39332da implements OnClickListener {

    /* renamed from: a */
    private final C39320cz f102177a;

    /* renamed from: b */
    private final C39319cy f102178b;

    C39332da(C39320cz czVar, C39319cy cyVar) {
        this.f102177a = czVar;
        this.f102178b = cyVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f102177a.mo97888b(this.f102178b, view);
    }
}
