package com.p280ss.android.ugc.aweme.festival.christmas;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.c */
final /* synthetic */ class C29136c implements OnClickListener {

    /* renamed from: a */
    private final FestivalHomePageView f76889a;

    C29136c(FestivalHomePageView festivalHomePageView) {
        this.f76889a = festivalHomePageView;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        this.f76889a.mo74594a(view);
    }
}
